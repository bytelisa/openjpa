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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Class class0 = null;
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName(class0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("SimpleRegex");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "util" + "'", str1, "util");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("Object");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("SimpleRegex");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SimpleRegex" + "'", str1, "SimpleRegex");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib.util", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib.util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib.util", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib.util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("util", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("SimpleRegex", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SimpleRegex");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("SimpleRegex", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SimpleRegex");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.openjpa.lib" + "'", str1, "org.apache.openjpa.lib");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("org.apache.openjpa.lib");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lib" + "'", str1, "lib");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("SimpleRegex", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SimpleRegex");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("util", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("org.apache.openjpa.lib");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.openjpa" + "'", str1, "org.apache.openjpa");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("org.apache.openjpa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache" + "'", str1, "org.apache");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib.util", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib.util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "util" + "'", str1, "util");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apache" + "'", str1, "apache");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("util", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: util");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("lib");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("apache", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lib", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apache" + "'", str1, "apache");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("apache", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("lib");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lib" + "'", str1, "lib");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("lib", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("org.apache.openjpa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "openjpa" + "'", str1, "openjpa");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("apache", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("openjpa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Class class0 = null;
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName(class0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("Object");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object" + "'", str1, "Object");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("openjpa", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("openjpa", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("openjpa", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openjpa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("org", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org.apache.openjpa.lib", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.apache.openjpa.lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("org");
        boolean boolean6 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("openjpa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "openjpa" + "'", str1, "openjpa");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", true);
        boolean boolean4 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("org", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("apache", false);
        boolean boolean4 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("openjpa", true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lib", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lib");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
        boolean boolean4 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", true);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("org.apache");
        boolean boolean14 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("org");
        boolean boolean14 = simpleRegex2.matches("lang");
        boolean boolean16 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("apache");
        boolean boolean8 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        boolean boolean12 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("hi!");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("hi!");
        boolean boolean8 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        boolean boolean12 = simpleRegex2.matches("openjpa");
        boolean boolean14 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("org");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", false);
        boolean boolean4 = simpleRegex2.matches("org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean16 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", false);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("org.apache");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("apache", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean10 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org");
        boolean boolean16 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("openjpa");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str16 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str17 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.openjpa.lib.util" + "'", str16, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SimpleRegex" + "'", str17, "SimpleRegex");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("lang");
        boolean boolean16 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean18 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("openjpa");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("java");
        boolean boolean14 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.openjpa.lib.util" + "'", str15, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("openjpa");
        boolean boolean16 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("apache");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("java");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean12 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", false);
        boolean boolean4 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("apache");
        boolean boolean10 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        boolean boolean6 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", true);
        boolean boolean4 = simpleRegex2.matches("apache");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", false);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("lang");
        boolean boolean12 = simpleRegex2.matches("lang");
        boolean boolean14 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", false);
        boolean boolean4 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", false);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("openjpa", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", false);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("org.apache");
        boolean boolean14 = simpleRegex2.matches("");
        boolean boolean16 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("SimpleRegex");
        boolean boolean12 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache");
        boolean boolean16 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("apache", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", false);
        boolean boolean4 = simpleRegex2.matches("org.apache");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", false);
        boolean boolean4 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("apache", false);
        boolean boolean4 = simpleRegex2.matches("apache");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("org");
        boolean boolean10 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        boolean boolean10 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java", false);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.openjpa.lib.util" + "'", str15, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        boolean boolean10 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        boolean boolean10 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean8 = simpleRegex2.matches("lib");
        boolean boolean10 = simpleRegex2.matches("SimpleRegex");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str16 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str17 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str18 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str19 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str20 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SimpleRegex" + "'", str16, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.openjpa.lib.util" + "'", str17, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SimpleRegex" + "'", str18, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.openjpa.lib.util" + "'", str19, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SimpleRegex" + "'", str20, "SimpleRegex");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("openjpa");
        boolean boolean16 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("SimpleRegex", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str16 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.openjpa.lib.util" + "'", str15, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SimpleRegex" + "'", str16, "SimpleRegex");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

