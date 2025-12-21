package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_DO_ALGEBRA {
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","*","-"}, new int[] {2,3,4,5}
        );
        org.junit.Assert.assertEquals(
            result, 9, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","+","-"}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertEquals(
            result, 1, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","*"}, new int[] {10,5,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 44, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*","-"}, new int[] {10,5,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 148, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*","-"}, new int[] {9,10,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 268, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","*"}, new int[] {2,3,4,5,2}
        );
        org.junit.Assert.assertEquals(
            result, -35, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-","//","-"}, new int[] {10,2,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 8, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","*","*"}, new int[] {10,5,3,2,5}
        );
        org.junit.Assert.assertEquals(
            result, 20, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-","-","+","*","*"}, new int[] {10,2,4,2,5,2}
        );
        org.junit.Assert.assertEquals(
            result, 24, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*","-"}, new int[] {10,4,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 118, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*","-"}, new int[] {10,5,10,2}
        );
        org.junit.Assert.assertEquals(
            result, 498, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-"}, new int[] {10,5,2}
        );
        org.junit.Assert.assertEquals(
            result, 48, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*"}, new int[] {9,10,3}
        );
        org.junit.Assert.assertEquals(
            result, 270, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","*","*","-"}, new int[] {10,5,3,2,5,3}
        );
        org.junit.Assert.assertEquals(
            result, 17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","-","*"}, new int[] {10,5,3,2,5}
        );
        org.junit.Assert.assertEquals(
            result, 37, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","*","-","*"}, new int[] {10,10,5,10,2}
        );
        org.junit.Assert.assertEquals(
            result, 480, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","+","-"}, new int[] {10,4,3,2}
        );
        org.junit.Assert.assertEquals(
            result, 41, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","*"}, new int[] {2,3,4,5,10}
        );
        org.junit.Assert.assertEquals(
            result, -195, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-","*","+"}, new int[] {5,9,3,9}
        );
        org.junit.Assert.assertEquals(
            result, -13, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"//","+","*","//"}, new int[] {10,3,2,7,2}
        );
        org.junit.Assert.assertEquals(
            result, 10, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","+","*"}, new int[] {2,3,1,5,6,6}
        );
        org.junit.Assert.assertEquals(
            result, 36, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-","*","+"}, new int[] {4,9,3,9}
        );
        org.junit.Assert.assertEquals(
            result, -14, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+"}, new int[] {5,10}
        );
        org.junit.Assert.assertEquals(
            result, 15, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","*","-"}, new int[] {0,0,0,0}
        );
        org.junit.Assert.assertEquals(
            result, 0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","+"}, new int[] {1,5,2,3,9}
        );
        org.junit.Assert.assertEquals(
            result, 9, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","+"}, new int[] {1,5,2,4,9}
        );
        org.junit.Assert.assertEquals(
            result, 7, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","*","+","*"}, new int[] {3,4,6,6,1,8}
        );
        org.junit.Assert.assertEquals(
            result, -16, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","*","*"}, new int[] {1,5,2,3,3}
        );
        org.junit.Assert.assertEquals(
            result, -12, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"*","-","*","+","-"}, new int[] {3,4,6,6,1,8}
        );
        org.junit.Assert.assertEquals(
            result, -31, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-","*","-","*","+"}, new int[] {3,4,5,6,7,8}
        );
        org.junit.Assert.assertEquals(
            result, -51, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+","-","+","-"}, new int[] {1,5,2,4,9}
        );
        org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }
}