package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_SORT_THIRD {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,3,-5,2,-3,3,9,0,123,1,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,-5,2,-3,3,5,0,123,9,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,8,-12,4,23,2,3,11,12,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,8,-12,3,23,2,4,11,12,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,6,3,4,8,9,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,3,4,8,9,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,8,3,4,6,9,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,8,3,4,6,9,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,6,9,4,8,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,9,4,8,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,6,3,4,8,9,2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6,3,4,8,9,5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,8,10,23,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,8,10,23,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,1,3,7,8,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,3,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,8,13,18,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,8,13,18,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,10,20,15,18,13,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,10,20,7,18,13,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,10,15,20,25,30,35,40,45,50,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,15,20,25,30,35,40,45,50,55,60).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,18,21,24,27,30,33,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,9,12,15,18,21,24,27,30,33,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,66,77,88,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList())
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,7,8,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,7,8,9,10,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,32,99,77))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,66,77,88,32,99,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,88,32,99,77,77,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,32,55,66,44,88,88,77,99,77,77,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(54,3,7,8,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,3,7,9,9,10,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,3,5,6,4,8,9,7,11,12,10,14,15,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,24,27,30,33,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,9,12,15,24,27,30,33,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,32,77))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,66,77,88,32,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,35,1,3,7,8,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,35,1,3,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,32,77,22,18,57,88,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,46,18,57,88,66,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,1,1,27,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(54,3,7,8,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,3,7,54,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,35,1,3,7,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,35,1,3,7,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(47,32,77,22,18,57,88,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,47,18,57,88,66,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,8,13,18))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,8,13,18).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,3,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,3,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(54,3,7,8,9,35,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,3,7,10,9,35,54,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,8,10,23,7,23))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,8,10,23,7,23).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,8,13,18,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,8,13,18,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,45,9,11,12,14,15,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,45,9,11,12,14,15,3,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,25,27,30,33,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,9,12,15,25,27,30,33,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,1,1,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,1,27,27).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,55,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,55,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(32,1,2,3,4,5,6,7,8,9,10,88,11,12,13,14,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,2,6,4,5,9,7,8,11,10,88,14,12,13,32,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,25,27,30,33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,12,25,27,30,33).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,45,9,12,14,15,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,3,5,6,4,45,9,7,14,15,12,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,4,20,15,18,13,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,20,7,18,13,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,45,9,12,14,15,21,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,45,9,12,14,15,21,3,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,27,30,33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,12,27,30,33).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,25,27,30,33,18,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,9,12,15,25,18,30,33,27,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(8,55,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,55,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,27,55,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,27,55,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,24,27,30,34,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,9,12,15,24,27,30,34,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,10,15,20,25,35,40,47,45,50,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,15,20,25,35,40,47,45,50,55,60).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(28,1,1,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,1,1,28,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,1,2,3,4,5,6,7,45,9,12,14,15,21,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,2,3,4,5,6,7,45,9,12,14,13,21,3,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,1,7,8,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,1,2,3,4,5,6,7,45,10,12,14,15,21,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,2,3,4,5,6,7,45,10,12,14,13,21,3,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,32,77,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,66,77,88,32,77,55).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,6,20,9,12,15,25,27,30,33,18,60,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,20,9,12,15,25,27,30,33,18,60,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,18,6,9,12,15,24,27,30,27,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,18,6,9,12,15,24,27,30,27,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,55,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,55,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,10,15,20,25,30,35,40,50,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,15,20,25,30,35,40,50,55,60).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,32,77,22,18,57,77,88,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,46,18,57,54,88,66,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,45,9,12,14,21,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,3,5,6,4,45,9,7,14,21,12,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,32,77,22,18,57,57,88,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,46,18,57,54,88,66,57).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,40,32,77,22,18,77,57,88,66,54,54,66))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(46,40,32,66,22,18,66,57,88,77,54,54,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,32,77,22,57,23,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,46,57,23,66,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(22,33,44,55,66,77,88,99))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,33,44,55,66,77,88,99).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,88,32,99,77,77,11,77,66))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,32,55,66,44,88,88,66,99,77,77,11,77,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,10,15,20,25,30,35,40,45,50,40,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,15,20,25,30,35,40,45,50,40,55,60).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(47,28,1,1,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,28,1,47,27,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,77,88,32,77,55))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,77,55,32,77,88).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,27))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(27,1,1,27).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(23,9,12,15,6,3,8,54,18))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,9,12,15,6,3,23,54,18).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,25,27,30,33,25))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,12,25,25,30,33,27).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(69,18))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(69,18).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,1,1,4,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,27,1,4,27,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,26,6,20,9,12,15,25,27,30,33,18,60,36))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,26,6,15,9,12,20,25,27,30,33,18,60,36).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,2,35,1,3,7,8,9,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,35,2,3,7,8,9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(46,32,77,22,18,57,77,88,66,18,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(18,32,77,22,18,57,46,88,66,77,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,100,33,44,55,66,77,88,88,32,99,77,77,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,100,33,44,55,66,77,88,77,32,99,88,77,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,10,20,15,20,25,35,40,47,45,50,55,60))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,10,20,15,20,25,35,40,47,45,50,55,60).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,6,4,5,6,7,8,9,10,11,13,14,57,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,4,5,6,7,8,9,10,11,13,14,57,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,21,8,13,26,18,12,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,21,8,12,26,18,13,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,77,88,99,77))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,22,33,44,55,77,88,99,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,1,4,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,1,4,27,27).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,33,44,55,66,77,88,32,77,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,33,44,11,66,77,55,32,77,88).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,8,8,9,10,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,8,8,9,10,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,21,8,40,26,18,12,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,21,8,12,26,18,40,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(27,1,1,1,1,11,4,27,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,1,4,1,11,27,27,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(33))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(33).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,23,33,44,55,77,88,99,77))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,23,33,44,55,77,88,99,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(47,32,77,22,18,57,26,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,26,18,57,47,66,54).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,8,10,23,7,23,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,8,8,10,9,7,23,23).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,45,9,11,6,12,13,15,3,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,45,9,11,6,12,13,15,3,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(47,32,77,22,18,47,57,88,66,54))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(22,32,77,47,18,47,54,88,66,57).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,15,6,3,9,13,18,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,12,15,9,3,9,13,18,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(77,4,20,15,18,13,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,4,20,15,18,13,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,1,2,3,4,5,6,7,9,12,14,15,21,3,13,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,1,2,3,4,5,6,7,9,12,14,15,13,3,13,21).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,5,6,7,45,9,11,6,12,13,15,3,13,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,3,3,5,4,7,45,6,11,6,9,13,15,12,13,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(54,3,11,7,8,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,3,11,54,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,88,11,12,13,14,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,88,11,12,13,14,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,4,66,15,18,13,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,66,7,18,13,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(11,33,44,55,88,99,77))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,33,44,55,88,99,77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,-8,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,0,-8,9,1,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,1,3,-7,5,8,0,9,13,6,11,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,-6,18,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,6,15,0,9,-6,18,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,6,5,-3,3,2,1,-1,-2,4,-4,-5,7,-7,-8,10,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,6,4,5,9,7,8,12,10,11,15,13,14,18,16,17,19,19,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,0,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,0,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,9,16,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,5,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,18,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,6,15,0,9,18,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,-4,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-1,9,-4,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,-4,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-1,9,-4,3,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,8,14,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,14,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,500,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,3,12,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,2,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,2,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,-8,6,2,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,-4,6,2,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,-4,-5,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,-1,6,-4,-5,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,9,-12,7,6,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,16,-8,9,-12,7,16,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,6,0,4,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,0,6,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,0,8,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,11,9,10,14,12,13,17,15,16,19,18,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,900,-901,800,1000,0,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-8,3,0,-6,6,2,-4,1,8,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,-8,6,2,289,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,-4,6,2,289,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-7,5,1,0,-8,9,-12,7,6,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-7,5,1,0,-8,9,1,7,6,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,11,9,10,14,12,13,18,15,16,19,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,0,8,289,7,-105,-277,20,200,3,104,5,700,300,18,-901,800,1000,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,21,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,21,-105,-277,104,200,3,300,5,700,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,4,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,0,4,9,1,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,9,16,7,6,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,6,1,0,-8,9,-12,7,6,5,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,6,6,5,7,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,12,10,11,15,13,14,18,16,17,19,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,-8,-6,8,6,2,289,1,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,-4,-6,8,1,2,289,6,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,16,-8,9,-12,7,16,-12,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,17,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,0,8,289,17,-105,-277,20,200,3,104,5,700,300,18,-901,800,1000,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,6,4,5,9,7,8,12,10,11,15,13,14,19,16,18,19,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,6,4,5,9,7,8,11,10,11,12,13,14,15,16,17,18,19,20,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,0,-12,7,6,6,1,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,1,9,0,5,7,6,6,1,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,-8,16,16,-8,14,9,-12,7,6,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,1,-8,16,16,-8,14,9,-3,7,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,9,-12,7,6,-13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,16,-8,9,-12,7,16,-13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,3,12,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,6,3,3,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,16,-8,9,-12,7,16,-12,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,800,-200,-901,900,1000,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,-5,3,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,3,9,-5,9,12,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,-3,5,1,16,16,-8,9,-12,7,6,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-12,1,16,1,-8,9,5,7,6,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,1,8,800,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,8,800,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,1,13,6,-2,19,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,1,3,-7,5,8,0,9,13,6,11,19,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,-5,1,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,1,9,-5,9,12,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,200,7,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,200,7,3,20,-105,6,104,200,7,4,5,289,900,-200,300,800,1000,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,289,3,12,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,3,9,289,3,12,900,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,16,7,8,9,10,11,12,14,15,16,17,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,7,6,16,10,8,9,14,11,12,17,15,16,19,18,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,1,0,-8,9,-12,7,6,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,1,0,-8,6,-12,7,9,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,3,0,-8,2,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,2,0,-8,3,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,9,12,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,11,9,3,-7,11,8,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,0,9,3,6,11,8,11,1,13,900,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,-3,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-3,8,289,0,-105,-277,0,200,3,7,5,700,20,900,18,104,800,1000,300,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,5,2,0,1,8,14,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,5,2,0,1,8,14,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,-1,6,-8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,-1,8,-8,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,1,-3,-8,9,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,2,1,8,14,0,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,2,1,2,14,0,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,0,6,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,0,6,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(7,3,-6,3,0,-8,6,2,1,8,14,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,-6,6,0,-8,7,2,1,8,14,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,3,0,-8,6,2,0,1,8,0,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-6,1,0,-8,3,2,0,3,8,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,21,20,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,6,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,21,20,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,19,1,8,-200,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,19,1,6,-200,0,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,12,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,12,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,-12,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,-12,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(8,7,3,-6,1000,0,-8,6,2,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,0,6,2,8,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,5,2,0,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,5,2,0,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,1,3,-6,3,0,-8,6,2,0,1,8,16,0,4,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,1,0,-6,3,2,-8,6,3,0,1,4,16,0,8,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,5,1,0,4,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,-3,4,1,0,5,9,-12,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,7,2,1,8,14,0,6,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,7,14,0,8,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-3,-4,-5,-6,-7,-8,-9,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,9,8,-7,6,5,-4,3,2,1,-1,-3,4,-5,-6,7,-8,-9,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,21,-105,-277,104,200,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,21,200,4,104,700,900,300,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,3,0,-7,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,0,-7,1,8,14,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-10,3,0,-8,6,2,0,1,8,14,0,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,7,3,-8,3,0,-4,6,2,0,1,8,6,0,4,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6,1,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,9,1,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,-13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,-13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,4,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,1,-3,-8,9,1,7,4,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,4,9,-12,0,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,18,4,7,-12,0,9,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,-13,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,-13,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,0,-1,6,-4,-5,3,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,0,-1,6,-4,0,3,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,-3,5,1,0,18,4,9,-12,0,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-3,5,1,0,18,2,9,-12,4,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-8,9,12,3,6,15,0,-3,-6,18,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,12,-8,6,15,0,-3,-6,3,21,30,18).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,200,7,289,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,200,7,104,-105,-277,289,200,3,300,5,700,800,-200,-901,900,1000,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,-4,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,-4,6,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,11,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,11,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,9,3,-7,8,8,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2,9,5,-7,8,8,0,1,13,6,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,1,-1,13,11,6,-2,104,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,5,3,-7,9,8,0,11,-1,13,11,6,-2,104,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,-8,6,290,2,289,1,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,-4,6,290,2,289,1,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,5,1,0,-8,9,-12,7,6,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,5,1,0,-8,6,-12,7,6,6,1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-901,800,1000,0,-277,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,0,8,289,7,-105,-277,20,200,3,104,5,700,300,18,-901,800,1000,0,900,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,-7,2,0,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,-7,2,0,1,8,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,16,16,-8,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,1,16,1,-8,9,5,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,2,1,0,-8,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,2,1,0,-8,9,1,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,1,-3,16,9,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,289,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,3,9,289,9,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,5,1,16,16,-8,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-12,1,16,2,-8,9,5,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,200,19,3,0,5,700,-3,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-105,289,20,5,-277,200,7,3,0,19,700,-3,300,18,-901,800,1000,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,1,800,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,1,800,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,0,300,6,3,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,0,300,0,3,12,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,0,-12,7,6,6,1,-12,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,1,9,0,1,7,6,5,1,-12,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,0,8,9,6,-4,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,900,0,-8,6,2,0,1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,3,900,0,-8,6,2,0,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,30,8,-1,6,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,30,8,-1,6,9,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,30,8,-1,6,-3,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,0,30,8,-1,6,9,-4,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,6,5,-3,3,2,1,-1,-2,4,-4,-5,7,-7,-8,10,-10,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,5,500,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,0,6,9,500,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,5,1,16,16,-8,9,-12,7,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-12,1,16,2,-8,9,5,7,6,16,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,16,16,-8,9,-12,7,4,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,1,1,16,5,-8,9,6,7,4,16,-12,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,0,6,-8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,0,8,-8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,3,-4,9,289,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,3,3,-4,9,9,3,12,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,15,16,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,15,16,9,-12,7,16,-12,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,900,0,-8,6,2,0,1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,3,900,0,-8,6,2,0,1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,-1,-8,9,-12,7,-7,0,6,6,1,16,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,-1,5,9,-12,6,-7,0,7,6,1,16,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,9,-12,7,6,-2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,-2,16,9,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,105,4,5,700,900,-200,-901,800,1000,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,6,8,289,7,-105,-277,20,200,3,104,4,5,105,900,-200,300,800,1000,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,30,-200,8,-1,-9,-3,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,0,30,-9,8,-1,-5,-3,-4,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,11,9,3,-7,8,0,1,-12,6,-2,19,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,-2,9,3,1,8,0,11,-12,6,900,19,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,6,2,0,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,3,0,0,2,0,1,8,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,4,9,0,7,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,0,4,9,0,7,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,10,-12,7,6,-2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,-2,16,10,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,11,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,6,4,5,9,7,8,11,10,11,12,13,14,15,16,17,18,19,20,19,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,1,0,-8,9,0,-12,7,6,6,1,-12,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,1,2,0,5,1,0,-8,9,1,-12,7,3,6,1,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,21,-6,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,8,289,3,-6,-105,7,104,200,8,4,5,21,900,-200,300,800,1000,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,4,6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,6,0,4,14,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,6,2,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,1000,0,1,2,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,-8,0,5,11,900,18,-901,800,1000,0,-277,-277,500))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,0,8,289,7,-105,-277,20,200,-8,104,5,11,300,18,-901,800,1000,0,900,-277,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,105,8,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,105,8,-8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,1,3,-6,3,0,-8,6,2,0,1,16,8,16,0,4,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,1,0,-6,3,0,-8,6,0,0,1,2,8,16,3,4,1,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,6,5,-3,3,2,1,-1,-2,4,-4,-5,7,-7,-8,10,-10,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,7,-8,-7,2,0,1,20,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,3,0,2,-8,-7,7,0,1,20,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-8,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,0,8,289,0,-105,-277,7,200,3,20,5,700,104,18,-8,300,800,1000,900,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,1,8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,1,8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-5,1,2,-3,5,1,16,16,-8,9,-12,7,6,-12,16,1,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,1,2,-3,5,1,1,16,-8,6,-12,7,9,-12,16,16,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,9,-12,0,7,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,0,18,9,1,0,7,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,9,-6,3,0,-8,6,2,0,1,8,14,0,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,9,-6,3,0,-4,6,2,0,1,8,6,0,4,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,289,-200,8,-1,-9,-3,-4,-5,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,0,289,-9,8,-1,-5,-3,-4,9,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,4,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,4,16,-8,7,9,-12,16,6,-12,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,4,3,4,5,6,7,-9,9,10,11,12,13,14,15,16,17,18,19,20,11,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,0,2,4,3,4,5,6,7,11,9,10,14,12,13,17,15,16,19,18,19,20,11,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,9,-6,3,0,-8,6,2,0,1,8,14,0,4,6,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,9,-6,3,0,-4,6,2,0,1,8,6,0,4,14,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,7,-8,-7,2,0,1,20,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,3,0,1,-8,-7,2,0,1,7,0,0,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,105,0,-8,7,2,1,8,14,0,6,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,6,0,-8,7,2,1,8,14,0,105,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-1,700,-1,6,-4,3,11,3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,-1,700,-1,6,-4,3,11,3,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,11,5,1,16,-8,9,-11,7,4,-12,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-11,5,1,1,-8,9,11,7,4,16,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,300,4,9,0,7,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,300,4,9,0,7,6,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,1,3,-6,3,0,-8,6,2,0,1,16,8,16,0,4,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,1,3,-6,3,0,-4,6,2,0,1,16,4,16,0,8,1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-4,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,-4,9,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,18,30,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,12,3,-3,15,0,6,18,30,9,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12,0,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,8,12,0,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,-1,5,700,900,-901,800,1000,6,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-1,8,289,7,-105,-277,20,200,3,104,5,700,300,-901,800,900,6,0,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,105,2,8,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,105,0,8,-8,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,-1,6,-4,3,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,-1,6,-4,3,12,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,16,-8,9,-12,7,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,-3,1,16,16,2,9,-12,7,6,-12,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-3,-4,0,9,-5,3,-4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,-3,-4,0,9,-5,3,9,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,0,9,0,7,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,0,0,9,0,7,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,-5,1,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,9,-5,1,12,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6,16,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,9,16,7,6,16,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,6,6,-8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,6,8,-8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,105,3,3,0,7,-8,-2,2,0,1,20,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,105,1,3,0,2,-8,-2,3,0,1,7,0,0,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,9,-6,3,0,6,2,0,1,8,14,0,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,9,-4,3,0,0,2,0,1,8,14,6,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-2,-1,6,-4,13,12,0,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,8,-2,-1,6,0,13,12,9,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,6,6,-8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,0,2,1,6,14,6,6,-8,14,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,300,5,9,0,7,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,300,5,9,0,7,6,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,8,0,4,9,0,7,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,6,0,4,8,0,7,9,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,105,3,14,0,-8,6,2,0,1,8,14,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,105,-4,14,0,0,6,2,3,1,8,14,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,0,-8,6,2,1,8,14,6,6,-8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,3,-4,0,-8,0,2,1,6,14,6,6,-8,14,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(30,1,2,3,-3,5,1,16,16,-8,4,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,1,2,-12,-3,5,-8,16,16,1,4,9,3,7,6,30,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,13,0,3,-4,9,289,3,12,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,13,0,9,-4,9,289,3,12,900,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,-13,3,0,-8,6,2,0,1,8,-8,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,-13,3,0,-8,6,2,0,1,8,-8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(16,7,3,-6,3,0,-8,6,2,1,8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,1,6,2,16,8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,0,-8,-6,8,6,2,289,1,7,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,1000,0,-4,-6,8,1,2,289,6,7,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,16,-11,16,-8,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,2,3,1,1,16,5,16,-8,6,-12,7,9,-12,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,5,1,0,6,4,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,-3,1,1,0,5,4,9,6,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,15,3,9,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,6,15,3,9,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,-4,3,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-1,9,-4,3,12,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,4,0,-3,18,30,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,12,3,6,15,4,9,-3,18,30,-9,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,0,9,0,7,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,0,0,9,1,7,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,11,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,11,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-105,0,30,-200,8,-1,-9,-3,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,0,30,-105,8,-1,-9,-3,-4,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,290,3,-6,3,0,-8,6,2,0,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,290,3,-6,3,0,-4,6,2,0,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,1,0,6,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,4,-12,7,7,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,1,-3,-8,9,1,7,4,4,7,7,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,7,6,6,1,104,-13,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,6,6,7,104,-13,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,1000,700,6,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,1000,700,6,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,700,1,13,6,-2,19,19,13,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,6,3,-7,9,8,0,11,1,13,19,-2,19,700,13,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,11,9,3,-7,8,0,1,-12,6,200,-2,19,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,1,9,3,11,8,0,13,-12,6,200,-2,19,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-200,8,-1,-9,-3,-4,-5,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,0,-200,8,-1,-9,9,-4,-5,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,105,3,3,0,7,-8,-2,2,0,1,20,0,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,105,0,3,0,2,-8,-2,3,0,1,7,0,0,20,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,-5,1,12,-4,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,1,9,-5,9,12,-4,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,16,-11,16,-8,9,-12,7,6,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,16,-11,1,-8,9,5,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,0,6,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,12,0,6,3,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,6,1,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,1,0,6,14,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,21,20,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,11,9,10,14,12,13,17,15,16,19,17,19,21,20,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,0,-8,6,2,1,8,13,6,6,-8,14,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,3,-6,0,-8,-4,2,1,6,13,6,6,-8,14,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,-4,3,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-1,9,-4,3,900,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,4,-6,0,-8,6,2,1,8,13,6,6,-8,14,-6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,4,-6,0,-8,-4,2,1,6,13,6,6,-8,14,8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,500,3,12,20,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,6,500,20,3,12,500,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,5,2,1,8,14,0,6,-8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,5,2,1,6,14,0,8,-8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,700,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,6,700,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,0,8,-1,6,-4,-5,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,10,12,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,200,-12,7,6,6,1,-13,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,1,9,200,5,7,6,6,1,-13,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-7,105,1,0,-8,9,-12,7,6,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-7,105,1,0,-8,9,1,7,6,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,1000,0,-8,6,290,2,289,1,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-6,6,0,-8,289,290,2,1000,1,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,-8,-7,2,0,1,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,7,3,-6,3,-8,-4,2,0,1,8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12,18,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,9,12,18,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,4,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,18,4,6,-12,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,30,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,12,3,-3,15,0,6,30,-9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,1,8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,1,8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,-3,5,1,16,-12,7,4,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-12,1,16,1,7,4,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,4,9,-12,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,18,4,9,-12,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,0,-1,6,19,-5,3,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,0,-1,6,19,0,3,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,6,3,3,0,6,2,1,800,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,6,3,0,0,6,2,1,800,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,3,-4,9,-5,1,12,300,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,3,-4,9,-5,1,12,300,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,9,-6,3,11,-8,6,2,-11,1,8,14,0,4,6,9,2,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,7,9,-8,3,11,-6,6,2,-4,1,8,0,0,4,6,9,2,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,104,20,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,6,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,104,20,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,9,-6,3,11,-8,6,2,-11,1,8,14,0,4,6,9,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,7,9,-8,3,11,-6,6,2,-4,1,8,6,0,4,14,9,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,-1,5,700,900,-901,800,1000,6,0,-277,500))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-1,8,289,7,-105,-277,20,200,3,104,5,700,300,-901,800,900,6,0,1000,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,16,7,8,9,10,11,12,14,15,16,17,18,19,21,20,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,7,6,16,10,8,9,14,11,12,17,15,16,19,18,19,21,20,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,-10,8,289,20,-105,-277,104,200,3,4,5,-278,700,900,-901,800,1000,-105))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,500,6,4,8,289,20,-105,-277,104,200,3,300,5,-278,700,900,-901,800,1000,-105).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,12,1,12,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,9,12,1,12,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,700,12,15,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,6,700,12,15,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,105,-5,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,-1,6,105,-5,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,21,-105,-277,104,200,4,5,700,900,-200,-901,800,1000,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,21,200,4,104,700,900,300,-901,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,20,200,4,104,700,900,300,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,1,105,8,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-8,3,0,-6,6,2,-4,105,8,1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,18,7,3,-6,3,0,-8,6,1,8,14,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,18,7,0,-6,3,1,-8,6,3,8,14,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,15,3,0,105,-8,2,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,15,-4,0,105,3,2,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,4,5,700,-200,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,500,6,7,8,289,20,-105,-277,104,200,4,300,700,-200,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,5,1,0,-8,9,200,-12,7,6,6,1,-13,7,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,5,1,0,-8,2,200,-12,7,6,6,9,-13,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,-10,8,289,20,-105,-277,104,200,3,4,11,5,-278,700,900,-901,800,1000,-105))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-278,8,289,-105,-105,-277,-10,200,3,4,11,5,20,700,900,104,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,11,9,3,-7,11,0,1,13,6,-2,19,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,-2,9,3,1,11,0,11,13,6,900,19,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,21,-105,-277,104,200,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-105,289,21,7,-277,104,200,4,5,300,900,-200,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,-7,2,0,1,5,500,0,0,-7,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-7,3,0,-6,-7,2,-4,1,5,0,0,0,500,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,16,-8,9,-12,19,7,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-8,16,16,1,9,-12,2,7,6,19,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,4,5,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,18,4,5,9,-12,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,6,300,4,9,0,7,6,0,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,-3,6,300,1,9,0,4,6,0,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,16,-11,16,-8,9,-12,7,-12,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,1,16,-11,5,-8,9,16,7,-12,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,8,-12,7,6,2,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,8,2,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,14,3,-6,3,0,-8,6,2,0,1,8,-4,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,14,0,-6,3,2,-8,6,3,0,1,8,-4,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,-5,1,12,-4,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,1,9,-5,9,12,-4,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,1000,11,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,1000,11,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,-5,1,17,12,-4,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,-4,9,-5,1,17,12,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,9,289,3,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,3,9,289,9,900,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,7,11,9,3,-7,11,0,1,13,7,-2,19,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,11,9,3,-7,11,0,1,13,7,-2,19,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,700,12,3,3,700))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,12,3,700,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,5,1,0,-8,9,-12,7,6,6,1,6,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,5,1,0,-8,6,-12,7,6,6,1,9,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,2,-12,7,7,6,1,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,2,-8,9,7,-12,7,16,6,1,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,1,3,-6,3,0,-8,6,2,0,1,16,7,16,0,4,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,1,0,-6,3,0,-8,6,0,0,1,2,7,16,3,4,1,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,13,1,16,16,9,-12,7,6,-2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,13,1,-2,16,9,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,30,13,8,-1,-9,-3,-4,-5,12,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,0,30,-5,8,-1,9,-3,-4,13,12,-3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,14,0,6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,8,0,6,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,200,3,0,5,700,900,18,-901,800,1000,0,289,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,5,8,289,7,-105,-277,18,3,0,20,700,900,200,-901,800,300,0,289,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,200,19,3,0,5,700,-3,900,18,-901,800,1001,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-105,289,20,5,-277,200,7,3,0,19,700,-3,300,18,-901,800,1001,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,17,8,289,20,-105,2,104,200,3,0,5,700,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,0,8,289,17,-105,2,20,200,3,104,5,700,300,18,-901,800,1000,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,200,19,3,699,0,5,700,900,18,-901,800,1001,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-105,289,20,0,-277,200,7,3,699,19,5,700,300,18,-901,800,1001,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,5,1,0,-8,9,-12,7,-4,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,3,5,1,0,-8,1,-12,7,6,6,1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,-1,-8,9,-12,7,6,5,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,-1,1,9,-12,5,6,5,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,200,3,0,5,700,900,18,-901,800,1000,0,289,-277,18))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,5,8,289,7,-105,-277,18,3,0,20,700,900,200,-901,800,300,0,289,1000,18).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,16,7,8,9,10,11,12,14,15,16,17,18,19,21,20,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,7,6,16,10,8,9,14,11,12,17,15,16,19,18,19,21,20,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,1,13,6,-2,19,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,9,3,-7,11,8,1,13,6,-2,19,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9,8,9,10,11,12,13,14,15,16,17,18,19,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,9,8,9,10,11,12,13,14,15,16,17,18,19,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,-8,9,-12,7,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,-3,2,16,-8,6,-12,7,7,-12,16,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,21,20,200,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,19,20,200,21).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,0,-1,6,-4,-5,3,3,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,0,-1,6,-4,9,3,3,12,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,-6,3,0,-8,2,1,8,14,0,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,3,-6,2,0,-8,3,1,8,14,0,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,10,11,9,12,13,14,15,16,17,18,19,21,20,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,9,10,11,14,12,13,17,15,16,19,18,19,21,20,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,-4,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,6,9,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,11,5,1,16,-8,0,9,-11,7,-2,4,-12,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,3,1,5,1,7,-8,0,9,-11,7,11,4,-12,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,4,5,700,900,-200,-901,800,1000,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,20,200,4,104,700,900,300,-901,800,1000,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,0,-8,6,2,1,8,13,6,6,-8,14,-6,6,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,3,-6,0,-8,-4,2,1,6,13,6,6,-8,14,8,6,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,11,5,8,1,16,-8,9,-11,7,4,-12,7,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,1,5,8,4,16,-8,7,-11,7,9,-12,7,11,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,-8,9,-12,7,6,-4,16,7,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,-3,2,16,-8,6,-12,7,7,-4,16,9,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,1,0,-8,9,11,0,-12,7,6,6,1,-12,1,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,1,5,1,1,-8,9,1,0,-12,3,6,6,7,-12,1,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,900,9,3,-7,8,0,1,-12,6,-2,19,13,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,-2,9,3,1,8,0,19,-12,6,900,19,13,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,0,6,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,0,8,-8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-2,-6,3,0,-8,6,0,2,0,1,8,14,-12,4,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,7,3,-4,-6,3,-2,-8,6,0,2,0,0,8,14,1,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,700,1,13,6,-2,19,19,13,9,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,6,3,-7,9,8,0,11,1,13,13,-2,19,19,13,9,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,10,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,0,8,9,6,-4,10,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(22,9,12,3,6,15,0,-3,18,21,30,-9,22))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,9,12,3,6,15,21,-3,18,22,30,-9,22).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(7,3,3,-7,1,8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,3,3,7,1,8,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,3,0,-8,6,2,699,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-6,0,0,-8,1,2,699,3,8,0,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,2,-5,-6,-7,-8,-9,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,9,8,-5,6,5,-3,3,2,1,-1,-2,4,-4,2,7,-6,-7,10,-9,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-3,-4,0,9,-5,-4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,0,3,3,-4,0,9,-5,-4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,700,12,699,15,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,700,12,9,15,0,699).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,289,11,15,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,289,11,15,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-10,10,12,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,0,8,-1,6,-4,0,10,12,9,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-1,7,700,-1,6,-4,3,11,3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,-1,7,3,-1,6,9,3,11,700,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,5,16,-8,9,-12,7,6,16,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,5,16,-8,6,-12,7,9,16,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,16,7,8,289,21,-105,-277,200,4,5,700,-200,-901,800,1000,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,500,16,21,8,289,200,-105,-277,300,4,5,700,-200,-901,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,-8,9,-12,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,1,16,-8,2,-12,6,9,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,2,-12,7,6,1,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,2,-8,9,6,-12,7,16,1,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12,0,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,-1,12,0,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,5,1,16,16,-8,9,-12,7,-12,-9,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-9,1,16,2,-8,9,5,7,-12,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,0,6,2,1,8,14,6,6,-8,14,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,3,-6,0,6,-4,1,8,2,6,6,14,14,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,7,3,-3,5,1,16,-8,9,104,7,6,16,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,7,3,1,5,1,16,-8,9,16,7,6,104,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,4,3,4,5,6,7,-9,9,10,11,12,13,14,15,16,17,18,19,20,11,16,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,0,2,4,3,4,5,6,7,11,9,10,11,12,13,14,15,16,17,18,19,19,11,16,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,1,10,-12,7,6,6,1,-12,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,-8,1,10,1,7,6,5,1,-12,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,499,6,17,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,499,6,0,8,289,17,-105,-277,20,200,3,104,5,700,300,18,-901,800,1000,0,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,1000,0,-8,6,290,2,289,1,1000,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-6,6,0,-8,289,290,2,290,1,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,800,700,2,699,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,800,12,2,699,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,-277,-105,-277,104,200,3,0,5,700,900,18,-901,800,1000,0,-277,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-277,8,289,0,-105,-277,7,200,3,104,5,700,300,18,-901,800,1000,0,900,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-3,-4,0,9,-5,3,-4,3,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,3,-3,-4,0,9,-5,3,9,3,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,16,7,7,9,10,12,14,15,16,17,18,19,21,20,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,7,6,16,10,7,9,15,12,14,18,16,17,19,19,21,20,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,30,-200,8,-1,-9,-3,-4,-5,12,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,0,30,-9,8,-1,-5,-3,-4,9,12,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,9,-12,7,6,16,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,9,16,7,6,16,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,-2,1,16,-8,9,-12,7,6,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,-2,1,16,-8,6,-12,7,9,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,2,1,8,14,0,2,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,2,1,2,14,0,8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,1,3,-6,3,0,-8,6,2,1,16,8,16,0,4,1,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,1,3,-6,3,0,-4,6,2,1,16,8,1,0,4,16,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,200,3,0,5,700,900,18,-901,800,1000,0,289,-277,18,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,5,8,289,7,-105,-277,18,3,0,20,700,900,200,-901,800,300,0,289,1000,18,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,20,-8,9,-12,7,6,5,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,20,2,9,-12,5,6,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-5,200,-8,-7,2,0,1,8,0,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,7,3,-6,200,-8,-5,2,0,-4,8,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,10,-4,9,289,3,12,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,10,3,9,289,3,12,900,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,16,-8,9,-12,7,6,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,16,-3,-8,9,1,7,6,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,16,-8,10,-12,7,0,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,16,-3,-8,10,1,7,0,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,105,3,3,0,7,-8,-2,2,0,12,1,20,0,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,105,0,3,0,1,-8,-2,2,0,12,3,20,0,7,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,11,5,8,1,16,-8,9,-12,7,4,-12,7,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,1,5,8,4,16,-8,7,-12,7,9,-12,7,11,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,-10,1,16,16,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,-10,1,-3,16,9,1,7,6,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,-3,900,18,-901,800,1000,0,-277,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-3,8,289,0,-105,-277,0,200,3,7,5,700,20,900,18,104,800,1000,300,-277,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(16,3,-6,3,0,21,6,2,1,8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,-6,6,0,21,8,2,1,16,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,2,-5,-6,-7,-8,-9,-10,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,9,8,-5,6,5,-3,3,2,1,-1,-2,4,-4,2,6,-6,-7,7,-9,-10,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,-12,6,-4,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,0,1,9,-12,5,-4,6,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,105,-901,800,1000,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,6,-105,-277,7,200,3,20,5,700,104,-200,105,300,800,1000,900,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,0,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,0,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,-12,-8,5,2,1,8,14,0,6,-8,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,-12,-8,5,2,1,6,14,0,8,-8,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,-9,1,0,-8,9,-12,7,-4,6,1,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,0,-9,1,1,-8,9,3,7,-4,5,1,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9,8,9,10,11,12,13,14,15,17,18,19,11,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,9,8,9,10,11,12,13,14,15,17,18,19,11,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-8,-901,800,1000,0,-277,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,0,8,289,0,-105,-277,7,200,3,20,5,700,104,18,-8,300,800,1000,900,-277,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,200,-12,7,6,6,1,-13,9,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,1,9,200,5,7,6,6,1,-13,9,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,11,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,11,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-4,9,289,3,12,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-4,9,289,3,12,900,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-3,-4,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,8,-1,6,-3,9,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,6,500,3,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,500,9,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,105,4,5,700,900,-200,-901,800,1000,6,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,6,8,289,7,-105,-277,20,200,3,104,4,5,105,900,-200,300,800,1000,700,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,-9,1,0,-8,9,-12,7,-4,6,6,1,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,0,-9,1,1,-8,9,5,7,-4,6,6,1,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,0,-1,6,19,-5,3,9,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,0,-1,6,19,9,3,9,12,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3,5,1,0,-8,9,0,-12,7,6,6,-12,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,0,5,1,1,-8,9,1,-12,7,3,6,-12,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,17,5,6,7,8,9,10,12,13,14,15,16,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,7,3,4,10,5,6,14,8,9,17,12,13,18,15,16,19,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,15,16,-8,10,-12,7,0,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,16,1,16,-8,10,-12,7,15,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,2,1,8,14,0,2,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,2,1,2,14,0,8,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,9,-1,6,-4,-5,12,0,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,8,0,-1,6,9,-5,12,9,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,12,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,6,12,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,9,3,-4,289,3,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,9,3,-4,289,9,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,15,16,9,-12,7,6,-12,7,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,5,1,5,15,16,6,-12,7,9,-12,7,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-1,700,-1,6,-4,3,20,11,17,3,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,-1,700,3,6,-4,9,20,11,17,3,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,289,10,16,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,289,10,16,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,14,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,21,20,200,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,4,14,3,7,5,6,10,8,9,13,11,12,16,14,15,19,17,17,19,21,20,200,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,-8,8,-12,7,6,1,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,-8,8,1,7,6,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,4,300,0,-3,18,30,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,12,3,6,15,4,9,0,-3,18,30,-9,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,3,0,6,2,0,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-6,2,0,6,3,0,1,8,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,10,11,12,14,14,15,16,17,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,8,6,7,12,10,11,15,14,14,18,16,17,19,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,18,7,3,-6,3,0,-8,6,0,8,14,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,18,7,0,-6,3,0,-8,6,3,8,14,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,-3,5,1,0,18,4,9,-5,-12,0,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,-3,5,1,0,18,2,9,-5,4,0,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,-1,0,7,-8,-7,2,0,1,20,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,7,3,-6,3,-1,-4,7,-8,0,2,0,0,20,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,7,8,10,11,9,12,13,14,15,11,16,17,18,19,21,20,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,0,-901,2,3,4,5,6,7,8,10,11,9,12,13,14,15,11,16,17,18,19,21,20,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,3,0,7,-8,-7,2,0,1,20,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,3,-4,3,0,2,-8,-7,7,0,1,20,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,16,7,8,289,21,3,-105,-277,200,4,5,700,-200,-901,800,1000,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,16,-277,8,289,5,3,-105,7,200,4,21,700,-200,300,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,3,0,-8,6,2,1,800,0,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,3,-6,3,0,-4,6,2,1,800,0,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-1,6,3,12,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-1,6,3,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-8,1001,-901,800,1000,0,-277,-8,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,500,6,0,8,289,7,-105,-277,20,200,3,104,5,700,300,18,-8,900,-901,800,1000,0,-277,1001,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,3,0,-8,6,799,2,1,800,0,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,3,-6,3,0,-4,6,799,0,1,800,2,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(6,300,500,6,7,8,289,20,-105,-277,104,200,3,0,5,700,900,-276,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,300,500,3,7,8,6,20,-105,6,104,200,18,0,5,289,900,-276,700,-901,800,1000,0,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,-276,4,5,6,16,7,8,9,10,11,12,14,15,16,17,18,19,21,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,4,3,-276,9,5,6,12,7,8,16,10,11,16,14,15,19,17,18,19,21,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(3,-3,1,16,16,-8,9,-12,7,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,-3,1,6,16,-8,7,-12,7,9,-12,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,13,3,4,-4,9,-5,289,12,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,13,9,4,-4,9,-5,289,12,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,-277,22,-277,104,200,3,0,5,700,901,18,-901,800,1000,0,-277,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-277,8,289,0,22,-277,7,200,3,104,5,700,300,18,-901,800,1000,0,901,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,105,3,-1,10,14,0,-8,6,2,0,1,8,14,0,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,3,105,0,-1,10,1,0,-8,3,2,0,6,8,14,14,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(7,3,-6,3,0,-8,6,2,2,1,8,14,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,-6,1,0,-8,3,2,2,6,8,14,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,-901,2,3,4,5,6,16,7,8,10,10,11,12,14,15,16,17,18,19,21,20,16))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,-901,5,3,4,7,6,16,10,8,10,14,11,12,17,15,16,19,18,19,21,20,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,-4,-5,1,-11,-4,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,0,3,-4,-5,1,9,-4,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,-3,1,0,6,4,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,-3,1,0,6,4,9,-12,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,30,-9,-9,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,12,3,6,15,0,9,-9,-9,30).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,15,16,-8,10,-12,7,0,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,16,1,16,-8,10,-12,7,15,-12,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,105,4,5,700,900,-200,-901,800,1000,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,6,8,289,7,-105,-277,20,200,3,104,4,5,105,900,-200,300,800,1000,700,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,4,-6,0,-8,6,2,1,13,6,6,-8,14,-6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,4,-6,0,-8,-4,2,1,6,6,6,8,14,-6,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-1,700,-1,17,6,-4,3,11,3,-1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,-1,700,-1,17,6,3,3,11,9,-1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,14,0,-901,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,21,20,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,14,0,5,3,4,8,6,7,12,10,11,15,13,14,18,16,17,19,19,21,20,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,-278,15,16,-8,10,-12,7,0,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-278,2,3,-8,5,16,-3,15,16,1,10,-12,5,0,-12,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(6,300,500,6,7,1001,8,289,20,-105,-277,104,200,3,0,5,700,900,-276,18,-901,800,1000,0,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,300,500,-276,7,1001,-105,289,20,5,-277,104,6,3,0,6,700,900,8,18,-901,200,1000,0,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-5,1,2,-3,5,1,289,16,16,-8,9,-12,7,6,-12,16,1,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,1,2,-5,5,1,-3,16,16,5,9,-12,7,6,-12,16,1,5,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,1001,20,-105,-277,104,200,3,105,4,5,700,900,-200,-901,800,1000,22,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,7,8,1001,20,-105,-277,22,200,3,104,4,5,105,900,-200,300,800,1000,700,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,3,-6,3,0,7,-8,-7,2,0,0,1,-7,20,0,0,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,8,3,-4,3,0,0,-8,-7,1,0,0,2,-7,20,7,0,-7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,-278,15,16,-8,10,-12,7,0,-12,5,10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-278,2,3,-8,5,16,-3,15,16,1,10,-12,5,0,-12,7,10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,18,4,9,-12,7,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,18,4,4,-12,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,5,1,0,-8,9,-12,105,6,6,1,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,5,1,0,-8,6,-12,105,6,6,1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,8,9,-1,6,-4,-5,12,0,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,8,9,-1,6,-4,0,12,0,8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-3,7,3,-6,3,0,-8,6,2,0,901,8,0,0,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-3,6,2,0,901,8,0,0,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(16,7,3,-6,3,0,-8,6,2,1,8,14,8,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,1,6,2,8,8,14,16,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,4,9,0,6,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,0,4,9,0,6,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,1000,0,-8,-6,8,6,2,289,1,7,-8,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,-6,-4,0,-8,2,8,6,7,289,1,1000,-8,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,0,-8,6,2,1,8,14,-1,6,-8,6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,0,-8,6,2,1,6,14,-1,8,-8,6,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,9,289,3,12,900,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,3,9,289,3,12,900,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,0,-8,9,0,-12,-6,6,6,1,-12,1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,0,1,9,0,1,-6,6,5,1,-12,6,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-6,1000,0,-8,-6,8,6,2,289,1,7,-8,-6,289))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,-6,-4,0,-8,2,8,6,7,289,1,289,-8,-6,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,11,9,3,-7,8,0,1,-12,6,200,-2,19,13,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,1,9,3,11,8,0,13,-12,6,200,-2,19,900,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,801,7,8,289,20,-105,-277,104,200,3,0,5,700,900,18,-8,-901,800,1000,0,-277,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,801,0,8,289,0,-105,-277,7,200,3,20,5,700,104,18,-8,300,800,1000,900,-277,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,1,-1,-8,9,-12,7,6,5,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,1,-1,-8,2,-12,7,6,5,1,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,-10,1,16,16,9,-12,7,1,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,-10,1,-3,16,9,1,7,1,16,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-1,-2,-9,-3,-4,-5,-6,-7,-8,-9,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-8,6,5,-5,3,2,1,-1,-2,4,-3,-4,7,-6,-7,10,-9,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-2,1,16,-8,9,-12,7,6,-12,16,-7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,3,-2,1,16,-8,2,-12,7,6,-12,16,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,4,9,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,1,4,9,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,14,3,-5,3,0,-8,6,2,0,1,8,-4,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,14,0,-5,3,2,-8,6,3,0,1,8,-4,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,20,7,3,-6,3,0,-8,6,0,1,105,8,-8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,20,7,0,-6,3,0,-8,6,3,1,105,8,-8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,900,9,3,-7,8,0,1000,-12,6,-2,19,13,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,-2,9,3,19,8,0,900,-12,6,900,19,13,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,16,16,-8,9,-12,7,6,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,-3,16,16,1,9,-12,7,6,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,2,7,900,9,3,-7,8,0,1000,-12,-278,-2,19,13,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,-2,9,3,19,8,0,900,-12,-278,900,19,13,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,300,6,3,12,0,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,300,6,3,12,0,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,-9,16,16,-8,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,2,3,-8,5,1,-3,16,16,1,-12,7,6,-12,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-1,-4,7,105,3,3,0,7,-8,-2,2,0,1,20,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,-4,7,-1,3,3,0,7,-8,0,2,0,1,20,0,105,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,21,20,200,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,6,4,5,9,7,8,12,10,11,15,13,14,17,16,17,19,19,21,20,200,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,20,6,3,3,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,0,20,6,3,3,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,289,20,-105,-277,104,200,3,4,700,5,700,900,-901,800,-11,4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,6,7,-11,289,20,8,-277,104,200,3,4,500,5,700,700,-901,800,900,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,2,7,8,6,-277,22,-277,104,200,3,0,5,901,18,-901,800,1000,0,-277,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-277,7,8,2,-277,22,3,104,200,6,0,5,300,18,-901,800,1000,0,901,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,15,-2,-8,10,-12,7,0,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,16,1,-2,-8,10,-12,7,15,-12,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-1,700,-1,17,6,-4,11,3,-1,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,-1,700,-1,17,6,-1,11,3,9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,21,-105,-277,104,200,4,5,700,900,-200,-901,800,1000,300,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,21,200,4,104,700,900,300,-901,800,1000,300,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,15,-2,-8,10,-12,7,0,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,16,1,-2,-8,10,-12,7,15,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,3,9,289,3,12,900,3,289))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,3,9,289,3,12,900,3,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(2,3,-3,1,16,-8,9,-12,6,6,-12,16,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,-3,2,16,-8,6,-12,6,7,-12,16,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,4,-6,3,0,-8,6,2,0,1,8,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,4,-6,3,0,-4,6,2,0,1,8,0,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(0,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-2,6,-4,10,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,0,8,9,6,-4,10,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(900,1,2,3,-3,5,1,801,4,9,0,6,6,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,2,3,-3,5,6,801,4,9,0,6,900,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(19,0,2,4,3,4,5,6,7,-9,10,11,12,13,14,15,16,17,18,19,20,11,16,11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,0,2,4,3,4,5,6,7,11,10,11,12,13,14,15,16,17,18,19,20,19,16,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,4,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,4,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,30,-9,-9,3,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,12,3,6,15,0,9,-9,-9,30,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,13,2,7,9,3,-7,11,8,0,700,1,13,6,-2,19,19,13,9,13,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,13,2,0,9,3,5,11,8,7,700,1,9,6,-2,13,19,13,19,13,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,3,-3,5,1,16,15,16,9,-12,7,6,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,3,-3,-12,1,16,1,16,9,5,7,6,15,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,0,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,0,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,8,-12,-6,4,900,-8,6,799,2,1,800,0,800,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,-12,-6,4,900,-4,6,799,0,1,800,2,800,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,3,-4,9,-5,1,12,300,-4,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,3,-4,9,-5,1,9,300,-4,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,8,-1,6,-4,-5,12,18,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,8,-1,6,-4,9,12,18,12,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,18,7,3,-6,3,289,-8,6,1,8,14,14,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,18,7,1,-6,3,3,-8,6,14,8,14,289,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,2,-277,1,8,14,0,2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,2,-277,0,8,14,1,2,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,4,5,700,900,-200,-901,499,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,5,8,289,7,-105,-277,20,200,4,104,700,900,300,-901,499,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,4,9,0,6,6,0,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,5,1,0,4,9,0,6,6,1,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-1,6,-4,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,6,-4,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,701,900,-200,105,-901,800,1000,6,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,6,-105,-277,7,200,3,20,5,701,104,-200,105,300,800,1000,900,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,16,16,-8,9,-12,7,6,-12,16,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,1,16,-8,6,-12,7,9,-12,16,16).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,104,200,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,104,200,300,5,700,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,9,3,-7,8,-8,8,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,9,-2,-7,8,1,8,0,3,13,6,5,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,10,-4,9,289,3,12,900,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,0,10,3,9,289,3,12,900,9,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,200,7,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,6,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,200,7,3,20,-105,6,104,200,7,4,5,289,900,-200,300,800,1000,700,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,15,16,10,-12,7,0,-12,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,16,-3,16,10,1,7,0,15,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,105,3,3,0,7,-8,-2,2,1,1,20,0,0,0,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,105,0,3,0,2,-8,-2,3,1,1,7,0,0,20,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,14,6,105,-4,-5,14,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,14,6,105,-4,9,14,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,16,16,-8,10,-12,7,0,-12,-12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-12,5,16,-3,-8,10,1,7,0,16,-12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,1,16,-11,16,-8,9,-12,7,6,-12,16,7,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,2,3,1,1,16,5,16,-8,6,-12,7,7,-12,16,9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,499,6,17,8,289,20,-105,-277,-200,104,200,37,3,0,5,700,900,18,-901,800,1000,0,-277,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,499,6,0,8,289,5,-105,-277,17,104,200,18,3,0,20,700,900,37,-901,800,300,0,-277,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,1,1,-1,-8,9,-12,7,6,5,1,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,1,-1,1,9,-12,1,6,5,7,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,18,7,-6,3,-6,3,0,-8,6,0,8,14,14))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,18,7,-4,3,-6,3,0,-8,6,0,8,14,14).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(6,9,3,12,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,9,3,12,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,5,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,3,4,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,3,3,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(4,-3,9,-5,0,-7,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-3,9,2,0,-7,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,104,200,3,4,-8,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,104,289,104,200,300,4,-8,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,6,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,-6,18,21,30,-9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,6,15,0,9,-6,18,9,30,-9,21).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,7,6,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,7,9,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,290,3,0,-8,6,2,0,1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-4,3,0,0,6,2,290,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,104,200,-8,700,900,-901,800,1000,290,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,290,8,-8,20,104,7,104,200,289,700,900,290,800,1000,300,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,290,3,0,-8,6,2,0,1,-9,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-4,3,0,0,6,2,8,1,-9,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,0,-3,-6,18,21,30,-9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,12,3,6,0,-3,9,18,21,30,-9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,-901,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000,900))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,-901,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(290,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(290,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,104,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-901,8,289,4,-105,-277,20,200,3,104,700,900,290,800,1000,300,104,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,-6,-9,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,6,15,0,9,-6,-9,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-7,3,-6,3,0,-8,6,2,0,1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,-7,0,-6,3,2,-8,6,3,0,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,104,200,-8,700,900,-901,800,1000,290,-8,900))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,290,8,-8,20,104,7,104,200,289,700,900,290,800,1000,300,-8,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,300,3,4,5,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-901,290,8,-277,20,-105,5,104,200,7,3,4,289,700,900,300,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,289,290,8,289,20,104,-277,104,200,-8,700,900,-901,800,1000,15,-8,700))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,290,8,-8,20,104,15,104,200,289,700,900,289,800,1000,300,-8,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,7,290,8,200,20,104,289,8,104,300,-8,700,900,-901,800,1000,290,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,7,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,7,-105,-277,20,200,7,104,4,5,300,900,-200,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(290,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(290,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-1,-2,-3,-4,-1,-5,-6,-7,-8,-9,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,6,5,-4,2,1,-1,-2,-3,4,-1,-5,7,-7,-8,500,-11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,1,-9,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,7,3,-4,290,3,0,-8,6,2,0,1,289,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,-6,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,3,-7,6,8,-6,9,1,13,11,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,11,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,3,-6,9,8,-6,11,300,1,13,6,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-7,-1,-2,-3,-4,-1,-5,-6,-7,-8,-9,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,9,8,-7,6,5,-5,2,1,-3,-1,-2,4,-4,-1,7,-6,-7,500,-9,-11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(8,9,0,0,6,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,9,0,8,6,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,500))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,1,-9,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,7,3,-4,290,3,0,-8,6,2,0,1,289,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,20,-105,-277,104,200,3,104,700,900,290,800,1000,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,7,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,7,-105,-277,20,8,7,104,4,5,300,900,-200,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,289,20,104,-277,104,200,3,4,-8,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,6,7,20,8,289,104,104,-277,290,200,3,500,-8,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,-4,1,8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,290,3,2,-8,6,7,0,8,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,21,7,290,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,21,3,290,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,-901,10,11,12,13,14,15,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,-901,8,11,12,10,14,15,13,17,18,16,20,7,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,899,-277,104,8,7,3,4,5,19,700,900,-200,-901,800,1000,500))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,-105,289,20,3,899,-277,7,8,7,19,4,5,104,700,900,300,-901,800,1000,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,-901,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,-901,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,3,8,289,20,104,290,104,200,500,4,-8,700,-2,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,6,7,-105,289,20,5,-277,104,8,3,4,200,700,900,500,-901,800,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,0,-8,-7,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,5,0,-3,-7,9,1,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,6,3,-6,8,-6,0,9,1,13,300,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,1,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,291,8,-3,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,500,6,-3,291,8,7,289,20,104,-277,8,104,200,-8,300,900,-901,700,1000,290,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,1000,18,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,6,15,0,9,1000,18,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,-6,18,29,21,30,-9,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,12,3,-3,15,0,6,-6,18,9,21,30,29,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,289,290,3,0,-8,899,2,0,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,289,-4,3,0,0,899,2,290,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,7,-105,-277,20,200,3,104,5,700,300,-200,-104,900,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,-2,8,289,20,-105,-277,104,200,3,4,5,10,700,900,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-277,8,289,-2,-105,-277,4,200,3,20,5,10,104,900,-200,500,800,1000,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,8,7,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,290,3,2,-8,6,7,0,8,289,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,-8,9,-12,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,-3,5,1,1,9,-12,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-901,8,289,4,-105,-277,20,200,3,104,700,900,290,800,1000,300,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,105))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,20,-105,-277,104,200,3,105,700,900,290,800,1000,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,15,3,7,-7,11,8,0,1,13,6,-2,19,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,7,15,3,8,-7,11,9,0,1,13,6,-2,19,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,800,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,3,8,289,20,104,290,104,200,500,4,-8,700,-2,-901,800,1000,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,291,800,1000,105,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,20,-105,-277,104,200,3,290,700,900,500,291,800,1000,105,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-7,-3,5,0,-8,-7,9,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,3,0,-3,5,1,-8,-7,6,-12,7,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,11,3,6,15,0,-3,1000,18,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,11,3,6,15,0,9,1000,18,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,7,-105,-277,20,200,3,104,5,700,300,-200,-104,900,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,5,-200,-104,-901,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-104,500,6,4,8,289,7,-105,-277,20,200,3,104,5,700,300,5,-200,900,-901,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,-901,8,289,-105,-277,11,200,3,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,-901,8,11,-105,-277,289,200,3,300,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,6,12,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,900,0,9,12,3,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,-6,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,0,-5,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,8,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,8,104,200,289,4,700,300,900,-901,800,1000,-901,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,6,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,5,700,900,-901,800,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,291,8,-3,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,500,6,-3,291,8,7,289,20,104,-277,8,104,200,-8,300,900,-901,700,1000,290,800,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,0,3,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-901,8,289,4,-105,-277,6,200,3,20,700,900,104,800,1000,290,0,3,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800,1000,-277,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,6,7,-105,289,20,5,-277,104,8,3,4,200,700,900,500,-901,800,1000,-277,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,-901,8,289,20,-105,-277,104,5,200,3,4,5,700,900,-901,800,1000,900))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,-901,8,5,20,-105,7,104,5,200,3,4,289,700,900,300,800,1000,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,-6,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,0,-5,9,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,291,8,-3,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,104,290,-8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,500,6,7,291,8,104,289,20,104,-277,8,290,200,-8,300,900,-901,700,1000,104,800,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,-2,8,289,20,-105,-277,104,200,3,4,5,11,700,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,6,7,4,8,289,20,-105,-277,104,200,3,500,5,11,700,-200,-901,800,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,20,20,7,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,104,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,20,-105,-277,104,200,3,104,700,900,290,800,1000,300,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,-6,0,6,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,3,-7,9,8,-6,11,6,1,13,6,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800,1000,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,5,-105,-277,7,200,3,20,5,700,104,-200,-104,300,800,1000,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,300,7,3,289,290,0,-8,6,2,0,8,7,2,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,300,7,0,289,290,2,-8,6,3,0,8,3,2,3,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,11,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,11,16,17,18,20,20,7,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,801,1000,-277,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,6,7,-105,289,20,5,-277,104,8,3,4,200,700,900,500,-901,801,1000,-277,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,-9,700,900,-901,800,1000,-901,104,899,17,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,6,7,20,8,289,104,-105,-277,290,200,3,300,-9,700,899,-901,800,900,-901,104,1000,17,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,0,-5,-6,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,0,-5,1,12,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-277,104,200,3,4,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-901,290,8,4,20,-277,7,200,3,104,700,900,289,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-7,-3,5,0,-8,-7,1,-12,7,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,3,0,-3,5,1,-8,-7,1,-12,7,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-8,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,6,7,-8,289,20,5,-277,104,8,3,4,200,700,900,500,-901,800,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,-9,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,-9,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,15,2,3,4,5,6,7,8,10,11,1000,12,13,14,15,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,15,2,3,4,5,6,7,8,7,11,1000,10,13,14,12,16,17,15,20,20,18,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,291,8,-3,289,20,104,-277,8,200,-8,700,900,-901,800,1000,290,-8,200))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,500,6,7,291,8,104,289,20,200,-277,8,200,-8,700,300,-901,800,900,290,-8,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,7,3,12,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,3,8,289,5,-105,-277,7,8,7,20,12,4,104,700,900,300,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,-2,8,289,20,-105,-277,104,200,3,4,11,700,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,6,7,-2,8,289,4,-105,-277,20,200,3,104,11,700,500,-901,800,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,-104,-200,-104,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-104,8,289,4,-105,-277,7,200,3,20,5,700,104,-200,-104,300,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,300,6,289,290,8,289,20,104,-277,104,200,-8,700,900,-901,800,1000,15,-8,700))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,500,300,8,289,290,104,289,20,200,-277,104,300,-8,700,700,-901,800,900,15,-8,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,29,3,0,-8,6,2,0,1,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,3,-4,29,3,0,-8,6,2,0,1,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,6,8,289,20,-105,-277,104,200,3,20,4,5,700,900,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,6,6,4,289,20,8,-277,104,200,3,20,500,5,700,800,-200,-901,900,1000,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,-2,3,-6,1,0,300,5,13,6,9,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,15,7,3,12,4,5,700,900,799,-200,-901,800,1000,5,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,5,-105,-277,7,8,15,7,3,12,20,5,700,104,799,-200,300,800,1000,900,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,-4,3,4,700,900,-901,800,1000,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,-4,300,4,700,900,-901,800,1000,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,-6,0,1,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,0,3,-7,5,8,-6,9,1,6,11,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,9,12,3,6,15,0,-3,1000,18,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,9,12,1,6,15,3,-3,1000,18,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,104,7,8,289,20,-105,-277,104,8,9,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-200,7,8,5,20,-105,9,104,8,104,3,4,289,700,900,300,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-4,6,-5,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6,0,-4,9,-5,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,290,3,0,-8,6,2,0,1,-9,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-4,3,0,0,6,2,8,1,-9,290,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-7,-1,-3,-4,800,-5,-6,-7,-8,-9,-11,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-7,6,5,-6,2,1,-4,-1,-3,4,800,-5,7,-7,-8,500,-11,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-3,104,200,3,4,700,900,-901,800,1000,-901,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-276,104,200,3,4,700,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-276,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,20,3,6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-901,8,289,4,-105,-277,6,200,3,20,700,900,104,800,1000,290,20,3,300,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,15,3,7,-7,11,8,0,1,13,6,-2,19,5,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,7,15,3,8,-7,11,9,0,1,13,6,-2,19,5,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,7,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,7,5,-3,3,2,1,-1,-2,4,-4,-5,7,-7,-8,10,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,3,-7,11,8,-6,0,6,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2,7,5,-7,11,6,-6,0,6,1,13,8,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,-901,0,1000,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,290,8,3,20,-105,7,104,200,104,4,700,289,0,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,9,3,-7,11,8,-6,0,6,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,2,9,5,-7,11,6,-6,0,6,1,13,8,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,899,20,-105,-277,104,200,3,4,700,900,-901,291,800,1000,105,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,899,20,-105,-277,104,200,3,290,700,900,500,291,800,1000,105,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,1001,290,3,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-8,290,3,8,289,20,104,-277,104,200,3,4,500,700,-2,1001,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,7,3,12,4,5,700,900,799,6,-200,-901,800,1000,5,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,5,-105,-277,5,8,7,7,12,4,20,700,900,104,6,-200,300,800,1000,799,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,6,8,289,20,8,-277,104,200,3,20,300,4,5,700,900,-200,-901,800,1000,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,6,-277,289,20,8,-277,104,8,3,20,200,4,5,300,900,-200,500,800,1000,700).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,104,7,8,289,20,-105,-277,104,8,9,3,9,5,700,900,-200,-901,800,1000,-105))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-200,7,8,5,20,-105,9,104,8,104,3,9,289,700,900,300,-901,800,1000,-105).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-902,800,1000,103,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-902,6,7,4,8,289,20,-105,-277,103,200,3,104,700,900,290,800,1000,300,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,12,1,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-4,6,2,0,12,1,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,9,11,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,-2,3,-6,1,11,8,5,0,300,9,13,6,9,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,2,0,-8,9,-12,7,6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,2,-3,-8,9,0,7,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,8,289,-105,-277,11,3,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,4,289,-105,8,11,3,300,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(290,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(290,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(301,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,1000,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,20,104,200,289,4,700,301,-901,800,900,-901,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,-199,200,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,7,-105,-277,20,-199,200,104,4,5,300,900,-200,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,8,2,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,290,3,2,-8,6,2,0,8,289,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,5,0,-5,-6,12,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,5,0,9,-6,12,9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,10,3,289,290,3,0,-8,6,2,0,8,7,2,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,10,3,289,290,3,0,-8,3,2,0,6,7,2,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,-901,10,11,12,13,14,15,-276,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-276,2,3,1,5,6,4,8,-901,7,11,12,8,14,15,10,17,18,13,20,7,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800,1000,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,-105,289,20,5,-277,104,7,3,4,200,700,900,300,-104,-901,800,1000,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,5,0,-5,-6,12,9,9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,5,0,9,-6,12,9,9,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,2,-8,700,-2,-901,800,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,3,8,289,20,104,290,104,200,500,2,-8,700,-2,-901,800,1000,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,-2,8,289,20,-105,-277,104,200,3,4,5,11,700,-200,-901,800,1000,-277,289))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,6,7,4,8,289,20,-105,-277,104,200,3,289,5,11,500,-200,-901,700,1000,-277,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800,29,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,-105,289,20,5,-277,104,7,3,4,200,700,900,300,-104,-901,800,29,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,-4,-11,3,4,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-11,290,8,7,20,-105,289,104,-4,300,3,4,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,1,5,2,0,-8,9,-12,7,6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,1,5,2,0,-8,6,-12,7,9,-3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,15,7,3,4,5,700,900,799,-200,-901,800,1000,5,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,500,6,7,8,289,7,-105,-277,8,8,15,20,3,4,104,700,900,300,-200,-901,799,1000,5,800,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,290,3,0,-8,6,2,0,8,2,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-4,3,0,0,6,2,7,8,2,290,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,-9,-9,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,-9,-9,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,5,3,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,5,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,9,12,3,6,15,0,-3,1000,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,9,12,1,6,15,3,-3,1000,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,4,6,12,3,12,9,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,900,0,4,6,12,9,12,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,289,290,3,0,-8,6,2,0,1,-9,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,289,-4,3,0,0,6,2,8,1,-9,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,7,3,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,7,9,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,18,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,3,8,18,20,104,289,104,200,290,4,-8,500,-2,-901,700,1000,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,29,-6,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-5,9,-6,12,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,-8,1,13,6,-2,19,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,7,5,3,-7,6,8,0,9,1,13,11,-2,19,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,1,5,2,0,-8,9,-12,7,6,-3,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,1,1,5,2,0,-8,6,-12,7,9,-3,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,8,7,2,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,290,3,2,-8,6,7,0,8,7,2,3,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,29,-6,105,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-5,9,-6,105,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,8,289,20,104,-277,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-8,8,289,20,104,-277,200,3,4,290,700,-2,500,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,10,6,7,8,10,11,12,13,14,15,16,17,18,19,20,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,10,6,7,8,10,11,12,13,14,15,16,17,18,19,20,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,-5,-6,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,-5,-6,12,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,-901,800,1000,104,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,7,4,8,289,20,-105,-277,104,200,3,290,700,-901,300,1000,104,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,30,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,18,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,30,8,18,20,104,289,104,200,290,4,-8,500,-2,-901,700,1000,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,5,6,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,6,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,15,2,3,4,5,19,6,7,8,10,11,1000,12,13,14,15,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,15,2,3,4,5,8,6,7,14,10,11,17,12,13,19,15,16,20,18,20,1000,7,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,7,3,12,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,5,-105,-277,7,8,7,20,12,4,104,700,900,300,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(290,290,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(290,290,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,7,290,8,104,20,104,200,8,104,289,-8,700,300,-901,800,900,290,-8,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,290,3,0,-8,6,0,1,-8,8,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-4,3,0,0,6,0,1,-8,8,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,500,8,21,-6,0,300,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,5,3,-6,9,8,21,13,0,300,19,6,-2,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8,104,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,7,290,8,104,20,104,200,8,104,289,-8,700,300,-901,800,900,290,-8,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,1,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-902,800,1000,103,1001))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-902,1,7,4,8,289,20,-105,-277,103,200,3,104,700,900,290,800,1000,300,1001).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,103,20,-105,-277,104,8,7,3,12,4,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,4,8,289,7,20,-105,7,104,8,103,3,12,300,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(299,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,299,4,700,900,-901,800,1000,-901,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,29,-6,900,9,29,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-5,9,-6,900,29,29,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-2,-5,29,-276,-6,12,9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,-2,-5,12,-276,-6,29,9,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,9,104,200,3,4,5,700,900,-200,-104,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-104,500,6,3,8,289,7,-105,-277,9,104,200,20,4,5,300,900,-200,700,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,300,-5,-6,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,300,-5,1,12,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,-200,800,1000,290,-8,104,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-8,290,8,7,20,104,200,8,104,289,-8,700,300,-901,-200,800,1000,290,900,104,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,1,5,2,11,0,-8,105,9,-12,7,6,2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,5,-3,11,0,1,105,9,2,7,6,2,-3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,8,300,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,6,7,20,8,289,104,-105,-277,290,200,3,300,700,8,300,900,-901,800,1000,-901,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,15,7,3,4,5,700,900,799,-200,-901,800,1000,4,8,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,500,6,7,8,289,7,-105,-277,8,8,15,20,3,4,104,700,900,300,-200,-901,799,1000,4,800,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,-104,-200,-104,-901,800,1000,289))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-104,8,289,4,-105,-277,7,200,3,20,5,700,104,-200,-104,289,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,15,3,7,-7,11,8,0,13,6,-2,19,5,15))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,5,15,3,6,-7,11,7,0,13,8,-2,19,9,15).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,4,4,5,700,900,-200,-104,-901,800,1000,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,8,289,7,-105,-277,20,200,4,104,5,700,300,-200,-104,900,800,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(299,500,6,7,290,8,289,20,-105,-277,104,3,4,700,900,-901,800,1000,-901,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-901,290,8,-277,20,-105,4,104,3,7,700,900,289,800,1000,299,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,104,-199,200,3,4,5,700,900,699,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-199,8,289,4,-105,104,7,200,3,20,5,700,300,699,-200,900,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,-276,289,20,-105,-277,104,200,3,4,-9,700,900,-901,800,1000,-901,104,899,17,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,6,7,20,-276,289,104,-105,-277,290,200,3,300,-9,700,899,-901,800,900,-901,104,1000,17,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,288,20,-105,-277,104,200,3,4,5,700,900,-200,-901,801,1000,-277,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,6,7,-105,288,20,5,-277,104,8,3,4,200,700,900,500,-901,801,1000,-277,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,7,8,289,20,-105,104,200,3,4,5,700,-104,-200,-104,-901,800,1000,289,200))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,500,7,-104,289,20,3,104,200,8,4,5,300,-104,-200,700,-901,800,1000,289,200).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,0,5,700,-104,-200,-104,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-104,500,6,4,8,289,7,-105,-277,20,200,3,104,0,5,300,-104,-200,700,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,6,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-200,-901,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,800,-200,-901,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,299,3,-7,11,8,0,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,1,3,-7,5,8,0,11,13,6,299,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,9,8,289,20,-105,-277,700,103,200,7,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,4,9,8,7,20,-105,200,700,103,289,7,3,300,5,700,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,15,2,3,4,5,19,6,7,8,10,1000,12,13,14,15,16,17,18,20,20,7,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,15,2,3,4,5,7,6,7,8,10,1000,12,13,14,15,16,17,18,20,20,19,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-7,-6,3,0,-8,6,2,0,1,8,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,-7,-6,3,0,-4,6,2,0,1,8,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-7,6,7,290,8,289,20,104,-277,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-8,8,289,-7,104,-277,20,3,4,200,700,-2,290,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(290,291,290))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(290,291,290).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,29,-6,105,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-5,9,-6,105,29,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,-901,20,3,6,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,8,-105,-277,20,200,3,20,700,900,104,800,-901,290,3,6,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,291,8,-3,289,20,104,-277,8,200,-8,700,900,-901,800,1000,290,-8,200,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,500,6,7,291,8,104,289,20,200,-277,8,200,-8,700,300,-901,800,900,290,-8,1000,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,5,2,7,9,3,-7,11,0,1,13,6,-2,8,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,5,2,-2,9,3,1,11,0,1,13,6,7,8,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(6,2,7,9,15,3,7,-7,11,8,0,13,6,-2,19,5,15,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,6,15,3,6,-7,11,7,0,13,8,-2,19,9,15,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,10,3,4,700,900,-901,800,1000,-901,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,10,300,4,700,900,-901,800,1000,-901,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,-6,3,0,-8,6,2,0,1,8,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,7,3,-6,3,0,-6,6,2,-4,1,8,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,7,290,8,289,20,104,-277,900,8,6,200,-8,700,900,-901,800,1000,290,-8,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(20,500,7,104,8,289,200,104,-277,290,8,6,300,-8,700,900,-901,800,900,290,-8,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-7,6,7,290,8,289,104,-277,200,3,4,-8,700,-2,-901,800,1000,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,6,7,3,8,289,104,-277,200,290,4,-8,700,-2,-901,800,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,3,4,700,900,-901,800,1000,-901,-277))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-901,290,8,-277,20,-105,4,104,3,7,700,900,289,800,1000,300,-277).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,4,-105,12,3,12,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,900,0,4,-105,12,9,12,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,301,7,3,289,290,699,-8,6,2,0,8,7,2,3,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,301,7,2,289,290,3,-8,6,3,0,8,7,2,3,699).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,2,0,-8,9,-12,7,6,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,2,3,1,2,0,5,9,-12,7,6,-3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,7,7,-901,289,-105,-277,11,200,3,4,5,700,900,-901,800,1000,7,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,7,-105,-901,289,5,-277,11,7,3,4,7,700,900,200,800,1000,300,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,15,2,3,4,5,19,-276,7,8,10,11,1000,12,13,14,15,16,17,18,20,20,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,15,2,3,4,5,8,-276,7,14,10,11,17,12,13,19,15,16,20,18,20,1000,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,-1,9,0,3,-6,9,11,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,2,7,0,9,0,3,-6,9,5,8,-6,11,300,1,13,6,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,290,290,3,0,-8,6,2,0,1,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,290,-4,3,0,0,6,2,290,1,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,-1,9,0,3,-6,9,7,11,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,-2,9,0,-1,-6,9,1,11,8,3,0,300,5,13,6,7,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,15,3,7,-7,11,8,0,13,6,-2,19,5,15,11,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,5,15,3,6,-7,11,6,0,13,7,-2,19,8,15,11,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,500,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-277,290,8,3,20,-105,7,104,200,289,4,700,300,-901,800,900,-901,500,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,8,7,7,5,4,3,2,1,899,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,8,7,-6,5,4,-3,2,1,3,-1,-2,7,-4,-5,10,-7,-8,899,-10,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,3,290,3,0,-8,6,2,0,8,2,19,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,3,-4,3,0,0,6,2,19,8,2,290,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,11,8,-6,0,300,5,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,0,3,-6,1,8,-6,5,300,5,9,13,6,11,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,-5,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,12,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-7,-277,104,200,3,4,700,900,-901,800,1000,-901,1000,289))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-7,289,104,200,289,4,700,300,-901,800,900,-901,1000,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,700,-901,800,-901,20,3,6,8,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,4,8,289,6,-105,-277,20,200,3,104,700,900,290,-901,800,300,20,3,700,8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,8,-6,0,300,1,13,6,-2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,2,7,6,3,-6,8,-6,0,9,1,13,300,-2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-278,104,200,3,4,700,-901,800,1000,104,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,6,7,4,8,289,20,-105,-278,104,200,3,290,700,-901,300,1000,104,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,9,290,200,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,7,-105,-277,9,290,200,20,4,5,300,900,-200,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,15,0,-3,-6,18,21,30,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,0,15,0,6,-6,18,9,30,-9,21).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,-1,9,0,3,-6,9,11,8,-6,0,300,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-1,2,7,0,9,0,3,-6,9,5,8,-6,6,300,13,11,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,-200,-901,800,200))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,4,8,289,7,-105,-277,20,200,3,104,5,700,200,-901,800,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,1001,290,3,8,289,20,104,-277,104,200,3,4,-8,700,-2,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-8,290,3,8,289,20,104,-277,104,200,3,4,500,700,-2,1001,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-6,-1,-3,-4,800,-5,-6,-7,-8,-9,-11,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,9,8,-6,6,5,-6,2,1,-4,-1,-3,-1,800,-5,4,-7,-8,7,-11,-2,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,9,7,3,12,4,5,700,900,-200,-901,800,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,3,8,289,5,-105,-277,7,9,7,20,12,4,104,700,900,300,-901,800,1000,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,2,-6,3,0,-8,6,2,0,1,8,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,7,3,0,-6,3,2,-8,6,2,0,1,8,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,3,289,290,3,0,-8,6,2,0,1,-9,8,7,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-9,7,3,-4,290,3,0,-8,6,0,0,1,2,8,7,289).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,12,3,6,14,0,-3,-6,18,21,30,-9,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,12,3,0,14,0,6,-6,18,9,30,-9,21).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,-5,12,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,0,6,9,12,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,-5,29,20,-6,105,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(9,0,-5,29,20,-6,105,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-6,-1,-3,-4,800,-5,-7,-8,-9,-11,-2,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-6,2,1,-4,-1,-3,4,800,-5,7,-8,-9,500,-2,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,8,7,7,5,4,3,2,1,899,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,8,7,-5,5,4,-4,2,1,-2,0,-1,3,-3,-4,7,-6,-7,10,-9,-10,899).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,3,290,3,0,-8,6,2,0,8,2,19,7,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,3,3,-4,3,0,0,6,2,19,8,2,290,7,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,20,8,289,20,-105,-277,700,103,200,7,3,4,5,700,900,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,4,20,8,7,20,-105,200,700,103,289,7,3,300,5,700,800,-200,-901,900,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,2,-8,700,-2,-901,800,1000,7,500))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,3,3,8,289,20,104,290,104,200,500,2,-8,500,-2,-901,700,1000,7,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,-2,3,8,4,20,104,289,200,3,290,-8,700,500,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,289,20,-105,-277,104,200,3,4,700,900,700,-901,800,-901,20,3,6,8,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-105,289,20,8,-277,104,20,3,4,200,900,700,290,800,-901,300,3,6,700,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-5,12,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,12,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,-901,8,289,-105,-277,5,200,3,4,5,700,900,-901,800,1000,801))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,5,-901,8,7,-105,-277,289,200,3,300,5,700,900,-901,800,1000,801).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-200,899,5,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,899,5,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,29,-276,-6,12,9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-276,-5,29,9,-6,12,9,-6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,0,1,-200,13,6,-2,19,13))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,7,5,3,-7,6,8,0,9,-200,13,11,-2,19,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(10,8,7,7,5,4,3,2,1,899,0,-1,-2,-4,-6,-7,-8,-9,-10,-4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10,8,7,-7,5,4,-2,2,1,3,0,-1,7,-4,-6,10,-8,-9,899,-4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,20,104,-277,104,200,3,4,-8,700,290,-2,-901,18,1000,7,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-277,3,8,3,20,104,7,104,200,289,4,-8,290,290,-2,500,18,1000,700,104).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,5,1,0,-8,9,-12,7,6,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-3,5,1,0,-8,9,1,7,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,103,20,-105,104,3,7,3,12,5,700,900,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,500,6,7,8,289,103,20,-105,104,3,7,300,12,5,700,900,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,300,8,289,20,-105,-277,104,200,3,4,700,8,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,-901,290,300,-105,289,20,7,-277,104,8,3,4,200,8,900,300,800,1000,700,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,300,-5,-6,12,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,300,-5,-5,12,-5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,0,6,-6,12,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,0,6,9,12,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-6,-1,-3,-4,800,-5,-7,-8,-9,-11,-2,-1,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-6,2,1,-6,-1,-3,-4,800,-5,4,-8,-9,7,-2,-1,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,1,5,2,11,0,-8,105,9,-12,7,6,2,-3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-12,2,3,-8,1,5,-3,11,0,1,105,9,2,7,6,2,-3,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,7,3,4,8,700,900,16,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,3,8,289,7,-105,-277,20,200,7,104,4,8,300,900,16,700,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,11,16,17,18,20,20,7,8,6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6,6,8,10,7,12,13,11,11,16,14,18,20,17,7,8,20).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-276,104,200,3,4,700,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-276,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,800,1000,-901,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,11,8,-6,-11,0,300,5,1,13,6,19,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,2,7,5,3,-6,5,8,-6,6,0,300,9,1,13,11,19,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,-2,8,289,20,-105,-277,104,200,3,4,5,11,700,-200,-901,800,1000,-277,289,-105))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,6,7,4,8,289,20,-105,-277,104,200,3,289,5,11,500,-200,-901,700,1000,-277,800,-105).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,-5,-6,-105,12,-5,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,-5,-6,-5,12,-5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,-199,7,9,3,-7,11,8,-6,0,1,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,-199,-6,9,3,5,11,8,6,0,1,7,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,4,6,13,3,12,9,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,900,0,4,6,13,9,12,9,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-7,11,8,-6,0,1,6,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,3,-7,9,8,-6,11,1,6,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,8,7,3,12,4,5,700,-5,-200,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,3,8,289,5,-105,-277,7,8,7,20,12,4,104,700,-5,300,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-3,3,1,5,2,11,0,-8,105,9,-12,7,6,2,-3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,3,0,3,1,1,2,11,5,-8,105,6,-12,7,9,2,-3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,699,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,19,104,3,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,699,4,8,289,20,-105,-277,104,200,3,104,700,900,290,800,19,300,3,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,699,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,801,19,104,3,-901))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,699,4,8,289,20,-105,-277,104,200,3,104,700,900,290,801,19,300,3,-901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,800,1000,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,900,-901,800,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,-105,-277,104,200,3,4,5,700,5,-200,-104,-901,800,29,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-200,500,6,-105,289,20,5,-277,104,7,3,4,200,700,5,300,-104,-901,800,29,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,799,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8,104))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,799,6,7,290,8,104,20,104,200,8,104,289,-8,700,300,-901,800,900,290,-8,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,-5,29,-276,-6,9,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-276,-5,29,-6,-6,9,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,-6,288,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,-2,3,-6,1,288,300,5,13,6,9,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,-276,289,20,-105,-277,104,200,3,-8,4,-9,700,900,-901,800,1000,-901,104,899,17,3,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,6,7,3,-276,289,20,-105,-277,104,200,3,104,4,-9,290,900,-901,300,1000,-901,700,899,17,800,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,4,6,12,12,9,12,0))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,900,0,4,6,12,9,9,12,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,289,20,899,-105,-277,104,200,3,4,5,700,900,-200,-104,-901,800,29,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,500,6,4,289,20,5,-105,-277,7,200,3,104,5,700,300,-200,-104,899,800,29,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,104,-277,8,104,200,-8,700,900,-901,800,1000,290,-8,104,800))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,7,290,8,104,20,104,200,8,104,289,-8,700,300,-901,800,900,290,-8,1000,800).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(29,9,8,7,6,5,4,2,0,-6,-1,-3,-4,800,-5,-7,-8,-9,-11,-2,-1,-6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-6,2,0,-6,-1,-3,-4,800,-5,4,-8,-9,7,-2,-1,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,8,289,20,-105,-277,104,200,289,3,4,700,8,300,900,-901,800,1000,-901,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-901,8,289,3,-105,-277,8,200,289,20,4,700,104,300,900,290,800,1000,300,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-1,-2,-4,-1,-5,-6,-7,-8,-9,-11))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-1,2,1,-1,-2,-4,4,-5,-6,7,-8,-9,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,-5,-6,-5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-5,-5,-6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,9,8,7,6,5,4,2,1,-7,-1,-2,-3,-4,-1,-6,-6,-7,-8,-9,-11,9,9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-8,9,8,-7,6,5,-6,2,1,-3,-1,-2,4,-4,-1,7,-6,-7,9,-9,-11,500,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-7,6,7,290,8,289,20,-4,104,-277,200,3,4,-8,700,-2,-901,800,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,6,7,-7,8,289,-2,-4,104,4,200,3,20,-8,700,290,-901,800,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(29,9,8,7,6,5,4,1,0,-6,-1,-3,-4,800,-5,-7,-8,-9,-11,-2,-1,-6,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-6,1,0,-6,-1,-3,-4,800,-5,4,-8,-9,7,-2,-1,29,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,299,3,-7,11,8,0,1,13,6,-2,19,2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-2,2,7,1,3,-7,5,8,0,11,13,6,299,19,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,7,-7,11,8,0,1,13,6,-2,19,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-7,2,7,0,3,7,5,11,8,5,1,13,6,-2,19,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,104,200,3,4,5,700,900,-901,3,800,1000,300))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,500,6,7,8,289,20,-105,-277,104,200,3,300,5,700,800,-901,3,900,1000,300).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,7,-1,9,0,3,-6,9,7,11,8,-6,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,-1,9,6,3,-6,7,7,11,8,-6,0,9,1,13,300,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,900,0,4,6,3,12,9,-4,12))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,900,0,9,6,3,12,9,-4,12).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,5,5,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,9,11,8,0,300,1,13,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,7,5,3,-6,9,11,8,9,300,1,13,6,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,8,289,20,-105,-277,9,104,200,3,4,5,700,900,-200,-104,-901,800,6,1000))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-104,500,6,3,8,289,6,-105,-277,7,104,200,9,4,5,20,900,-200,300,-901,800,700,1000).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,290,3,8,289,-9,20,104,-277,104,200,3,4,-8,700,-2,-901,800,1000,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-901,6,7,-8,3,8,7,-9,20,104,-277,104,200,3,4,289,700,-2,290,800,1000,500).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5,2,7,9,3,-6,-6,0,300,1,13,1,6,-2,19))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,2,7,1,3,-6,5,0,300,6,13,1,9,-2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,7,290,8,289,20,-105,-277,104,200,3,4,700,900,-901,800,1000,-901,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,3,290,8,7,20,-105,289,104,200,300,4,700,900,-901,800,1000,-901,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,500,6,289,20,-105,-277,104,200,3,4,5,700,5,-200,-104,-901,800,29,5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-277,500,6,-104,20,-105,3,104,200,29,4,5,289,5,-200,300,-901,800,700,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,3,289,3,0,-8,6,2,0,1,-9,8))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-4,3,289,1,0,-8,3,2,0,6,-9,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(500,6,7,8,288,20,-105,-277,104,200,4,3,4,5,700,900,-200,-901,801,1000,-277,7))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-105,6,7,4,288,20,7,-277,104,8,4,3,200,5,700,500,-200,-901,801,1000,-277,900).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(9,11,3,6,15,0,-3,1001,21,30,-9))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,11,3,6,15,0,9,1001,21,30,-9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(300,6,7,290,-276,289,20,-105,-277,104,200,3,4,-9,700,900,-901,800,1000,-901,104,700,17,3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,6,7,20,-276,289,104,-105,-277,290,200,3,300,-9,700,700,-901,800,900,-901,104,1000,17,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(29,9,8,7,6,5,4,1,0,-6,-1,-3,-4,800,-5,-7,-8,-9,-11,-2,-1,-6,-1,-1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-11,9,8,-7,6,5,-6,1,0,-6,-1,-3,-4,800,-5,4,-8,-9,7,-2,-1,29,-1,-1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1,2,-11,3,-3,1,5,2,11,0,-8,105,9,-4,-12,7,6,2,-3,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-3,2,-11,0,-3,1,1,2,11,3,-8,105,5,-4,-12,7,6,2,9,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(-4,7,-7,-6,3,8,0,-8,6,2,0,1,8,7,1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-6,7,-7,-4,3,8,0,-8,6,2,0,1,8,7,1).toArray()
        );
    }
}

