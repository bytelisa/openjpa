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

    @Test
    public void testToClassForPrimitiveType() {
        assertEquals("Deve caricare tipi primitivi", boolean.class, ClassUtil.toClass("boolean", null));
    }

    @Test
    public void testToClassForFullyQualifiedName() {
        assertEquals("Deve caricare classi standard", String.class, ClassUtil.toClass("java.lang.String", standardLoader));
    }

    @Test
    public void testToClassForPrimitiveArray() {
        assertEquals("Deve gestire array di primitivi", int[].class, ClassUtil.toClass("int[]", null));
    }

    @Test(expected = NullPointerException.class)
    public void testToClassThrowsNPEForNullInput() {
        ClassUtil.toClass(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToClassEmptyInputThrowsException() {
        ClassUtil.toClass("", standardLoader);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testToClassThrowsIllegalArgumentForNonExistentClass() {
        ClassUtil.toClass("Elisa.Marzioli", null);
    }

    @Test
    public void testToClassWithNullLoaderUsesContextLoader() {
        assertEquals(Object[].class, ClassUtil.toClass("java.lang.Object[]", null));
    }

    // ========================================================================
    // == Test Suite per toClass(String str, boolean resolve, ClassLoader loader) ==
    // ========================================================================

    @Test
    public void testToClassForPrimitiveTypeWithResolve() {
        assertEquals("Deve caricare tipi primitivi", boolean.class, ClassUtil.toClass("boolean", false,null));
    }

    @Test
    public void testToClassForFullyQualifiedNameWithResolve() {
        assertEquals("Deve caricare classi standard", String.class, ClassUtil.toClass("java.lang.String", true, standardLoader));
    }

    @Test
    public void testToClassForPrimitiveArrayWithResolve() {
        assertEquals("Deve gestire array di primitivi", int[].class, ClassUtil.toClass("int[]", false, null));
    }

    @Test(expected = NullPointerException.class)
    public void testToClassThrowsNPEForNullInputWithResolve() {
        ClassUtil.toClass(null, true, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToClassEmptyInputThrowsExceptionWithResolve() {
        ClassUtil.toClass("", false, standardLoader);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testToClassThrowsIllegalArgumentForNonExistentClassWithResolve() {
        ClassUtil.toClass("Elisa.Marzioli", true, null);
    }

    @Test
    public void testToClassObjectArrayWithNullLoaderSucceedsWithResolve() {
        assertEquals(Object[].class, ClassUtil.toClass("java.lang.Object[]", false,null));
    }

    @Test
    public void testToClassFalseDoesNotInitializeWithResolve() {
        String className = "org.apache.openjpa.lib.ClassUtilTest$StaticInitializerTestClass";

        Class<?> cls = ClassUtil.toClass(className, false, getClass().getClassLoader());

        assertEquals(StaticInitializerTestClass.class, cls);
        assertFalse(StaticInitializerTestClass.initialized);
    }

    @Test
    public void testToClassWithNullLoaderUsesContextLoaderWithResolve() {
        assertEquals("Deve usare un loader di default se quello fornito è null",
                String.class, ClassUtil.toClass("java.lang.String", false, null));
    }


    // ========================================================================
    // == Test Suite per getClassName(Class cls)                             ==
    // ========================================================================

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

    @Test
    public void testGetClassNameFromString() {
        assertEquals("String", ClassUtil.getClassName("java.lang.String"));
    }

    @Test
    public void testGetClassNameFromPrimitiveArrayString() {
        assertEquals("boolean[]", ClassUtil.getClassName("boolean[]"));
    }


    @Test
    public void testGetClassNameFromEmptyString() {
        assertEquals("", ClassUtil.getClassName(""));
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

    @Test
    public void testGetPackageNameFromString() {
        assertEquals("java.util", ClassUtil.getPackageName("java.util.Map"));
    }

    @Test
    public void testGetPackageNameFromStringWithoutPackage() {
        // Classi nel package di default
        assertEquals("", ClassUtil.getPackageName("Elisa"));
    }

    @Test
    public void testGetPackageNameFromEmptyString() {
        assertEquals("", ClassUtil.getPackageName(""));
    }

    @Test
    public void testGetPackageNameFromNullString() {
        assertNull(ClassUtil.getPackageName((String) null));
    }


//     Test generato con LLM per ampliare la Test Suite e aumentare la coverage
    @Test
    public void testGetClassNameFromInnerClassString() {
        /**
         * Questo è un test di partizione più specifico per il formato della stringa di input.
         * Verifica la capacità del metodo di gestire correttamente i nomi di classi interne,
         * che in Java usano il carattere $ come separatore invece del punto.
         * Assicura che la logica di parsing isoli correttamente il nome della classe interna,
         * ignorando sia il package che la classe esterna.
         */
        assertEquals("Map$Entry", ClassUtil.getClassName("java.util.Map$Entry"));
    }


}