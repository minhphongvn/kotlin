/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/resolve/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirDiagnosticsTestGenerated extends AbstractFirDiagnosticsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInDiagnostics() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/fir/resolve/testData/diagnostics/j+k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J_k extends AbstractFirDiagnosticsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJ_k() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/diagnostics/j+k"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("complexFlexibleInference.kt")
        public void testComplexFlexibleInference() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/complexFlexibleInference.kt");
        }

        @TestMetadata("FunctionTypeInJava.kt")
        public void testFunctionTypeInJava() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/FunctionTypeInJava.kt");
        }

        @TestMetadata("KJKComplexHierarchy.kt")
        public void testKJKComplexHierarchy() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KJKComplexHierarchy.kt");
        }

        @TestMetadata("KJKComplexHierarchyNestedLoop.kt")
        public void testKJKComplexHierarchyNestedLoop() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KJKComplexHierarchyNestedLoop.kt");
        }

        @TestMetadata("KJKComplexHierarchyWithNested.kt")
        public void testKJKComplexHierarchyWithNested() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KJKComplexHierarchyWithNested.kt");
        }

        @TestMetadata("KJKInheritance.kt")
        public void testKJKInheritance() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KJKInheritance.kt");
        }

        @TestMetadata("KJKInheritanceGeneric.kt")
        public void testKJKInheritanceGeneric() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KJKInheritanceGeneric.kt");
        }

        @TestMetadata("KotlinClassParameter.kt")
        public void testKotlinClassParameter() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KotlinClassParameter.kt");
        }

        @TestMetadata("KotlinClassParameterGeneric.kt")
        public void testKotlinClassParameterGeneric() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/KotlinClassParameterGeneric.kt");
        }

        @TestMetadata("outerInnerClasses.kt")
        public void testOuterInnerClasses() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/j+k/outerInnerClasses.kt");
        }
    }

    @TestMetadata("compiler/fir/resolve/testData/diagnostics/samConversions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SamConversions extends AbstractFirDiagnosticsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSamConversions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/diagnostics/samConversions"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("genericSam.kt")
        public void testGenericSam() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/genericSam.kt");
        }

        @TestMetadata("kotlinSam.kt")
        public void testKotlinSam() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/kotlinSam.kt");
        }

        @TestMetadata("notSamBecauseOfSupertype.kt")
        public void testNotSamBecauseOfSupertype() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/notSamBecauseOfSupertype.kt");
        }

        @TestMetadata("runnable.kt")
        public void testRunnable() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/runnable.kt");
        }

        @TestMetadata("samSupertype.kt")
        public void testSamSupertype() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/samSupertype.kt");
        }

        @TestMetadata("samSupertypeWithOverride.kt")
        public void testSamSupertypeWithOverride() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/samSupertypeWithOverride.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/fir/resolve/testData/diagnostics/samConversions/simple.kt");
        }
    }
}
