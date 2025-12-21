package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_UNIQUE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5,3,5,2,3,3,9,0,123))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,5,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(0,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,5,-1,3,5,2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList())
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,5,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,5,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1,3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(3,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,0,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,2,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,0,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(3,1,2,1,1,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,-1,5,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(3,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,5,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(0,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-5,5,0,-84,2,-19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-84,-19,-5,-2,0,2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,1,-19,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-19,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,-4,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,1,2,1,2,3,4,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,-4,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-4,-6,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-4,-4,-5,-6,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,9,9,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,6,9,9,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,6,9,9,9,10,5,7,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,7,8,8,8,9,9,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,-6,9,9,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,7,7,7,8,-4,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10,9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,6,7,7,7,8,8,8,8,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,-4,8,8,9,0,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,-4,8,8,9,9,9,10,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,10,-3,-4,-4,-4,-5,-6,-4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-1,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,7,10,-3,-4,-4,-4,-5,-6,-4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-3,-4,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,7,8,-4,6,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,7,7,7,8,-4,8,8,9,3,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,9,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-3,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,3,4,6,4,5,6,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,7,-3,-4,-4,-4,-5,-6,-4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,6,9,9,10,5,7,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,1,2,1,2,3,4,3,4,3,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,1,2,3,4,3,4,3,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,3,4,6,4,5,6,7,7,7,8,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,6,7,7,7,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,7,8,8,8,9,9,9,10,7,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,2,2,3,4,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,-4,8,9,0,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(7,1,2,2,3,4,4,5,6,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(7,1,2,2,3,4,5,6,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,10,-3,-4,-4,-4,-5,-6,-4,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,7,7,8,-4,6,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,7,7,7,8,-5,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,2,3,4,4,4,5,6,2,7,7,7,8,8,8,9,9,9,10,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,7,7,7,10,8,-4,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,-4,8,8,9,1,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-4,-5,-3,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(7,1,2,2,3,4,4,5,6,7,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,1,2,1,2,2,4,3,4,3,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,6,7,7,7,8,-4,6,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,3,1,2,1,2,2,4,3,4,3,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,0,1,2,0,1,2,1,2,3,4,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,5,3,1,2,1,2,2,4,3,4,3,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,-1,7,7,8,8,8,6,9,9,10,5,7,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,6,7,7,7,8,8,9,9,9,10,-1,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,3,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,-4,8,8,9,9,9,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,10,-3,-4,-4,-1,-5,-6,-4,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-2,-3,-3,-4,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,-4,8,8,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,1,2,1,2,3,3,4,3,4,2,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,2,2,3,4,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,3,1,2,1,2,2,4,3,4,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-6,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-2,-3,-3,-4,-4,-5,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-6,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-4,-5,-7,-3,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,3,4,3,4,2,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-3,-4,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,-4,8,8,9,9,9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,5,6,7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,7,-3,-4,-4,-4,-5,-6,-4,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,0,4,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,5,-61,3,1,2,1,2,2,4,3,4,3,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-61,1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,2,2,3,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,2,2,3,4,3,4,3,4,1,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,6,9,9,10,5,7,2,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,1,2,1,-6,3,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,6,7,7,7,8,8,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,5,4,4,5,6,7,7,7,8,8,8,6,9,9,10,5,7,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,-4,7,7,8,-4,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-6,1,2,2,3,4,4,5,6,7,7,8,-4,8,9,0,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-7,-4,-5,-6,-1,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-2,-3,-3,-4,-4,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,7,7,7,8,8,8,8,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-4,-5,-3,-6,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(3,7,1,2,2,3,4,5,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-3,-3,-5,-4,-5,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,7,-3,-4,-4,-4,-1,-4,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,-1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-6,-3,-3,-4,-4,-5,-3,-6,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,10,-3,-4,-4,-4,-5,-6,-4,123,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,10,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,-1,7,7,8,8,8,6,9,9,10,5,7,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-7,-4,-5,-6,-3,-1,-3,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,0,6,-4,7,7,8,-4,8,8,9,9,9,10,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,3,8,4,4,5,6,7,7,7,8,-4,6,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,2,4,4,4,5,6,2,7,7,7,8,8,8,9,9,9,10,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-1,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,2,3,4,6,4,5,6,7,7,7,8,8,8,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,2,2,1,3,4,3,4,3,4,1,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,9,1,2,1,-6,3,3,4,3,3,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(7,1,2,2,3,4,4,5,6,7,7,2,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-6,10,-3,-4,-4,-5,-6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,6,7,7,7,8,8,9,9,9,10,-1,10,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,9,7,7,7,8,-4,8,8,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,8,9,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,-3,-4,-4,-4,-5,-1,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-4,-3,-2,-1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,10,-3,-4,-4,8,-1,-5,-6,-4,-6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,-4,4,5,6,7,7,-4,8,9,0,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,8,8,9,9,9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,7,10,-3,-4,-4,-4,-5,-6,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(7,2,2,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,2,2,3,3,4,3,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-6,-3,-3,-1,-4,-4,-5,-3,-6,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1,2,1,2,2,4,3,4,3,5,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,9,1,2,-1,-6,3,3,4,3,3,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-1,1,2,3,4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,3,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,4,5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,-1,8,8,9,9,9,10,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,9,98,28))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,8,9,28,64,66,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,4,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,2,3,4,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,-1,8,8,9,2,9,9,10,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,4,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,7,-1,8,8,9,9,9,10,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,65,-4,-4,-4,-5,4,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,4,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-2,0,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,28,4,0,3,4,3,4,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,28).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,-3,5,6,7,7,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,-3,5,6,7,7,7,5,8,8,9,9,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,1,2,3,4,5,6,7,8,9,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,9,-2,-3,-3,-4,-4,-5,-4,-5,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,28,1,1,2,4,3,4,4,3,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,28).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-6,-2,0,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,-1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-4,4,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,-1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,28,1,1,2,4,3,4,4,4,3,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,28).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,2,1,2,1,2,3,4,3,4,3,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-3,65,-4,-4,-5,-6,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,2,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,8,9,9,-6,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-4,65,0,-2,-3,-3,-4,-4,-4,-4,4,-6,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,0,4,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,-6,10,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,0,1,2,1,2,1,2,3,4,3,4,4,0,3,4,3,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,2,4,3,4,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,-4,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,0,3,4,3,4,2,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,4,8,8,9,9,9,10,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,4,-6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,-2,2,1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,-1,8,8,9,2,9,9,1,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,1,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,7,7,4,7,8,8,8,9,9,9,-2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,6,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,-6,9,4,5,6,7,7,7,-1,8,8,9,9,9,10,8,6,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,3,-4,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,2,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,8,9,9,-6,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,2,3,6,4,3,1,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,8,9,9,3,9,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,5,7,7,4,7,8,8,8,9,3,9,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,4,4,5,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-6,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,2,3,6,4,3,1,4,5,6,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,3,4,5,6,7,7,4,7,8,8,8,9,9,-6,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,9,-2,-3,-3,-4,-4,-4,-5,-4,-5,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,-1,8,8,9,2,9,9,3,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,9,28))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,8,9,28,64,66).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,-3,28,66))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,-3,4,8,28,64,66).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(10,1,2,2,3,4,4,4,5,7,7,7,8,8,8,9,9,-6,10,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,4,2,3,4,4,4,5,6,7,7,8,8,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,0,2,4,3,4,2,3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,4,3,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,-4,4,0,3,4,3,4,2,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-2,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,9,4,4,5,6,7,7,7,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,3,4,4,4,5,7,7,4,7,8,8,8,9,9,9,-2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,-2,2,1,2,1,2,1,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,6,7,8,8,8,9,9,9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-5,-6,-3,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,2,1,2,1,2,3,4,3,4,-4,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,-6,10,6,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,7,4,4,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,2,3,6,4,3,1,4,5,6,7,7,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,-6,10,6,1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-3,65,-4,-4,-6,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,-3,2,3,4,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-5,-6,-3,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-4,-4,-4,-4,-5,-6,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,9,4,4,5,6,7,7,7,8,8,9,9,9,10,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-2,-4,-4,-5,-6,-3,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-2,-2,-3,-5,-3,-4,-4,-4,-5,-6,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,9,9,10,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,3,2,3,4,3,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,-4,4,0,3,4,3,4,2,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,3,4,4,4,5,6,7,6,7,8,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,3,4,5,6,7,7,4,8,7,8,8,8,9,9,-6,10,4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,4,4,4,5,7,7,4,7,8,8,8,9,9,9,-2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,1,2,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,2,3,6,4,3,64,1,4,5,7,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,1,2,3,4,5,6,7,64).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,4,4,4,5,6,7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,9,98,28,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,8,9,28,64,66,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,6,7,8,8,8,9,9,-6,10,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-3,-4,-4,-5,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,0,3,4,3,4,2,4,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-4,65,0,-3,-3,-3,-4,-4,-4,-4,4,-6,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,0,4,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,-6,5,6,7,7,7,8,8,8,9,9,9,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-2,-4,-6,-6,-3,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,-3,-4,-4,-4,-5,-6,-2,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,8,8,8,9,9,9,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,-3,3,4,4,4,5,7,7,4,7,8,8,8,9,9,9,-2,10,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,98,2,1,3,2,3,4,3,4,0,3,4,3,4,2,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,4,5,6,7,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3,-4,-4,-4,-4,-5,-6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,7,-3,-4,-4,65,-5,-6,-2,0,-3,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0,7,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,4,0,3,4,2,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,7,6,7,8,8,8,9,9,9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-4,65,-5,0,-2,-3,-3,-4,-4,-4,-4,4,-6,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,0,4,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,5,-4,4,0,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(10,1,2,2,3,4,4,4,5,7,7,7,8,8,8,9,9,-6,10,6,1,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,2,1,2,3,4,3,4,4,3,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,7,-1,8,8,9,2,9,9,3,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,65,-5,0,-2,-3,-3,-4,-4,-4,-4,4,-6,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,0,4,65).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,4,8,9,2,9,9,10,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,9,9,-6,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,9,-6,-2,-3,-3,-4,-4,-4,-5,-4,-5,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,-1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-3,-4,-4,-4,-5,-6,-3,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,8,3,4,5,6,7,7,4,8,7,8,8,8,9,9,-6,10,4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,-1,8,8,8,9,2,9,9,1,8,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,9,10,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,5,6,7,7,7,8,-3,8,9,9,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,3,4,4,4,5,0,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,3,4,5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,6,7,8,8,8,9,9,9,10,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,3,4,4,4,5,7,7,4,4,7,8,8,8,9,9,9,-2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,0,2,0,0,1,3,2,3,4,3,4,3,4,3,10,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,3,5,6,7,7,4,8,7,8,8,8,9,9,-6,10,4,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,123,2,4,4,5,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,6,7,9,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,7,7,6,7,8,8,8,9,9,9,10,5,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,-3,3,4,4,4,5,7,7,4,7,8,8,8,9,9,9,-2,10,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,2,1,2,3,4,3,-4,4,0,4,3,4,2,9,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,1,2,3,4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,7,-1,8,8,9,2,9,9,3,8,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,98,2,2,3,4,4,4,5,6,7,6,7,8,8,9,9,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,9,98,28,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,8,9,28,64,66,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(4,1,2,2,3,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,1,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3,7,4,4,4,5,6,7,7,-1,8,8,9,2,9,9,10,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,3,4,3,4,3,4,3,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,-3,-4,-4,-4,-5,-6,-2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,-5,-4,-3,-2,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,8,4,4,4,5,7,7,4,7,8,3,8,8,9,9,9,-2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,1,2,3,4,5,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,-3,2,3,3,4,5,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,-6,4,6,7,7,7,8,8,8,9,9,9,10,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,2,2,3,4,5,4,5,6,7,7,-1,8,4,8,9,2,9,9,10,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,7,-57,66,4,9,98,28))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,7,9,28,64,66,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,9,2,3,4,5,4,5,6,7,7,-1,8,4,8,9,2,9,9,8,6,2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(64,8,-57,66,4,8,98,28))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,4,8,28,64,66,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,64,9,123,4,4,5,4,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5,6,7,9,64,123).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,0,2,0,0,1,3,2,3,4,3,4,3,3,10,4,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,4,7,8,8,8,9,9,-6,10,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,1,2,3,4,5,6,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,-1,4,4,5,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,1,2,3,4,5,6,7).toArray()
        );
    }
}

