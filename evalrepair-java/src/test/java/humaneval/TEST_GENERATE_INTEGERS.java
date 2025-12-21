package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_GENERATE_INTEGERS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(2, 10);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2,4,6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(10, 2);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2,4,6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(132, 2);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2,4,6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(17, 89);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(6, 12);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(13, 25);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(50, 60);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(100, 200);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(201, 299);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(5, 5);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(11, 11);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(10, 5);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(5, 11);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(50, 34);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(5, 10);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(201, 13);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(34, 201);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(12, 5);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(6,8))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(34, 200);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(201, 10);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(299, 299);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(200, 299);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GENERATE_INTEGERS.generate_integers(99, 12345);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList())
        );
    }
}

