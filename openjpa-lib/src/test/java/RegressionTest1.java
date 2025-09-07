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
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("lang");
        boolean boolean12 = simpleRegex2.matches("java.lang");
        boolean boolean14 = simpleRegex2.matches("");
        boolean boolean16 = simpleRegex2.matches("lib");
        boolean boolean18 = simpleRegex2.matches("org.apache.openjpa");
        java.lang.Class<?> wildcardClass19 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("apache", false);
        boolean boolean4 = simpleRegex2.matches("apache");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("util");
        boolean boolean12 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("Object");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", true);
        boolean boolean4 = simpleRegex2.matches("util");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", true);
        boolean boolean4 = simpleRegex2.matches("apache");
        boolean boolean6 = simpleRegex2.matches("org");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        boolean boolean4 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org");
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
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
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
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean12 = simpleRegex2.matches("lib");
        boolean boolean14 = simpleRegex2.matches("openjpa");
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
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("apache");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("org.apache.openjpa");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa", true);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("java");
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
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("apache");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        boolean boolean14 = simpleRegex2.matches("lang");
        boolean boolean16 = simpleRegex2.matches("org.apache.openjpa.lib");
        java.lang.Class<?> wildcardClass17 = simpleRegex2.getClass();
        java.lang.String str18 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.openjpa.lib.util" + "'", str18, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
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
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("apache");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.openjpa.lib.util" + "'", str10, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.openjpa.lib.util" + "'", str11, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.openjpa.lib.util" + "'", str13, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib.util", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
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
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
        boolean boolean4 = simpleRegex2.matches("java");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("util", true);
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("Object");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean10 = simpleRegex2.matches("lang");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("SimpleRegex");
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
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache", true);
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
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("org.apache.openjpa");
        boolean boolean12 = simpleRegex2.matches("lib");
        boolean boolean14 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SimpleRegex" + "'", str4, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("SimpleRegex");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.openjpa.lib.util" + "'", str12, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SimpleRegex" + "'", str13, "SimpleRegex");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("lang");
        boolean boolean12 = simpleRegex2.matches("java.lang");
        boolean boolean14 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean8 = simpleRegex2.matches("java.lang");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SimpleRegex" + "'", str12, "SimpleRegex");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("lang");
        boolean boolean12 = simpleRegex2.matches("java.lang");
        boolean boolean14 = simpleRegex2.matches("");
        boolean boolean16 = simpleRegex2.matches("lib");
        boolean boolean18 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean20 = simpleRegex2.matches("lib");
        java.lang.Class<?> wildcardClass21 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", true);
        boolean boolean4 = simpleRegex2.matches("apache");
        boolean boolean6 = simpleRegex2.matches("org");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("java");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("org");
        boolean boolean6 = simpleRegex2.matches("lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("java.lang", false);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("java");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("Object");
        boolean boolean10 = simpleRegex2.matches("lib");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lang", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SimpleRegex" + "'", str5, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean8 = simpleRegex2.matches("util");
        boolean boolean10 = simpleRegex2.matches("Object");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.openjpa.lib.util" + "'", str14, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SimpleRegex" + "'", str15, "SimpleRegex");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org.apache.openjpa.lib", false);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("Object");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.openjpa.lib.util" + "'", str4, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.openjpa.lib.util" + "'", str5, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SimpleRegex" + "'", str6, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SimpleRegex" + "'", str7, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.openjpa.lib.util" + "'", str8, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.openjpa.lib.util" + "'", str9, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SimpleRegex" + "'", str10, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SimpleRegex" + "'", str11, "SimpleRegex");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("Object");
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
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        java.lang.String str14 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SimpleRegex" + "'", str14, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.openjpa.lib.util" + "'", str15, "org.apache.openjpa.lib.util");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
        boolean boolean4 = simpleRegex2.matches("lang");
        boolean boolean6 = simpleRegex2.matches("lib");
        boolean boolean8 = simpleRegex2.matches("java");
        boolean boolean10 = simpleRegex2.matches("openjpa");
        boolean boolean12 = simpleRegex2.matches("openjpa");
        boolean boolean14 = simpleRegex2.matches("util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.openjpa.lib.util" + "'", str6, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.openjpa.lib.util" + "'", str7, "org.apache.openjpa.lib.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SimpleRegex" + "'", str8, "SimpleRegex");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SimpleRegex" + "'", str9, "SimpleRegex");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("java");
        boolean boolean6 = simpleRegex2.matches("util");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean10 = simpleRegex2.matches("lib");
        boolean boolean12 = simpleRegex2.matches("SimpleRegex");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("Object", true);
        boolean boolean4 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        boolean boolean6 = simpleRegex2.matches("lang");
        boolean boolean8 = simpleRegex2.matches("lang");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("org.apache.openjpa.lib");
        boolean boolean14 = simpleRegex2.matches("apache");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", false);
        boolean boolean4 = simpleRegex2.matches("SimpleRegex");
        boolean boolean6 = simpleRegex2.matches("org.apache");
        boolean boolean8 = simpleRegex2.matches("org.apache.openjpa.lib.util");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("lib", true);
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("java.lang");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        boolean boolean8 = simpleRegex2.matches("org");
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("org", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("java.lang");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

