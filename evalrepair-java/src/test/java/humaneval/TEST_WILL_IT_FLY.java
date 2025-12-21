package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_WILL_IT_FLY {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,2,3}, 9);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3}, 5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {5}, 5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0}, 0);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1}, 4);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,4}, 13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,4}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 10);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,4,4}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,0}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,0}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1}, 3);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,2,3}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,4,4}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1}, 12);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,1}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,2,1,2,4}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1}, 13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,13,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,0,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 0);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,13}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1}, 13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2}, 12);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,1,2,4,4}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,2,1,2,4}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,2,1,2,4}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {-15,13,83,8}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1,1,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,8,4}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,13}, 83);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,-1,0}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,1}, 83);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,13,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,1,2,1,2,4}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,8,4,1}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,2,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,13,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 2);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,83,8}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,2}, 12);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,13,1,0}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2}, 13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0}, 1);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,2,1}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,1,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,2,8,4}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,1}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,0,0}, -15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1}, 14);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,2,3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,1,1}, 83);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {12,13,83,8}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,2}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,1,2,4,4}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,1,2,1,2,4,2}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,83,8}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,13,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3}, 14);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,13,13}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,1}, 82);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6}, -15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,13,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,0}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2}, -2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,1}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,16,18,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,18,20,12}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,6,1}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,6,1,2}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,2,3,4,5,6}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,0,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,1,5,7,9,7,5,3,1,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,2,3,2,1,0,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,17,20,12}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,7}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,1,2,3,2,1,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,5,6}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,0,2,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,0}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,17,20,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,1,0}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,4}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,2,1,2,3,2,1,2,3,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,2,3,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0,1}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,2,3,4,4,5}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,7}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,1,1,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,0}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,1,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,16,18,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,3,2,1,1,2,3,2,1,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,3,2,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,13,17,17,20,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,1,14,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,2,3,4,5,6}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,0}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,1,2,3,2,16}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,4,2,5,1,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,16,18,20}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,3,5,6}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,5,1,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,1,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,1,3,2,3,2,1,7,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,1,2,3,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,0,2,2}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,7,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,0,1,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,3,3,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,1,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,0,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,30,3,2,1,0,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,12,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6,6}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,6,8,10,16,18,31,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,12,1,1,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,5,1,31,3,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,2,1,0,2}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,1,0}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,2,4,4,5}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,1,2,3,2,16}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,3,1,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,30,3,1,5,7,9,7,5,3,1,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,2,3,2,1,2,3,2,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,6,2,1,2,3,2,1,2,3,2,2,3,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,18,20,12,6}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,7,2,1,0,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,5,0}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,2,1,2,3,2,1,2,3,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,16,18,20}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,1,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,31,3,3,2,2,1,1,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,3,1,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6,5,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,4,5,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,0,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,14,17,17,20,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,11,17,17,20,12}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,4,2,5,1,3,2,1,1}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,1,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,2,3,2,1,0,1,1,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,17,20,12}, 11);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,2,3,4,5,6}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,2,1,2,3,2,1,2,3,2,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,11,4,5,6}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 6);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,3,1}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,3}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,2,1,2,3,2,1,2,3,2,2,3}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,18,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,3,1,2,1,0,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4,5}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,30,3,5,7,9,7,5,3,1,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,10,7,5,3,1,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,18,4,1,0}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,0}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,31,3,3,2,2,1,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,1,0,1,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,4,5,6}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,3,4,5,7}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1,0,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,14,17,17,20,12,10}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3,3}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,13,17,17,20,12}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,8,10,12,14,16,18,21}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,11,4,5,6}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,21,3}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,2}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,-1,4,5,0}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,31,1,-1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,8,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,4,5,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,4}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0,1,2}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,3,2,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,1,0}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,13,17,17,20,12}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1,4}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,30,1,3,2,3,2,1,7,2,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,0,0}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,1}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,2,4,5}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,0,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,4,6,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,9,2,5,1,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,2,2,3,2,2,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,2,3,4,4,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,11,6,8,10,12,14,17,18,20,12,6}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,3,2,1,2,3,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2,2}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,1,1,1,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,5,1,2,0,4,5,6}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,3,5,6,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1}, 14);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,3,2,1,1,2,3,2,1,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3,3}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,11,17,17,20,12}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,3,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,6}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,3,3,1,2,3,2,1,2,3,2,16}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,3,1,0,1,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0,1,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,9,3,2,1,0,9,1}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2,2}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,2,1,2,3,2,1,2,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,-1,4,5,0}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,4,5,3,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,3}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,4}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,21,5,6,4}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,14,17,17,20,12,8}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,1,0,4}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,5,0}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,-1,2,1,2,0,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,1,2,3,1,16}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,20,2,3,2,2,3,3}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,12,1,1,1,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,30,1,3,2,3,4,2,1,7,2,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7}, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,5,1,31,3,2,1}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,15,5,1,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,8,10,16,19,31,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,14}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,4,6,5,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,42,3,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,1,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1,0}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,1,2,3,2,1,22}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,2,1}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,6,3,5,7,9,7,5,3,1}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,4,5,6}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,1,2,3,2,1,2,2,2,3}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4,4}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,13,17,17,20,12,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,8,10,16,19,31,20,20}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,7,17,18,20,12,6}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,1,2,3,2,2,3,3,3}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,1,0}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,3}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0,2,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,2,1,2,3,1,2,3,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,1,4,5,6}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,1,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,2,3,4,5,6}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,21,7,5,1,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,1,11,2,3,2,1,7,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4,4,4}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,3,1,5,5}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,2,1,1,2,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {10,2,2,1,0,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1,7}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,7,2,3,4,5,6}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,2,3,4,5,3}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,2,1,1,2,1,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,31,1,2,3,1,0,1,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,30,1,3,2,3,2,1,7,3,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,2,3,2,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,3,2,1,1,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,30,3,1,0,1,1,1}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,0}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,4,5,6,2}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,2,3,1,2,3,2,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,31,3,1,2,1,0,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,1,2,1,0,0}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,1,2,3,-1,2,1,2,0,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,1,4,5,6}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,0}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1,0,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,5,6}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,2,1,1,2,1,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,2,3,4,5,6}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1,3}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,18,16,7,0}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,4}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,15,3,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,5,6,1}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,17,10,12,13,17,20,12}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,2,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,1,3,3,2,1,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,4}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,29,1,2,1,0,4,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,3,2,2,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,5,6}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,2,3,2,16}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,2,3,2,1,2,3,2,2,2}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,3,2,1,1,2,3,2,1,2,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,20,2,3,2,1,1,3,2,3,2,1,7,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,6,2,1,1,3,2,2,3,2,2,3,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,1,1,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0,2}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,3,4,5,3,3}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,2,1,2,3,1,2,3,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,3,2,2,3,2,16}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,3}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,13,17,20,12}, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,29,1,2,1,17,4,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,3,2,1,0,9,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,1,3,3,2,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0,2,2}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,0,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,16,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,2,3,2,0,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,31,1,2,3,1,1,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,3,2,1,1,1,1}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,2,1,1,4}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,3,2,0,1,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,3,3,2,1,0,7}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4,4,4}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,4,5,6}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,5,6}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,11,17,17,20,12}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,1,0,9,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,3,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,1,2,3,2,1,2,3,2,16}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,8,10,19,3,31,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,16,8,10,19,3,31,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,1,3,2,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,0,2,5,3,4,5,6}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,2,1,1,2,1,1,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {17,3,1,4,5,6}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,1,5}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,30,5,7,9,7,5,3,1,5}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {13,3,4,5,3}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,5,2,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,18,20,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,2,3,2,1,2,2,2,2}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,3,5,7,9,7,5,3,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,5,5,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,31,3,2,1,0,1}, 18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,5,8,10,12,16,18,20}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7}, 21);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,3,6,5,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,1}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,3,5,6,3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {15,3,-1,4,5,0}, 13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,-1,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,14,3,4,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,5,3,4,5,6}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1,2,3,2,1,2,3,2,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,3,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,5,4}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,15,5,1,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,0,1,0}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,1,0}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6,5}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0,2}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,4,5,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,1}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,6}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,31,1,0}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,13,1,0,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,3,1,5,5,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,1,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,2,1,16}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,4,4,5,30}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,4,16,6,10,14,17,17,20,12}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,5,7,9,7,5,3,13,1,5}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,4,6,5,3}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,5,6,5}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,1,5}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,2,4,5,6}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,3,2,2,3,2,16}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,30,1,3,2,3,2,1,7,3,2}, 18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,30,3,7,9,7,5,3,1,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,7,3,2,1,1,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,1,2,1,0,0,0}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,3,2,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,0,2,18}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1,1}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,-1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,5,5,5,5}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,3}, 29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,1,1,3,2,1,0}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,2,3,2,1,2,2,1}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,8,10,16,19,31,20}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,5,6,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,5,8,10,12,16,18,20}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,5}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,4,5,6,2}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,0,1}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,5,1,31,3,2,1,31}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,6,1,2,2}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,6,2,1,1,3,2,2,3,2,2,3,2}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,2,3,2,1,2,2,1,2}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,15,3,2,1,0,1}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,13,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,1,4,5,6,2}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4,7,0}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,3,2,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,18,19,0}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,2,2,1,1}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,18,16,7,0,16}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,0,1}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,30,3,7,9,7,5,3,5}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,1,2,3,2,16}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,1,3,2,1,1}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,0,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,1,0}, 18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,1,2,2,1,2,3,2,1,2,3,2,2}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,8,10,12,14,16,18,21,16}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,4,5,5,3}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,1,1,1}, 42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {10,2,2,1,0,2}, 11);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,3,3,4,29,2,1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,1,1,1}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,6,4,6,8,10,12,16,18,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,1,1,3,2,5,1,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,5,3,4,5,6,-1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,3,4,5,3}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,15,2,11,2,1,-1}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,1,2,3,1,16,3}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,4,4,5,6}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,7,2,3,4,5,6}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {20,2,4,6,8,10,12,13,17,17,20,12,2}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,30,2,1,0,1,0,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,1,1,0}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,5,6,8,10,30,14,17,17,20,12,10}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,2,0,2,18}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,1,2,5,1,31,3,2,1,31,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,7,2,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1,2,1,0}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,0,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,6,18,8,10,16,18,31,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,3,2,1,-1,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,3,1,1,4}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,4,5,5,2}, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,2,3,2,0,1,2}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {19,4,8,10,12,14,16,18,21,16}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,3,3,2,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,14,15,4,4,5}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,9,7,5,3,1,3,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,17,20}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,17,18,12}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1,1,2,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,31,1,2,3,1,0,1,1,2}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,2}, 17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {14,2,4,5,3,3,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,9,1}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,6,2,3,4,5,6,2}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,1,2}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,1,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3,3,3,15,1,0,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,3,2,1,0}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,4,2,5,3,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,11,17,17,10,20,12}, 22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {7,2,5,5,5}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,17,1,2,1,16,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,1}, 15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,5,2,1,0,2,2,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {0,2,2,2,1,2,3,2,1,2,3,2,3,2}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,3,1,2,3,2,1,2,9,1,16,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,18,16,7,12,16,16}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,31,1,2,3,1,1,1}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 10);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10,10,10,10}, 100);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {10}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {}, 1);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2}, 3);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,5,2}, 10);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,4,7,9,7,5,3,1,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,2,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0,0,0}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,1}, 18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,3,2,1,2,3,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,1}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,10,2,4,3,2,1,4}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,2,3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,6,8,10,12,14,16,18,20}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,14,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,3,2,1,4,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,2,2}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,14,3,2,1,2,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,3,2,1}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,4,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,3,2,1,2,3,2,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,3,2,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,3,2,1,0}, 8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,3,2,1,2,3,2,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {2,4,6,8,10,12,14,16,18,20,14}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,4,4}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,3,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,6,8,10,12,14,16,18,20}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {6,1,3,5,4,7,9,7,5,3,1,5}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,3,3,4,4}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,18,3,2,1,4,3,2,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,2,4,4}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {8,1,3,5,7,4,9,7,5,3,1,5}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,3,3,4,4}, 11);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,2,4,4}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,3,2,1,2,3,2,1}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,3,1,5}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,6,8,10,12,14,16,18,20}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,12,2,3,2,4,4}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6,2}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,4,5,6}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,3,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,2,1,2,3,2,1,3,2,1,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,8,2,3,2,1,3,2,1,2,3,2,1,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,6,8,10,12,14,18,11}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1,1,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,4,5,6,2}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,18,3,3,2,1,2,3,2,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1,1,3}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,5,7,9,7,5,3,1}, 30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,3,2,1,2,4,2,2}, -1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1,1}, 31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,3,2,1,2,3,2,1,3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,4,5,6,2}, 20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,3,3,4,4}, 18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,2,3,2,1,2,3,2,1}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,2,1,2,3,2,1,2,19,2,3}, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3}, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,1,8,2,3,2,1,3,2,1,2,3,2,1}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {4,6,8,10,12,14,16,18,20,12}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,1,2,3,2,1,2,2,2}, 0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,2,1,2,3,2,1,2,3,2,1}, 19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,30}, 14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,4,5,6,2}, 21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,3,5,7,4,9,7,5,3,1,5}, 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {30,2,3,2,4,4}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,14}, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,2,3,2,7,2,3,2,1,2,2,2,2}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1,8,2,3,2,1,3,2,2,1,2,3,2,1}, 12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}

