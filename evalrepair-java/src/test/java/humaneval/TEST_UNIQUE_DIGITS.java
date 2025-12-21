package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_UNIQUE_DIGITS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,1422,1));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,15,33));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(152,323,1422,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,2033,111,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,103,31));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(31,135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,369,781,409));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,741,951,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,647,380));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(111,333,555,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,13579,86420,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,246,369,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(680,925,753,413));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,802,666,999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,741,951,753,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,647,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,246,1357,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,647));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(369,123,246,369));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,468,802,666,999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,369,781,409,369));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,321,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,135,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(369,781,409));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,320,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,321,381,321,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,888,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,381,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,246,781,409));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,13579,86420,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,2358,159,647,380));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(320,741,951,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(369,246,369));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(79,245,8642,246,1357,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,246,781,409,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,680,135,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,802,666,999,468,802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(680,925,753,468,413));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(646,2358,159,647));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,888,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(380,741,951,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2356,2357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,257,86420,888,413,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,159,13579,647,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,320,381,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,680,135,752));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,802,999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,321,381,321,321,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(111,333,778,555));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,257,369,781,370));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,159,321,2468,381,321,321,159));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159,159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,86420,97531,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(646,2358,647,646));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,680,135,753,951));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,753,951,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,246,79,8642,888,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,246,79,888,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,2358,159,647,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(753,246,134));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(333,555,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(333,555,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,159,647,322,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,79,8642,246,888,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(257,413,781,409,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,369,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2357,2358,159,647,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(245,1357,246,79,8642,888,246,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,246,680,135,999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,951,999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,2359,159,647,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,159,8642,647,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(666,369,2468,369,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,123,2358,159,380));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(951,753,753,246,135,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,753,753,753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,8642,246,888,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,741,159,647,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,158));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(753,321,741,951,753,951));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,753,951,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,246,369,888,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,380,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,123,2358,159,380,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(79,8642,246,1357,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(79,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(468,111,333,778,555));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,159,381,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(159,2358,159));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159,159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(159,381,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,320,381,381));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,369,245,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(409,781,409));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(158,741,753,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1357,246,888,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(680,753,468,753,413));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,159,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2358,381,2358));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(409,410,781,409));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(410,2358,159,647,380));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(159));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(680,753,468,753,413,753));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,753,753));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,86420,97531,97531,2468));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,741,951,753,741,741));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(753,951));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,647,86420,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2468,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123456789,246813579,111111111,987654321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111111111));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,5555,6666,7777,8888,9999,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,678,234,901,567,123,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,678,234,901,567,444,123,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,210,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,431,674,6666,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,431,674,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,99,101,121,151,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,5555,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,235,456,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,641,210,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,97531,84063,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86421,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,101,121,151,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,210,431,908,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4445,5555,6666,7777,8888,9999,1001,2012,3013,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,641,210,431,674,235,641,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,33,24680,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,15793,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,101,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,105,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,67890,13579,86420,84063,15791,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,975,642,431,674,235,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,101,121,151,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,84063,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,181,77));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,4444,5555,6666,7777,1357,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,975,642,431,674,6666,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,246802,435,24680,13579,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,84063,67890,24680,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,86420,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890,674,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,888,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,77,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,99,101,121,151,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,546,67890,435,24680,13579,86420,97531,84063,15792,67890,24680,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,1010,642,431,674,235,456,674,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1010,8888,4444,2221));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,181,120,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,97531,77,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,7778,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,7778,4444,5555,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,84063,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13580,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,975,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,5555,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,15,678,234,901,567,444,123,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,901,567,123,789,456,890,674,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,2221,135,975,642,431,674,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,84063,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,908,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,99,101,121,121,151,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,181,120,55,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,210,431,641,908,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,4444,5555,6666,5555,7777,1357,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,210,2222,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,97531,84063,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,674,235,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,435,24680,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,975,642,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,12,13579,86420,97531,84063,15792,333,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(333,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,210,431,641,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,3013,5555,7777,8888,9999,55,77,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,674,235,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,974,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,1010,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,666,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1011));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(546,67890,435,24680,13579,86420,97531,84063,15792,67890,24680,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,120,55,77,99,101,121,151,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,246802,435,24680,13579,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,1001,135,641,210,431,908,674,235,357,456,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,3013,5554,7777,8888,9999,55,77,1010,1111,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,1111,1111,3333,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,67890,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,49,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,975,1010,642,431,674,235,456,674,456,674,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,12345,24680,13579,86420,5555,84063,15792,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,84063,24680,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,6,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,999,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(888,33,55,99,101,121,151,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,101,121,121,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,67890,13579,86420,84063,15791,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,674,49,456,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,8888,975,642,431,674,235,888,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,675,642,431,674,235,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12346,12345,67890,13579,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,642,135,975,642,674,49,456,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,641,210,444,430,235,641,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,456,901,567,123,789,456,890,674,890,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,97531,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,674,235,456,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,13579,97531,84063,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,1357,9999,2223,1011,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,67890,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,5554,789,890,901,102,213,324,435,546,657,768,879,987,5555,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,456,642,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,67890,67890,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,555,3013,5555,7777,8888,9999,55,77,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,555,1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,99,101,121,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,99));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,17,27,38,49,50,61,72,83,94,105,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,975,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,120,55,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890,13579,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,975,431,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,908,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,86420,15792,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2222,3333,4444,5555,6666,7777,8888,9999,2223,1110,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,15793,84063,6666,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,346,678,234,901,567,123,789,456,890,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,674,235,357,456,642,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,49,431,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,674,235,357,456,642,234,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,5554,789,890,901,102,213,324,435,546,657,768,879,5555,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,13579,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,111,24680,13579,13579,84063,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,890,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,17,123456789,38,49,50,61,72,83,94,105,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,183,55,77,182,123456789,99,101,121,121,151,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,456,642,975,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,17,27,38,49,50,61,72,83,94,16,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,675,55,77,101,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,15793,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,15793));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,641,210,86419,431,908,15792,235,357,456,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,642,975,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4445,5555,6666,7777,8888,9999,1001,2012,3013,5035,6046,7057,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,235,3013,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,235,357,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,8888,975,642,674,235,888,674,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,97531,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,120,55,77,99,101,121,151,181,181,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,1001,121,151,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,101,121,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,135,235,888,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,8888,24680,13579,97531,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,235,456,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,15793,642,431,674,235,456,15793,15793));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,15793,15793,15793));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13578,86421,97531,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,430,55,77,99,101,121,151,181,180,180));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,54,120,55,120,120,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,180,642,6,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,1110,13579,86420,97531,15793,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890,674,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,679,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4445,5555,6666,7777,8888,9999,1001,2012,3013,5035,6046,7057,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,674,235,357,456,642,210,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(102,34,183,55,77,182,123456789,99,101,121,121,151,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,183,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,99,101,121,151,181,55,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24679,86419,97531,84063,15792,13579,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,674,235,357,209,456,642,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,67890,13580,86420,84063,15791,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,435,24680,13579,86420,97531,84063,15792,67890,24680,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,120,55,120,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4444,12345,67890,24680,13579,86420,97531,15793,6666,67890,15793));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,4444,5555,6666,5555,7777,1357,10000,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,12345,24680,13579,12345,86420,5555,84063,15792,345,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,678,234,901,567,123,10,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,641,210,134,431,674,235,641,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,4444,5555,6666,8888,9999,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,674,456,674,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,435,24680,13579,1001,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,7778,4444,5555,6666,7777,8888,9999,2223,1010,1111,4444));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,346,678,234,657,567,123,789,456,890,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,457,890,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,5555,84063,15792,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,84063,24679,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,235,3013,55,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,86420,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,6,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,641,210,7057,444,430,235,641,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13579,86420,97531,5555,84063));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,97531,86420,97531,5555,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111,10000));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,10000,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,674,235,357,456,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,333,674,235,888,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,333,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,13579,86420,97531,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86421,97531,84063,15792,67890,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,77,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,5555,84063,15792,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,674,49,456,674,642,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1010,135,975,431,642,431,674,235,974,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,181,642,431,97531,674,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,999,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,13579,97531,84063,15792,67890,24680,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86421,97531,84063,15792,67890,12345,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,123456789,901,567,123,10,890,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,543,135,975,642,674,49,456,674,642,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86421,455,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(543,13579,24680,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,7057,77,99,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,456,901,567,123,789,456,431,674,890,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,99,101,121,151,181,55,181,101,99));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,99,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,457,890,674,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,1001,121,151,181,55,77));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,432,431,97531,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,13580,246802,97531,84063,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,135791,642,431,908,674,975,235,357,456,975,431,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,210,431,641,908,674,235,357,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24679,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,678,234,901,567,444,123,444,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,678,233,901,567,444,123,444,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,430,235,456,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,120,55,77,99,101,121,151,181,181,120,101));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(555,67890,24680,13579,321,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,456,642,975,642,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(546,67890,435,24680,13579,86420,97531,15793,84063,15792,67890,24680,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(546,67890,235,24680,13579,86420,97531,15793,84063,15792,67890,24680,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,333,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,183,55,77,182,123456789,99,101,121,121,151,181,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,235,357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,17,27,38,49,61,72,83,94,16,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,457,567,678,789,890,901,102,213,666,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,210,2222,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111,9999,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1111,3333,5555,7777,9999,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,674,235,123,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,13579,97531,84063,67891,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,15793,642,643,431,674,235,456,15793,15793));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,15793,15793,15793));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,908,674,235,357,456,49,975,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24681,13579,86420,15792,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,1011,24680,13579,97531,84063,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86421,455,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,101,135,24680,975,642,674,49,456,674,455,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,5555,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,13579,86420,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1010,8888,4444,456,2221));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,183,16,27,83));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,3333,4444,555,3013,5555,7777,8888,55,77,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,555,1111,1111,3333,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1112,2222,3333,4444,5555,6666,8888,9999,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3333,5555,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,99,101,121,151,181,33,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,181,642,431,97531,674,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,13580,86420,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,642,430,235,456,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,183,55,77,123456790,99,101,121,121,151,181,33,181,33));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,675,642,431,674,235,974,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,9079,13579,86420,84063,15792,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,974,84063,12345,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,456,435,24680,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,15792,975,642,431,97531,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,1110,13579,86420,97531,15793,84063,15792,67890,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,13580,67889,13579,86420,84063,15791,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,12,987654321,13579,86420,97531,84063,15792,333,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(333,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,907,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,641,443,210,455,7057,444,430,235,641,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,457,890,674,673,674,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,975,642,431,674,6666,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,135791,642,431,908,975,235,357,456,975,431,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,8888,546,13579,97531,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,6,673,235,183));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,674,235,357,456,908,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,642,975,135,975,642,674,49,456,674,642,49));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,675,642,431,235,974,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,1110,13579,86420,97531,15793,67890,84063,15792,67890,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,134,975,642,431,235,975,456,674,235,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,974,84063,12345,24681,151,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(151,13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,908,86419,97531,84062,84063,15792,13579,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86422,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,431,674,6666,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,14,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1011));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,99,101,121,151,181,1112,33,55,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,235,357,456,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,3013,55,77,974,101,121,151,181,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,86421,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,673,235,456,642,975,642,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(555,67890,24680,13579,320,86420,7057,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,6666,2222,3333,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,975,642,431,674,6666,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,15792,67890,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,235,3013,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,3013,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,456,901,567,123,789,456,431,674,4,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,908,235,357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,135,641,210,431,908,674,235,357,456,908,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,182,181,77));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,86420,84063,15792,67890,24680,435));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24679,86419,97531,84063,13579,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,999,432,321,210,111,222,333,445,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,97531,67890,435,24680,13579,999,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,12344,67890,435,24680,13579,1001,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,135791,642,431,908,975,235,357,456,975,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(101,135,975,642,431,908,674,235,357,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,246802,24680,13579,183,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,15793,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,15793));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,13579,86421,97531,84063,15792,67890,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,641,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,86420,67890,435,24680,13579,86420,97531,84063,15792,789,24680,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1010,135,975,431,642,431,235,974,456,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,674,235,357,456,907,235,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,3333,4444,5555,6666,7777,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,543,135,975,642,674,49,456,674,643,456,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(543,13579,24680,86420,97531,84063,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,6,33,55,77,99,101,121,151,181,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,20,77,99,101,121,151,181,33,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,1010,135,975,431,642,431,235,974,456,974,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,679,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,332,333,444,555,666,777,888,1111,2222,3333,4445,5555,6666,7777,8888,9999,1001,2012,3013,5035,6046,7057,8068,9079,2222,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,181,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,456,890,890,234,678));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,975,642,674,49,456,674,49));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,135,641,210,431,908,674,235,13580,456,908,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,134,641,210,431,908,235,357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(120,33,55,77,99,101,121,151,54,8888,120,55,120,120,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,180,642,179,6,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,179,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,67890,24680,13579,86421,97531,246813579,15792,67890,12345,246813579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,134,975,642,642,431,975,456,674,235,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,13579,84063,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,7778,975,210,431,674,235,357,209,456,642,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,4444,5555,6666,5555,7777,1357,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,15,678,234,8888,901,567,86419,444,123,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,13580,13579,84063,15791,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,642,908,77,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,642,975,641,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,333,210,431,908,674,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,333,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,1010,84063,67890,24680,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,182,678,234,901,567,444,123,444,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,431,674,235,642,976,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,543,135,975,642,674,49,456,674,643,456,135,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,543,135,975,642,674,346,456,54,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,234,456,901,567,123,789,456,431,674,890,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2223,10000,8888,4444,5555,6666,7777,1357,9999,2223,1011,4444));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1357,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,183));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,456,901,2468,567,123,789,974,456,431,674,890,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,222,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,543,135,975,642,674,49,456,674,643,456,135,974,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,5554,2222,3333,4444,555,7777,8888,9999,55,77,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,555,1111,1111,3333,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,77,674,235,357,456,457,456,357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,135,357,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,901,567,123,789,456,890,674,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,50,975,642,431,674,6666,235,456,431,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,431,908,457,235,357,456,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,5554,2222,3333,4444,555,7777,8888,9999,55,77,1010,1111,3333));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,555,1111,1111,3333,3333,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1356,135,975,642,431,674,6666,235,456,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,642,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(101,135,24680,975,987654321,674,49,674,455,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,102,4444,5555,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,975,1010,642,431,674,235,456,674,456,674,456,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,908,235,357,8888,641,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,84062,13579,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,86420,84063,15792,12345,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,973,84063,12345,12345,24681,151,15792,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(151,973,13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,18,20,14));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(72,121,642,674,49,457,674,49));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,9079,13579,86420,15792,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,987654321,8,10,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123456789,34,55,77,99,101,121,121,151,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,435,24680,13579,1001,97531,84063,15792,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,100,12,443));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,2221,135,975,642,431,235,456,642,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,4444,5555,6666,5555,7777,1357,2223,1010,1111,10001,2223));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,5554,789,890,901,436,102,213,324,435,546,657,768,879,5555,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,6046,678,789,890,901,102,213,324,435,546,657,333,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,674,320,456,674,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,8,210,431,641,908,674,235,357,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,8888,546,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,1001,121,151,7777,55,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151,151,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,974,675,642,431,235,5555,974,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,5555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86419,84063,24679,86420,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,8888,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4445,5555,6666,7777,8888,9999,1001,2012,3013,5035,6046,7057,8068,9079,2222,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,86421,135,4445,975,642,431,674,235,456,642,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84062,12345,67890,435,13579,86420,97531,15791,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,67890,24680,13579,86421,97531,246813579,235,15792,67890,12345,246813579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,879,210,908,674,235,357,456,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,2468,678,234,8888,901,567,86419,444,123,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,357,456,431,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,77,99,1001,121,151,181,55,77,1001));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,15793,84063,6666,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(209,6666,2222,3333,6666,7777,8888,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,84063,84063,15793,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(431,67890,24680,13579,97531,1010,84063,67890,24680,97531,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,7778,4444,5555,6666,7777,8888,9998,9999,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,1010,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,67890,24680,13579,86421,246813579,246813579,15792,67890,12345,246813579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(546,67890,435,24680,6666,86420,97531,84063,15792,67890,24680,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,431,3013,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,975,431,674,6666,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,888,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,180,642,99,179,6,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(99,135,179,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,3332,2222,10000,3333,4444,5555,6666,7777,8888,9999,2223,1010,1111,10000));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,235,974,456,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,455,135,975,642,431,674,6666,456,120,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,234,77,99,101,121,151,181,181,101));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,135,235,888,430,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,641,210,7057,444,430,235,641,457,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,675,642,431,674,235,974,456,675));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,674,235,456,674,456,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,86420,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1001,135,641,210,431,908,674,235,357,456,908));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,234,77,99,101,121,151,181,181,101,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,83,246802,435,24680,13579,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4443,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,777,324,2012));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(445,181,642,431,97531,674,234,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(77,455,135,975,642,431,674,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,3333,4444,5555,6666,7777,9999,2223,1010,1111,7777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,3333,5555,7777,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,324,2222,3333,908,4444,5555,6666,7777,8888,9999,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,432,674,235,456,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,135791,642,431,908,975,235,357,456,975,431,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,975,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,86420,97531,84063));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,642,135,975,642,674,49,456,674,642,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,99,101,121,151,181,2012,33,55,151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,77,99,151,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,99,101,121,181,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,99));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,2468,678,234,8888,901,567,86419,444,123,456,97531,901,234));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,13580,86421,97531,84063,15792,67890,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,987654321,8,10,14,16,18,20,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,333,674,235,887,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,333,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,12345,67890,12,13579,86420,97532,84063,15792,333,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(333,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,345,678,234,456,901,2468,567,123,789,974,456,431,674,890,890,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(101,135,431,975,642,431,908,674,235,357,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,9079,86420,84063,24679,15792,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(7058,975,67890,24680,13579,320,86420,7057,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,777,768,546));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,55,77,123456790,99,101,121,1357,151,181,33,181,33));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,33,55,77,99,151,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,86420,97531,5555,84063,15792,97531,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,134,975,642,431,235,975,456,674,235,642,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24679,86419,97531,5554,84063,15792,13579,50,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,642,430,235,456,674,235,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2222,3333,7778,4444,5555,7777,8888,9999,2223,1010,1112));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,908,674,909,235,357,456,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,12,2222,10000,4444,5555,6666,5555,7777,1357,10000,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1357,135,975,431,674,6666,675,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1112,13578,12345,12344,67890,435,24680,13579,1001,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,67890,13579,86420,84063,15791,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,908,235,357,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,8,210,430,641,908,674,235,357,456,642,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,674,97531,5555,84063,15792,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,642,431,674,320,456,674,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,5554,789,890,901,436,102,213,324,435,546,657,768,879,5555,765,654,543,432,321,210,111,222,333,444,555,666,333,777,888,999,1111,2222,3333,4444,5555,7777,8888,9999,1001,2012,3013,4024,5035,6046,8889,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,333,555,777,999,1111,3333,5555,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24679,13579,86420,97531,15793,84063,6666,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,675,642,431,235,974,456,674,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,640,210,431,908,235,357,456,455));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,5555,15,84063));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,5555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67890,456,435,24680,13579,86420,97531,84063,15792,67890,24680,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,642,431,235,674,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,86420,67890,435,24680,13579,86421,97531,84063,15792,15792,789,24680,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,49,879,210,908,674,235,357,456,641));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(34,183,55,77,123456789,99,101,121,121,151,181,181,33,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13578,86421,97531,15792,67890,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,213,55,77,121,99,101,121,151,181,181,120));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,435,24680,13579,86420,97531,84063,15792,67890,24680,67890,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,431,674,235,456,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,457,567,678,789,890,901,102,213,666,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,444,555,666,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6045,7057,8068,9079,777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,346,678,234,657,567,123,789,456,890,890,234));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,9999,67890,13579,86420,84063,15791,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(9999,13579,15791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,974,12345,24680,13579,12345,86420,5555,84063,15792,345,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5555,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24680,13579,86420,97531,5555,15,879));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,5555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,431,642,7778,975,210,431,674,357,209,456,642,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,908,987654321,674,235,357,456,49,975,431));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,246802,24680,13579,183,84063,443,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,431,235,3013,641,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,435,86420,15792,67890,24680,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,13579,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,3332,975,641,431,674,235,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,642,431,235,456,674,235,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,2012,642,431,674,235));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,24679,86419,97531,84063,15792,13579,97531,97531));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,333,876,765,654,543,432,321,210,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,908,4024,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(209,12345,67890,435,13579,86420,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,642,135,3332,642,674,49,456,674,642,674));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13578,12345,67889,435,24680,13579,86420,97531,84063,15792,67890,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,987654321,49,50,61,72,83,94,183,16,27,83));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(24680,12345,67890,1110,13579,86420,97531,15793,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,15793,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(777,642,135,641,210,908,235,357,8888,641,456,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,357,777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,135,975,642,432,431,97531,83,235,456,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,975,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,34,24680,13579,77,86420,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(77,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(38,15,678,84063,234,901,567,444,123,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(33,55,99,101,121,151,181,55,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,55,55,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,2221,2222,10000,2223,4444,5555,6666,5555,7777,1357,2223,1010,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,1111,1357,5555,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(642,1001,135,641,210,431,908,674,235,357,456,908,357));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,20,200));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(11111,33333,55555));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(11111,33333,55555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(24680,13579,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(13576,86431,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,15792,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,105,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,123,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,456,890,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,5035,901,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,768,1357,2467,2468,13579,24680,135791,246802,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,72,105,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,233,5035,901,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,789,678,233,5035,901,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,2222,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,345,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,222,768,879,876,765,654,543,432,321,210,111,222,333,444,674,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2012));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,455,10,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,20,20,4));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,101,2,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,4,8,10,14,16,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,181,123,456,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,6));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,18,20,20,20,4));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,16,49,50,61,8068,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,768,1357,2467,2468,13579,24680,135791,246802,246,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,890,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,28,38,49,50,61,72,83,72,105,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,777,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,542,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,10,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,2222,246802,2467));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,14,16,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,1357,2468,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,6666,567,123,999,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,325,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,71,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,455,10,345,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123456789,111111112,246813579,111111111,987654321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111111111));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,3333,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,14,24681,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,181,123,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,469,2468,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,234,901,181,123,456,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,431,908,674,235,357,456,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,430,908,674,235,357,456,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,94,105,72));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,233,5035,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,10,6,10,18,20,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,84063,15792,67890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,181,123,456,233,890,345,678,181,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,777,233,5035,901,789,456,890,901,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,765,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,84063,15792,12345,67890,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,325,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456,210));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,8888,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,2222,13579,86420,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,5035,901,789,456,890,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,61,72,83,72,105,27,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,2222,13579,86420,567,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,18,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,469,2468,13579,24680,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,789,678,233,5035,901,789,890,5035));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,901,344,181,123,456,9999,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,456,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,542,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222,9999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,4,8,10,13,16,3,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,13579,18,86420,97531,84063,15792,84063,15792,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,765,16,18,20,14));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,4,1357,10,14,16,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2223));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,99,27,104,38,49,50,61,72,83,72,105,27,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(99));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,14,6,8,14,16,18,5,20,10,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,246,2222,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,38,16,49,50,61,8068,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,4,8,10,14,16,10,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,2222,13579,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,431,908,674,235,357,456,975,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2468,13579,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,121));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,642,431,908,674,235,357,456,975,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,567,181,123,345,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,233,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,888,999,1111,2222,3333,4444,5555,6666,8888,9999,1001,2012,3013,4024,5035,6046,7057,656,8068,9079,1001));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,768,1357,2467,2468,13579,24680,135791,246802,246,2467));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,320,234,345,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,321,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,431,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,455,10,123,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,61,72,83,94,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,2,6046,4,8,10,13,16,5,3,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,10,6,10,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,768,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,5035,901,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,7777,14,16,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,101,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,6046));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,320,234,345,456,567,678,789,890,901,3013,213,324,434,546,657,768,879,321,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,431,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,777,233,5035,901,789,456,890,111111112,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,16,38,49,51,61,72,71,83,642));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(51,71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(344,234,181,123,8888,890,345,890,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,37,38,49,50,61,72,83,94,105,72));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,234,901,181,123,890,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,55,1357,2468,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,234,901,181,123,890,345,677,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,50,5,49,72,50,61,72,83,94,105,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,5035,901,789,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,469,2468,13579,24680,135791,246802,469));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,181,123,456,233,890,345,678,181,345,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,320,234,345,456,567,678,789,890,901,3013,213,324,434,546,657,768,879,321,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,431,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,345,678,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,246813579,38,49,50,61,72,83,94,105,72));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,14,6,8,14,16,18,5,20,10,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86419,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,469,2468,13579,24680,246802,469,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,246,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,876,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,320,234,345,456,567,678,789,890,901,3013,213,324,434,546,657,768,879,321,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,455,37,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,431,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37,111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,901,344,181,123,456,9999,182,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2468,468,1357,2468,13579,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2468,13579,24680,246802,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,33,55,77,101,2,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(33,55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,456,181,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,24680,13579,18,86420,97531,84063,15792,84063,1001,15792,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,234,901,181,123,13579,456,345,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,210,111,10000,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,7777,14,16,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,121,101));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,10,6,8,7777,14,16,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,1001,102,213,324,435,546,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,900,678,777,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,61,72,71,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,789,6046,7057,455,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,234,901,181,890,346,677,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,37,38,49,50,61,72,83,94,105,73));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37,73));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,975,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,975,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,768));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,72,37,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,16,18,20,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,344,345,456,181,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,83,246,2222,246802,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,14,24681,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,151,181,121,101,15));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,777,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,123,84063,456,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,1001,102,213,324,435,546,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,555,210,111,10000,222,333,444,1001,555,666,777,888,3332,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,246802,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2223,7777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,94,456,181,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,8888,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,10,17,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,6,6,10,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,654,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,14,17,6,8,14,16,18,5,20,10,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20,6));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,430,908,235,357,456,3,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,233,5035,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,6666,567,123,999,568,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,18,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,666,8,10,14,2467,16,18,20,14,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,28,38,49,50,434,61,72,71,83,72,105,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,876));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,430,908,642,674,235,357,456,642,975,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,8888,6046,4,1357,10,14,16,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,876,765,654,543,432,321,210,111,222,333,444,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6,8,10,14,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,8,10,14,16,18,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,2222,13579,86420,567,84063,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,16,49,50,61,987654321,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,14,1111,8,14,16,18,5,20,10,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,1111));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,8888,6046,4,1357,10,14,16,61,6046));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8888,8,10,14,16,18,20,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,5,8,10,13,16,3,62,16,62));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,123,455,11,122,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(11));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,2222,105,2222,13579,97531,84063,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,51,99,101,121,151,181,121,101,15));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,15,33,51,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,677,10,14,16,18,20,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,86420,97531,84063,6));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,181,345,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,8887,901,102,213,324,435,546,657,768,879,876,765,654,543,432,321,210,111,222,333,444,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,545,879,987,876,765,654,543,432,321,210,111,222,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,321,181,123,456,890,345,456,181,345,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,5035,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,101,180,2,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,357,901,1001,101,213,324,435,546,657,768,879,987,876,765,654,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456,987));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,357,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,890,6666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6047,4,7,8,10,13,16,3,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,7,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(6046,4,1357,10,14,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(975,975,642,431,908,674,235,357,8889,456,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(678,181,123,456,233,890,345,678,181,345,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,10,6,10,555,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,456,181,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,7,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(7));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,789,678,233,5035,901,788,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,7777,4,14,16,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,324,435,546,657,768,879,987,876,654,543,432,321,210,111,10000,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(27,38,49,61,71,71,83,122));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71,71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,325,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,6045,321,210,111,222,333,444,555,666,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,677,789,890,901,102,213,325,436,546,657,768,879,987,876,765,654,543,432,321,5556,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2468,13579,468,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,555,210,111,10000,222,333,444,1001,555,666,777,888,84063,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,246802,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,210,111,246813579,333,444,1001,555,666,776,888,999,431,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,2,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,4444,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,8888,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,16,49,50,61,8068,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,24680,83,246,2222,246802,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,13579,18,86420,97531,84063,15792,84063,15792,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,2,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,4444,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,8888,1001,2012,3013,4024,6046,7057,8068,9079,666,654));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,2012,3013,4024,6046,7057,8068,9079,666,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,2,6046,4,8,10,13,16,5,3,324,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,6,8,7777,14,16,5,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,24681,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,444,678,234,901,181,123,455,10,345,123));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,8,10,12,14,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,567,181,123,345,123,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,6,8,10,14,16,18,20,6));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,101,180,2,55,121,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,55,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,2012,3013,4024,6046,7057,8068,9079,666,8888,6666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,10,6,555,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,181,768,123,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,768,1357,2467,2468,24680,7057,246802,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,55,77,101,2,151,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,123,456,890,345,456,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,431,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,233,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,888,999,1111,2222,3333,4444,5555,6666,8888,9999,1001,2011,3013,4024,5035,6046,7057,656,8068,9079,1001));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,103,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,101,213,324,435,546,657,768,3332,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,3333,4444,5555,6666,7777,8888,9999,1010));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,555,210,111,10000,222,333,444,1001,555,666,777,888,84063,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,987654321,1001,2012,3013,4024,6046,246802,8068,9079,324,6046));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,13579,24681,86419,97531,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,455,38,49,50,61,72,83,94,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222,987,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,181,151,181,15));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1358,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,61,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,4,8,10,14,16,10,61,8));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,325,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,2012,3013,4024,3013,6046,7057,8068,9079,666,8888,6666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,666,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,181,456,890,345,456,455,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,901,567,123,789,545,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,7777));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,15792,12345,67890,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,2,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,4444,333,444,666,777,888,998,999,1111,2222,3333,4444,5555,6666,8888,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,777,999,1111,3333,5555));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,345,678,233,5034,901,789,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,333,444,555,344,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(99,2,4,6,8,10,14,16,18,20,18,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(99));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,468,1357,2467,2468,13579,24680,246,2222,246802,24680));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123456789,111111112,246813579,111111112,987654321));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,777,233,5035,901,789,456,890,5034,111111112,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,123,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,677,456,567,678,789,890,901,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,444,555,666,777,888,999,1111,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666,765));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,10,6,10,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,1111,2222,790,3333,4444,5555,6666,7777,8888,1001,2012,3013,4024,5035,6046,7057,8068,9079,987,4444));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,1111,3333,5555,7777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,37,83,104,105,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,789,6046,7057,455,9079,666,3013));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,345,678,17,5035,901,789,456,890,901,789));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17,135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,2222,105,2222,97531,84063,15792,12345,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,1001,657,768,879,876,765,654,543,432,321,210,111,222,333,444,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,111111112,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,181,123,456,233,890,345,678,181,345,181,345,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,765,876,765,654,543,432,321,210,111,333,444,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222,987,890,9999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8888,8,10,14,16,18,20,5,20,14));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,99,101,121,86419,181,151,181,15));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,15,33,55,77,99,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,325,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,1001,555,666,777,888,999,1111,2222,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456,999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,999,1111,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,677,456,567,678,789,890,900,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,444,555,666,777,888,999,1111,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,879));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,765,16,18,20,16));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,654,678,233,5034,901,2,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6,10,14,24681,16,18,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,975,642,431,908,674,235,357,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,357,975,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,642,431,908,674,235,456,975,135));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135,135,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,321,84063,456,890,345,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(86420,2,789,678,234,5035,901,789,890,5035));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6047,5,4,7,8,10,13,16,3,61));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,7,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,4444,324,435,546,657,768,879,987,876,12345,765,654,543,432,321,111,222,333,444,555,344,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(6,6,10,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,101,543,432,321,210,111,222,333,444,555,666,777,888,999,568,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,6046));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,210,111,246813579,333,444,1001,555,666,776,888,999,431,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(6,6,18,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,123,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6047,5,4,7,8,10,13,16,3,61,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,7,13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1111,3333,4444,5555,6666,7777,8888,9999,1010,8888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,61,72,71,83,105,72));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(768,4,6,8,14,16,18,20,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,111,222,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,2012,3013,4024,6046,7057,8068,9079,666,8888,6666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,879,432,234,901,181,345,123,432));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,320,234,345,456,567,678,789,890,901,3013,213,324,434,546,768,879,321,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,431,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,10,14,17,20,4,4));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,654,233,987654321,901,2,456,890,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(135));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,657,222,768,879,876,765,654,543,432,321,210,111,222,333,444,674,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2012,2012));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,61,72,71,83,105,72,27));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(71));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(768,4,6,8,14,16,18,20,20,20));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(6,6,10,18,10,10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,789,890,901,3013,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,49,50,37,14,83,104,105,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,234,234,5035,901,789,456,890,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,542,432,321,210,111,9079,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,2222,9999));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(24681,67890,24680,13579,86420,97531,15792,97531,13579));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,13579,97531,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,5035,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,555,210,111,10000,222,333,444,1001,555,666,777,888,84063,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,987654321,1001,2012,3013,4024,6046,246802,8068,9079,324,6046,555));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,555,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,14,6,8,14,16,18,5,20,10,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,1001,102,213,324,435,546,657,768,879,987,876,765,654,432,321,210,879,111,222,333,444,555,666,777,8889,888,999,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,123,84063,456,890,768,456));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,14,17,6,8,14,16,18,5,20,10,2,2));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5,17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,101,180,2,121,151,181,55));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,55,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,55,1357,2468,13579,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,13579,86420,567,84063,15792,12345,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,14,18,20,5,6));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,13579,18,86420,84063,84063,15792,84063,15792,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(55,1357,2468,13579,24680,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(55,1357,13579,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,1001,657,768,879,876,765,654,543,432,321,210,111,222,333,444,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,111111112,8068,9079,2222));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,234,901,181,123,890,345,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,6046,5,8,10,13,16,3,62,17,62));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,13,17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,84063,15792));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,678,777,233,5035,901,789,456,890,5034,111111112,679,901));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(777));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079,879));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,5556,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,324,901,346));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,900,678,234,901,123,789,344,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135,975,974,642,430,908,235,105,357,456,3,975));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,135,357,975,975));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,24680,13579,24681,86420,97531,84063,555,15792,12345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(555,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,555,210,111,10000,222,333,444,1001,555,666,777,888,84063,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,987654321,1001,2012,3013,4024,6046,246802,8068,9079,324,6046,555));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,555,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,5556,102,213,324,435,546,657,768,879,987,876,10,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,8888,5035,6046,7057,8068,9079,123,432,324,901,346,888));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,543,432,321,105,210,111,10000,222,333,444,1001,555,666,777,888,999,1111,2222,3333,5555,6666,7777,8888,9999,2012,3013,4024,6046,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,346,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(24681,246,468,1357,2468,13579,24680,246802,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(468,1357,135791,2468,13579,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,13579,135791,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,789,6046,7057,455,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,38,16,49,213,50,61,8068,72,83,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(234,345,456,567,678,789,890,901,102,213,323,435,546,657,768,879,987,876,654,543,432,321,210,111,246813579,333,444,1001,555,666,776,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,900,6,14,24681,16,18,20,18));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079,3013));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(247,468,1357,2468,135790,468,135791,246802));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357,135791));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,37,38,49,50,61,72,83,94,105,73,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(37,73));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,233,901,181,890,346,677,181));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,789,233,5035,901,789,456,890));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,654,3013,432,321,210,111,10000,222,333,444,1001,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079,324));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(16,27,455,38,987654321,50,61,72,974,94,105));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(246,768,1357,2467,2468,24680,7057,246801,247,246));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1357));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,2222,13579,86420,97531,84063,15792,12345,84063));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,975,345,456,567,678,789,890,901,102,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,975,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(101,12345,2222,105,2222,13579,97531,84063,7));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(7,13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,213,102,213,324,435,546,657,768,545,879,987,876,765,654,543,432,321,210,111,222,333,444,3333,555,666,777,888,999,1111,8889,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,888,999,1111,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,3013,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,444,555,666,777,546,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,5035,6046,7057,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(321,900,6,14,24680,16,18,20,18));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345,67890,105,122,13579,86420,97531,84063,15792,12345,84063));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(345,677,234,901,123,890,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,102,213,324,435,546,657,768,879,987,876,765,654,543,432,321,210,111,222,333,24680,1001,234,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,6046,8068,9079));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,5,8,10,13,16,3,62,17,62));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3,5,13,17));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15,33,55,77,101,2,121,101,151,181,101));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(15,33,55,77,151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(84063,234,901,181,123,890,345));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,345,456,567,678,789,890,901,101,213,324,435,546,657,768,879,987,876,765,543,432,321,210,111,222,333,444,555,666,777,999,1111,2222,3333,4444,5555,654,7777,8888,9999,1001,2012,3013,4024,6046,7057,9079,1111));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(123,234,456,567,678,789,890,901,3013,213,324,435,546,657,768,879,18,987,876,765,654,543,432,321,111,222,333,9079,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666,7777,8888,9999,1001,2012,3013,4024,789,6046,7057,545,666));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111,333,555,777,999,1111,3333,5555,7777,9999));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(67890,345,13579,18,86420,97531,84063,15792,84063,10000,15792,86420));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(13579,97531));
        org.junit.Assert.assertEquals(result, desired);
    }
}

