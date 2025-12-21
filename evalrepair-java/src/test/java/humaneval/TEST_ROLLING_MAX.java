package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_ROLLING_MAX {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList())
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,3,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,2,3,100,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,3,3,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,3,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,4,3,5,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,4,5,5,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,15,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(7,2,4,1,8,6,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7,7,7,7,8,8,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(50,40,30,20,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,2,3,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,3,3,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,-2,-3,-4,-5,-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,50,20,15,10,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,15,10,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,4,3,5,4,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,4,5,5,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,15,10,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,-2,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,1,3,3,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,4,-3,-4,-5,-4,-3,-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-3,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,3,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-4,-3,-2,-1,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,10,21,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-4,-2,-1,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,3,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,-3,-4,-5,-4,-3,-2,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,-2,-1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,5,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(27,6,6,20,62,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(27,27,27,27,62,62)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,6,20,30,25,20,15,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,15,-1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,-2,-1,-2,-2,30))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,4,4,4,4,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,-3,2,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,4,5,4,3,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,50,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(7,2,4,1,8,6,9,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7,7,7,7,8,8,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,4,3,2,1,5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,3,2,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-3,15,-1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,6,20,30,25,20,15,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,40,2,4,3,5,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,40,40,40,40,40,40,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(7,2,4,1,8,6,9,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7,7,7,7,8,8,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,10,21,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,1,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,1,1,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,10,21,10,21,29,21,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,15,10,15,62))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,62)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,-3,-4,-4,-3,-2,-1,-2,-3,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,4,5,4,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,10,21,10,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-4,-2,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(7,2,4,1,8,6,9,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7,7,7,7,8,8,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,3,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,3,3,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,1,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,-3,-4,-5,-4,-3,-2,-1,-2,-3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,1,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(2,3,2,1,3,3,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(11,20,30,40,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11,20,30,40,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,3,2,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(2,2,-3,4,5,4,3,2,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,2,2,4,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,4,3,5,5,6,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,4,5,5,6,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-4,-5,-2,-1,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,-2,-2,-2,-1,-1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,10,21,10,21,29,21))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,-3,7,1,5,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,7,7,7,19)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,4,-3,-4,-5,-4,-2,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,4,3,5,5,6,2,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,4,5,5,6,6,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,3,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,-3,4,5,4,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(7,2,4,1,8,6,9,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7,7,7,7,8,8,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,4,-4,-5,-4,-2,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,-3,-4,-5,-4,-3,-2,-2,-3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(2,-3,4,5,4,2,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,2,4,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,9,21,10,21,29,21,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,2,4,3,30,5,6,2,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,3,4,4,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,-3,2,1,5,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,4,-4,-5,-2,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,3,3,2,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,5,20,30,25,20,15,10,19,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,-3,-4,-5,-4,-3,-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,1,1,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2,1,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,4,-3,-4,-5,-4,-3,-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,3,3,2,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,3,3,3,3,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5,-4,-2,-1,15,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,6,20,30,25,20,15,10,30,30))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,15,30,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,15,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,13,15,17))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,13,15,17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,35,50,45,60,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,40,50,50,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,97,96,95,94,93,92,91,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,35,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,50,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-1,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,98,8,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-1,-5,20,15,6,9,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-3,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,97,99,96,95,94,95,92,91,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,97,96,95,94,93,92,91,90,94))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,-1,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,40,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,6,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,9,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,9,9,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,-1,50,-2,-3,-4,-5,-4,-3,-2,0,-1,-2,-3,-4,-2,0,0,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,2,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-1,-5,20,16,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-11,4,6,4,7,10,3,8,2,4,6,6,6,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,-9,-1,-5,20,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,10,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,6,4,7,10,3,98,8,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-5,20,15,6,9,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,6,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-11,-15,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,-9,-1,-5,20,6,9,-8,-1,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,50,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,6,-1,-1,-5,20,15,6,9,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,6,6,6,6,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,20,0,5,5,-11,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-1,-5,20,15,6,9,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-5,-3,-4,-11,-15,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,70,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-1,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-1,-1,-1,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-3,1,10,2,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,60,5,6,7,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,-1,1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,2,1,2,3,2,3,4,3,4,5,4,5,60,5,6,7,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,3,3,3,4,4,4,5,5,5,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,92,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,15,40,50,45,60,55,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,15,6,9,-1,-8,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,6,4,10,3,98,70,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,10,10,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-3,-2,-1,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,7,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,2,-3,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,4,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-11,-15,20,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,4,7,10,3,2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,15,19,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-11,-16,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,20,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,35,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(2,1,2,3,4,5,6,7,8,9,10,1,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,2,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,10,-5,15,6,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,10,10,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-4,-4,-4,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,-15,20,0,5,-3,-10,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-1,-5,20,15,9,-8,-1,-5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-15,-12,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,0,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,20,0,5,0,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,30,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,6,-1,-1,-5,20,15,6,9,-8,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,6,6,6,6,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,-9,50,45,60,55,-5,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-4,-8,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-4,-4,-4,-4,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,20,15,6,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,9,20,15,19,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,10,3,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,10,3,8,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-4,-8,-15,-12,-2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-4,-4,-4,-4,-2,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,97,96,95,94,93,92,91,94))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,15,55,20,71,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,55,55,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,-8,50,45,60,55,-5,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-11,4,6,4,7,10,3,8,2,4,6,6,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,3,4,6,4,7,10,6,3,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,8,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,15,55,20,71,10,50,15,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,55,55,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,10,-5,16,6,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,10,10,16,16,16,16)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,15,55,20,71,70,50,15,15,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,55,55,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,50,-5,20,6,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-3,-12,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,-8,-11,-15,20,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,5,6,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,50,45,71,60,55,-5,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,20,15,17,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,20,15,-4,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,-2,-2,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,6,2,1,2,3,2,3,4,3,4,5,4,-11,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-1,0,-3,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,60,35,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,-4,-8,-11,-15,-4,-5,0,5,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,98,7,10,8,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,15,6,9,16,-8,-1,8,20,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,70,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,0,-2,-3,-10,-2,-1,1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,6,2,1,2,3,2,3,4,4,4,5,4,-11,6,5,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,10,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,10,10,10,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,-4,-8,-11,-15,-4,-5,0,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-12,0,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-2,-3,-4,30,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,14,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,9,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,9,9,9,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,15,19,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,100,98,97,96,95,94,93,92,91,90,94))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,30,20,15,6,9,-8,49,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,10,-5,96,16,6,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,10,10,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,6,4,10,3,98,8,10,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,10,10,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,-2,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,8,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,-2,-3,-5,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,-1,-2,-3,-2,-1,0,1,0,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,-2,-3,-4,-5,-4,-3,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,98,7,10,8,97,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,-4,-8,-11,-15,-4,-5,0,5,-5,-5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,7,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,4,10,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,10,10,10,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,8,-4,-11,-16,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,8,8,8,8,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-3,2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-1,-3,-2,-1,11,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,11,11,11,11,11,11,11,11,11,11,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,-2,-3,-4,16,-4,-3,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-9,4,6,4,7,10,3,98,8,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-3,1,10,2,49,1,1,100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,10,10,49,49,49,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,4,6,4,7,10,3,8,2,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,-1,1,-1,-2,-4,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-16,-11,-15,20,0,0,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(21,30,25,40,35,50,45,60,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(21,30,30,40,40,50,50,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,-16,20,0,5,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-8,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,5,50,-5,20,6,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,5,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-5,20,16,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-2,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-5,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,60,55,71,70,10,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,60,60,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-4,8,-4,-11,-16,-10,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-4,8,8,8,8,8,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,-4,-8,-15,-4,-5,0,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,45,60,55,71,70,10,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,45,60,60,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,-9,50,45,60,55,-5,49,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,-5,15,6,9,-1,-8,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,70,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,0,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,3,3,7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-2,-1,-1,0,-3,1,-2,-2,1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,-16,20,0,5,-4,-4,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,-5,15,6,9,-1,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-11,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,-1,49,-2,-3,-4,-5,-4,-3,-2,0,-1,-2,-3,-4,-2,0,0,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,2,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,35,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,4,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,6,8,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-15,-12,-6,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-5,70,-8,-11,20,0,5,0,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,60,5,6,7,6,2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,5,9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,5,9,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,21,-2,-1,0,-3,1,-2,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,-8,-15,-4,-5,0,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,70,90,-2,51,45,71,60,55,-5,50,70,10,90,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,70,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-12,0,-5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-4,-11,-15,20,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-3,15,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-1,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-11,-16,20,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,20,15,6,9,14,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,40,50,45,60,55,70,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(91,5,6,4,10,3,98,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(91,91,91,91,91,91,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-3,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,70,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-5,-3,-2,-1,0,-1,-2,-3,-3,-2,-1,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,95,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,-2,-3,-5,-3,-2,-1,-2,-3,-4,-5,-3,-2,7,-1,-1,-2,-3,-2,-1,0,1,0,-1,-5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,7,7,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,-9,50,45,60,55,-5,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,3,8,2,6,3,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,20,15,-10,9,-8,16,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,3,4,6,4,7,7,10,6,3,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,0,-5,3,5,9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,3,5,9,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-3,2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-4,-1,-3,-2,-1,11,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,11,11,11,11,11,11,11,11,11,11,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-5,-3,-4,-11,-15,20,0,5,-4,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,97,99,96,95,94,95,92,91,90,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,4,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-1,0,-3,1,0,-1,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,-4,-8,17,-11,-15,-4,-5,0,5,-5,-5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,7,7,17,17,17,17,17,17,17,17,17,17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,4,3,8,100,6,3,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,7,8,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-15,-12,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,4,7,10,3,98,8,1,2,10,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,7,10,10,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(6,10,-5,15,6,9,-1,-8,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,5,7,10,3,2,7,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,3,6,4,7,10,6,3,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,49,-1,-1,-1,90,-5,20,15,6,9,-8,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,49,49,49,49,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-15,-12,-6,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,8,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-1,0,-3,1,0,-1,-2,-2,1,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,8,8,8,8,8,8,8,8,8,8,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-7,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,30,20,14,6,9,-8,49,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,1,1,1,1,5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,90,-2,-8,50,45,60,55,-5,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-5,-3,-4,-11,-15,20,0,5,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,10,-1,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,-1,1,-2,-2,-4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,6,9,-8,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,45,60,55,71,70,10,70,45))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,45,60,60,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-7,-11,-15,20,0,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-8,-15,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-12,-5,-4,-4,-4,-4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,0,-1,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,-2,-9,50,45,60,55,-5,70,17,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,-5,2,6,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-5,20,15,6,9,-8,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,70,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,0,5,-5,20,15,6,9,14,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,0,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,-5,15,6,9,5,-1,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-5,70,-8,-11,20,0,5,0,-10,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-15,20,0,5,0,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,-16,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-5,-4,-4,-6,-15,-12,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-5,-4,-4,-4,-4,-4,0,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,5,7,10,4,2,7,-3,-3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,2,15,6,9,5,-1,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,-16,20,0,5,-4,-4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,4,7,10,3,8,2,5,6,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,7,6,10,-5,15,14,6,9,-1,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,7,7,10,10,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-11,-5,20,15,6,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,-8,50,45,60,55,-5,70,10,90,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,4,6,4,10,3,8,100,6,3,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,4,6,6,10,10,10,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,100,6,4,4,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,-15,20,0,5,-3,-10,-12,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,1,0,-2,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,2,1,-3,1,1,1,1,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,2,2,2,2,2,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,4,0,-1,-2,-2,-2,-1,0,-3,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-2,-3,-4,-3,-2,-1,-2,-4,-3,-2,-1,1,-1,-2,-2,-2,-1,0,-3,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,-8,50,45,60,55,-5,70,10,90,55,90,60,10,45))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,70,-8,-11,-15,20,0,5,-3,92))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,11,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,11,11,11,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,15,6,9,8,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(21,30,25,40,35,50,45,60,96,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(21,30,30,40,40,50,50,60,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,30,20,14,6,9,-8,49,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,30,30,30,30,30,30,49,49,49)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,10,-5,15,-8,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,10,10,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,4,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,6,8,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,-5,15,6,9,-1,-8,-1,15,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,7,6,10,-5,15,14,49,20,9,-1,-1,14,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,7,7,10,10,15,15,49,49,49,49,49,49,49)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,2,3,4,2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,30,20,15,0,6,9,-8,49,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,50,45,60,55,70,-15,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,50,50,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-14,-5,-4,-8,-15,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-14,-5,-4,-4,-4,-4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,70,-3,-8,-11,-15,20,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,8,-4,-11,-16,20,0,5,-4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,8,8,8,8,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,7,6,10,-5,15,14,6,9,-1,-1,15,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,7,7,10,10,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,-12,40,45,60,55,29,71,70,10,70,45))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,20,40,45,60,60,60,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-7,-11,-15,20,0,5,-15,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,5,-11,-12,0,-5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(93,-2,5,-5,20,15,6,9,-8,-1,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(93,93,93,93,93,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,2,3,4,3,4,5,4,5,60,5,6,7,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,2,3,4,4,4,5,5,5,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,96,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,-1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,97,-3,-4,-5,-4,-3,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,15,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,10,-1,-5,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,10,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,20,15,17,9,-8,-1,15,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,2,3,4,2,5,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,11,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,21,-2,-1,0,-3,1,-2,-2,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,11,11,11,11,11,11,11,11,11,11,11,11,11,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-14,5,9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-14,5,9,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,6,2,2,1,2,3,-12,3,4,5,4,5,4,-11,6,5,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,15,6,9,-1,-8,-1,15,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,35,50,45,60,55,70,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,40,50,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,35,70,10,10,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,9,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,9,9,9,9,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,6,2,1,2,3,2,3,4,3,4,5,4,-11,6,5,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,0,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,-1,1,-2,8,-4,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,8,-4,92,70,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,8,8,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,31,-3,-4,-8,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,6,-1,0,-5,20,15,6,9,-8,-1,-5,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,6,6,6,6,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,0,-2,-3,-10,-2,45,5,1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,45,45,45,45,45,45)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,6,4,10,3,98,8,10,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,10,10,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,5,20,15,6,9,-8,-2,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(19,-5,-3,7,-4,-8,-11,-15,-4,96,-5,0,5,-5,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(19,19,19,19,19,19,19,19,19,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,92,20,15,19,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-10,-4,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-5,-4,-4,-4,-4,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,6,2,2,1,2,3,-12,3,4,5,4,5,4,-11,6,5,5,6,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-3,-2,-1,50,-1,-2,-3,-2,-1,0,1,-1,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,35,50,45,60,55,70,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,50,50,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-11,-15,20,35,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,35,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,5,4,7,10,3,8,2,35,3,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,7,10,10,10,10,35,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(21,30,25,40,35,51,45,60,96,70,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(21,30,30,40,40,51,51,60,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-11,-15,20,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,19,50,45,60,55,70,10,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,50,50,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-11,-15,20,0,5,21))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,20,20,20,21)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-5,-8,-11,-15,-12,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,49,-1,-1,-1,90,-5,15,6,9,-8,-1,-5,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,49,49,49,49,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,-3,-12,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,70,-8,-11,-15,20,0,5,-3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-16,-11,-15,20,0,0,-15,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,0,-4,0,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,6,10,2,15,6,9,5,-1,-1,15,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,6,10,10,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,-1,0,-1,-2,-3,-2,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,4,10,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,10,10,10,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,4,-1,-2,-3,-4,-5,-3,-2,0,0,-1,-2,-2,-1,0,-3,1,0,-1,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,5,4,7,10,3,8,2,35,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,7,10,10,10,10,35,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,5,-11,-12,0,-5,0,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,5,5,5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,21,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,10,10,-1,-5,15,6,9,-9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,10,10,10,10,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,15,6,9,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,4,3,8,7,6,3,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,7,8,8,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-4,-4,-11,5,-15,20,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,5,5,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,-2,-3,-4,-5,-4,93,-2,-1,0,-1,-2,-3,-2,30,-1,0,1,0,-1,-2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,-5,3,5,9,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,0,3,5,9,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,4,-1,-2,-3,-3,-5,-3,-2,0,0,-1,-2,-2,-1,0,-3,1,0,-1,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-11,-16,20,0,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,30,-4,-11,-16,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,30,30,30,30,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,-4,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,98,8,2,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-3,-4,-3,-2,-1,-2,-4,-3,-2,-1,19,1,-1,-2,-2,-2,-1,0,-3,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,19,19,19,19,19,19,19,19,19,19,19,19)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-4,-4,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,94,-10,-5,-10,-4,-8,-11,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,94,94,94,94,94,94,94,94,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-5,20,15,6,9,-8,-1,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,70,90,-2,51,45,71,60,55,-5,50,70,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,70,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-7,-10,-5,-10,-4,-8,95,-15,20,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-7,-7,-5,-5,-4,-4,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,71,20,15,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,71,71,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,3,96,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,90,71,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,-1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,0,-4,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,35,70,10,10,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,50,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-1,-1,-2,-3,-4,-5,-3,-2,-1,-2,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,-1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-2,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,5,7,10,3,2,6,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-15,-12,0,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,0,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,-1,-2,-4,-3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,0,-5,3,5,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,3,5,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-5,-3,50,-4,-11,100,-15,20,0,5,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,50,50,50,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,4,3,94,100,6,3,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,7,94,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-2,-1,-1,0,-3,1,-2,-2,1,-1,-1,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,96,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,8,-4,92,-8,-11,-15,20,0,5,-3,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,8,8,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-4,20,15,6,9,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(97,91,5,6,4,10,3,98,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(97,97,97,97,97,97,97,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-5,-3,-2,-1,70,-2,-3,-4,-5,-4,93,-2,-1,0,-1,-2,4,-3,-2,30,-1,0,1,0,-1,-2,0,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,15,6,9,-1,15,9,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-11,-12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-2,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-2,-1,-1,0,-3,1,-2,-2,1,-1,-1,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,4,6,4,4,7,10,3,8,49,2,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,6,7,10,10,10,49,49,49,49)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(9,20,90,-2,-9,50,45,60,55,-5,70,17,10,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(9,20,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,5,7,10,3,2,14,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,14,14,14)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-2,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-2,-1,-1,0,-3,1,-2,-2,1,-1,-1,-3,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,0,4,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-1,0,-3,1,0,-1,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,0,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,70,-2,-8,-11,-15,20,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-1,0,-3,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,71,21,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,60,35,70,10,30))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-8,-11,-15,20,0,5,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,0,-4,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-15,-4,-3,0,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-6,-3,-2,-1,0,-2,-3,-2,-1,1,0,-1,-2,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,60,1,-3,1,10,2,49,1,1,100,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,60,60,60,60,60,60,60,60,60,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,-5,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-3,-2,-1,7,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-4,-5,-3,7,95,-15,-4,-5,0,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-4,-4,-3,7,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,10,3,8,3,2,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-3,-2,-1,-2,-3,90,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-4,-3,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(6,4,7,10,3,2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6,6,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,6,10,-5,15,6,9,-1,-1,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,6,10,10,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-10,-2,1,-1,-2,-4,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,60,5,6,7,6,92,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,60,60,60,60,60,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,8,6,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(21,6,25,35,51,45,60,96,70,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(21,21,25,35,51,51,60,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,-8,1,-15,-4,-5,0,-5,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4,6,4,7,10,8,2,5,6,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(2,1,2,3,4,5,6,7,8,8,9,10,1,2,3,2,3,4,2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,2,2,3,4,5,6,7,8,8,9,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,-7,-11,-15,20,0,100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,30,20,15,6,9,-8,10,49,-1,-5,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-9,-2,1,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,15,6,9,16,11,-8,-1,8,20,-5,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,20,20,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,1,-1,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,-5,20,15,6,9,-8,98,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,13,-4,-4,-11,5,-15,20,5,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,13,13,13,13,13,13,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-3,-4,-11,-15,20,0,5,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-3,99,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,0,-1,-2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,20,0,5,-4,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,-8,50,45,60,55,-5,70,10,90,55,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,90,92,92,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,10,8,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(90,40,45,60,70,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-6,1,10,2,49,1,1,1,100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,10,10,49,49,49,49,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,20,0,5,-4,20,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,45,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-1,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,45,45,45,45,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-2,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-2,-2,-2,-1,0,-3,0,-1,-2,-2,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-1,-1,-5,20,15,6,9,-8,-1,-5,-5,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,5,5,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-4,-5,-3,7,95,-15,-4,-13,-5,0,-5,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-4,-4,-3,7,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-15,20,6,9,-8,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-3,-3,-2,-3,15,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-7,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,70,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-4,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,70,7,-15,20,0,5,0,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-3,-2,-1,0,-1,-2,-3,-2,-1,-3,0,1,0,-1,-2,-5,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,96,9,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(19,-5,-3,7,-4,-8,-11,20,-4,31,-5,0,5,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(19,19,19,19,19,19,19,20,20,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-11,-2,-1,-9,-1,-2,-3,-3,-2,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,5,4,7,10,3,8,11,35,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,7,10,10,10,11,35,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,-4,-4,-11,-15,20,35,5,-4,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,-3,-3,-3,-3,20,35,35,35,35)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-4,-11,0,5,-4,20,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,5,20,15,6,9,-8,-2,-8,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,10,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,-3,-4,-11,-16,20,0,5,-4,-4,31,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,31,31,31,31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,71,6,4,7,10,3,98,8,2,10,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,71,71,71,71,71,71,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,-8,-15,-4,-5,0,-16,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,7,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-14,70,-8,-15,20,0,5,0,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,35,50,45,60,55,70,55,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,40,50,50,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-7,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-2,-4,-8,-11,-15,20,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-2,-2,-2,-2,-2,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,-15,20,0,5,-3,-10,49,-10,20,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,20,20,20,20,20,49,49,49,49)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,70,-8,-11,-15,19,0,5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-15,-10,-5,-4,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,6,31,4,10,3,98,8,10,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,31,31,31,31,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-14,5,9,11,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-14,5,9,11,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,4,3,8,100,7,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,6,8,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-4,-8,-11,-15,-12,-6,0,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-5,-3,-3,-3,-3,-3,-3,-3,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,-5,8,20,15,17,9,-8,-1,20,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,5,8,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,45,60,35,70,10,30,35))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,50,60,60,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,-8,-11,5,-15,20,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-4,-5,45,-3,7,95,-15,-4,-13,-5,0,-5,-5,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-4,-4,45,45,45,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,100,6,3,4,4,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,6,30,45,60,55,71,70,10,70,71))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,20,30,45,60,60,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,35,50,45,60,55,61,70,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,50,50,60,60,61,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,-12,44,60,55,29,71,70,10,70,45))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,10,44,60,60,60,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,10,3,8,2,6,3,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,10,15,6,-9,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,10,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,-3,-2,-3,-2,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-2,-2,-2,-1,0,-3,0,-1,-2,10,1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,7,-1,-2,-3,-2,-1,0,1,0,-1,-2,-5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,7,7,7,7,7,7,7,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,2,-3,-4,-3,-2,70,6,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,0,1,0,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,2,2,2,2,2,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,10,3,8,3,2,10,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(31,-5,-4,-6,-11,-15,0,5,31))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(31,31,31,31,31,31,31,31,31)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-5,60,70,-8,-11,20,0,5,0,-10,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,60,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,92,4,10,3,8,100,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,92,92,92,92,92,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-3,-4,-3,-2,-1,-2,-4,-3,-2,-1,19,1,-1,-2,-2,-2,-1,0,-3,29,0,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,19,19,19,19,19,19,19,19,19,29,29,29,29,29)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-2,-3,-4,-5,-3,90,-2,-1,0,-1,-2,-2,-2,-1,0,-3,1,0,-1,-2,-2,1,-1,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,8,4,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,92,20,15,19,6,9,-8,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-2,-3,-3,-4,-3,-2,-1,-2,-4,-3,-2,-1,19,1,-1,-2,-2,-2,-1,0,-3,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,19,19,19,19,19,19,19,19,19,19,19,19,19)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,15,6,9,-1,9,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,4,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-2,-3,-4,-3,-2,-1,-2,-3,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,0,1,-4,1,10,2,49,1,1,100))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,10,10,49,49,49,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,50,-5,20,15,6,9,8,-8,-1,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,50,31,-3,-4,-8,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,0,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,0,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,0,0,0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,4,8,2,4,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-4,-5,-3,-4,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-4,-4,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-11,-15,-12,-7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,3,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,-8,-1,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,50,45,60,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,50,50,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,0,-5,6,4,7,10,3,2,4,8,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-5,-3,-4,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,-5,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,35,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,7,10,3,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,3,8,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,4,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-4,-11,-15,-12,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,60,55,70,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,50,45,60,-4,55,70,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,50,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-4,6,4,7,95,10,3,8,2,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-3,-8,-11,-15,-12,-7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-8,4,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,35,29,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,35,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-8,-11,-15,-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-4,-8,-11,-15,-12,0,5,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,6,4,7,-11,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,7,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,3,7,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,35,20,30,25,11,35,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,35,35,35,35,35,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,3,8,2,4,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,3,4,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,11,35,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,98,1,1,1,1,1,1,1,1,1,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,98,98,98,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,0,-1,-2,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,4,7,-11,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-8,-11,-15,-7,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,7,9,3,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,40,4,7,9,3,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,40,40,40,40,40,40,40,40,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,45,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,45,45,45,45)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,93,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,-1,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-8,50,-15,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-11,-10,-5,-3,-8,-4,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-11,-10,-5,-3,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,26,60,55,70,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,-10,-3,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,5,-10,-3,92,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,5,4,7,-11,3,7,2,4,4,8,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,7,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,40,4,7,9,3,8,2,4,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,40,40,40,40,40,40,40,40,40,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-5,-8,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,10,7,10,3,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-3,-2,-1,-1,-2,-3,-2,-1,0,1,0,-1,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,93,6,0,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,93,93,93,93,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,41,4,7,9,3,8,2,4,3,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,41,41,41,41,41,41,41,41,41,41)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-5,-3,-4,-11,-15,-12,0,5,10,-4,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,9,9,9,9,9,9,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,10,7,10,3,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-3,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,5,4,7,-11,3,7,2,4,4,8,7,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,6,100,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,6,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,1,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,1,-3,-3,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,60,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,10,7,10,3,8,2,4,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,1,-3,-3,-1,-2,-4,-4,-5,-4,-3,96,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,60,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,96,96,96,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-8,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-4,-4,-4,-4,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-8,-11,-15,-7,-11,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,7,10,45,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,7,10,3,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,90,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,6,0,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,6,6,6,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,35,20,30,25,11,35,50,60,21,55,70,30))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,35,35,35,35,35,35,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-8,-11,-15,0,5,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,26,60,55,70,60,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,5,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,90,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,4,3,4,5,4,5,6,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-11,-15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,26,60,55,70,60,55,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,1,-1,-2,-3,-2,-12,-1,0,1,0,-1,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,1,1,1,1,1,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,-10,-3,-8,-11,-15,-7,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,40,4,7,9,3,8,2,4,4,3,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,6,100,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,6,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,4,6,7,10,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-5,-8,-10,-15,-12,-9,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,10,7,10,3,8,2,4,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,-15,50,45,60,-4,55,70,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,40,50,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,60,-10,-3,-8,50,-15,-11,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,26,-4,60,55,70,60,55,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,11,35,50,60,21,55,70,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,11,35,50,60,21,71,55,70,20,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,60,60,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,70,-2,-3,-2,-12,-1,0,1,-1,-1,-2,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(6,4,6,5,3,7,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6,6,6,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,21,5,10,90,90,20,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,21,21,21,90,90,90,90,90,90,90,90)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,-11,0,5,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,10,7,10,3,8,2,4,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,30,25,11,40,35,-15,50,45,60,-4,56,70,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,30,30,30,40,40,40,50,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,1,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,40,50,45,26,60,55,70,60,55,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,-4,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,1,-1,-2,-3,-2,-12,-1,0,1,0,-1,-2,-2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,60,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,95,20,30,25,11,35,50,60,21,55,70,20,71,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,95,95,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,15,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,15,15,15,15,15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,26,60,-10,-3,-8,50,-15,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,26,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,0,5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,1,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,98,26,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,4,7,95,10,3,8,2,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,6,7,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,10,7,10,3,2,4,8,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,7,10,3,8,4,3,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,5,-10,-10,-3,92,-8,-11,-15,-7,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-14,-7,0,1,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,6,35,50,60,21,55,70,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,2,4,4,8,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,3,-7,8,2,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,97,-8,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,92,4,6,50,4,10,7,10,3,8,2,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,92,92,92,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-8,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,6,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-10,-3,-11,-8,-11,-15,-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-3,-3,-3,-3,-3,-3,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,11,35,50,21,71,55,70,21,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,50,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,26,60,55,60,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,60,-10,-3,-2,-8,50,-15,-11,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,-10,-3,-8,-11,-15,-7,-11,-10,95))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-5,-3,55,-15,-12,0,5,-12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,55,55,55,55,55,55,55)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,15,70,-2,-3,-2,-12,-1,0,1,-1,-1,-2,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,15,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-33,84,93))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-33,84,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-9,-5,-8,93,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-9,-5,-5,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,8,10,3,8,2,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,8,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,50,45,60,55,70,84))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,50,50,60,60,70,84)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,2,4,4,8,3,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,95,-10,-3,-2,-8,50,-15,2,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,2,0,2,3,2,3,3,4,6,-8,4,5,6,5,6,17,6,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,3,3,3,3,4,6,6,6,6,6,6,6,17,17,17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-10,-3,-11,-8,-11,-15,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-3,-3,-3,-3,-3,-3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,5,-10,-7,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,51,45,60,-4,55,70,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,51,51,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-4,-3,-2,-1,0,70,-2,-3,-2,-12,-1,0,1,-1,-1,-2,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(50,95,60,95,-10,-3,-2,90,50,-15,2,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(50,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,6,7,8,9,10,1,2,3,3,4,2,1,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,6,7,8,9,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,96,3,2,3,4,3,4,5,4,5,6,5,2,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,8,2,4,3,4,-8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4,30,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,30,30,30)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,3,4,5,4,5,6,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,3,3,4,5,5,5,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,91,-7,0,1,94,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,91,91,91,91,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,51,8,9,10,1,2,3,3,4,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,51,51,51,51,51,51,51,51,51,51,51)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,40,4,7,9,3,8,2,4,4,3,40,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,4,7,95,10,3,8,2,4,8,3,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,6,7,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,-5,2,4,3,4,-8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,10,3,8,29,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,10,10,10,29,29,29)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,0,-1,-2,-2,-5,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,15,6,9,-8,4,-2,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,20,5,4,5,6,5,6,7,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,20,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,51,4,4,8,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,51,51,51,51,51,51)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,2,3,4,4,8,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,7,2,4,4,8,3,8,5,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,8,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,6,-1,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,6,6,6,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,2,0,2,3,2,3,3,4,6,-8,4,5,6,5,6,17,6,2,5,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,3,3,3,3,4,6,6,6,6,6,6,6,17,17,17,17,17,17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,2,4,4,-2,8,3,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-11,-10,-5,-2,-8,-4,-11,-15,-12,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-11,-10,-5,-2,-2,-2,-2,-2,-2,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,93,15,0,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,93,93,93,93,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,4,3,4,5,4,5,6,5,6,7,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,0,29,-10,-7,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-1,-3,-4,-5,-4,-3,-2,-1,0,70,-2,-3,-2,-12,-1,0,1,-1,-1,60,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,70,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-11,-10,-2,-8,-4,-11,-15,-12,0,5,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-11,-10,-2,-2,-2,-2,-2,-2,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(100,99,98,-10,97,96,95,94,93,92,91,90))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(100,100,100,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,-10,-3,-8,50,-15,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,-1,-1,-2,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,-10,-3,-8,-11,-15,-7,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-5,-3,55,-15,-12,0,5,55,-12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,55,55,55,55,55,55,55,55)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-15,-7,5,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,-8,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-3,-1,-2,-3,-4,-5,-4,-3,-1,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-8,-11,-7,0,1,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,7,9,3,8,2,4,5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,40,4,7,9,3,8,2,4,4,3,40,2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,98,-8,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,-33,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,-11,0,5,-10,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,5,4,-11,3,7,2,4,4,8,3,7,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,95,-10,-3,-33,-2,-8,50,-15,2,-3,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,7,10,45,8,2,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,98,26,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-4,-3,-4,-11,-15,-12,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,95,-10,-3,-2,-8,-15,2,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,7,2,4,4,8,3,8,5,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,6,100,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,6,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,51,96,4,4,8,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,51,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-10,-3,-11,-8,-11,-15,-7,-11,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-3,-3,-3,-3,-3,-3,-3,-3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,7,10,3,2,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,51,97,96,4,4,8,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,51,97,97,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,29,3,2,4,5,4,5,6,5,7,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,29,29,29,29,29,29,29,29,29,29,29,29)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,56,4,3,4,5,4,5,6,5,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,56,56,56,56,56,56,56,56,56,56,56)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,13,-1,-5,70,-2,-2,-12,-1,0,1,-1,-1,-2,-2,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,13,13,70,70,70,70,70,70,70,70,70,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,1,-3,-3,-1,-2,-3,-4,-5,-4,-3,-2,0,-1,-2,-3,-2,-1,0,1,0,60,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,96,50,45,60,70,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-11,-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,4,6,10,95))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,7,10,45,8,2,4,6,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,3,7,10,3,2,8,4,3,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,7,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,96,7,8,50,10,1,2,3,4,2,3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,96,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,7,10,3,7,8,4,3,10,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,26,5,4,5,6,5,6,7,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,26,26,26,26,26,26,26,26,26,26)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-8,-11,-15,-12,0,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-4,-4,-4,-4,-4,0,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,60,-10,-3,-8,50,-15,-11,-10,-33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-9,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-12,-15,-12,97,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,-5,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,0,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,7,9,3,8,95,4,5,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,9,9,9,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(6,4,100,5,3,7,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6,6,100,100,100,100,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-5,-11,-12,0,5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,-10,-3,-8,-11,-15,-7,5,-11,-15,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-3,-8,-11,-15,-12,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-3,-3,-3,-3,-3,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,3,8,4,3,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,1,-1,-2,-2,-2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,71,6,4,4,7,10,3,8,2,4,8,3,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,71,71,71,71,71,71,71,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,5,29,9,94,11,14,15,17))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,5,29,29,94,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-10,-3,-11,-8,-11,40,-15,-7,5,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-3,-3,-3,-3,40,40,40,40,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,60,55,60,96))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,51,97,96,4,4,8,3,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,51,97,97,97,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-11,1,-15,-11,-7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,-10,-3,-8,-11,-15,-11,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,2,7,8,9,10,1,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,55,70,92))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,4,7,95,10,3,8,2,4,8,3,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,6,7,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,4,35,50,45,60,-4,55,70,25,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,40,50,50,60,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,-10,-3,-8,-11,-15,-7,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,5,0,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,-8,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(84,30,25,96,50,45,60,70,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(84,84,84,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,7,4,7,9,3,8,2,4,3,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,7,7,7,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-12,-12,97,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,9,-5,2,4,3,4,6,-8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,3,4,5,4,6,5,7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,3,3,4,5,5,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,98,1,1,1,1,1,1,1,1,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,98,98,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,2,7,8,9,10,1,2,3,2,3,4,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,8,9,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,8,6,4,7,9,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,8,8,8,8,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,55,60,96))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,2,3,4,3,4,5,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,55,17,92))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,0,4,5,6,7,8,9,10,1,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,7,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-14,51,97,96,4,4,8,3,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,51,97,97,97,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,98,1,1,1,1,1,1,1,1,1,6,5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,98,98,98,98,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,2,3,4,3,4,5,4,5,6,5,6,7,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,91,2,4,4,8,3,8,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,91,91,91,91,91,91,91,91)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-8,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-8,0,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,5,4,5,6,5,6,6,5,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,6,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,93,15,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,5,29,9,94,11,14,15,17))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,5,29,29,94,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,-10,-3,-8,-11,-15,-11,-11,-14,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,3,7,2,-11,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,6,13,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,6,13,13,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-10,-3,-7,-11,-15,-7,5,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,92,4,6,50,4,10,7,10,3,8,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,92,92,92,92,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,40,7,9,3,-7,8,2,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,40,40,40,40,40,40,40,40,40)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,6,10,3,99,2,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,10,10,99,99,99,99,99)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,-9,10,35,20,30,25,11,35,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,3,10,35,35,35,35,35,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-11,0,5,93))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,0,5,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,30,25,11,40,35,-15,50,45,60,-15,-4,56,70,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,30,30,30,40,40,40,50,50,60,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,0,2,3,2,3,4,3,4,5,4,5,6,5,6,6,5,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,6,6,6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,-15,4,10,7,10,3,8,2,3,4,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,10,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,7,10,3,8,2,4,8,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,95,20,30,25,11,35,50,60,21,61,55,70,20,71,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,0,-2,0,-3,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-2,-1,0,1,0,-1,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(95,60,95,-3,-10,-3,-2,-8,-15,2,-10,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,4,7,9,3,8,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,7,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,7,10,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,7,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,4,6,4,7,9,3,8,2,4,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,6,6,7,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-4,-8,1,1,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-4,-4,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,93,15,0,5,-8,98,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,93,93,93,93,93,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,61,2,0,4,5,6,7,8,9,10,1,2,3,2,3,4,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,11,25,11,40,35,50,45,60,55,-9,60,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,20,25,25,40,40,50,50,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(15,60,-10,4,-3,-8,-11,-15,-7,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(15,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-11,-10,-3,-7,-11,-15,-7,5,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-9,94,60,-10,-3,-8,50,-15,-11,-10,-33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-9,94,94,94,94,94,94,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,1,-11,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,6,4,7,9,8,2,4,3,4,-8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,-11,0,3,2,3,4,3,4,5,4,5,6,5,6,7,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,1,1,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,5,4,7,-11,3,7,2,4,4,8,8,7,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,9,-5,-2,-4,-11,-15,-12,0,5,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,9,9,9,9,9,9,9,9,9,9,9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(45,5,7,4,-11,7,2,4,4,8,3,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(45,45,45,45,45,45,45,45,45,45,45,45,45)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,6,35,50,60,21,70,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,50,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-60,51,-38,15,-25,-62,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-60,51,51,51,51,51,51)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,-11,98,26,-8,-11,-15,-7,0,5,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,60,60,98,98,98,98,98,98,98,98,98)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,20,4,7,-11,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,20,20,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,-4,1,1,1,1,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-12,-2,4,6,4,7,10,3,2,4,8,3,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-12,-2,4,6,6,7,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,95,20,30,25,11,35,50,60,21,61,55,70,3,20,71,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,5,3,2,3,4,3,4,6,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,5,5,5,5,5,5,5,6,6,6,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,41,-10,-3,-11,-8,-11,-15,-7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,41,41,41,41,41,41,41,41,41)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,4,6,10,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,71,6,4,4,7,10,3,8,2,4,8,3,6,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,71,71,71,71,71,71,71,71,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,5,-10,-10,-3,92,-8,-10,-15,-7,0,5,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,92,92,92,92,92,92,92,92)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,1,-3,-3,-1,-2,-4,-5,-4,-3,96,-2,-1,0,-1,-2,-3,-2,-1,0,1,0,60,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-8,-11,-8,-15,-7,-11,-10,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,2,3,4,3,4,5,4,5,6,5,6,7,6,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,4,10,7,10,3,8,2,4,8,7,10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-12,-12,97,0,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-5,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,11,40,35,51,45,60,-4,55,70,25,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,30,40,40,51,51,60,60,60,70,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,6,7,9,10,2,3,2,3,4,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,8,8,9,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,6,4,7,10,3,8,2,4,8,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,0,-5,6,4,7,10,-5,2,4,8,3,2,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,6,6,7,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-9,94,60,-10,-3,-8,50,-15,-11,-10,-33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-9,94,94,94,94,94,94,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(11,-10,-5,-10,-3,-11,-8,-11,-15,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11,11,11,11,11,11,11,11,11,11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,3,7,6,10,3,8,2,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,7,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,51,4,5,6,7,8,9,10,1,2,3,4,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,51,51,51,51,51,51,51,51,51,51,51,51,51,51)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,40,4,7,9,3,8,2,4,4,3,40,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-7,-3,-8,-11,1,-15,-11,-7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-5,-3,-3,-3,1,1,1,1,1,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,7,71,2,4,4,-2,8,3,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,7,71,71,71,71,71,71,71,71,71)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,3,4,3,4,5,2,4,5,6,5,6,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-9,-5,-8,93,-11,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,-1,-1,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(26,-11,-12,0,5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(26,26,26,26,26,26)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,1,-4,1,1,2,1,1,1,-3,1,1,1,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,2,2,2,2,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,50,4,6,50,4,10,7,10,3,8,4,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,50,50,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,10,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,4,7,95,10,3,8,2,4,8,3,6,3,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,6,7,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-1,-3,-2,-3,-4,-3,-2,-1,-2,-3,-4,-5,-4,-3,-2,-2,0,-1,-2,-3,-2,-1,0,1,0,-1,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,20,-8,4,15,6,9,-8,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-2,5,10,10,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,8,2,4,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,96,7,8,50,10,1,2,3,4,2,3,1,1,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,96,96,96,96,96,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,1,-3,-3,-1,-2,-3,-4,-5,-4,-3,-2,0,-1,-2,-3,-2,-1,0,1,0,60,-2,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-11,-1,-5,6,100,5,10,-10,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-10,-1,-1,6,100,100,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,95,60,-10,-3,-11,-15,-7,-11,-11,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,4,7,10,3,2,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,93,1,-11,0,5,26,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,93,93,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-9,-5,-8,93,-11,0,5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,-1,-1,93,93,93,93,93)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-1,-5,5,100,5,98))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-1,-1,5,100,100,100)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,3,6,4,7,10,3,8,2,2,4,8,3,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,7,10,10,10,10,10,10,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,92,50,45,55,70,92))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,-8,4,20,4,7,11,-11,3,7,2,4,4,8,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,5,20,20,20,20,20,20,20,20,20,20,20,20)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,50,7,10,45,8,2,50,4,6,40))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,50,50,50,50,50,50,50,50,50,50)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,4,6,5,3,7,6,10,3,8,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,5,6,6,6,7,7,10,10,10,10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,2,0,2,3,2,3,3,4,6,-8,4,5,6,5,6,17,6,5,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,3,3,3,3,4,6,6,6,6,6,6,6,17,17,17,17,17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,-9,10,35,21,30,25,11,35,50,60,21,55,70))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,3,10,35,35,35,35,35,35,50,60,60,60,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-2,-3,-4,-3,-2,-1,-2,-4,-5,-4,-3,-2,-1,0,-1,-2,-3,-2,-12,-1,0,1,1,-1,-2,-2,-2,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,0,2,3,2,4,3,4,5,4,5,6,5,6,7,-5,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3,10,35,20,30,25,9,11,35,50,60,21,55,70,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3,10,35,35,35,35,35,35,35,50,60,60,60,70,70)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-8,-11,-15,-12,0,5,-15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,-5,-3,-3,-3,-3,-3,0,5,5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,50,45,26,60,21,60,55,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,50,50,50,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,2,3,3,4,5,4,5,7,5,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,3,3,4,5,5,5,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,96,50,45,26,60,55,70,60,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,96,96,96,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1,3,5,29,9,94,11,14,17))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,3,5,29,29,94,94,94,94)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-14,51,97,96,-9,4,8,3,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,51,97,97,97,97,97,97,97,97)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(0,1,2,1,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,4,4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(0,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(10,20,30,25,40,96,50,45,60,55,50))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10,20,30,30,40,96,96,96,96,96,96)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,6,4,7,95,10,3,8,2,4,8,3,6,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,6,6,7,95,95,95,95,95,95,95,95,95,95,95)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(-10,60,-10,-3,-8,-11,-15,-7,0,5,-11,0,-15,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(-10,60,60,60,60,60,60,60,60,60,60,60,60,60)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(5,7,4,7,-11,91,2,4,4,8,3,9,8,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5,7,7,7,7,91,91,91,91,91,91,91,91,91)).toArray()
        );
    }
}

