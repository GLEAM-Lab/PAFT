package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_DERIVATIVE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,1,2,4,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,4,12,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,2,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,2,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,3,0,4,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,20,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,7,0,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,49,0,0,0,88,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-2,0,5,0,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,0,20,0,0,70)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,0,0,-2,0,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,0,0,-14,0,54)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,1,-1,1,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,2,-3,4,-5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(6,2,0,7)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,0,4,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,0,16,0,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,0,0,-2,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,0,0,-14,0,54,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,0,-2,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,0,-14,0,54,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,0,1,0,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,16,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,1,7,0,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,7,56,0,0,0,96,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-2,5,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,15,0,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,0,1,7,0,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,0,8,63,0,0,0,104,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,6,0,0,0,0,0,1,7,0,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,12,0,0,0,0,0,8,63,0,0,0,104,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,0,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,3,0,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,4,0,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,0,4,0,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,0,7,0,0,1,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,0,56,0,0,11,96,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,-1,6,0,0,0,7,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,24,0,0,0,56,0,0,88,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,0,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,0,-2,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,0,-14,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,7,-1,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(7,-2,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(6,2,7)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,-1,0,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,-3,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,-1,0,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,0,7)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,-2,0,0,0,5,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-4,0,0,0,30,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,-2,0,0,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,0,0,0,25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,0,7,0,0,1,8,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,0,56,0,0,11,96,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,0,0,-2,0,6,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,0,0,-14,0,54,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,0,1,1,-2,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,3,4,-10,0,42,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,0,1,8,0,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,24,0,20,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,5,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,30,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(6,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,-1,8,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,16,-3,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(6,0,0,0,6,0,0,0,0,1,7,0,0,0,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,24,0,0,0,0,9,70,0,0,0,112,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,4,3,-2,0,1,1,0,-2,0,6,2,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,8,9,-8,0,6,7,0,-18,0,66,24,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(8,4,0,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,0,4,0,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,5,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,25,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,3,0,4,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,20,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,1,0,-2,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,6,0,-16,0,60,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,7,-1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(7,-2,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,1,0,-2,0,6,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,6,0,-16,0,60,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,8,3,0,4,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,24,12,0,24,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-1,0,0,6,0,0,0,0,7,0,0,1,8,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,24,0,0,0,0,63,0,0,12,104,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-1,0,0,6,0,0,0,0,7,0,1,8,6,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,24,0,0,0,0,63,0,11,96,78,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,-1,4,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,8,-3,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,0,1,7,0,0,0,8)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,0,8,63,0,0,0,104)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,4,-1,0,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-2,0,-4,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,0,-2,0,0,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,0,-14,0,0,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,55)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,-1,0,6,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,18,-4,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,-1,3,0,1,0,0,-2,0,6,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,6,0,4,0,0,-14,0,54,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-2,0,5,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,0,20,0,60)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,1,-1,1,-1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,-3,4,-5,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(6,2,7,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,14,18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,6,0,0,0,0,1,7,0,0,5,8,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,12,0,0,0,0,7,56,0,0,55,96,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,6,-2,0,0,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,36,-14,0,0,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,6,0,0,1,7,0,0,0,8)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,36,0,0,9,70,0,0,0,112)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,6,0,0,0,0,1,7,0,0,5,8,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,12,0,0,0,0,7,56,0,0,55,96,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,1,-1,1,-1,1,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,2,-3,4,-5,6,-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,0,1,1,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,3,4,0,36,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,6,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,12,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,3,-1,0,6,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-2,0,24,-5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,6,4,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,12,12,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-2,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,0,4,-1,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,0,16,-5,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,11,-1,-1,0,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(11,-2,-3,0,-5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,4,0,0,1,0,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,0,4,0,24,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,6,0,0,0,0,7,0,0,1,8,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,12,0,0,0,0,49,0,0,10,88,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,4,0,1,0,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,3,0,20,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(8,0,0,0,6,0,0,6,7,0,0,1,7,0,0,0,8,7)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,24,0,0,42,56,0,0,11,84,0,0,0,128,119)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(7,-2,8,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,16,-3,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,6,0,0,0,0,7,0,0,0,8,0,7)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,18,0,0,0,0,56,0,0,0,96,0,98)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,3,0,5,1,1,0,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,6,0,20,5,6,0,48,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,1,1,1,0,-2,5,6,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,4,5,6,0,-16,45,60,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,1,0,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,3,0,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(8,0,0,0,6,0,0,6,7,0,0,1,7,0,0,0,8,7,0,8)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,24,0,0,42,56,0,0,11,84,0,0,0,128,119,0,152)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,0,1,8,0,4,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,24,0,20,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,0,3,0,1,0,0,-2,0,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,9,0,5,0,0,-16,0,60)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,1,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,0,7,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-1,-3,-5,-7,-9,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72,27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-2,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-12,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-25,-1,63,-40,0,10,0,5,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,40,-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,-21,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,-25,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,-125,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,4,0,54,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,-40,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,-240,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-2,-3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-4,-9,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,-25,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,-125,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,-40,0,0,0,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,-240,0,0,0,0,-275)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,-7,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,-63,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-40,-2,5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-240,-14,40,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,1,0,9,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,4,0,54,0,8,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,1,0,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,2,0,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-1,-3,-5,-7,-8,-9,3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-64,-81,30,-55)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,126,-120,0,50,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,10,-2,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,50,-12,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,0,0,0,0,0,0,0,-7,0,10,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-70,0,120,0,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,-1,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,-4,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,9,0,0,0,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,45,0,0,0,0,-10,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(63,-1,0,0,63,0,0,0,63,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,252,0,0,0,504,0,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,0,9,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,36,5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,-4,0,0,0,1,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,-16,0,0,0,8,9,-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,0,0,0,0,0,0,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-70,0,120,0,14,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(63,-1,0,0,63,0,0,0,63,0,0,-8,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,252,0,0,0,504,0,0,-88,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,0,0,0,0,0,0,0,-7,0,10,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-70,0,120,0,0,15,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,-5,0,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,-25,0,-21,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,40,567)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,10,0,5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,60,0,40,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,45,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,0,63,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,0,630,0,-84,0,140,0,16,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,-40,10,-2,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-120,40,-10,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,8,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,-25,0,-40,0,10,0,5,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,0,35,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,-1,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,-3,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,0,0,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,1,-1,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,-3,4,0,54,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-1,0,-4,0,-1,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,-12,0,-5,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,63,-40,1,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,-120,4,0,60,0,40,567)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,-40,10,-2,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-120,40,-10,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,-1,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,-3,0,0,0,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,45,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,0,63,0,-7,0,10,0,1,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,0,630,0,-84,0,140,0,16,0,180)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-1,-3,-5,-7,-9,3,3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72,27,30,-55)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,1,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,126,-120,0,50,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,0,0,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,10,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,60,0,-200)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-5,0,0,0,-4,0,0,0,1,-40,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,0,0,-20,0,0,0,9,-400,-55)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,-7,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,-63,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-5,0,0,0,-4,0,0,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,0,0,-20,0,0,8,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,63,-40,0,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,126,-120,0,50,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,9,0,0,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,36,0,0,0,-8,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-8,5,-25,-1,63,-40,0,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-50,-3,252,-200,0,70,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,10,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,100,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,10,10,-1,63,-40,0,10,0,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,20,-3,252,-200,0,70,0,567)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,-2,-40,-40,10,-2,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-6,-160,-200,60,-14,32)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,63,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,126,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,0,10,-40,-2,5,10,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,0,40,-200,-12,35,80,-360)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,-1,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,-9,0,11,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,-1,-1,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,-3,-4,0,0,0,0,0,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,0,9,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,36,5,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,0,63,0,-7,1,0,10,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,0,630,0,-84,13,0,150,0,17,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,0,3,0,3,0,2,0,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,0,0,0,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,2,-40,10,-2,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,6,-160,50,-12,28)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,5,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,25,0,70,0,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,1,0,9,0,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,4,0,54,0,8,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,-7,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,-49,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-25,1,0,-5,-2,9,0,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,4,0,-30,-14,72,0,10,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,63,1,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,3,0,50,0,35,504)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-4,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,10,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,100,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,4,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,28,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,-3,5,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,-18,35,-200)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-25,1,0,-5,-2,9,0,1,-25,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,4,0,-30,-14,72,0,10,-275,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-2,-40,-8,10,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-8,-200,-48,70,0,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(64,-1,0,0,63,0,0,0,-25,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,252,0,0,0,-200,0,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-26,-1,63,-40,-1,10,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,-2,189,-160,-5,60,-21,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,0,-1,-3,-5,-7,-5,-9,3,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-3,-12,-25,-42,-35,-72,27,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-25,1,0,-5,-2,9,0,1,-25,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,4,0,-30,-14,72,0,10,-275,0,0,0,15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,-40,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,-240,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,6,-40,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,24,-200,0,70,0,45,630)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,1,0,9,0,1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,4,0,54,0,8,9,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-25,-1,63,-40,0,10,0,-26,-1,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,-208,-9,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,-40,10,-2,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,-160,50,-12,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-2,0,0,9,0,0,0,-1,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,0,0,45,0,0,0,-9,0,-11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,1,-7,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,9,-70,0,0,13,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-40,-2,5,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-240,-14,40,90,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,1,0,0,0,0,63,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,6,0,0,0,0,693,0,-91,0,150,0,17,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,-25,0,-40,0,0,5,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,0,30,-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,0,0,0,1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7,8,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,4,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,20,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,5,0,63,0,0,63,0,-7,0,63,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,30,0,504,0,0,693,0,-91,0,945,0,17)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,0,6,0,-7,1,0,10,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,0,60,0,-84,13,0,150,0,17,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,-8,0,0,0,1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-24,0,0,0,7,8,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,-5,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,-40,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,1,0,9,0,1,1,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,4,0,54,0,8,9,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,4,-25,0,63,-40,-8,10,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-50,0,252,-200,-48,70,0,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,10,63,-40,0,10,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,40,315,-240,0,80,-27,50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,5,0,10,0,1,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,25,0,70,0,9,50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,9,0,1,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,45,0,7,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,-7,0,10,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,-70,0,120,0,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,1,-1,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,3,-4,5,0,63,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,10,-2,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,40,-10,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,0,0,0,-24)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,-168)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-24,0,0,0,0,-40,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,0,0,0,0,-240,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-2,1,0,9,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-6,4,0,54,0,8,0,10,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,0,-4,0,0,-25,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,-125,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-39,-8,5,-25,-1,63,-40,0,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-8,10,-75,-4,315,-240,0,80,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,10,-2,0,5,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,40,-10,0,35,-40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,63,0,-7,2,0,10,0,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,567,0,-77,24,0,140,0,16,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,10,0,0,0,0,63,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,50,0,0,0,0,630,0,-84,0,140,0,16,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,-40,-2,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,-160,-10,0,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-3,-5,-7,-9,3,3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-25,-42,-63,24,27,-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,66,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-8,0,0,1,0,9,0,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-8,0,0,4,0,54,0,8,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,63,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,10,10,0,63,-40,0,10,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,20,0,252,-200,0,70,504)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-26,-1,63,-40,0,10,-8,-26,-1,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,-2,189,-160,0,60,-56,-208,-9,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-3,-4,-3,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12,-12,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,-2,1,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,2,0,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,8,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-39,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-39,0,0,0,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,9,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,9,0,3,0,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,36,0,18,0,0,-9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,-25,0,-40,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,0,-40,0,10,-2,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-80,0,40,-10,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,64,5,10,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,512,45,100,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,-39,1,10,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,-351,10,110,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,9,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,36,0,6,7,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,4,-25,0,63,-40,2,10,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-50,0,252,-200,12,70,0,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-3,-4,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12,-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,0,0,-1,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,-7,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,10,-2,0,5,-5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,40,-10,0,35,-40,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,0,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,0,6,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,-40,1,0,64,0,5,63,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-80,3,0,320,0,35,504,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,-3,0,1,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-6,0,4,0,6,7,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,9,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,36,5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,5,0,63,63,0,0,63,0,-7,0,63,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,30,0,504,567,0,0,756,0,-98,0,1008,0,18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,-1,9,0,1,0,1,10,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,-4,45,0,7,0,9,100,-11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,10,0,5,5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,60,0,40,45,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-2,0,0,9,0,0,0,0,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,0,0,45,0,0,0,0,0,-11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,-40,10,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-120,40,25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-40,-2,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-240,-14,80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-39,-8,5,-1,-25,-1,63,-40,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-8,10,-3,-100,-5,378,-280,0,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,4,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,0,0,0,0,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-4,0,0,0,0,0,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,0,9,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-2,0,9,0,0,0,-1,0,-1,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,0,36,0,0,0,-8,0,-10,-44)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,0,0,1,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,8,-36)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,8,9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,11,-25,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,44,-125,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,-1,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,-4,0,0,0,0,0,10,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,63,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,126,0,0,0,0,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,0,-1,-3,-25,-5,10,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-3,-12,-125,-30,70,-56,-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,-1,-1,0,0,0,0,0,0,0,1,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,-3,-4,0,0,0,0,0,0,0,12,0,-14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-26,-5,-25,-40,10,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-120,40,25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,1,-7,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,8,-63,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,6,0,0,0,0,0,-40,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(6,0,0,0,0,0,-280,0,0,0,0,0,13,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,0,1,-7,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,-70,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-25,-1,63,-40,0,10,0,5,-1,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,40,-9,630)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,4,-25,63,-40,-8,10,-25,1,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-50,189,-160,-40,60,-175,8,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,-25,0,-40,0,0,-1,5,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,0,-6,35,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,9,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,54,70,0,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,1,0,0,0,-3,-7,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,4,0,0,0,-24,-63,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,-40,0,3,0,0,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,-240,0,24,0,0,0,-300)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-26,-1,63,-40,0,10,-8,-26,-1,-40,63,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,-2,189,-160,0,60,-56,-208,-9,-400,693,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,-5,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,-35,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,0,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,-5,0,-3,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,-25,0,-21,32)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,62,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,434,0,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,1,63,0,9,0,5,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,126,0,36,0,30,-280)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,0,0,-1,0,0,1,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,-7,0,0,10,33,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,45,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-25,-1,63,-40,0,10,0,-26,-1,-40,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,-208,-9,-400,693)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,5,10,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,40,90,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,9,0,1,11,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,45,0,7,88,-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,9,0,1,0,0,0,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,45,0,7,0,0,0,-11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,7,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,1,0,-1,-3,-5,62,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,434,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-2,1,0,9,-4,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-6,4,0,54,-28,0,9,0,11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,0,0,1,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,0,0,11,0,-13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,9,0,1,1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,36,0,6,7,8,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,62,-2,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,124,-6,-160,0,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,-8,1,0,0,1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-24,4,0,0,7,8,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,0,0,10,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,0,0,90,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,10,63,-24,-40,0,10,-3,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,40,315,-144,-280,0,90,-30,66)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,-24,0,0,-7,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,-144,0,0,-63,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-5,4,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,8,0,0,0,0,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(64,9,-25,1,-1,63,0,-3,5,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,-50,3,-4,315,0,-21,40,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,-40,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-80,0,0,0,0,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,0,0,0,0,0,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,-63,0,110,0,13,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,3,0,0,0,0,1,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,9,0,0,0,0,8,-36)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,-3,0,1,-1,1,1,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-6,0,4,-5,6,7,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,-1,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,-4,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,0,0,0,8,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(63,-1,-1,0,63,0,0,0,63,0,0,-8,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-2,0,252,0,0,0,504,0,0,-88,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,2,-40,10,-2,4,9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,6,-160,50,-12,28,72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,-1,-40,0,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-2,-120,0,0,0,0,0,0,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-4,-25,0,-40,0,0,5,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-4,-50,0,-160,0,0,35,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,10,-40,-2,5,10,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,30,-160,-10,30,70,-320)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,0,0,0,5,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,0,25,0,7,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,4,0,0,5,0,63,63,0,0,63,0,-7,0,63,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,16,0,0,35,0,567,630,0,0,819,0,-105,0,1071,0,19,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,-3,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,-21,0,9,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,3,0,3,0,-9,2,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,9,0,-45,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,10,-25,0,63,-40,0,10,0,5,10,10,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,-50,0,252,-200,0,70,0,45,100,110,756)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,10,63,2,-40,0,10,-3,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,40,315,12,-280,0,90,-30,66)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-40,-2,-24,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-240,-14,-192,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,4,5,-25,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,24,35,-200,-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,10,62,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,50,372,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-39,3,0,3,0,2,4,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-39,6,0,12,0,12,28,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,0,0,-1,0,0,1,3,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,-7,0,0,10,33,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,-5,1,0,0,9,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-10,3,0,0,54,0,8,9,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,-1,0,-4,0,0,0,0,0,1,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,-12,0,0,0,0,0,9,-40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,-25,1,0,-5,-2,9,0,1,-25,0,0,0,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,-100,5,0,-35,-16,81,0,11,-300,0,0,0,16,-85)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,-1,0,-1,0,0,1,3,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,-5,0,-7,0,0,10,33,12,13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,63,-40,1,0,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,-120,4,0,0,35,504)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-39,-25,0,-40,0,10,-2,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-39,-50,0,-160,0,60,-14,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,10,0,0,0,0,63,-1,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,50,0,0,0,0,630,-11,-84,0,140,0,16,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,0,-1,-3,-25,-25,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-3,-12,-125,-150,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,10,-2,0,11,5,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,40,-10,0,77,40,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,5,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,10,189,-160,0,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,11,0,0,0,0,-40,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(11,0,0,0,0,-240,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-2,-25,0,63,-40,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,0,252,-200,0,70,0,45,630)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,-40,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-80,0,0,0,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,4,0,3,0,3,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,9,0,15,0,14,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,4,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,16,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,10,-25,0,63,-40,0,10,0,5,10,10,63,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,-50,0,252,-200,0,70,0,45,100,110,756,130)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,5,-1,63,-5,0,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-2,189,-20,0,-18,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,5,0,10,0,1,5,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,25,0,70,0,9,50,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,-9,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,-27,4,0,54,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,10,-3,5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,60,-21,40,-27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(63,-1,0,0,63,0,0,0,63,0,0,64,-8,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,252,0,0,0,504,0,0,704,-96,13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,2,0,63,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,189,0,0,0,0,0,9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,-5,0,-3,4,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,-25,0,-21,32,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,0,0,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,0,0,6,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-26,-1,63,-40,-1,10,-3,5,-26)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,-2,189,-160,-5,60,-21,40,-234)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-39,-25,0,-40,0,10,-2,5,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-39,-50,0,-160,0,60,-14,40,-18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,63,-40,0,10,-1,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,126,-120,0,50,-6,35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-1,-3,-5,-8,-9,3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-56,-72,27,-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,1,63,-40,0,10,0,5,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,126,-120,0,50,0,35,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,64,1,-3,0,1,-1,1,1,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(64,2,-9,0,5,-6,7,8,9,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,9,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,27,4,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,0,9,0,1,1,1,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,36,0,6,7,8,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-5,-25,-40,10,5,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-50,-120,40,25,-150)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,-25,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,-100,0,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,1,0,-1,-3,-5,-7,-9,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,1,0,0,-5,0,0,63,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,6,0,0,-45,0,0,756,0,-98,0,160,0,18,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,1,0,-4,0,0,10,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-12,0,0,60,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,1,0,9,0,1,0,1,10,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,3,0,45,0,7,0,9,100,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-25,1,0,-5,-2,9,0,1,-25,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,4,0,-30,-14,72,0,10,-275,0,0,14,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,4,0,3,0,3,0,2,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,9,0,15,0,14,0,9,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-26,-1,63,-40,-1,-3,5,-26)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,-2,189,-160,-5,-18,35,-208)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-4,0,0,-25,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-4,0,0,-100,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,-1,0,0,0,-7,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,-3,0,0,0,-49,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,1,-7,0,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,9,-70,0,0,13,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,4,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,0,0,0,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,4,0,0,5,0,63,63,0,0,63,0,-7,0,63,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,12,0,0,30,0,504,567,0,0,756,0,-98,0,1008,0,18,19)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,11,0,0,0,0,-40,0,0,0,0,11,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(11,0,0,0,0,-240,0,0,0,0,121,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-25,1,0,-5,-2,9,0,1,-25,0,0,0,1,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,4,0,-30,-14,72,0,10,-275,0,0,0,15,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,1,0,1,0,9,0,1,0,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,0,9,10,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,0,-4,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,0,-24,0,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,5,-1,63,-5,-3,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-2,189,-20,-15,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,10,63,-24,64,-40,0,10,-3,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,40,315,-144,448,-320,0,100,-33,72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,6,-8,0,63,1,0,10,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(6,-16,0,252,5,0,70,0,45,630)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-40,-1,10,63,-24,-40,0,10,-3,6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-80,-3,40,315,-144,-280,0,90,-30,66)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,5,0,10,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,25,0,70,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,12,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,9,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,36,0,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,3,1,0,-1,-3,-5,-8,-9,3,-5,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-56,-72,27,-50,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,63,-40,0,10,0,64,5,10,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,-120,0,50,0,448,40,90,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,10,-2,0,0,11,5,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,30,-8,0,0,77,40,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,0,0,-1,0,0,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,-7,0,0,30,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-25,0,63,-40,1,0,-26,0,5,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,-120,4,0,-156,0,40,567)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,4,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,16,5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,0,10,-40,-2,5,10,-40,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,0,40,-200,-12,35,80,-360,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,-1,0,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,-3,0,0,6,7,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,1,0,9,0,1,0,1,10,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,36,0,6,0,8,90,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,0,5,5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,0,35,40,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,0,0,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,0,0,5,6,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,0,-4,0,0,-1,1,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,-16,0,0,-7,8,9,-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,6,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,36,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,1,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,6,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-4,0,0,0,-1,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-8,0,0,0,-6,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,0,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,-1,0,1,-39)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,-4,0,6,-273)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,-1,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,9,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,27,4,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,1,5,10,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,8,45,100,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,9,-25,0,-40,0,10,-40,-24,-2,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,-50,0,-160,0,60,-280,-192,-18,100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,-1,0,0,0,0,0,0,0,-9,-7,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-2,0,0,0,0,0,0,0,-90,-77,0,13,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,-39,10,63,2,-40,0,10,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,-156,50,378,14,-320,0,100,-33)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,0,-25,0,0,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,-100,0,0,-280,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,0,3,0,2,0,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,9,0,10,0,21,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,1,0,-1,-3,-5,62,-26,62)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,434,-208,558)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,4,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,8,0,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,5,63,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,40,567,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,10,0,5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,60,0,40,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(63,-1,-1,0,0,63,0,0,0,63,0,0,-8,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-2,0,0,315,0,0,0,567,0,0,-96,13,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,62,-24,0,0,0,0,-40,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(62,-48,0,0,0,0,-280,0,0,0,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-1,63,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-2,189,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,4,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,12,0,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,9,0,1,0,9,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,0,3,0,45,0,7,8,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,0,0,0,9,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,0,0,0,99,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,0,0,1,-7,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,0,0,8,-63,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,1,0,0,-1,0,0,0,-1,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,0,-4,0,0,0,-8,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,10,1,-1,-3,-5,62,-26,62)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,2,-3,-12,-25,372,-182,496)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-1,0,0,0,-40,0,3,0,0,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-3,0,0,0,-280,0,27,0,0,-300)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,4,-26,-25,63,-40,-8,10,-25,1,-25,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-52,-75,252,-200,-48,70,-200,9,-250,-275)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,62,-24,0,0,0,-40,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(62,-48,0,0,0,-240,0,0,0,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,-1,1,0,9,0,1,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-2,3,0,45,0,7,0,9,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-4,-25,0,-40,0,-26,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,-130,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,-40,0,0,0,3,0,-25,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,-280,0,0,0,33,0,-325,-560)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,0,0,-8,1,0,0,1,1,0,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-24,4,0,0,7,8,0,20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,0,0,0,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,9,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,36,0,0,0,0,0,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,-1,3,0,2,0,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-2,9,0,10,0,21,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,10,-40,-2,5,10,0,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,50,-240,-14,40,90,0,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-40,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-200,0,0,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,1,0,1,0,9,0,1,2,0,1,-7,0,10,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,16,0,10,-77,0,130,0,15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,0,0,0,0,-24,1,0,0,-7,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,0,0,0,0,-144,7,0,0,-70,0,0,13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,9,-25,0,-40,10,-40,-24,-2,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,-50,0,-160,50,-240,-168,-16,90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,0,0,0,0,0,1,0,-7,0,10,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,8,0,-70,0,120,0,14,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,6,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-40,-1,63,-40,-24,0,-3,5,-25,-25,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-80,-3,252,-200,-144,0,-24,45,-250,-275,-300)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,-40,0,9,10,0,5,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,-160,0,54,70,0,45,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-8,10,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-40,60,-175)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,1,0,9,0,1,0,1,10,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,3,0,45,0,7,0,9,100,11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,0,6,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-39,-8,5,-1,-25,-1,63,-40,-2,0,10,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-8,10,-3,-100,-5,378,-280,-16,0,100,-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0,8,27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,0,63,-2,0,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,189,-8,0,0,0,0,0,0,0,12,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,2,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,12,0,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-40,0,0,0,0,-9,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-200,0,0,0,0,-90,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-2,-40,-40,0,10,0,5,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-4,-120,-160,0,60,0,40,-360)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,0,9,0,4,1,11,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,36,0,24,7,88,-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-5,0,0,0,0,0,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,0,0,0,0,0,8,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,-25,0,-40,0,9,-40,-2,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-120,0,45,-240,-14,80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,9,0,1,-1,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,45,0,7,-8,0,10,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,9,-25,0,63,-40,-8,10,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,-50,0,252,-200,-48,70,-200)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-2,-25,0,63,-40,0,10,0,5,63,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,0,252,-200,0,70,0,45,630,-440)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,63,0,-1,11,0,0,0,0,1,-9,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,126,0,-4,55,0,0,0,0,10,-99,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,0,1,0,1,-25,1,0,-5,-2,9,0,1,-25,0,0,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,4,-125,6,0,-40,-18,90,0,12,-325,0,0,16,-85)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,5,-5,-25,-40,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-10,-75,-160,0,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-40,-1,-25,10,63,2,-40,0,10,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-80,-3,-100,50,378,14,-320,0,100,-33)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,9,0,-40,1,0,9,0,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,0,-120,4,0,54,0,8,9,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,1,0,9,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,36,0,6,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,63,0,4,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,189,0,20,-150)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,-5,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,-45,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,-1,0,0,0,0,0,63,0,-7,0,10,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,-3,0,0,0,0,0,567,0,-77,0,130,0,15,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-24,-1,63,-40,-5,0,-3,4,-25,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-24,-2,189,-160,-25,0,-21,32,-225,-250)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,-1,-1,-40,0,0,0,0,0,0,0,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-2,-3,-160,0,0,0,0,0,0,0,0,13,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,1,0,-4,-1,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,2,0,-16,-5,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(4,10,-25,-1,63,11,0,-3,5,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,-50,-3,252,55,0,-21,40,-225)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,-1,1,-1,1,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,2,-3,4,-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,1,1,1,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,4,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,1,1,1,1,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,4,5,6,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,1,0,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,4,0,6,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,3,1,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,2,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,4,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-2,-25,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,5,0,7,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,0,10,0,5,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,0,60,0,40,99)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,-9,3,1,0,-1,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-9,6,3,0,-5,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,0,5,-40,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45,-400,-440)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,0,5,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,15,252,0,60,0,40,99,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,-1,10,0,5,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,-5,60,0,40,-360)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,-10,1,0,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-20,3,0,-5,-18,-35,-56,-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,4,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,2,2,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,4,6,0,5,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,0,-1,0,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,6,0,5,63,1,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,12,0,20,315,6,70,0,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,0,-1,0,-4,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,-16,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,1,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,5,0,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,1,10,2,0,1,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,30,8,0,6,0,8,18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-5,1,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,2,3,0,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-9,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-5,-2,-25,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-4,-75,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,5,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,1,0,1,0,1,-1,-5,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,0,7,-8,-45,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,3,0,2,0,1,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,15,0,14,0,9,30,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,3,0,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,0,8,0,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,3,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,18,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,9,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-3,-2,-3,-4,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-6,-6,-12,-20,-18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,0,6,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,0,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,-10,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,-70,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,2,1,1,3,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,12,5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,2,1,1,3,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,12,5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,1,0,-9,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-36,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,0,1,0,3,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,21,8,9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,3,0,3,0,2,0,1,3,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,6,0,12,0,12,0,8,27,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,0,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,0,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,0,5,63,0,10,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,0,60,0,88)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,-1,1,0,1,0,1,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,-4,5,0,7,0,9,10,22)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,-5,-7,-9,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,81,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,0,1,1,-40,3,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,6,-280,24,9,10,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,0,7,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-2,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,0,5,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,15,-4,315,0,70,0,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-2,-25,-4,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,-12,-160)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,0,-9,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-90,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,4,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,3,0,2,0,1,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,15,0,14,0,9,40,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,0,1,0,1,4,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,4,0,6,28,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,-1,1,0,2,1,0,1,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,-4,5,0,14,8,0,10,11,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-49,-72,-45,-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,3,1,0,-1,11,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,55,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-3,-2,-3,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-6,-6,-12,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,0,3,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,9,0,10,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,5,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,20,-5,378,0,80,0,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,0,-9,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,0,-90,-99)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-5,-3,3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-15,-12,15,-24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,-2,0,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,-12,0,0,0,0,11,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,-1,1,0,2,1,0,1,2,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,-4,5,0,14,8,0,10,22,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-4,315,0,70,0,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,-40,0,5,63,0,10,62,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-80,0,20,315,0,70,496,0,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-4,-9,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,2,2,0,1,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,4,6,0,5,0,7,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,0,1,0,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,4,0,6,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-1,0,0,0,0,0,0,-1,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-3,0,0,0,0,0,0,-10,-440,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,3,0,6,0,1,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,15,0,42,0,9,40,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,0,-1,0,0,0,0,9,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,63,0,9,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-4,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-12,-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,3,0,2,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,15,0,14,0,9,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,-5,-6,-9,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-42,-72,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,0,-1,0,0,0,0,9,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,63,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,-1,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,-4,5,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,0,1,0,1,11,4,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,66,28,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,0,11,0,5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,0,66,0,40,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,0,5,-40,-40,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45,-400,-440,756)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-2,-2,-6,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-12,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-5,-4,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-15,-16,-25)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,0,1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,0,5,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,2,0,1,10,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,4,0,4,50,0,7,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-7,1,1,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-14,3,4,0,54,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-3,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-9,-12,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-2,-25,4,4,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,12,16,-200)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,0,9,-1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,0,81,-10,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-3,-1,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-5,-18,-35,-56,-81,-50,-33)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,63,0,10,0,5,11,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,121,0,-13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(62,0,1,0,-7,1,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,-28,5,6,0,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,2,-5,6,0,5,63,1,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,-10,18,0,25,378,7,80,0,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,0,5,63,10,0,11,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,50,0,77,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-6,-2,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-6,-4,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-25,-42,-63,-40,-27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,5,5,-40,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,40,45,-400,-440)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,5,0,5,63,-40,0,10,5,5,-40,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,0,15,252,-200,0,70,40,45,-400,-440)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7,0,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-6,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-6,-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-5,-1,-25,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-2,-75,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,6,0,5,63,1,-1,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,12,0,20,315,6,-7,0,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-5,-3,3,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-15,-12,15,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-1,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-4,-5,378,0,80,0,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-4,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-8,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,1,0,-1,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-3,-12,-25,-42,-63,-40,-27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,0,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,1,0,3,0,3,0,0,2,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,12,0,18,0,0,18,0,11,36)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,0,1,0,-7,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,2,0,-28,5,0,7,0,9,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,-10,1,0,-1,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-20,3,0,-5,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-3,-2,-25,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-75,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,2,-5,5,6,0,5,63,1,10,0,5,11,0,6,6,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,-10,15,24,0,30,441,8,90,0,55,132,0,84,90,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,0,3,0,2,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,9,0,10,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,-1,0,1,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,-3,0,5,0,7,16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-7,-25,0,-1,0,0,0,0,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,-3,0,0,0,0,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,0,63,0,10,0,5,11,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,0,441,0,90,0,55,132,0,-14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,0,5,-1,63,0,10,0,10,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,15,-4,315,0,70,0,90,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,1,1,11,0,1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,3,44,0,6,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-1,-1,11,63,0,10,0,5,11,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-4,-5,66,441,0,90,0,55,132,0,154)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,63,-40,11,0,5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,189,-160,55,0,35,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,5,-4,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-8,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,-1,0,1,0,1,-6,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,-3,0,5,0,7,-48,18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,0,5,-40,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45,-400,-440,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,4,0,2,0,1,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,20,0,14,0,9,40,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-1,-1,11,63,0,10,0,5,11,0,11,0,-1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-4,-5,66,441,0,90,0,55,132,0,154,0,-16,-85)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,-1,1,0,2,-6,1,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,-4,5,0,14,-48,9,0,11,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,0,6,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,5,63,9,-40,0,10,0,5,-40,-40,-5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,15,252,45,-240,0,80,0,50,-440,-480,-65,140)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,0,3,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,9,0,10,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,-40,0,10,0,5,-40,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45,-400,-440,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,5,-3,-2,-4,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(5,-6,-6,-16,-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-3,-2,-3,-3,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-6,-6,-12,-15,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-2,-5,-3,3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-10,-9,12,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,9,1,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,18,3,4,0,6,0,8,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,0,1,3,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,18,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-2,-2,-3,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,5,63,-40,0,10,4,0,5,-40,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,32,0,50,-440,-480,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,6,63,9,-40,0,10,0,5,-40,-40,-5,10)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,18,252,45,-240,0,80,0,50,-440,-480,-65,140)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,-1,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,-7,8,27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,-2,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,63,0,10,0,5,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,0,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,0,-9,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-27,4,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,0,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,0,1,10,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,3,40,0,6,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,4,-25,0,5,63,-40,0,10,5,5,-40,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4,-50,0,20,315,-240,0,80,45,50,-440,-480)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,1,0,-25,-3,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-75,-12,-35,-54)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,9,-1,-25,-4,-40,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(9,-2,-75,-16,-200,-150)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,-9,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,-81,0,-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,-9,3,1,0,-1,5,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-9,6,3,0,-5,30,-35,-56,-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,0,0,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,0,0,-360)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,0,5,-1,63,10,0,10,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,15,-4,315,60,0,80,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,0,1,0,1,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,64,-40,0,10,0,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,192,-160,0,60,0,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-40,0,3,0,2,-9,-1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,0,9,0,10,-54,-7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,-40,-5,0,-5,-1,63,0,10,0,5,6,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,66,0,-13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,6,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,48,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-5,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,0,1,2,0,-3,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,8,0,-18,14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,63,0,10,0,5,11,0,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,121,0,-13,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-1,-1,11,63,0,10,5,11,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-4,-5,66,441,0,90,50,121,0,143)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,-40,0,10,0,5,63,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,-200,0,70,0,45,630,693)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-4,-3,3,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-12,-12,15,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-3,-4,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-6,-12,-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,11,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,55,6,0,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-3,-4,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-9,-16,-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,-9,-20,-35,-54,-35,-24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,0,3,0,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,9,0,0,6,21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,1,1,0,3,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,12,5,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,-2,0,-5,-1,0,63,0,10,0,5,11,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,-6,0,-25,-6,0,504,0,100,0,60,143,0,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,3,2,2,0,1,-2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,4,6,0,5,-12,0,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-5,0,-1,-1,11,63,0,10,0,5,11,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,-3,-4,55,378,0,80,0,50,121,0,143)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,0,5,63,0,10,0,11,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,0,15,252,0,60,0,88,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,-40)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,-320)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,2,2,0,1,-2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,4,0,4,-10,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,-1,0,4,0,2,0,1,4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,-4,0,24,0,16,0,10,44)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,10,-25,0,64,-40,0,10,-1,5,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,-50,0,256,-200,0,70,-8,45,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-5,11,1,1,0,1,0,1,1,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,22,3,4,0,6,0,8,9,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-2,-6,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-12,-9,-16)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-3,-1,-3,-2,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-5,-18,-14,-40,-63,-90,-55,-36)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,0,63,0,10,0,5,11,0,-1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,0,441,0,90,0,55,132,0,-14,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,4,-3,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,8,-9,-12,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-5,-4,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-15,-16,-25,-18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-40,-2,-25,-4,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-50,-12,-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,6,62,63,9,-40,0,10,0,5,-40,-40,-5,10,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,18,248,315,54,-280,0,90,0,55,-480,-520,-70,150,-400)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-1,0,0,0,6,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-5,0,0,0,54,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-3,0,0,0,0,9,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-15,0,0,0,0,90,0,12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-3,-2,-3,-3,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-6,-6,-12,-15,-18)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,0,-2,-6,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-4,-18,-12,-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,3,0,3,0,2,0,1,3,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,9,0,10,0,7,24,27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-9,3,1,0,-1,1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,5,-18,-35,-56,-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,2,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,4,3,0,5,0,7,8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,0,0,0,-9,6,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,0,0,0,-72,54,0,11,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,0,-9,1,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-27,4,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,0,1,0,1,11,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,66,28,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(5,3,-10,1,0,-1,-2,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,-20,3,0,-5,-12,-35,-56,-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,-1,-6)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,0,2,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,0,10,0,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,6,0,0,5,63,1,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,12,0,0,25,378,7,80,0,50,121,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-5,-4,-5,-3,-2,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-15,-16,-25,-18,-14,-32)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,-2,-2,0,0,0,0,0,0,-9,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,-8,-10,0,0,0,0,0,0,-108,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,0,10,0,5,11,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,0,60,0,40,99,50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,0,-5,-1,63,0,10,0,5,0,63)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,0,80,0,50,0,756)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,-1,0,-1,-3,-5,-7,-9,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,-3,0,-5,-18,-35,-56,-81,-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,2,2,0,1,0,1,2,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,4,6,0,5,0,7,16,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,6,-1,-3,-5,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,18,-4,-15,-30,-49,-72)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,0,5,63,0,10,0,11,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,0,60,0,88,45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,3,0,-9,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,0,-27,0,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,1,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,3,0,5,6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,-40,0,4,63,0,62,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-80,0,16,315,0,434,0,99)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-1,-3,-2,-3,-4,-3,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-1,-6,-6,-12,-20,-18,-21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-3,1,0,-1,-3,-5,-7,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-3,-12,-25,-42,-63,-40,-27)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-4,-2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-8,-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-1,0,1,0,0,0,0,-1,-40,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-3,0,5,0,0,0,0,-10,-440,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,-1,6,63,9,-40,0,10,0,5,-39,-40,-5,10,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,-2,18,252,45,-240,0,80,0,50,-429,-480,-65,140,75)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,64,1,1,11,0,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,128,3,4,55,0,7,0,9,0,11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-5,6,0,5,63,1,-1,0,-1,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,12,0,20,315,6,-7,0,-9,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-1,0,0,0,6,0,1,0,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-5,0,0,0,54,0,11,0,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-25,0,5,63,2,10,0,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,10,60,0,88)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-5,6,0,5,63,1,-1,0,-1,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-5,12,0,20,315,6,-7,0,-9,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,-10,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,-70,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-2,-2,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-4,-12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,-1,0,0,0,0,-5,0,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,0,0,0,0,-35,0,0,10,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,3,0,2,0,1,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,9,0,10,0,7,24)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,-3,-5,-7,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,-9,-20,-35,-30,-21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,1,0,2,-1,1,0,2,1,0,1,2,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,10,-6,7,0,18,10,0,12,26,28)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,-3,-7,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,-9,-28,-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,-25,0,64,-40,11,0,5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,192,-160,55,0,35,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,1,0,-7,1,2,1,0,1,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,0,-21,4,10,6,0,8,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,10,-25,6,64,-40,-1,10,-1,5,11)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,-50,18,256,-200,-6,70,-8,45,110)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,1,-9,0,0,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,-18,0,0,0,6,7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-8,10,1,0,-25,-3,-7,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(10,2,0,-100,-15,-42,-63)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,-1,-1,63,0,10,0,5,11,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,-3,-4,315,0,70,0,45,110,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,1,0,1,2,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,5,0,7,16,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,0,-1,-3,-7,-3,-7,-3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,-2,-9,-28,-15,-42,-21,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3,-26,0,5,63,10,0,11,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-26,0,15,252,50,0,77,40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,0,0,0,0,-1,0,0,0,6,0,1,-5,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,0,0,0,-5,0,0,0,54,0,11,-60,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,0,1,3,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0,8,27,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(9,2,0,3,0,4,1,2,0,1,4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,0,9,0,20,6,14,0,9,40,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-40,-5,-2,0,-5,-1,0,63,0,10,0,5,11,0,-4,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,-6,0,-25,-6,0,504,0,100,0,60,143,0,-60,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,0,1,0)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,0,8,0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1,2,1,0,0,2,-1,1,0,2,1,0,1,2,3,2)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,0,0,10,-6,7,0,18,10,0,12,26,42,30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,-5,-9)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,-30,-63)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,5,63,0,10,0,5,10,5,5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,10,189,0,50,0,35,80,45,50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-3,-1,-3,-2,-5,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-5,-18,-14,-40,-81,-50,-33)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,-2,-40,-5,0,-5,-1,63,0,10,0,5,6,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-2,-80,-15,0,-25,-6,441,0,90,0,55,72,0,-14)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(11,-25,0,5,63,0,10,0,5,11,5,-25)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-25,0,15,252,0,60,0,40,99,50,-275)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(0,2,1,1,0,0,1,0,1,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2,2,3,0,0,6,0,8,9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(2,0,3,0,3,0,2,-1,1,-4,3,3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(0,6,0,12,0,12,-7,8,-36,30,33)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,1,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,8,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-1,-3,-2,-4,-1,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-3,-4,-12,-4,-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(12,-40,-5,0,-5,-1,63,64,0,10,0,5,0,-1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-10,0,-20,-5,378,448,0,90,0,55,0,-13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,1,1,0,0,1,0,1,0,0,1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1,2,0,0,5,0,7,0,0,10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-3,-1,-3,-2,-9,-5,-3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-12,-5,-18,-14,-72,-45,-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(10,3,1,0,-1,-3,4,-6,-9,-5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(3,2,0,-4,-15,24,-42,-72,-45)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(-5,-40,-2,-3,-4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(-40,-4,-9,-16)
        );
    }
}

