package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_MAXIMUM_K {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,-4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4,-3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,2,1,2,-1,-2,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(123,-123,20,0,1,2,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,20,123));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-123,20,0,1,2,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,20));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,15,0,3,-13,-8,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-13,-8,0,0,3,5,15));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0,2,5,3,-10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,5,-7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4,4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-10,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,4,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,-4,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,10,3,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,5,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,0,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,0,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,4,10,3,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-3,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-3,-2,-3,-4,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,-3,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,-1,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,8,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,-3,1,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,-4,-5,-4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,4,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,4,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-4,-3,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,4,10,3,8,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,5,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1000,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,2,3,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,10,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,2,3,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,-3,1,-3,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,-3,-3,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-3,-3,-2,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,-1,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,-999,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,0,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-3,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,10,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2,2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,-3,10,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,10,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,11,-2,-3,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,10,11));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,-3,-4,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-3,-2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,4,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,4,10,3,8,3,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,4,10,3,8,3,8,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,-3,10,10,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-3,-2,-1,10,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1000,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-2,-3,8,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,4,10,3,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-3,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,4,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,4,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,3,5,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-4,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,1,-3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,-3,-3,10,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-3,-3,-2,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,1,-3,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0,1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-399,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,4,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(11));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,11));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(11));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-23,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,5,5,-5,7,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-60,-40,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,30,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-23,0,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,3,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-401,-1,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,11));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(998,999,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(50,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,100,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,3,100,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,-399,2,3,-23,243,-400,-400,0,1,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-23,0,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-100,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,100,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-401,-1,0,1,100,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,-5,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-23,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,30,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,100,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,-1000,5,30,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-22,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-22,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-1,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-59,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,1,2,3,-23,243,8,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-22,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-22,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-401));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-40,30,-40,1,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,3,3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-20,4,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,30,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-22,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,30,-100,100,-100,100,-100,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,5,5,-5,7,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-23,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,-22,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,244,3,-400,-400,0,243,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,3,3,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,-40,50,-60,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,-20,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,2,5,6,6,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,50,6,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,7,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,6,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-23,0,1,2,3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-401,2,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,100,-100,100,30,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,1000,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,0,1,2,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,-1000,5,30,-5,-5,0,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,-23,243,-399,-400,-400,0,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-20,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,30,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,30,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,5,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-22,-400,0,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-61,-20,30,1000,-40,50,-59,10,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,50,-60,49,-21,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-19,999,-20,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-19,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,1,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-23,0,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,8,-400,0,-401));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-22,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-22,0,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,-399,3,-23,243,-61,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(29,10,30,-20,30,1000,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-61,-400,0,1,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-61,-23,0,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,10,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,1000,-1000,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,0,0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,3,-400,-400,0,242,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(242,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-21,10,-20,6,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-1,-20,30,-40,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,29,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-1000,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-22,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-22,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-21,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,100,-100,100,31,30,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(31,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,8,-400,0,49));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,-40,50,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-401,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,-19,3,-23,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,5,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,5,100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,243,-400,-400,0,243,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,100,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,50,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,998,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,998));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,999,243,-400,-400,0,243,7,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,30,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,30,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,30,50,-60,30,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,244,3,-400,-400,0,243,-400,-400,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,3,3,3,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,1,2,3,-23,243,8,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,9,-40,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,1000,243,-401,-400,-400,0,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,2,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,1,2,3,-23,243,8,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-22,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-22,0,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,244,3,-400,-400,0,243,-400,-400,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,3,3,50,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-40,30,-40,1,-60,-40,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-40,30,-40,1,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-60,-40,-40,-40,-40,1,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,-100,100,-100,100,-100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,0,30,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-401,-1,0,1,30,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-20,4,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,999,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,30,50,-60,30,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,9,30,-40,30,50,-60,30,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-18,1,-19,3,-23,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-401,-1,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,100,0,1,-1,1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-401,-1,0,1,100,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,-1,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,0,30,1,-1,1000,-1000,1000,10,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,1,10,30,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,99,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,242,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,6,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,100,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-22,-400,-400,0,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-22,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,998,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,998));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,1,-1,1000,-1000,1000,-1000,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-40,-59,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,-59,10,-40,10,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,5,5,-5,7,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,100,-100,-99,100,31,30,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(31,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,243,-20,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,6,5,6,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,6,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,244,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,1,244,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-1,-40,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,-5,-400,-400,9,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,99,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,99));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,-20,30,-40,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,9,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,3,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,100,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,-40,50,242,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-100,99,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,-5,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,1,-1,1000,-1000,1000,-1000,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,1,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,1,100,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,1000,243,-401,-400,0,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,2,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,243,100,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,2,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,29,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,29,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,9,-23,243,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-23,0,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,243,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,-40,50,-59,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,1,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,243,2,3,-23,243,-400,-400,0,1,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,51,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-59,-40,-40,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,6,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,999,243,-400,-400,0,243,7,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,999,243,-400,-400,0,243,998,7,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-4,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,5,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,5,100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-61,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-61,-23,0,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,99,-100,100,-100,100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,-40,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,1,2,3,-23,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,-1000,5,30,-5,-5,-5,-5,-5,5,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,101,0,1,-1,1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-401,-1,0,1,101,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,242,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,3,242,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,244,3,-400,-400,0,243,-400,-400,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,3,50,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,-400,243,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-23,0,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,9,-23,243,-23,-400,-400,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,243,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-59,-40,-40,30,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,998,-5,-5,-5,-5,-5,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,998));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,243,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,30,50,-60,30,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,9,243,10,30,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,0,30,-40,50,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,2,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-61,-20,30,49,1000,-40,50,-59,10,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,9,-21,-40,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,244,3,2,-399,0,243,-400,-400,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,3,50,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,-40,50,242,50,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,99,5,5,5,-5,-5,-5,-5,-5,5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,99));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,999,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-40,-59,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,-40,-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,30,-400,-400,243,999,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,243,243,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,-1,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,50,242,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,-400,0,0,1,-1,1000,-1000,1000,-1000,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,50,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,-5,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-100,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-21,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-40,-20,30,999,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-999,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-19,30,-20,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-19,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,1,2,3,-23,243,8,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-23,1,2,3,8,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-22,243,-400,-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-22,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,1,998,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,998));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,1000,50,9,243,10,30,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,99,-22,-400,-400,0,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,3,99,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,-5,-5,-5,6,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,3,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,3,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-401,101,0,1,-1,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-401,-1,0,1,101,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,-59,-40,50,242,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-21));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-61,-20,30,49,1000,-40,50,-59,10,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-20,998,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,5,6,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,998,-5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,998));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-41,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,30,-399,-100,100,-100,100,-100,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,6,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-41,-40,30,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-999,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,243,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,243,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,8,-400,0,-401));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,8,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,5,6,7,4,-1,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-60,-59,-40,-40,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,1000,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,0,1,2,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-401,2,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,51,30,-40,-59,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-40,-20,30,999,-40,50,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,7,4,8,4,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-40,-59,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-59,-40,-40,-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,-400,0,243,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-20,50,-60,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-19,30,-20,-4,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-19,-4,10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-40,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,10,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,999,243,-400,-400,0,0,243,7,-400,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,7,4,8,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-40,-20,30,999,-40,50,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,244,30,-40,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,243,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,29,-60,10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,29,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,100,5,5,2,5,5,243,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,100,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,999,243,-400,-400,0,243,244,998,7,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-60,-40,-39,50,-60,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,-23,243,-400,0,243,-400,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,-1,1000,-1000,1000,-1000,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,3,1000,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,4,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-4,2,3,1000,243,-400,-400,0,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4,0,2,3,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,30,-40,50,-60,-40,-20,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,8,4,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,51,10,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,242,-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,-5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-60,-40,-40,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-23,0,1,3,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,3,-400,-1,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,100,5,5,2,5,-4,5,-40,243,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,100,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,7,4,100,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-21,10,-20,30,-40,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,2,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,1000,-1000,-1,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,-1,5,5,-22,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,-60,6,7,4,100,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-19,30,-20,100,-4,-60,-60,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-399,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,1,100,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,244,30,50,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,-61,50,-60,-1,-40,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,1,2,3,-23,243,-400,-400,0,29,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,50,-60,49,5,-21,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,49,50,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,-999,1000,-999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,5,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,5,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-999,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-40,-20,30,-40,10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,243,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-22,243,-400,-400,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-22,1,1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(998,999,-21));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,5,5,-5,7,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-23,243,3,-400,-400,0,243,-400,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-5,50,-60,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,-5,10,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,1,2,3,-23,243,8,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,8,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-400,-400,-23,0,1,2,3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,-1,5,5,-22,5,5,5,5,-5,-4,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,30,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,1,-60,-40,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-20,30,-40,50,-60,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,1,-400,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,3,-400,-400,0,243,-400,-400,3,243));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(29,10,30,-20,30,1000,-40,50,-59,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,29,-40,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(29,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,0,0,1,-1,1000,-1000,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,4,5,5,5,5,-1000,5,30,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,244,30,-40,-62,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,-40,50,-60,51));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,1000,243,-400,-400,0,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,1,2,2,3,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,1,2,3,-23,243,8,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-23,1,2,3,8,243,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,3,5,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,1,-1,1000,-1000,-1,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,51));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-6,10,-20,30,-59,-40,50,-59,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,0,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-41,50,-60,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,11,-20,30,-40,50,-60,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,-5,-5,-5,-5,5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,2,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,99,-22,-400,-400,0,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-22,0,1,2,3,99,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,-20,4,243,-400,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,-20,30,-40,-59));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,-1000,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-99));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,243,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50,-60,-20,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,3,-400,-1,-400,0,243,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,50,-60,51,-40,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-40,-20,30,999,50,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,8,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,51,10,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,-40,50,-59,10,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,4,5,5,5,5,5,5,-5,7,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-61,-20,30,1000,-40,50,-59,10,30,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,-40,50,-60,51));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,6,0,243,-400,-23,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,100,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,-23,243,-399,-400,-400,0,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-23,0,1,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,6,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,6,30,-40,51,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-61,-20,30,49,1000,-40,50,-59,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-21,244,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(244,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,1,3,-23,243,-400,0,243,-400,-23));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,1,3,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-19,999,-20,-1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-19,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-59,50,-60,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,2,5,5,5,5,-5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,4,100,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,7,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,-19,2,-23,243,-400,-400,0,-400));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,0,-1,1000,-1000,1000,-1000,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,3,1000,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-20,-40,50,-61,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-10,-15));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-10,-5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,10,5,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3,-4,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,1000,-999,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-10,-15));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,999,-999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,80,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,-40,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-40,10,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,9,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,9,49,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,10,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-60,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-1000,-20,30,-40,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-60,10,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-40,-1,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,9,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,9));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,1,101,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,30,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,80,6,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,49));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,-1000,0,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1000,-1,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,999,-999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-999,999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1000,0,4,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,-1,0,1,4,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,1000,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1000,0,5,4,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,0,1,4,5,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,243,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,49,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(11,30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,30,49,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,5,4,8,4,4,5,5,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,242,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,5,8,-400,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-100,100,-5,100,-100,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,5,8,-400,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,101,-5,100,-100,-60,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,5,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,-60,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,51,30,-40,50,-60,50,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,101,-60,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(79,80,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,79,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-1000,-20,30,50,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,3,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,101,-5,100,-100,-60,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,101,-5,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000,1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-100,100,-5,100,-100,100,-5,-6,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-1000,-20,30,-40,50,10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,10,79));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,79));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,9,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,999,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-99,99,100,-1,-100,100,-5,100,-100,100,-5,-6,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,99,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(99,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,242,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,101,-60,-1,6,80,6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,80,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,243,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,9,49,-20,29,49,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,8,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,999,5,5,5,5,-5,-5,-5,-5,-5,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,6,7,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-2,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4,6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(81,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-101,-1,6,-60,80,81,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,5,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,-20,30,-40,-20,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,5,6,7,5,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-101,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,6,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,6,80,81,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-2,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-5,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-101,-1,6,-60,80,81,-2,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,5,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,50,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,80,-101,-1,6,-60,80,81,-2,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,9,49,-20,30,50,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,-400,4,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,0,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,-20,30,-40,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,10,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,101,-60,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,0,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,81,6,7,4,8,4,4,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,101,-60,-1,6,80,6,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,-1,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4,4,4,4,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,5,8,-400,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,4,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,8,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,29,6,81,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-40,9,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,-60,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,244,3,243,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,243,244));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,51,4,2,5,6,7,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,30,49,-60,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,30,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,-1,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,80,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,3,-100,100,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-2,5,6,7,4,8,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,6,79,80,80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(82,-6));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,-99,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,-99,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-99,-99,0,80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,-5,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,999,5,5,-101,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,6,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,999,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-19,30,30,49,-60,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,30,30,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,6,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,0,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,6,7,8,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-4,-100,100,-5,100,999,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-23,243,-400,-400,0,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,242,4,8,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,8,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-2,5,6,4,8,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-5,101,-100,100,999,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,101,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,78,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-2,5,30,6,4,8,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(243,2,5,6,7,4,8,4,243,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,5,-100,-5,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,51,4,2,5,6,7,4,4,101,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,51,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,80,-40,-1,82));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,82));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,-100,100,100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,6,7,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,-100,100,-5,100,3,-100,100,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-100,999,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,-60,9,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,5,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,80,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,2,5,5,4,8,4,4,5,5,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,1,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,6,7,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,4,4,4,4,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,2,5,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4,4,4,4,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(49,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,49));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,10,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,9,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,8,9));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(79,80,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,79,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,30,30,49,-60,-20));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(51,100,-100,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,51,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,6,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,10,79));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,79));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,51,10,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-999,80,80,-40,-1,82));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,82));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-101,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,78,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,243,3,5,6,7,5,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,-100,100,-100,100,-5,100,-100,30,100,-5,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,6,7,5,8,5,-400,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,-100,100,-5,100,3,-100,79,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,81,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,5,-100,-5,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,4,4,4,4,5,5,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,80,3,-23,243,-400,-400,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,101,-5,100,-100,99,999,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,101,999,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,3,243,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,30,-40,50,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,29,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,99,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,51,30,-40,-60,50,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,5,5,5,999,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,6,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,101,101,-100,100,-100,101,-5,100,-100,-60,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,101,101,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-5,0,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,7,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,-100,100,-5,100,3,-100,79,999,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,999,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,5,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,6,8,10,10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,51,4,2,5,6,7,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,6,7,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,100,-100,99,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(99,100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,-23,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2,3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,-40,-60,50,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,101,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,-1,1000,-1000,1000,-1000,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,0,0,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,80,3,243,-400,-400,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,2,5,6,7,4,8,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4,4,4,4,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,6,242,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-100,100,-5,100,-100,100,-5,-6,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,29,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1000,0,4,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1000,-1,-1,0,4,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,81,78,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-20,11,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(11,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,30,100,-5,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,51,30,-40,50,-60,50,-40));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,6,5,-6,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,99,81,6,2,4,8,4,4,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81,99));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,51,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4,2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,8,101,101,-60,-1,6,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,100,80,-100,100,-100,100,-99,-100,-99,100,-100,100,0,-99));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,99,-5,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,99,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-40,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-40));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-60,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,30,5,6,7,5,8,-400,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,5,6,243,4,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,-23,243,-400,-400,0,3,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,242,4,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,6,8,242));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,-60,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,101,-5,100,-101,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,6,7,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,6,80,81,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,5,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-1,-100,100,-5,100,-100,100,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-6,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,5,5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,101,-5,100,-100,-60,100,-5,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,-5,-5,-5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,4,4,4,5,5,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,5,5,4,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,-100,100,0,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,80,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,4,5,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,10,0,1,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,80,-1,6,80,81,79,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(243,2,5,6,83,7,4,8,4,243,29,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(243,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,80,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,6,80,81,-1,-2,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,-99,-100,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,6,80,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,-5,5,-5,-5,-5,4,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,-5,-5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,5,5,5,5,5,5,5,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,-100,100,-100,100,79,-99,-100,100,-100,100,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,30,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,-1000,0,4,1,-1,1000,-1000,1000,-1000,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1,0,0,1,4,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,10,0,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,5,6,7,4,8,4,4,5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-2,4,4,4,5,5,6,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,10,0,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,5,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,-100,100,-5,100,3,-100,79,-99,999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,9,100,-101,-100,100,-5,100,3,-100,-99,999,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,80,6,80,81,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,80,100,-100,100,-100,100,-100,100,-100,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,2,7,5,6,243,8,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-20,30,-40,-60,50,30));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,30,9,49,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(9,10,30,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,5,6,7,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-100,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,-100,100,-100,100,-100,100,-100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-100,-100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,30,5,6,7,5,8,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8,30));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,-1000,-20,30,-40,50,10,10,10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(10,10,30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,6,7,8,4,4,4,7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,-100,100,-100,100,-6,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-6,100,100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(49));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,6,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-23,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,-1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,10,5,5,5,5,5,5,5,-5,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,5,6,7,4,8,4,4,5,5,4,8));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1,0,4,1,-1,1000,-1000,1000,-1000));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,4,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-1,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,79,-1,6,80,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000,999,-999,999,-999));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(999,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,5,6,7,5,4,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,4,8,5,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-100,100,-100,100,-100,100,-100,100,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,49,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-20,10,30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0,0,1,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,100,101,-5,100,82,-100,99,999,999,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,101,999,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,82));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1000,-100,100,-100,100,-5,100,-100,30,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(999,9,49,50,-20,30,-40,50));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(50,50,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,49,-20,30,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-60,-40,-20,11,30,49,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,-5,-5,-5,6,-5,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,-5,5,5,5,5,5,5,5,6));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,-100,100,-5,100,-100,100,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,51,4,2,5,6,7,4,4,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5,6,7,51));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-59,10,-20,30,9,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(30,50));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,6,80,78,81,79,-1,-2,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80,81));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-101,-100,100,-5,100,3,-100,79,999,-100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(244));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(49,-20,100,-40,50,-60));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(49,50,100));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-100,100,-100,101,-5,100,-100,-60,100,99,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-5,99,100,100,100,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,-5,-5,-5,101,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-1,-2,-1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,0,-5,-5,-5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,1,-1,1000,-1000,1000,-1000,1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1000,-1,0,0,0,1,1,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,83,100,-5,101,-100,100,999,100));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(100,100,100,101,999));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,-1,83,1000,-1000,1000,-1000,0,0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,0,0,0,0,0,83,1000,1000));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1007() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,7,4,8,4,4,4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4,5,7,8));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1008() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(80,-2,-1,-2));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-1,80));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1009() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,-6,3,-23,243,-400,-400,3,3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3,243));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1010() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8,-60,10,-1,6,10,80));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-60,-1,6,8,10,10,80));
        org.junit.Assert.assertEquals(desired, result);
    }
}

