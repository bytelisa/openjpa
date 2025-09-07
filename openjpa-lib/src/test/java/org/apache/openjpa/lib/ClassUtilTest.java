/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.openjpa.lib;

import org.apache.openjpa.lib.util.ClassUtil;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

import static org.junit.Assert.*;

public class ClassUtilTest {

    private final ClassLoader standardLoader = getClass().getClassLoader();

    // Helper: classe interna per testare l'inizializzazione statica
    public static class StaticInitializerTestClass {
        public static boolean initialized = false;
        static {
            initialized = true;
        }
    }

    // Helper: resetta lo stato della classe di test prima di ogni esecuzione
    @Before
    public void setUp() {
        StaticInitializerTestClass.initialized = false;
    }


    // ========================================================================
    // == Test Suite per toClass(String str, ClassLoader loader)             ==
    // ========================================================================

    /**
     * Test: Primitivo (Happy Path)
     * Giustificazione: Verifica il percorso rapido interno per i primitivi.
     */
    @Test
    public void testToClass_PrimitiveHappyPath() {
        Class<?> result = ClassUtil.toClass("int", null);
        assertEquals("Il caricamento del primitivo 'int' deve restituire int.class", int.class, result);
    }

    /**
     * Test: Classe Standard (Happy Path)
     * Giustificazione: Verifica il caso base di caricamento di una classe con un loader competente.
     */
    @Test
    public void testToClass_StandardClassHappyPath() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        Class<?> result = ClassUtil.toClass("java.lang.String", standardLoader);
        assertEquals("Il caricamento di 'java.lang.String' deve restituire String.class", String.class, result);
    }

    /**
     * Test: Array di Primitivo Multi-dimensionale
     * Giustificazione: Testa la logica di parsing dei [] e il lookup dei tipi primitivi.
     */
    @Test
    public void testToClass_MultiDimensionalPrimitiveArray() {
        Class<?> result = ClassUtil.toClass("char[][]", null);
        assertEquals("Il caricamento di 'char[][]' deve restituire char[][].class", char[][].class, result);
    }

    /**
     * Test: Array di Oggetto
     * Giustificazione: Testa la logica di costruzione del nome interno "[L...;".
     */
    @Test
    public void testToClass_ObjectArray() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        Class<?> result = ClassUtil.toClass("java.lang.Object[]", standardLoader);
        assertEquals("Il caricamento di 'java.lang.Object[]' deve restituire Object[].class", Object[].class, result);
    }

    /**
     * Test: Classe Inesistente (Negative Path)
     * Giustificazione: Verifica la corretta gestione del ClassNotFoundException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToClass_NonExistentClassThrowsException() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        ClassUtil.toClass("com.fake.MyClass", standardLoader);
    }

    /**
     * Test: str = null (Robustezza)
     * Giustificazione: Verifica il controllo esplicito sull'input nullo.
     */
    @Test(expected = NullPointerException.class)
    public void testToClass_NullStringThrowsException() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        ClassUtil.toClass(null, standardLoader);
    }

    /**
     * Test: loader = null (Fallback)
     * Giustificazione: Verifica che il SUT usi correttamente il Context Loader.
     */
    @Test
    public void testToClass_NullLoaderUsesContextLoader() {
        Class<?> result = ClassUtil.toClass("java.util.Map", null);
        assertEquals("Con loader nullo, deve usare il Context Loader per trovare Map.class", Map.class, result);
    }

    /**
     * Test: loader Incompetente e ISOLATO
     * Giustificazione: Verifica che il SUT fallisca quando viene fornito un ClassLoader
     *              che non può risolvere una classe NON di sistema, perché la sua
     *              catena di delegazione è stata interrotta.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToClass_WithAppClassAndTrulyIsolatedLoader_ShouldThrowExceptionWithResolve() throws Exception {

        String className = "org.apache.openjpa.lib.util.ClassUtil";

        ClassLoader trulyIncompetentLoader = new URLClassLoader(new URL[0], null);

        ClassUtil.toClass(className, false, trulyIncompetentLoader);
    }


    // ========================================================================
    // == Test Suite per toClass(String str, boolean resolve, ClassLoader loader) ==
    // ========================================================================

    /**
     * Test: Primitivo (Happy Path)
     * Giustificazione: Verifica il percorso rapido interno per i primitivi,
     * che non deve usare il loader.
     */
    @Test
    public void testToClass_PrimitiveHappyPathWithResolve() {
        Class<?> result = ClassUtil.toClass("int", false, null);
        assertEquals("Il caricamento del primitivo 'int' deve restituire int.class", int.class, result);
    }

    /**
     * Test: Classe Standard (Happy Path)
     * Giustificazione: Verifica il caso base di caricamento di una classe
     * con un loader competente.
     */
    @Test
    public void testToClass_StandardClassHappyPathWithResolve() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        Class<?> result = ClassUtil.toClass("java.lang.String", false, standardLoader);
        assertEquals("Il caricamento di 'java.lang.String' deve restituire String.class", String.class, result);
    }

    /**
     * Test: Array di Primitivo Multi-dimensionale
     * Giustificazione: Testa la logica di parsing dei [] e il lookup dei tipi primitivi.
     */
    @Test
    public void testToClass_MultiDimensionalPrimitiveArrayWithResolve() {
        Class<?> result = ClassUtil.toClass("char[][]", false, null);
        assertEquals("Il caricamento di 'char[][]' deve restituire char[][].class", char[][].class, result);
    }

    /**
     * Test: Array di Oggetto
     * Giustificazione: Testa la logica di costruzione del nome interno "[L...;".
     */
    @Test
    public void testToClass_ObjectArrayWithResolve() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        Class<?> result = ClassUtil.toClass("java.lang.Object[]", false, standardLoader);
        assertEquals("Il caricamento di 'java.lang.Object[]' deve restituire Object[].class", Object[].class, result);
    }

    /**
     * Test: Classe Inesistente (Negative Path)
     * Giustificazione: Verifica la corretta gestione del ClassNotFoundException
     * e la sua conversione nell'eccezione di contratto.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToClass_NonExistentClassThrowsExceptionWithResolve() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        ClassUtil.toClass("com.fake.MyClass", false, standardLoader);
    }

    /**
     * Test: str = null (Robustezza)
     * Giustificazione: Verifica il controllo esplicito sull'input nullo
     * all'inizio del metodo.
     */
    @Test(expected = NullPointerException.class)
    public void testToClass_NullStringThrowsExceptionWithResolve() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        ClassUtil.toClass(null, false, standardLoader);
    }

    /**
     * Test: loader = null (Fallback)
     * Giustificazione: Verifica che il SUT usi correttamente il Context Loader
     * quando il loader fornito è nullo.
     */
    @Test
    public void testToClass_NullLoaderUsesContextLoaderWithResolve() {
        Class<?> result = ClassUtil.toClass("java.util.Map", false, null);
        assertEquals("Con loader nullo, deve usare il Context Loader per trovare Map.class", Map.class, result);
    }

    /**
     * Test: loader Incompetente e ISOLATO
     * Giustificazione: Verifica che il SUT fallisca quando viene fornito un ClassLoader
     *              che non può risolvere una classe NON di sistema, perché la sua
     *              catena di delegazione è stata interrotta.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToClass_WithAppClassAndTrulyIsolatedLoader_ShouldThrowException() throws Exception {
        // 1. Scegliamo una classe che esiste nel nostro classpath,
        //    ma non è una classe di sistema (non è in java.*).
        //    La classe ClassUtil stessa è un candidato perfetto.
        String className = "org.apache.openjpa.lib.util.ClassUtil";

        // 2. Creiamo un ClassLoader "veramente incompetente".
        //    - Il suo classpath è vuoto (new URL[0]).
        //    - Il suo genitore è NULL. Questo è il passo CRUCIALE.
        //      Significa che delegherà solo al Bootstrap Class Loader,
        //      che NON conosce ClassUtil.
        ClassLoader trulyIncompetentLoader = new URLClassLoader(new URL[0], null);

        // 3. Eseguiamo il test.
        //    Ora la richiesta di caricare "ClassUtil" fallirà, perché:
        //    a) Il Bootstrap Loader (genitore) non la conosce.
        //    b) Il nostro loader ha un classpath vuoto e non può trovarla.
        ClassUtil.toClass(className, trulyIncompetentLoader);
    }
    /**
     * Test: resolve = false (No Inizializzazione)
     * Giustificazione: Verifica che il flag resolve venga passato correttamente
     * per prevenire l'inizializzazione statica.
     */
    @Test
    public void testToClass_ResolveFalsePreventsInitializationWithResolve() {
        ClassLoader standardLoader = ClassLoader.getSystemClassLoader();
        String className = StaticInitializerTestClass.class.getName();

        assertFalse("Lo stato iniziale del flag deve essere false", StaticInitializerTestClass.initialized);

        ClassUtil.toClass(className, false, standardLoader);

        assertFalse("Con resolve=false, il blocco static non deve essere eseguito", StaticInitializerTestClass.initialized);
    }


    // ========================================================================
    // == Test Suite per getClassName(Class cls)                             ==
    // ========================================================================

    //OK

    @Test
    public void testGetClassNameFromClass() {
        assertEquals("String", ClassUtil.getClassName(String.class));
    }

    @Test
    public void testGetClassNameFromPrimitiveClass() {
        assertEquals("int", ClassUtil.getClassName(int.class));
    }

    @Test
    public void testGetClassNameFromArrayClass() {
        assertEquals("Object[]", ClassUtil.getClassName(Object[].class));
    }

    @Test
    public void testGetClassNameFromNullClass() {
        assertNull(ClassUtil.getClassName((Class) null));
    }


    // ========================================================================
    // == Test Suite per getClassName(String fullName)                       ==
    // ========================================================================

    //DA QUI IN POI OK
    /**
     * Test: Standard (getClassName)
     * Input: "java.util.concurrent.Executors"
     * Esito atteso: "Executors"
     */
    @Test
    public void testGetClassName_Standard() {
        String input = "java.util.concurrent.Executors";
        assertEquals("Il nome della classe deve essere 'Executors'", "Executors", ClassUtil.getClassName(input));
    }

    /**
     * Test: Senza Package (getClassName)
     * Input: "MyClass"
     * Esito atteso: "MyClass"
     */
    @Test
    public void testGetClassName_NoPackage() {
        String input = "MyClass";
        assertEquals("Il nome della classe deve essere 'MyClass'", "MyClass", ClassUtil.getClassName(input));
    }

    /**
     * Test: Array di Oggetto Interno (getClassName)
     * Input: "[Ljava.util.List;"
     * Esito atteso: "List[]"
     */
    @Test
    public void testGetClassName_InternalObjectArray() {
        String input = "[Ljava.util.List;";
        assertEquals("Il nome della classe deve essere 'List[]'", "List[]", ClassUtil.getClassName(input));
    }

    /**
     * Test: Array di Primitivo Interno (getClassName)
     * Input: "[[Z"
     * Esito atteso: "boolean[][]"
     */
    @Test
    public void testGetClassName_InternalPrimitiveArray() {
        String input = "[[Z";
        assertEquals("Il nome della classe deve essere 'boolean[][]'", "boolean[][]", ClassUtil.getClassName(input));
    }

    /**
     * Test: Classe Annidata (getClassName)
     * Input: "java.util.Map$Entry"
     * Esito atteso: "Map$Entry"
     */
    @Test
    public void testGetClassName_NestedClass() {
        String input = "java.util.Map$Entry";
        assertEquals("Il nome della classe annidata deve essere 'Map$Entry'", "Map$Entry", ClassUtil.getClassName(input));
    }

    /**
     * Test: Stringa Vuota (getClassName)
     * Input: ""
     * Esito atteso: ""
     */
    @Test
    public void testGetClassName_EmptyString() {
        String input = "";
        assertEquals("Il nome della classe per una stringa vuota deve essere vuoto", "", ClassUtil.getClassName(input));
    }

    /**
     * Test: Null (getClassName)
     * Input: null
     * Esito atteso: null
     */
    @Test
    public void testGetClassName_NullInput() {
        assertNull("getClassName(null) dovrebbe restituire null", ClassUtil.getClassName((String) null));
    }
    // ========================================================================
    // == Test Suite per getPackageName(Class cls)                           ==
    // ========================================================================

    @Test
    public void testGetPackageNameFromClass() {
        assertEquals("java.lang", ClassUtil.getPackageName(String.class));
    }

    @Test
    public void testGetPackageNameFromPrimitiveClass() {
        // I tipi primitivi non hanno package
        assertEquals("", ClassUtil.getPackageName(int.class));
    }

    @Test
    public void testGetPackageNameFromArrayClass() {
        assertEquals("java.util", ClassUtil.getPackageName(Map[].class));
    }

    @Test
    public void testGetPackageNameFromNullClass() {
        assertNull(ClassUtil.getPackageName((Class) null));
    }


    // ========================================================================
    // == Test Suite per getPackageName(String fullName)                     ==
    // ========================================================================

    /**
     * Test: Standard (getPackageName)
     * Input: "java.util.concurrent.Executors"
     * Esito atteso: "java.util.concurrent"
     */
    @Test
    public void testGetPackageName_Standard() {
        String input = "java.util.concurrent.Executors";
        assertEquals("Il nome del package deve essere 'java.util.concurrent'", "java.util.concurrent", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Senza Package (getPackageName)
     * Input: "MyClass"
     * Esito atteso: ""
     */
    @Test
    public void testGetPackageName_NoPackage() {
        String input = "MyClass";
        assertEquals("Il nome del package deve essere una stringa vuota", "", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Array di Oggetto Interno (getPackageName)
     * Input: "[Ljava.util.List;"
     * Esito atteso: "java.util"
     */
    @Test
    public void testGetPackageName_InternalObjectArray() {
        String input = "[Ljava.util.List;";
        assertEquals("Il nome del package deve essere 'java.util'", "java.util", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Array di Primitivo Interno (getPackageName)
     * Input: "[[Z"
     * Esito atteso: ""
     */
    @Test
    public void testGetPackageName_InternalPrimitiveArray() {
        String input = "[[Z";
        assertEquals("Il nome del package per un array primitivo deve essere vuoto", "", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Classe Annidata (getPackageName)
     * Input: "java.util.Map$Entry"
     * Esito atteso: "java.util"
     */
    @Test
    public void testGetPackageName_NestedClass() {
        String input = "java.util.Map$Entry";
        assertEquals("Il nome del package deve essere 'java.util'", "java.util", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Stringa Vuota (getPackageName)
     * Input: ""
     * Esito atteso: ""
     */
    @Test
    public void testGetPackageName_EmptyString() {
        String input = "";
        assertEquals("Il nome del package per una stringa vuota deve essere vuoto", "", ClassUtil.getPackageName(input));
    }

    /**
     * Test: Null (getPackageName)
     * Input: null
     * Esito atteso: null
     */
    @Test
    public void testGetPackageName_NullInput() {
        assertNull("getPackageName(null) dovrebbe restituire null", ClassUtil.getPackageName( (String) null));
    }


    // MUTATION TESTING
//    @Test
//    public void testGetClassNameForMultiDimensionalPrimitiveArray() {
//        assertEquals("char[][]", ClassUtil.getClassName(char[][].class));
//    }
//
//    @Test
//    public void testGetClassNameForClassInDefaultPackage() {
//        assertEquals("MySimpleClass", ClassUtil.getClassName("MySimpleClass"));
//    }
//
//    @Test
//    public void testGetPackageNameForClassInDefaultPackage() {
//        assertEquals("", ClassUtil.getPackageName("MySimpleClass"));
//    }
//
//    @Test
//    public void testGetPackageNameForMultiDimensionalArray() {
//        assertEquals("java.lang", ClassUtil.getPackageName(String[][][].class));
//    }


}