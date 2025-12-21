package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_INTERSPERSE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,6,3,2)), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,8,6,8,3,8,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,2,2)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,2,2,2,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,4,6,8)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,1,4,1,6,1,8)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(9,9,9,9,9,9)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(9,7,9,7,9,7,9,7,9,7,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(10)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(10)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,7)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,2,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,3,5,7)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,4,3,4,5,4,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,1,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,10,15)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,0,10,0,15)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(0,0,0)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(0,7,0,7,0)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,9,5,6)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,3,9,3,5,3,6)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,0,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(0,0,0)), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(0,8,0,8,0)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,2)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,3,0,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,7)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,3,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,7)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,5,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(9,9,9,9,9,9,9)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(9,7,9,7,9,7,9,7,9,7,9,7,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,7)), 15
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,15,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,9,5,6,5)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,3,9,3,5,3,6,3,5)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,2)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,1,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(0,0,0,-1)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(0,7,0,7,0,7,-1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,9)), 15
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,15,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,2,-46)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,0,3,0,2,0,-46)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,1,0,1,0,1,0,1,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,2)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-8,5,-8,10,-8,-5,-8,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,2,5,1,9)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,0,6,0,2,0,5,0,1,0,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,3,6,8,4,2,1)), -1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-1,3,-1,6,-1,8,-1,4,-1,2,-1,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,4,1,4,2,4,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,4,2,4,3,4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3)), -4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-1,-4,-2,-4,-3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,10000,2,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,4)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-8,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,2,5,1,9)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,1,6,1,2,1,5,1,1,1,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,2)), -7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-7,5,-7,10,-7,-5,-7,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,2,3,5,1)), -1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-1,6,-1,2,-1,3,-1,5,-1,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,-5,1,-5,1,-5,1,-5,1,-5,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,3,4)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-8,3,-8,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,5,10,-5,2,5)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,5,5,5,10,5,-5,5,2,5,5)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,4)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,-5,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,3,4,1)), 6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,6,3,6,4,6,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)), 6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,6,2,6,3,6,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,5,1,9)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,0,6,0,5,0,1,0,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,2,5,10,-5,2)), -7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-7,2,-7,5,-7,10,-7,-5,-7,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,1,1)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-5,1,-5,1,-5,1,-5,1,-5,1,-5,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,7,5,1,9)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,9,7,9,5,9,1,9,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,9,2,9,3,9,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,2,4)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-8,2,-8,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,4)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,5,3,5,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,1)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-5,1,-5,1,-5,1,-5,1,-5,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,7,5,6,1,9)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,9,7,9,5,9,6,9,1,9,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,4)), 10001
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,10001,3,10001,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,2,4,4)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-8,2,-8,4,-8,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,4)), -4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,-4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,1,1)), -3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-3,1,-3,1,-3,1,-3,1,-3,1,-3,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,3,4)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,5,3,5,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,7,2,1,9)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,1,7,1,2,1,1,1,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(6,3,7,5,1,9,3)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(6,7,3,7,7,7,5,7,1,7,9,7,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)), 9999
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,9999,2,9999,3,9999,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,7,5,7,9)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,9,7,9,5,9,7,9,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(6,3,7,7,1,9,3)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(6,7,3,7,7,7,7,7,1,7,9,7,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,10000,1,10000,1,10000,1,10000,1,10000,1,10000,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,-4,6,5,1,9)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,1,-4,1,6,1,5,1,1,1,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,3,6,8,4,2,1)), 10
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,10,3,10,6,10,8,10,4,10,2,10,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,7,2,1,9)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,2,7,2,2,2,1,2,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,15,63,2,-2,5,9,100,5,-9)), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,8,15,8,63,8,2,8,-2,8,5,8,9,8,100,8,5,8,-9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4)), 6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,6,2,6,4,6,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,4)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-5,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,5,1,9,6,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,0,6,0,5,0,1,0,9,0,6,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,1,7)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-5,1,-5,1,-5,1,-5,1,-5,1,-5,7)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1)), -6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,-6,1,-6,1,-6,1,-6,1,-6,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,1,1)), -4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-4,1,-4,1,-4,1,-4,1,-4,1,-4,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,7,2,1,-1)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,2,7,2,2,2,1,2,-1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,5,1,9,6,1)), 10001
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10001,6,10001,5,10001,1,10001,9,10001,6,10001,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-4,-4,6,5,1,9)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-4,1,-4,1,6,1,5,1,1,1,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-6,4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-6,4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-4,-4,6,5,1,9)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-4,2,-4,2,6,2,5,2,1,2,9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,63,3)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10000,63,10000,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,63,3,3)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10000,63,10000,3,10000,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4)), 63
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,5,1,9,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,0,6,0,5,0,1,0,9,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3,2)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,2,1,2,2,2,3,2,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-2,2,4,4)), -7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-2,-7,2,-7,4,-7,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,3,6,8,4,2,2)), 10
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,10,3,10,6,10,8,10,4,10,2,10,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,15,63,2,-2,5,9,100,5,-9,100)), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,8,15,8,63,8,2,8,-2,8,5,8,9,8,100,8,5,8,-9,8,100)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(15,63,2,-2,5,-93,100,5,-9)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(15,9,63,9,2,9,-2,9,5,9,-93,9,100,9,5,9,-9)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,1,1,1,1,2)), -4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-4,1,-4,1,-4,1,-4,1,-4,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,4,4)), -5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,-5,4,-5,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4)), 8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(9,3)), 6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(9,6,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,5)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,5,5)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,4,1,4,2,4,2,4,3,4,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,3,2)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,3,3,3,3,3,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList()), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList()).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,4)), 1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,1,3,1,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5,6,7,8)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(5,5,6,5,7,5,8)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,3,2,3,4,3,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,3,0,4,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,2,2,2,4,2,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,3,6,8,4,2,1,3)), -1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-1,3,-1,6,-1,8,-1,4,-1,2,-1,1,-1,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,1,2,3)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,4,1,4,1,4,2,4,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,6,2,5,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,0,6,0,2,0,5,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-1,1,-2,-3)), -3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-1,-3,1,-3,-2,-3,-3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,3)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,4,2,4,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3,3)), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,7,1,7,2,7,3,7,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(10,-2,5,10,-5,2,10)), -8
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(10,-8,-2,-8,5,-8,10,-8,-5,-8,2,-8,10)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,1,0,1,0,1,0,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3)), 6
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,6,1,6,2,6,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,4,4)), -2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,-2,1,-2,4,-2,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3,3,4)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,3,1,3,2,3,3,3,3,3,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-1,2,-2,2,-3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,10000,1,10000,2,10000,3,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,1,2,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10000,1,10000,2,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,4,4,4)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,3,4,3,4,3,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-3)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-1,2,-2,2,-3,2,-3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,2,3,4)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,10000,2,10000,3,10000,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-48,4,1,2,3)), 3
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-48,3,4,3,1,3,2,3,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,-8,3,4)), -48
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-48,-8,-48,3,-48,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,1,2,3,3,-5)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,10000,1,10000,2,10000,3,10000,3,10000,-5)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-22,1,2,18)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-22,5,1,5,2,5,18)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(7,3,6,8,4,2,1,3,4)), -1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(7,-1,3,-1,6,-1,8,-1,4,-1,2,-1,1,-1,3,-1,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4)), -1
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,-1,2,-1,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4)), 9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4,1)), 2
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,2,2,2,4,2,4,2,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(4,4,4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(4,4,4,4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,2,3)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,1,0,2,0,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,-8,4,4)), -48
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-48,-8,-48,4,-48,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2,3,4)), 4
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(2,4,3,4,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,2,3,4,3)), 19
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,19,2,19,3,19,4,19,3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(10,-2,5,10,-5,2,10)), -9
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(10,-9,-2,-9,5,-9,10,-9,-5,-9,2,-9,10)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-1,1,-2,-2,-3)), 10000
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-1,10000,1,10000,-2,10000,-2,10000,-3)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-22,1,2,18,1)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-22,5,1,5,2,5,18,5,1)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(3,-8,3,4,-8)), -48
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(3,-48,-8,-48,3,-48,4,-48,-8)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(-22,1,2,-52)), 5
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(-22,5,1,5,2,5,-52)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,4,4)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,4,0,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,2,-9,4,4)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,2,0,-9,0,4,0,4)).toArray());
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(1,1,1,2,1)), 0
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>(Arrays.asList(1,0,1,0,1,0,2,0,1)).toArray());
    }
}

