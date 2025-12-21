package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SOLUTION {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,8,7,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,3,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,13,24,321));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,13,23,32));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,13,2,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,8,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(18, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,0,6,8,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,11,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,1,2,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,1,2,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,2,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,3,4,5,5,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,10,11,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,13,5,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,1,2,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(13,5,10,11,2,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,11,2,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(22, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,6,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,5,7,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,1,2,3,1,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,2,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,1,2,3,1,2,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,6,7,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,1,2,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,2,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,13,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,10,11,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,10,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,4,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,2,10,11,10,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,8,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,1,2,3,1,11,13,2,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,13,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(18, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,1,2,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,10,11,18,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11,2,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(22, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,8,13,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(18, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,11,2,11,11,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,1,2,3,1,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11,2,11,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(22, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,3,5,7,5,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,6,2,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,4,5,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,13,14,5,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(19, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,2,3,13,5,6,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,2,14,3,13,5,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,5,2,7,5,7,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11,2,11,2,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(33, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,2,11,11,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,0,0,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,3,13,14,5,18));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,7,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,5,13,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,10,3,4,5,5,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(17, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,10,11,18,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,3,5,7,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,8,10,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,11,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,5,10,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,10,3,4,5,5,7,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(17, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,7,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,0,1,2,12,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,10,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,4,8,10,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,3,4,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,2,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,3,5,4,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,6,1,2,6,2,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(6,12,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,7,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,11,10,11,2,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,12,11,11,11,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(22, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,10,0,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(13,5,10,11,2,11,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,10,0,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,2,1,2,2,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,4,5,6,1,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,2,11,11,10,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,10,11,11,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,13));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,4,1,4,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(275, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,75,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(375, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(65, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,22,33,44,55,66,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(230, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,22,44,55,66,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(65, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,1,4,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,22,33,44,55,66,77,88,77,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(164, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(264, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,9,8,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,1,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,22,33,55,66,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(98, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,11,1,1,4,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,1,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,5,1,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,2,1,1,1,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,44,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,4,1,4,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,3,4,5,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,4,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(19, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,4,4,5,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,33,44,55,44,77,88,99,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(264, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,6,9,8,55,11,10,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(19, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,56,44,65,55,66,88,99,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,6,1,77,1,1,5,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,4,6,9,12,8,11,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(45, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,10,9,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,5,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,0,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,5,6,7,8,53,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(68, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,9,31,10,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,1,1,1,1,1,1,5,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(42, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,4,1,4,5,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,3,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,7,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,5,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,55,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,9,9,11,2,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,55,66,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(143, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,6,9,12,8,11,10,9,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,11,1,1,4,1,4,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,88,99,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(66, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,3,4,5,6,7,9,2,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,3,4,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(82, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,1,2,4,4,5,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,8,9,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,1,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,6,2,2,1,1,1,5,5,5,1,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,9,12,8,11,10,8,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,2,1,1,1,5,5,33,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,4,5,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(87, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,8,11,10,8,4,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,2,4,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,0,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(28, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,0,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,6,65,55,66,88,99,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,6,65,55,66,88,99,22,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,4,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(56,11,3,4,5,88,9,8,55,11,10,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(72, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,53,2,3,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,9,3,12,8,11,10,8,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(37, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,5,76,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(89, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,10,10,8,10,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,88,99,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,9,12,8,12,10,8,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,5,1,8,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,2,1,1,1,5,5,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,5,9,8,55,11,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,44,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,6,7,8,9,10,4,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,33,44,55,44,77,88,99,77,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(341, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,119,2,3,64,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(82, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,0,4,5,6,7,8,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,1,4,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,4,12,8,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,11,10,8,4,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,4,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,3,88,6,9,8,11,10,8,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,5,5,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,65,8,11,10,8,4,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(76, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,108,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,3,4,5,6,7,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,22,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,4,12,8,33,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,77,12,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,22,22,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,5,6,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,4,5,6,7,8,77,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(92, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,4,1,4,22,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,1,4,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,4,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,9,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,2,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,5,9,8,11,8,66));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,12,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,4,5,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,4,6,9,12,8,11,32,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,56,22,33,44,55,66,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(65, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,65,22,33,44,55,66,77,88,77,99,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(372, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,1,4,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,5,76,55,11,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(68, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,33,86,55,44,32,76,88,99,77,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(165, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,10,8,9,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,1,1,1,97,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(273, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,2,1,1,1,1,5,5,33,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(41, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,2,1,1,1,1,22,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,33,1,1,5,5,5,42,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(45, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,9,9,11,2,2,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,1,1,1,1,1,1,0,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,1,4,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,22,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,3,6,44,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,5,5,1,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,44,1,44,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,4,5,1,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,108,1,1,1,1,1,97,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(125, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,6,7,8,9,10,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,4,6,1,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,119,2,3,64,6,9,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(93, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,10,22,33,44,55,76,66,77,88,22,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(142, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,32,44,6,65,55,66,88,99,64,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(66, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,42,7,11,10,32,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,0,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,1,1,1,1,1,1,0,1,1,1,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,5,6,6,7,8,53,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,32,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,21,33,44,65,55,89,66,88,99,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(198, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,5,76,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(300, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,11,22,33,6,65,55,66,88,99,22,22,65,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(120, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,22,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,4,6,1,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,4,5,6,7,9,2,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(88, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,21,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(28, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,5,86,97,108));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,42,7,10,32,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,5,76,55,11,8,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(68, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,4,2,1,4,1,4,4,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,21,4,4,6,7,8,9,10,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(44, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,77,4,6,9,12,8,11,33,8,33,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(97, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,11,2,33,44,65,55,66,88,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,54,66,88,99,22,22,33,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(208, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,44,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,97,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(97, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,1,1,1,1,64,97,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,53,2,3,6,5,75,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(75, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,77,22,22,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(307, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,55,32,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,65,22,33,44,55,66,77,88,77,99,10,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(372, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,22,33,100,44,65,55,66,88,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,4,2,4,5,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,100,65,55,66,56,99,21,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(76, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,22,1,1,1,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,56,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(142, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,5,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,7,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,2,4,4,5,6,7,8,9,10,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,53,2,3,5,6,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,5,1,8,108,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,1,1,1,97,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,100,5,6,7,8,9,10,4,9,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,11,53,64,5,76,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(89, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,98,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,6,7,8,9,10,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,3,6,44,11,10,44,100));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,54,66,88,99,22,22,33,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(77, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,65,5,6,42,53,77,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(85, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,75,2,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,3,1,2,4,4,5,6,10,9,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,54,3,4,5,6,7,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,4,5,6,7,8,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,44,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,5,6,7,8,9,10,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,31,2,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,2,4,4,5,6,7,8,9,10,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,4,1,4,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,6,7,8,9,10,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,8,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,54,66,88,99,22,22,66,33,22,22,22,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(44, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88,99,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(275, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,3,3,4,4,4,12,8,33,8,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(41, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,66,3,4,6,65,8,11,10,8,4,6,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,45,6,9,44,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(65, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,3,3,4,33,4,42,7,10,32,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(45, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,100,1,56,1,1,1,1,1,99,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,21,33,44,65,89,66,88,86,99,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(109, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,54,66,88,99,22,22,33,22,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(77, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,4,6,9,8,11,10,6,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,1,1,1,5,100,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,6,9,8,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,6,9,8,11,10,8,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,6,65,55,66,99,22,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(198, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,9,12,8,11,33,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,33,8,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,22,1,1,1,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,21,12,8,11,100,8,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,4,6,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,53,1,1,1,1,32,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,4,0,1,4,22,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,11,6,44,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,4,6,9,8,11,10,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,1,2,3,5,6,7,8,9,10,4,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,2,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,4,6,7,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(19, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(98,1,2,4,5,6,7,9,2,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,1,4,5,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,3,4,5,7,9,2,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,3,88,6,9,8,11,10,8,3,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,2,1,1,1,97,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,4,10,4,6,9,8,11,10,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,11,53,64,5,76,86,97,108,119,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(120, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,98,0,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,34,86,55,44,32,76,99,77,77));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(231, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,4,6,9,108,8,11,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(45, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,11,5,6,7,9,2,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(88, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,4,5,6,7,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,2,5,5,6,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,1,4,1,4,0,1,4,22,1,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(66, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,8,9,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,5,5,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,32,44,6,64,55,66,88,99,64,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(66, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,31,2,6,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,1,1,1,32,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,4,6,7,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,2,54,3,4,5,6,7,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(74,1,2,11,5,6,7,9,2,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,3,4,5,6,7,8,9,31,10,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,11,22,33,6,65,55,98,66,88,22,22,65,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(120, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,32,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(231, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,22,34,33,44,54,66,99,22,22,66,33,22,22,22,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,5,5,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,9,4,4,6,9,12,8,11,10,10,8,10,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,1,1,1,1,1,5,1,8,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,6,7,97,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(45,22,33,44,65,55,66,88,99,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(307, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,33,44,55,66,88,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,0,6,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,6,9,7,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,0,1,1,1,0,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,2,5,5,6,5,2,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,6,9,12,8,12,10,8,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(17, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,65,22,33,44,66,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(86, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,6,1,1,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,5,5,5,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,33,44,55,44,77,88,99,77,77,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(341, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,9,9,11,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,6,9,8,11,10,8,4,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,9,8,11,10,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(26, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,100,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(275, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(55,0,1,2,3,4,4,5,6,7,8,9,10,4,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(68, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,77,4,6,9,12,8,11,33,8,33,9,4,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(108, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,4,5,88,6,9,77,8,55,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(149, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,77,4,6,9,12,8,11,33,8,33,33,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,1,4,5,1,5,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,32,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,5,86,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,10,4,4,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,11,22,65,6,65,55,66,88,99,22,22,65,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(120, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,54,66,88,99,22,22,4,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(44, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,1,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(38, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,1,97,1,97,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,10,4,42,7,11,10,32,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,44,66,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,34,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,4,4,6,9,8,11,10,2,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,2,1,1,1,119,5,33,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,45,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,67,11,23,98,33,44,55,66,77,88,77,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(175, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,3,88,99,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(109, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,5,87,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(171, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,4,6,9,77,11,10,6,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(45,21,33,65,55,64,88,99,22,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(133, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,31,2,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(41, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,3,4,5,22,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(82, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,1,55,2,2,1,0,1,1,5,5,33,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(62, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,67,11,23,98,33,44,55,66,77,88,77,99,67));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(175, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,3,4,4,6,9,12,6,8,11,10,8,9,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,4,6,9,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,11,22,33,6,65,55,98,66,89,88,22,23,65,88,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(78, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,4,1,4,1,4,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,4,4,6,9,12,8,11,12,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,32,56,44,6,64,55,66,88,99,64,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,22,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,2,1,1,22,1,1,1,1,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,11,1,1,4,1,4,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,119,12,33,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(155, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,5,1,1,1,5,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,4,6,9,8,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,1,1,1,1,1,5,1,8,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,65,5,6,42,53,77,2,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(94, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,32,56,44,6,64,55,66,88,99,22,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,2,4,2,4,5,1,6,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(90, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,119,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(127, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,33,1,1,5,5,5,42,1,1,5,5,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(45, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,100,55,66,77,88,99,66));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(275, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,33,1,5,5,5,42,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(49, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,6,9,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(25, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,98,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,8,1,1,22,1,1,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,33,1,1,5,5,5,42,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(44, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(23,2,3,65,5,6,42,53,77,2,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(117, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,75,6,7,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(82, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,88,6,9,8,11,10,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,9,33,100,55,66,77,88,99,66));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,4,7,1,5,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,4,5,1,4,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,2,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,56,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,30,2,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,98,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,56,1,1,22,1,1,1,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,119,5,5,23,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(132, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,97,1,1,0,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,2,1,1,1,97,1,1,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,22,33,44,65,55,66,77,88,77,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(274, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,1,1,1,1,1,1,1,1,99,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(136, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,77,67,6,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(70, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,32,56,6,64,55,66,88,99,64,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(66, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(108,0,1,2,3,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,34,1,1,1,5,5,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,9,4,4,6,8,9,12,8,11,10,10,8,10,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,56,4,6,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,5,76,86,97,108,119,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(89, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,1,4,6,5,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,1,86,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,31,2,4,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(41, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,4,6,9,8,11,10,8,8,0,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,75,56,4,11,6,44,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,5,21,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,9,4,4,6,8,9,12,8,11,10,10,8,10,12,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(26, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,1,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,44,54,66,88,99,22,22,33,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,77,4,6,9,12,8,11,33,8,33,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(97, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(55,3,4,4,6,9,12,8,11,10,10,8,10,12,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(69, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,100,65,55,66,56,99,21,0,22,100,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(109, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,3,1,77,3,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(85, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,1,108,1,1,1,1,5,1,8,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,88,99,54,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,3,5,5,6,7,8,9,31,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,1,1,1,0,1,1,1,1,99,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(136, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,22,33,44,65,55,66,76,88,78,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(120, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,33,44,55,66,88,99,0,22,33,88,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,22,34,86,55,44,32,76,99,77,77,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(231, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,6,55,66,99,22,22,22,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(44, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,3,5,88,9,8,1,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,2,3,4,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(42, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,0,4,5,6,7,8,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,1,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,86,97,108));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,9,12,8,12,10,8,9,11,9,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(33, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,11,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,22,1,1,1,1,2,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,4,6,7,9,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,65,4,6,44,11,10,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,7,11,4,4,6,9,7,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(20, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,44,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,55,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(157, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,8,11,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,6,9,108,5,8,11,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(36, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,89,11,65,22,33,44,55,66,77,77,99,10,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(153, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,1,5,4,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,44,1,1,5,86,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,88,66,99,54,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(165, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,53,22,33,44,65,55,66,88,56,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(165, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(55,3,4,4,6,9,12,8,11,10,10,8,10,12,3,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(69, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,4,12,8,33,33,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(36, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,2,2,1,1,1,5,5,5,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(18, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,2,4,5,1,5,30));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,98,2,98));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,77,76,5,5,1,4,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(83, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,1,1,1,32,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,44,88,99,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,88,5,33,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(33, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,54,66,88,99,22,22,66,33,22,22,22,33,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(143, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,9,12,8,11,10,8,9,12));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,8,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,2,4,5,1,4,2,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,55,2,86,1,1,1,5,5,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,5,5,5,1,1,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,0,4,5,5,7,8,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,9,4,4,6,7,9,12,8,11,10,10,10,8,10,12,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(30, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,65,55,66,88,99,0,22,31,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(241, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,2,1,1,1,97,87,1,1,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(197, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,21,4,65,6,7,8,9,10,7,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(109, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,22,33,55,66,77,88,65));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(98, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,1,5,5,98,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,2,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,10,22,4,33,44,55,76,66,77,88,22,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(186, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(55,3,4,4,6,9,12,8,11,10,8,10,12,3,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,0,108,1,1,1,1,5,1,8,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,12,22,33,44,55,66,77,89,99,55,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(155, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,11,0,4,10,4,6,9,8,11,10,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,1,44,65,55,66,88,56,99,0,22,33,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(198, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,2,1,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,4,5,6,7,8,10,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,1,4,1,4,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,1,4,2,1,4,1,4,4,4,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,5,87,97,87,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(258, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(99,1,4,1,4,1,4,10,1,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,5,4,6,9,12,8,12,10,8,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,4,2,4,5,1,5,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,64,5,2,2,1,1,1,5,21,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(17, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,33,1,2,4,3,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,44,6,65,55,66,88,99,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,31,76,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(300, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,1,2,4,5,6,7,9,2,4,1,2,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(95, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,3,1,2,1,1,1,1,1,97,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,1,1,1,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,33,100,55,66,77,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(176, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,10,3,5,5,6,7,8,9,31,10,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,8,9,31,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,5,5,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(17, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,74,53,2,3,5,6,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(65, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,44,1,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,4,1,4,5,1,108));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,75,12,8,11,34,8,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(81, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,97,108,1,1,0,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,5,4,6,9,119,8,12,10,8,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,11,22,33,65,44,65,55,66,77,88,77,99,77,66));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(294, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9,31,98));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,4,6,1,9,8,11,10,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,31,42,53,5,86,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(135, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,1,4,6,5,5,5,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,22,32,44,65,55,66,3,88,99,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(76, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,32,9,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9,31,10,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,3,119,4,4,5,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,7,6,6,9,11,10,44,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(33,1,1,1,1,0,1,1,1,1,99,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(137, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,4,4,5,1,108,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,33,1,2,4,3,5,6,7,9,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,4,6,9,12,8,11,33,8,12,33));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(47, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,33,44,88,99,32));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(99, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,3,4,6,9,12,8,12,10,8,9,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,6,1,3,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,5,7,9,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(21, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,5,4,6,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,89,22,33,44,55,66,77,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,89,22,33,44,55,66,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(110, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,119,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(203, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,76,75,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,6,9,8,11,10,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,6,6,44,8,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,2,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,0,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,1,0,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1,1,9,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,75,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(325, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,1,1,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,99,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,44,3,4,5,6,7,43,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(43, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,86,97,118,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,52,119,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,87,97,118,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,44,3,4,5,6,7,43));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(43, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,76,75,86,97,7,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(210, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,86,97,118));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,87,97,118));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,6,6,44,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,8,11,10,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(397, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,99,1,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,6,44,8,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,52,119,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(397, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,42,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,97,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,120,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(278, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,87,75,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,99,1,1,1,0,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,99,1,66,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,52,119,75,75,120,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(450, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,0,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,96,120,76,75,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,2,1,1,1,99,1,1,1,0,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,99,100,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,4,5,6,7,43,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,1,1,1,99,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,53,75,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,1,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,5,6,6,44,8,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,89,1,99,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,75,42,53,87,97,118,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(118, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,75,86,32,97,120,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,2,3,4,6,7,8,9,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,75,86,97,108,119,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(325, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,43,53,75,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,6,44,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,87,53,75,86,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(365, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,88,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1,1,44,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,75,86,97,108,119,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(375, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,2,3,4,5,6,7,8,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,96,3,120,42,53,75,86,97,52,119,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(400, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,4,5,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,7,9,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,97,120,75,42));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(278, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,3,4,5,6,7,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,75,32,9,8,11,10,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,119,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,119,88,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,108,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(278, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,5,6,6,53,44,8,8,53,5,44,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(109, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,3,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(89, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,0,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,0,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,97,97,119,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(322, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,0,1,89,1,99,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(192, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,119,88,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(241, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,3,64,75,86,97,108,119,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(186, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,76,1,1,1,5,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,10,1,1,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,75,86,97,119,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(206, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,10,4,5,6,7,8,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,44,2,1,0,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,2,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,118,53,75,86,96,120,76,75,22,120,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,3,4,5,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,89,22,33,44,55,66,10,77,88,99,66));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(187, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,3,4,5,10,8,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,86,97,118,75,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(225, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,8,11,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,43,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,119,2,88,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,1,1,1,1,1,9,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,98,120,75,42));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,7,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,89,1,99,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,3,4,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(96, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,52,89,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(367, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,1,2,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,32,89,22,33,44,55,66,77,77,88,99,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(276, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,42,3,64,75,86,97,108,66,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(175, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,3,4,5,7,7,43,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,53,75,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,0,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,96,55,1,1,1,1,2,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,10,1,1,1,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,0,1,1,1,0,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,22,53,75,97,120,75,22,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(106, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,87,75,86,97,108,119,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(152, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,0,22,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,10,42,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,0,1,89,1,1,0,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(92, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,119,88,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,119,88,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,43,7,53,75,86,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(285, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,99,1,1,1,0,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,75,10,53,87,97,118,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(118, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,87,75,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(337, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,44,2,1,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,119,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,120,76,75,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,7,44,8,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,0,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,1,1,1,1,1,1,66,1,44,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0,0,0,32,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,2,42,55,54,53,75,86,52,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(333, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,75,1,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,31,42,53,75,86,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,22,53,75,97,120,75,22,22,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(137, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,2,4,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,89,3,64,75,86,97,108,119,98,97,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(456, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,44,4,3,4,5,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,119,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,31,42,53,75,86,97,120,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,86,97,87,118));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,2,3,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,1,1,1,1,1,1,4,1,44,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,43,1,44,2,1,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,64,42,43,53,75,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,0,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,6,44,8,8,5,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,99,31,2,1,1,1,99,1,1,108,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(36, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,3,33,64,75,86,97,108,119,97,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(488, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,108,52,119,75,108,42,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,119,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,42,3,64,87,75,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(90, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,10,4,5,7,8,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,76,75,86,97,7,108,119,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(210, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,76,75,120,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,1,1,1,99,1,1,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,5,6,6,53,44,8,53,5,44,44));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(61, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,7,1,2,4,5,6,7,8,1,2,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,77,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(83, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,53,87,97,118,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(171, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,1,3,4,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(90, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,89,31,42,53,30,75,86,97,120,76,75,120,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,53,64,76,75,86,97,7,107,119,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(385, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,120,119,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,3,4,5,6,7,8,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(22, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,55,75,86,97,77,120,42));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(163, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,42,118,53,75,86,96,120,76,75,22,120,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(150, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,76,42,55,75,86,97,77,120,42,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(203, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,2,1,1,1,99,1,1,1,0,88,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,119,88,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,0,1,89,1,99,1,2,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(191, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,43,7,53,75,75,86,6,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(188, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,75,10,53,87,97,118,75,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(149, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,31,7,8,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,65,4,6,7,7,9,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(77, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(77,52,1,2,1,1,1,99,33,1,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(114, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,1,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(112, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,53,75,86,97,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(247, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,6,44,8,22,5,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,1,3,4,5,6,7,1,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(91, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,96,53,97,120,75,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(128, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,76,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(278, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,2,1,1,1,99,1,1,1,0,88,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,66,120,42,55,53,75,86,108,52,119,75,108,42,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(355, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,119,88,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,1,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,119,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,119,88,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(241, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,87,31,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(281, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,96,55,1,1,1,22,2,1,1,1,1,1,55));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(60, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,75,86,32,97,120,76,99,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(205, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,87,75,86,97,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(240, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,0,1,89,1,99,1,2,1,1,1,1,98));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(191, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,119,2,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(119,31,42,53,64,75,86,97,108,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(238, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,32,89,22,33,44,55,66,77,77,88,11));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(265, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(97,52,1,2,1,0,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(100, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,4,5,7,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(8, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,120,119,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(123, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,1,5,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,9,2,1,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(14, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,42,2,1,1,0,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,1,1,1,99,1,1,1,1,53,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,31,42,22,53,75,86,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(53, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,31,2,1,1,1,99,1,1,1,1,53,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(114, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,53,75,86,119,97,76,75,120,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(194, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,4,1,118,2,3,4,5,10,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,3,4,6,7,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(96, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,42,42,1,1,0,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,5,97,120,75,75,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(111, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,41,3,87,31,86,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(281, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,99,1,1,1,0,88,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,3,4,5,6,7,8,8,118,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,97,97,119,75,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(419, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22,42,53,75,86,97,120,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(53, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,64,88,1,1,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,42,1,89,66,99,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(192, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,1,88,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,2,3,5,6,6,44,8,75,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(78, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,99,1,1,1,0,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(200, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,9,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,3,4,5,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(96, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,96,55,1,1,1,22,2,1,1,1,1,1,55,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(60, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,86,1,1,0,77,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(80, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,53,75,86,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(247, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,96,55,1,0,1,22,2,1,1,1,1,1,55,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(60, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,41,2,3,4,6,7,8,9,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,86,97,118,75,97,118));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(225, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,44,3,4,5,6,7,66,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,75,0,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(78, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,3,64,75,86,97,119,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(119, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,31,42,53,75,53,97,120,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,53,75,5,97,120,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(164, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,75,10,52,87,97,118,3,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(193, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,5,6,6,44,8,88,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,44,2,1,0,1,1,1,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,1,10,42,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,86,97,118,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(247, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,86,97,118,75,118));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(225, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,32,75,86,32,97,120,76,75,120,42,76));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(128, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,2,1,0,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,52,22,30,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(159, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,89,22,33,44,66,88,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(11, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,87,22,53,75,86,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(171, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,53,75,86,119,97,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(194, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,86,97,87,118,42));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,52,22,30,75,87,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,41,53,75,86,97,52,119,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,118,2,117,3,4,5,10,8,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(118, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,2,1,1,119,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(124, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,4,5,7,7,43,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(50, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,10,1,2,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,44,2,1,0,1,1,1,2,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11,1,2,1,1,1,99,1,1,1,0,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(112, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,42,53,75,86,97,97,119,75,97,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(419, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,52,119,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,88,75,97,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(250, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,43,0,0,0,43,0,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,1,2,4,4,6,7,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(96, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,3,44,4,5,7,8,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(10, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,41,42,22,53,75,97,120,75,22));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(147, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,-1,1,6,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,0,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,89,1,2,98,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,1,1,1,99,1,1,41,1,1,53,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(156, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,8,3,4,5,6,7,43));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(43, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,7,1,2,4,5,86,7,8,1,2,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,2,4,5,6,7,8,1,2,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,42,5,97,120,75,75,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(80, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,97,118,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(53, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,52,23,30,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(257, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,-1,1,6,1,1,1,1,2,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,52,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(84, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(65,89,3,64,75,86,97,108,119,98,97,75,3,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(459, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,1,1,1,1,44,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,87,53,75,86,97,120,75,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(365, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,120,119,119,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(241, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,44,2,1,0,119,1,1,9,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,2,4,5,31,7,8,1,2,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(31, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,65,31,54,42,53,86,97,118,75,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(128, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,0,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,119,44,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(121, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,96,97,120,75,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,4,5,6,9,8,11,10,8,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,42,1,100,89,66,99,1,1,1,1,1,1,1,99));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,96,55,1,0,1,22,2,1,1,1,1,1,55,2,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(61, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,41,53,75,86,97,52,119,75,75,51,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(210, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,30,1,2,1,0,22,76,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,3,4,6,7,8,9,10));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,1,1,1,99,1,1,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,2,2,1,1,1,5,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(76,89,31,42,53,30,75,86,97,120,76,75,120,97,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(256, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(75,120,42,53,75,86,97,52,119,75,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(441, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,99,1,1,1,0,88,99,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,42,2,1,1,0,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,1,1,1,5,2,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,120,119,119,1,2,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(124, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,64,76,75,86,97,7,108,118,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(91, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,42,118,53,75,86,96,31,76,75,22,120,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(150, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,2,4,6,7,4));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(7, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(120,31,42,53,87,97,118,87));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(87, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,55,53,75,86,52,52,30,75,87,75,87));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,65,31,54,64,42,53,86,97,118,75,97,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(331, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,75,1,1,2,76,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,66,53,10,87,97,118,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(181, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,0,2,1,1,1,99,1,1,1,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(102, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,3,64,87,75,86,97,108));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,2,2,1,0,1,5,5));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,1,1,1,0,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(41,1,3,4,5,7,7,43,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(56, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,31,2,5,1,1,99,1,1,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(104, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,119,1,1,89,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(92, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,44,120,119,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(122, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,22,2,1,0,119,1,1,9,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(13, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,5,97,120,75,75,88));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(111, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,88,75,97,108,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(162, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,2,3,119,1,5,6,7));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(93, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,74,75,0,1,2));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(118,96,53,97,120,75,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(128, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42,53,86,119,97,76,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(172, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,86,1,1,0,77,1,1,86));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(80, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,44,4,5,6,7,66,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,43,1,1,88,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,41,53,75,86,97,52,119,75,75,75,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,53,75,86,97,52,89,119,90,75,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(367, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,4,42,42,53,75,97,120,75,75,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(309, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,42,3,64,87,75,86,97,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(209, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,42,1,6,66,99,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,120,76,119,1,1,119,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(123, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,2,3,4,5,6,7,31,8,1,2,8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(15, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,4,5,6,7,6));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(101, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(89,3,52,64,75,86,97,108,119,97,75,89));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(455, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,31,54,42,53,86,97,118,75,97,118,54));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(225, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,1,2,1,1,1,1,0,0));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,99,1,2,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100,52,1,2,1,1,1,31,99,1,1,1,0,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(103, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2,1,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,3,64,87,75,64,86,97,108,119,31));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(337, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,1,1,88,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2,1,0,1,0,97));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,42,3,64,87,2,75,86,97,119,3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(265, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,89,1,99,10,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,2,42,55,54,53,75,119,75,75,120));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(333, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,119,0,1,1,1,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(123, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,3,4,5,7,8,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(16, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,42,75,120,41,53,75,86,97,52,119,75,75,75,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(234, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,1,43,1,1,88,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,42,53,75,86,97,52,75,53));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(137, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,41,2,3,4,6,7,8,9,5,9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(25, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,119,88,1,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(2, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(31,120,76,42,41,53,75,86,97,52,119,75,75,51,75));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(513, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30,42,3,64,87,75,86,108,119));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(209, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(86,2,2,1,1,1,1,1,1,4,107,44,1,1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(111, result);
    }
}
