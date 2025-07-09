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
import org.junit.Test;

import static org.junit.Assert.*;

public class LLMClassUtilTest {

    /**
     * Test della conversione di tipo primitivo ("int") in classe.
     */
    @Test
    public void testToClassPrimitiveInt() {
        Class<?> result = ClassUtil.toClass("int", null);
        assertEquals(int.class, result);
    }

    /**
     * Test della conversione di array primitivo ("int[][]") in classe.
     */
    @Test
    public void testToClassPrimitiveArray() {
        Class<?> result = ClassUtil.toClass("int[][]", null);
        assertEquals(int[][].class, result);
    }

    /**
     * Test della conversione di tipo oggetto ("java.lang.String") in classe.
     */
    @Test
    public void testToClassReferenceType() {
        Class<?> result = ClassUtil.toClass("java.lang.String", null);
        assertEquals(String.class, result);
    }

    /**
     * Test della conversione di array di oggetti ("java.lang.String[][]") in classe.
     */
    @Test
    public void testToClassReferenceArray() {
        Class<?> result = ClassUtil.toClass("java.lang.String[][]", null);
        assertEquals(String[][].class, result);
    }

    /**
     * Test per verifica della gestione delle stringhe null in toClass().
     */
    @Test(expected = NullPointerException.class)
    public void testToClassNullInput() {
        ClassUtil.toClass(null, null);
    }

    /**
     * Test per verifica della gestione di classi inesistenti.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToClassInvalidClass() {
        ClassUtil.toClass("non.existent.ClassName", null);
    }

    /**
     * Test che verifica la restituzione del nome semplice da una classe.
     */
    @Test
    public void testGetClassNameFromClass() {
        String name = ClassUtil.getClassName(String.class);
        assertEquals("String", name);
    }

    /**
     * Test che verifica la restituzione del nome semplice da una stringa con nome completo.
     */
    @Test
    public void testGetClassNameFromFullName() {
        String name = ClassUtil.getClassName("java.util.List");
        assertEquals("List", name);
    }

    /**
     * Test che verifica l'estrazione del nome da un array primitivo codificato.
     */
    @Test
    public void testGetClassNamePrimitiveArrayCode() {
        String name = ClassUtil.getClassName("[[I");
        assertEquals("int[][]", name);
    }

    /**
     * Test che verifica il nome semplice per un array di oggetti.
     */
    @Test
    public void testGetClassNameObjectArray() {
        String name = ClassUtil.getClassName("[[Ljava.lang.String;");
        assertEquals("String[][]", name);
    }

    /**
     * Test che verifica il comportamento con input null in getClassName.
     */
    @Test
    public void testGetClassNameNull() {
        assertNull(ClassUtil.getClassName((String) null));
    }

    /**
     * Test per verificare il comportamento con una stringa vuota.
     */
    @Test
    public void testGetClassNameEmpty() {
        String name = ClassUtil.getClassName("");
        assertEquals("", name);
    }

    /**
     * Test che verifica l'ottenimento del package name da una classe.
     */
    @Test
    public void testGetPackageNameFromClass() {
        String pkg = ClassUtil.getPackageName(String.class);
        assertEquals("java.lang", pkg);
    }

    /**
     * Test che verifica l'ottenimento del package name da una stringa con nome completo.
     */
    @Test
    public void testGetPackageNameFromFullName() {
        String pkg = ClassUtil.getPackageName("java.util.Map");
        assertEquals("java.util", pkg);
    }

    /**
     * Test che verifica l'ottenimento del package name da un array di oggetti.
     */
    @Test
    public void testGetPackageNameObjectArray() {
        String pkg = ClassUtil.getPackageName("[[Ljava.util.Map;");
        assertEquals("java.util", pkg);
    }

    /**
     * Test che verifica l'ottenimento del package name da un array primitivo.
     */
    @Test
    public void testGetPackageNamePrimitiveArray() {
        String pkg = ClassUtil.getPackageName("[[I");
        assertEquals("", pkg);
    }

    /**
     * Test che verifica il comportamento di getPackageName con input null.
     */
    @Test
    public void testGetPackageNameNull() {
        assertNull(ClassUtil.getPackageName((String) null));
    }

    /**
     * Test che verifica il comportamento di getPackageName con stringa vuota.
     */
    @Test
    public void testGetPackageNameEmpty() {
        assertEquals("", ClassUtil.getPackageName(""));
    }

}
