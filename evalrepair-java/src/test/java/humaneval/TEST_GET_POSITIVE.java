package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_GET_POSITIVE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,4,5,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,5,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,3,-5,2,3,3,9,0,123,1,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,3,2,3,3,9,123,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList())
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,-1,2,-2,3,-3,4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,3,-3,4,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,0,1,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,8,10,11,12,15,17,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,8,10,11,12,15,17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-3,-6,2,3,8,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3,8,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-4,-6,0,2,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-15,20,-20,25,-25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-3,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,0,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,2,-2,3,-3,4,-4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,0,1,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,1,2,-2,3,-3,4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-25,-20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-3,-6,2,3,8,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3,8,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,8,-1,0,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,8,11,12,15,17,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,8,11,12,15,17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,15,-3,20,-20,8,-25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,17,2,2,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,17,2,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,9,0,1,-10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,1,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-5,-4,-1,5,0,4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-4,-6,2,8,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,8,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-3,-4,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-5,-4,-1,5,0,4,1,4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,4,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-4,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,8,-3,-15,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,10,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-6,2,3,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-4,-1,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,0,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,8,-1,0,4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,8,11,12,15,17,-1,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,8,11,12,15,17,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,6,9,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-20,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,3,4,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,3,-3,20,-20,25,-20,-10,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,3,20,25,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,8,-1,0,1,4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-3,-4,-1,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-20,-20,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,3,4,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,3,4,-4,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-3,-6,2,3,10,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-20,-5,-4,-1,0,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-3,-6,2,3,10,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,3,10,1,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,15,-3,20,-20,8,-25,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,8,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-3,20,-20,25,-20,-10,5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,20,25,5,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,25,-20,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,19,25,-20,-5,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,19,25,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,10,3,-3,20,-20,25,-20,-10,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,10,3,20,25,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,10,-10,15,-15,20,-20,25,-25,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,10,15,20,25,25).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,8,1,-1,0,1,4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-5,-4,-1,5,0,-10,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-3,-4,-1,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-3,-6,2,3,8,1,-4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3,8,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,4,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,20,-20,25,-20,-10,5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(20,25,5,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(9,-2,-1,-1,-3,6,9,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,6,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,0,1,5,4,5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,5,4,5,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-4,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,1,-2,3,-3,4,-5,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,1,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-10,15,-3,20,-20,26,-20,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,15,20,26).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,4,4,-4,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-1,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,-1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-5,-4,-1,5,0,-10,1,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-1,0,1,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,1,3,-3,4,-5,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,-4,-1,0,1,5,6,1,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,5,6,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,2,-2,-3,4,-4,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,7,8,11,12,15,17,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,8,11,12,15,17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,5,9,-3,-6,2,3,8,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,9,2,3,8,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,3,4,-4,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,-5,-4,-1,0,1,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,8,-3,-15,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,8,-1,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,9,-3,-6,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,9,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,6,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,-5,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,2,-4,6,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,6,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-4,7,-100,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-3,-4,6,0,6,7,-9,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-4,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-3,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,6,0,6,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,2,-1,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-1,-3,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,6,7,-9,10,-3,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-8,1,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-5,-1,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-4,-5,0,6,-9,-5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,-9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-3,-4,-5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,1,-5,0,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,0,6,7,-9,10,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,-3,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,5,0,6,7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,0,5,7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-8,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,1,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,6,0,6,7,-9,10,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-8,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-4,7,-100,1,0,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,7,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,0,6,7,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,2,-1,-5,11,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,2,11,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,1,2,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,-5,6,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,1,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,6,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,8,-4,6,0,11,-6,-9,10,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6,11,10,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,1,2,6,7,-9,10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,-8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,2,-1,9,-5,0,6,-100,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,2,9,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,10,-5,6,7,-9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,6,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,8,-3,6,-2,-1,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,-5,0,1,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-3,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,0,6,7,-9,10,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-7,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,2,-4,-5,0,1,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,2,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-2,-5,-3,-4,6,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,5,7,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,5,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,-4,6,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,-2,10,6,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-4,-5,0,6,-9,-5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-5,-3,-4,6,0,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,6,-1,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,6,0,6,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,6,-5,7,-9,10,-3,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-8,1,1,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,1,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,1,1,-8,1,1,2,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,1,1,1,1,2,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,11,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,11,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,0,2,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,2,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-3,-5,0,0,6,7,-9,10,10,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,-1,-5,0,6,7,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-2,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-9,-3,-3,-4,6,0,6,7,-9,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,1,2,-4,-5,0,1,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,1,2,1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,7,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-6,-3,6,-1,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,-1,-5,0,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,2,6,7,-9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,6,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,6,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,-1,6,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-3,-3,2,-4,6,0,6,7,-9,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,6,7,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,1,0,-1,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,3,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,6,0,6,7,-9,10,-3,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,10,-5,7,-9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,3,6,7,2,-9,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,2,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-3,6,-2,-1,6,-4,-1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,-9,10,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,7,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-2,1,1,1,2,2,2,2,2,1,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-1,-5,0,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,6,-5,7,-9,10,-3,-9,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,6,7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,0,-9,10,5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-8,-4,8,-8,-2,-1,-5,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-1,-5,-1,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-3,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-3,-9,-8,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,-4,6,6,-8,7,-9,10,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,8,-3,6,-2,-1,-4,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,0,6,7,-9,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-4,-7,-3,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,3,1,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,3,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(9,-8,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,0,2,2,6,6,-9,10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,2,2,6,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,-100,6,-1,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,-5,-4,-3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-5,-3,-4,6,0,6,7,-9,-100,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,3,6,7,2,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,2,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,-1,6,11,0,6,7,-9,10,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,11,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,2,-4,6,-9,6,7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-1,-3,-4,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,0,6,7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-100,-101,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-2,-5,-3,-4,6,0,6,7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,0,6,7,-9,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(9,-8,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-4,-7,-3,0,6,7,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-7,-4,-4,-5,0,6,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-3,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-4,-7,-3,0,6,7,-9,10,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,1,0,6,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,1,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,2,-4,-5,0,1,2,6,7,-9,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,2,1,2,6,7,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,0,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-3,-5,0,0,6,7,-9,10,10,1,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-4,6,0,6,7,-9,10,5,-7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,1,2,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,-1,-5,0,6,2,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,2,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,7,-9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,6,7,-9,10,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,7,10,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-3,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-3,-4,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,0,6,7,-3,6,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,7,6,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-9,2,3,-4,-5,0,6,-9,-5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,3,0,-5,0,6,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,8,-4,6,0,11,-6,-9,10,7,7,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6,11,10,7,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-100,-101,1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-7,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-3,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9,-1,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-4,-101,-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,0,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,2,-4,-5,0,1,2,6,7,-9,11,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,2,1,2,6,7,11,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,-1,-5,0,6,7,1,10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,0,6,7,-9,10,6,6,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,7,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,5,7,-9,10,7,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,5,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-6,0,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-100,-101,1,1,1,1,-101))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,2,-4,-3,-5,0,0,6,7,-10,10,10,1,10,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,1,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1,2,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,6,7,10,6,6,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,7,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-3,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-4,-2,0,-3,6,-9,-5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,10,0,-3,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,10,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,1,-4,8,-3,6,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,1,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-5,0,2,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,-100,7,0,-9,10,5,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,11,-1,-3,-4,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,6,6,7,-9,6,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,6,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,10,9,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,9,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-4,6,0,6,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,6,0,6,7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-1,-2,-5,0,-5,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-1,-3,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,3,-5,-3,-4,6,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-3,-4,6,6,5,7,-9,10,7,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,5,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,-5,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,6,0,6,7,-9,10,-3,-4,-4,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,8,-9,-5,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,8,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,8,6,7,-9,10,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,8,6,7,10,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,2,-4,-3,-5,-100,0,0,6,7,-9,10,10,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,6,7,10,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,9,1,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,9,1,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,1,0,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-10,-4,6,0,6,-5,-9,10,-3,-9,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-1,-2,-5,-4,6,0,6,7,-9,10,5,-7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,6,7,2,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,-4,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,8,-3,6,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,6,7,-9,10,5,10,-9,-2,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,0,6,7,-9,10,10,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,7,10,10,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-10,-7,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,-2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,6,5,7,-9,10,7,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,6,5,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,-5,0,0,6,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,6,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-4,-5,0,2,2,6,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,2,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,1,-5,0,0,6,7,9,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,2,-4,1,-5,0,0,6,7,9,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,1,6,7,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,5,3,-1,-2,-5,0,6,7,10,6,6,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,5,3,6,7,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,7,-9,11,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,6,-2,-1,6,-4,-1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-8,1,2,2,2,2,2,2,-100,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,7,3,-4,-5,0,6,-9,-5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,7,3,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-3,-5,0,0,6,7,-9,10,10,1,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,0,-9,-3,-3,-4,6,0,6,7,-9,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,-4,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,10,1,-5,0,0,6,10,9,-9,10,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,10,1,6,10,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,6,5,10,-5,6,7,-9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5,10,6,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-101,-1,-5,0,6,7,-9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-5,-3,-4,6,0,6,7,-9,9,10,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-3,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,-4,8,-3,-100,6,-1,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,-1,11,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,11,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-1,-3,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-3,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,11,-1,-3,-4,-1,-5,-1,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,11,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-8,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,11,-1,-3,-1,-5,-1,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,11,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,-1,-5,0,6,7,1,10,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,9,-10,-7,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,9,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,6,7,2,-9,10,10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,6,-2,-1,6,-4,-1,8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,-100,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,1,-5,0,0,6,7,9,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,-9,10,6,-4,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,11,-1,-3,-4,-1,-5,-1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,11,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,6,0,6,7,-9,10,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,-2,-1,-5,-1,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,-5,0,6,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-1,-2,-5,-4,6,0,6,-8,-9,10,5,-7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,6,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-4,-3,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-5,0,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-1,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,-5,2,7,-9,10,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,10,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,-4,6,6,7,-7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,-3,-5,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,6,0,6,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,2,-7,-4,-4,-5,0,6,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,-5,-4,8,-3,-100,6,-1,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,-1,6,0,6,7,-8,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-8,1,1,11,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,11,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,2,-7,-4,-4,0,6,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,2,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,6,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,7,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,7,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,6,0,6,7,-9,10,-3,-4,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,-1,-6,-5,0,6,7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-1,-101,-1,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,1,3,-1,-2,-5,0,0,6,7,-9,10,6,6,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,3,6,7,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,0,6,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,7,6,7,10,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-4,8,-3,6,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-101,-9,-9,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,6,7,-9,-9,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,-1,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-1,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-1,-2,-5,-100,6,0,6,-8,-9,10,5,-7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,6,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,6,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-5,6,7,2,-100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,2,2,1,2,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,-7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,-3,-100,6,-1,-1,-5,-1,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-100,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-5,1,1,2,2,2,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,-10,-2,-1,6,-4,-1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,2,-4,1,-5,0,0,3,6,7,9,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,1,3,6,7,9,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,-9,10,6,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,7,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,5,6,0,6,7,-9,-9,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,5,6,6,7,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-4,-3,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,-5,7,-9,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,1,7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,7,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,3,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,3,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,-4,6,7,-7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,1,2,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,1,2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,4,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,4,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,0,6,7,-9,10,0,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,0,-7,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-100,-9,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-101,1,1,1,1,-101))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-3,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-6,0,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-7,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-4,8,8,-2,-100,6,-100,-1,-1,-5,-1,8,-100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,0,7,-9,10,7,-3,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-1,-2,-5,0,6,-5,7,-9,10,10,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,7,10,10,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,8,6,7,7,-9,10,1,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,8,6,7,7,10,1,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,3,-5,0,6,7,-9,11,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,7,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,1,3,-1,-5,0,0,6,7,-9,10,6,6,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,3,6,7,10,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-1,7,-100,1,0,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,10,-4,6,0,6,-7,7,-9,10,-3,-4,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,-10,-2,-1,6,-4,-1,8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,-7,-100,-4,-4,-4,0,6,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-2,-4,6,6,1,7,-9,10,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,1,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,9,-3,2,-4,-5,0,-100,-9,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,9,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,-1,-5,0,6,7,1,10,-5,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,0,6,7,-9,10,-3,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,2,-4,-5,0,6,7,-9,10,1,0,2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,2,6,7,10,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-1,7,-100,1,0,2,-9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,0,6,7,-9,10,10,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,-3,0,6,-9,10,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,8,6,7,-9,10,6,3,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,8,6,7,10,6,3,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,-7,-9,-100,-4,-4,-4,0,6,-9,10,6,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,6,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,-4,6,7,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,9,-8,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,0,6,7,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,5,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-1,-2,-5,0,6,-5,7,-9,10,0,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,7,10,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-6,0,8,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-5,6,-2,-1,6,-4,-1,8,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,1,-5,0,0,6,7,9,-9,10,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,9,10,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-5,-3,2,-4,6,-9,6,7,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-9,-4,8,-2,6,-1,-5,-1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-10,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,-1,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-4,-5,0,2,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-3,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,8,6,7,7,-9,10,1,0,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,8,6,7,7,10,1,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,10,-3,-5,11,-1,-3,-4,-1,-5,-1,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,10,11,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,1,2,-1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,1,2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-3,2,-4,-3,-5,0,0,6,7,-9,10,10,1,10,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-4,1,-5,0,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,6,-2,-1,6,-4,-1,8,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-5,2,6,7,2,-100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,0,6,2,2,6,6,-9,10,-5,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,6,2,2,6,6,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-10,-7,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-1,9,-5,0,6,-100,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,9,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,2,2,1,2,-10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-1,7,-100,1,0,2,-9,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,3,0,2,1,2,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,3,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,0,6,-1,7,-9,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,5,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-8,-1,-3,-5,-3,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,6,5,10,-5,6,7,-8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5,10,6,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-2,-5,0,6,7,4,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,4,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,6,6,7,-9,-1,5,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,1,-4,8,-3,7,6,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,1,8,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,2,-4,-3,-5,0,0,6,7,-10,10,10,1,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,10,1,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,0,6,6,7,-9,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,0,6,7,10,7,-5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-6,-5,-4,8,8,-2,-100,6,-100,-1,-1,-5,-1,8,-100,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,5,0,6,7,-9,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,-1,-1,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-6,-5,-4,8,8,-2,-100,6,-100,-1,-1,-5,-1,8,-100,-4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-2,-4,6,6,7,-9,10,5,10,-9,-2,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-5,0,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,1,-10,0,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,0,-4,6,0,6,7,-9,10,5,10,-9,-1,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5,10,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-7,-1,-1,11,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-100,-1,-5,0,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,-2,0,6,2,2,6,6,-9,10,-5,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,6,2,2,6,6,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,2,-4,-3,-5,-2,0,0,6,7,-9,10,10,1,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,2,6,7,10,10,1,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,1,-5,-1,0,0,6,7,9,-9,10,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,6,7,9,10,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-5,-1,-4,-100,-2,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-4,6,0,6,7,-9,10,6,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,0,6,7,-9,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,2,-9,-4,-1,7,-100,1,2,-9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,0,6,6,2,-9,10,10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,6,2,10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1,-2,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,5,0,-5,7,-9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,-4,6,0,6,7,-9,10,-3,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,6,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,-5,8,6,7,-9,10,6,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,8,6,7,10,6,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-4,-2,-5,-3,-4,6,0,6,7,-9,10,-5,0,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-2,-1,-3,-4,6,0,6,7,-9,-3,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-5,-3,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,-5,0,2,6,7,-9,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,6,7,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,9,0,-4,6,7,2,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,9,6,7,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-3,-4,-5,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,11,-3,-4,6,-3,-5,0,6,7,-9,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,7,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-9,-1,-3,-3,-4,6,0,6,7,-9,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,7,8,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,1,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-3,8,-5,6,0,11,-6,-9,10,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,6,11,10,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,0,6,7,-9,5,10,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,7,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-8,-10,2,2,2,2,2,2,-100,2,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,1,2,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,1,2,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,8,-3,6,-2,-1,6,-4,-1,8,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,8,6,6,8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-5,-3,-4,6,6,6,5,7,-9,10,7,-4,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,6,6,5,7,10,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-5,-4,-7,5,-3,0,6,7,-9,10,6,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,-7,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,6,7,2,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-1,-2,-5,-100,6,0,6,10,-9,10,5,-7,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,6,10,10,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,-1,-2,7,0,6,7,6,6,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,7,6,7,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,0,6,7,-9,10,5,10,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,6,7,10,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(10,2,-4,-5,-2,5,0,6,2,2,6,6,-9,10,-5,2,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10,2,5,6,2,2,6,6,10,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(11,-1,-2,-5,-3,-4,6,0,7,-2,5,10,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,6,7,5,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-100,-5,6,7,2,-101,-100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,0,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-100,-5,-8,7,2,-100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,-2,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,4,5,0,0,6,0,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,0,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,1,-3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,-3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,-1,1,-3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,99,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-2,1,99,2,2,2,2,-3,1,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,99,2,2,2,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,0,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,-1,1,-3,3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1,1,2,1,3,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,0,6,7,-9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-3,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,5,0,6,7,-9,10,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-6,-3,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-5,-3,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,-3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,-5,0,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,-1,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0,1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-1,-1,0,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,6,-4,5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,99,-1,6,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-2,-1,-5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,0,99,-1,6,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-9,-4,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,7,-2,-3,-4,-2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,6,-4,5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,1,-3,-4,5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-9,-3,-6,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0,3,1,0,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,3,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-3,1,1,1,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-3,-8,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-3,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-8,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-5,-5,0,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,7,-9,10,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,-6,1,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-5,-4,-3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,-3,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,6,1,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,6,1,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(99,3,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,6,1,1,2,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,6,1,1,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,99,2,2,2,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,99,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,2,-4,0,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,-4,-5,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-2,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,1,2,-1,1,-3,3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1,1,1,2,1,3,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-1,0,-1,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,6,1,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,6,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,10,0,98,3,1,0,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,98,3,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,-2,10,0,98,3,1,0,-4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,98,3,1,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,0,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,0,7,-9,10,0,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-2,1,2,-1,1,-3,-3,2,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,1,2,1,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-3,-4,-5,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,0,99,-1,6,-9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,3,-2,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,99,2,2,2,-3,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,99,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,0,5,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,-5,0,7,-9,10,0,1,-5,1,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,10,1,1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-3,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,0,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,7,-9,10,2,1,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,3,-2,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,99,0,2,2,2,-3,-5,2,1,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,99,2,2,2,2,1,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-8,-5,-5,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,0,99,-1,6,4,-9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,6,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,3,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,6,1,1,2,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,6,1,1,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,0,-1,-2,-9,-3,4,-6,-4,7,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-1,-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5,3,-6,-2,-1,-5,4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-1,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,99,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-1,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,99,3,-2,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,99,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,0,-1,-2,-9,-3,4,-6,-4,7,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4,7,9,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-1,-2,-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,6,1,2,2,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,6,1,2,2,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-6,99,-1,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-6,98,0,99,-2,6,-9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,6,1,1,2,1,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,6,1,1,2,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,6,1,1,2,1,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,6,1,1,2,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-9,-4,-9,-2,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-8,-3,-4,-5,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,-9,10,0,98,3,1,0,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,10,98,3,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-9,-9,-2,-1,-5,-5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,1,2,-4,-5,0,7,-9,-2,10,0,98,3,1,0,-4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,10,98,3,1,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-3,-4,-5,-3,-4,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,1,1,1,1,2,-1,1,-3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,-3,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-1,2,-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-4,-4,-1,-5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-4,5,0,6,7,-9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,99,3,-2,-5,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,99,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-9,-4,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,2,1,2,-1,1,-3,3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1,2,1,2,1,3,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,-3,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-9,-1,7,-3,-3,-4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,0,-1,-2,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-6,99,-2,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,2,-5,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,-2,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,0,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,7,-2,-3,-4,-7,-2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,1,-3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,0,7,-9,10,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-2,4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,6,-4,5,0,6,7,-9,10,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-2,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-1,-2,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-2,-10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-6,-1,-1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,0,99,-9,6,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,0,-1,-2,-9,-3,4,-6,-4,7,9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-9,-4,-6,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-3,-4,98,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-4,-2,98,-1,-5,-5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,98,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-4,4,-2,98,-1,-5,-5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-10,-4,6,-5,0,7,-9,10,0,1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,0,-1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-1,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,-6,1,1,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,98,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,98,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-2,1,2,-1,1,-3,-3,2,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,1,2,2,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,2,-3,0,7,-9,10,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-4,0,-1,-2,-1,-3,-4,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,6,1,2,1,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,6,1,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,-5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,0,1,1,1,2,2,1,-3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-4,-1,-5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-9,-1,7,-3,-3,-4,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,7,-2,-3,-4,-7,-2,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,6,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,0,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-1,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,6,1,2,2,2,4,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,6,1,2,2,2,4,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,2,-5,3,-3,-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,1,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,0,-1,-2,-9,-3,4,-6,-4,7,9,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4,7,9,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,0,-1,-2,-9,-3,4,-4,9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,6,1,1,2,1,2,2,2,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,1,1,2,1,2,2,2,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,98,-1,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,1,2,-1,1,-3,3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1,1,1,2,1,3,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,0,6,7,-9,9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,0,6,7,-9,9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,0,-9,-3,-6,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,99,1,1,6,1,2,2,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,99,1,1,6,1,2,2,2,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-6,-3,-4,9,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,-6,1,1,2,2,2,10,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,10,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,-1,99,5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(99,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,1,4,-3,-4,5,0,6,7,4,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,5,6,7,4,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,97))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,97).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,4,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-10,4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-6,-1,-1,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,7,0,6,7,-9,9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,6,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,0,-3,-4,-5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-9,-6,0,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,3,-2,97,-1,-5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,97,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,2,-5,3,-3,-2,2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-10,-9,-4,-6,-2,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,-4,-5,0,7,-9,10,0,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,10,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-2,1,2,-10,-4,6,-5,0,7,-9,10,0,1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,-7,-1,-3,-4,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,7,-9,10,2,1,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,2,1,2,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-9,-4,7,4,-2,98,-1,-8,-5,-5,-9,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,4,98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,1,2,-1,-3,3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,1,1,1,1,2,3,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,2,2,2,1,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,1,1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-4,-2,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2,1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,-6,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,1,1,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,1,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-8,-5,97,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(97).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,-9,1,1,1,2,2,1,-3,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,-7,1,1,-3,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-9,-1,7,-3,-3,-4,10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(3,-2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-10,-4,6,-5,0,7,-9,10,0,1,-5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-8,-3,-4,-10,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,1,-3,-3,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,2,1,2,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-2,-10,-4,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-5,-3,-4,9,-5,-5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-3,0,-5,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,99,1,2,2,1,-3,-3,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,99,1,2,2,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-2,-1,-9,-3,-6,-4,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(6,99,3,-2,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,99,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,-7,1,2,6,5,-1,1,-3,-3,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,1,2,6,5,1,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,1,-3,-3,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,2,1,2,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,-7,99,3,-2,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,99,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,5,7,0,6,7,-9,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,6,7,-9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,3,6,1,1,2,1,2,2,2,2,3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,6,1,1,2,1,2,2,2,2,3,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,98,1,-3,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,98,1,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,7,-2,-3,-4,-7,-2,9,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,9,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,2,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(98,-2,99,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,99,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(2,0,-1,-2,-9,-3,4,-6,-4,7,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,5,-1,6,7,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,6,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,2,-4,-5,0,7,-10,-6,0,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-3,5,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,98,99,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,98,99,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(7,1,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,1,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-9,-4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(1,1,6,1,1,2,1,2,2,2,0,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,6,1,1,2,1,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(0,-1,-1,-1,5,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-5,-2,-10,4,-4,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4).toArray()
        );
    }
}

