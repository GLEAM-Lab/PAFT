package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_COMMON {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,3,34,653,2,5}, new int[] {5,7,1,5,9,653,121}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,653}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,3,2,8}, new int[] {3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,2,8}, new int[] {3,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,2,8}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,3,3}, new int[] {2,2,3,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,10}, new int[] {5,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,3,3,3,4}, new int[] {1,3,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2}, new int[] {1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,9,2,1,2}, new int[] {1,9,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3}, new int[] {1,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,5,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,3,3,4,4}, new int[] {2,2,3,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,3}, new int[] {5,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {1,2,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-50,59,-37,5}, new int[] {-50,59,-37,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-50,-37,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,9,2,2,1,2}, new int[] {1,9,2,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,9,5,6}, new int[] {1,3,9,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,2,3,4}, new int[] {5,1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,2,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-50,59,3,5}, new int[] {-50,59,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-50,3,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,5,3,1,1}, new int[] {1,2,2,3,5,3,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,2,2,1,2}, new int[] {9,2,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,3,4}, new int[] {1,5,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,5,3,1}, new int[] {1,2,2,3,5,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,7,8}, new int[] {6,9,8,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,59,3,4}, new int[] {1,2,59,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,4,5,4}, new int[] {1,2,3,4,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,10}, new int[] {10,5,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-50,59,3,5,3}, new int[] {-50,59,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-50,3,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,1,2,3,4}, new int[] {5,1,1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,2,3,4,4}, new int[] {5,1,2,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,3,4,2}, new int[] {1,1,2,3,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,10,10}, new int[] {1,4,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,7,8}, new int[] {6,8,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,9,2,1,2,2}, new int[] {1,9,2,1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,7,7,3,8,9}, new int[] {6,9,8,7,7,3,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,7,8,8}, new int[] {6,9,8,7,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,10,1}, new int[] {1,4,10,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,59,5,4}, new int[] {1,59,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,3,10,1}, new int[] {1,4,3,10,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,4,10}, new int[] {7,4,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,1}, new int[] {1,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,2,1,2,2}, new int[] {9,2,1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,10}, new int[] {1,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,59,3}, new int[] {5,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11}, new int[] {10,5,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,2,3,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,59,2,3,5,3,1}, new int[] {1,59,2,3,5,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5}, new int[] {10,5,6,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,3,4,3,4}, new int[] {0,2,3,4,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,10,10,4}, new int[] {1,4,10,10,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,10,10}, new int[] {0,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,3,4,4,5,4,3}, new int[] {1,3,2,3,4,4,5,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,2,3}, new int[] {1,5,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,9,5,6}, new int[] {1,10,9,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9}, new int[] {7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,2,59,3}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,5}, new int[] {1,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,3,4,0,3,3,4}, new int[] {1,3,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1,2,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-50,59,-37,5,59}, new int[] {-50,59,-37,5,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-50,-37,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,1,3,2,3,8,1,4}, new int[] {3,5,1,3,2,3,8,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,5,3,1,2}, new int[] {1,2,2,3,5,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {59,-37,5,59,59}, new int[] {59,-37,5,59,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-37,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1}, new int[] {1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-51,59,-52,59,-37,5}, new int[] {-51,59,-52,59,-37,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-52,-51,-37,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,3,4}, new int[] {1,2,3,4,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,5,3,59,3,1,2}, new int[] {1,2,2,3,5,3,59,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,10,10,10}, new int[] {1,10,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,9,2,2,1,2,2}, new int[] {3,1,9,2,2,1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,3,9,5,6,5}, new int[] {7,3,9,5,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {1,2,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,5,11,6}, new int[] {1,10,5,11,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,9,6,6}, new int[] {1,9,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,1,59,3,4}, new int[] {2,2,1,59,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,59}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,4}, new int[] {1,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11}, new int[] {1,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,-51,10}, new int[] {0,-51,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-51,0,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,9,9}, new int[] {1,4,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,5,11,6}, new int[] {10,5,11,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {4,5,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9}, new int[] {10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,8,9,10}, new int[] {6,8,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,8,9,10}, new int[] {6,9,8,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,1,1,2,2,2,3,3}, new int[] {9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {4,5,6,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {4,5,7,6,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,5}, new int[] {1,1,1,2,2,2,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,4}, new int[] {1,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {4,5,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,5}, new int[] {4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,1,1,2,2,2,3,3}, new int[] {1,3,1,1,2,2,2,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,4,8,9}, new int[] {1,2,3,5,6,4,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,1,8,9}, new int[] {1,11,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,5}, new int[] {9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,3}, new int[] {1,2,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,5,7,8,9}, new int[] {10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,7,6,5}, new int[] {9,8,9,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,4}, new int[] {1,2,3,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,2,1}, new int[] {1,2,3,4,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9}, new int[] {1,2,3,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,9,4,5,2}, new int[] {2,3,9,4,5,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,4}, new int[] {8,2,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,9,10}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,10}, new int[] {9,6,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11,5,5,5}, new int[] {1,11,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2}, new int[] {1,2,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,1,2,2,2}, new int[] {1,1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,2,3,6,8,9}, new int[] {1,5,2,3,6,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,6,8,9}, new int[] {1,2,3,6,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,1,8,9}, new int[] {1,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,3,9,4,5,4}, new int[] {2,2,3,9,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,6,9,2}, new int[] {1,2,3,6,9,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,5,5}, new int[] {9,8,7,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,9,7,7,10,6}, new int[] {9,9,9,7,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5,3}, new int[] {1,2,6,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11,5,5}, new int[] {1,11,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,10,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,4}, new int[] {2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2}, new int[] {4,5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,10}, new int[] {8,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,4,5,6,5,7,8,9}, new int[] {10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,8,9,10}, new int[] {7,7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,2,2}, new int[] {1,1,3,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,4,3}, new int[] {8,2,3,4,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,4}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4}, new int[] {4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,1,2,2,2,2}, new int[] {1,1,2,1,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2}, new int[] {1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,3}, new int[] {1,2,3,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,8,4,5,4}, new int[] {1,2,3,8,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,12,12}, new int[] {10,3,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,10,2,6,4,4}, new int[] {2,10,2,6,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,6,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,8}, new int[] {2,2,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10}, new int[] {8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,8,9,9,10,10}, new int[] {8,7,8,9,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,1,1,1,2}, new int[] {11,1,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,3,2,2}, new int[] {1,7,3,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11,5,6,5,5}, new int[] {1,11,5,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,10,9}, new int[] {8,9,9,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,1,1,2,2,2,3,3,3}, new int[] {9,8,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {1,1,3,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,10,11,12}, new int[] {4,10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,11,4}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,10}, new int[] {7,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2}, new int[] {1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,11,5}, new int[] {1,2,3,4,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,10}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,10,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,1,10,10,9,10}, new int[] {8,9,1,10,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,10,10}, new int[] {7,8,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,8,7,7,10,6}, new int[] {9,9,8,7,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,1,2,3,4,5,8,6,5,7,8}, new int[] {10,11,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,10,9,10}, new int[] {8,9,9,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,5}, new int[] {2,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-45,34}, new int[] {35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,2,3,3,3,2}, new int[] {1,1,1,2,2,2,2,3,3,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,6,9,2,1}, new int[] {1,2,3,6,9,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,2,2}, new int[] {1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {1,1,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3}, new int[] {3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,9,4,4}, new int[] {2,9,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,6,5,7,7}, new int[] {8,9,7,6,5,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,5,3,4,3}, new int[] {1,12,5,3,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,10,12}, new int[] {4,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,3}, new int[] {3,4,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,8,7,10,6}, new int[] {9,9,8,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,7,7,6,5,5}, new int[] {9,7,7,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,4,2,2}, new int[] {1,2,3,4,4,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,6,5,3,7}, new int[] {8,9,7,6,5,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4}, new int[] {7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,8,4,5}, new int[] {1,2,3,8,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,9,9,7,7,10,6}, new int[] {7,9,9,9,7,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10,10,9}, new int[] {8,9,10,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,1,10,10,9,10,9}, new int[] {8,9,1,10,10,9,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,3}, new int[] {12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,35,3}, new int[] {0,35,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,0,4,1,2,2,2,2,1}, new int[] {1,1,2,1,0,4,1,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9}, new int[] {8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,3,6,9,2,1}, new int[] {2,2,3,6,9,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,1}, new int[] {1,2,3,4,5,6,7,8,9,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,9,2}, new int[] {1,2,3,9,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,1,2,2,2,2,1}, new int[] {1,1,2,1,1,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2}, new int[] {1,1,1,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,36,3}, new int[] {0,36,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,1,2,3,12,10,8,9}, new int[] {11,1,2,3,12,10,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,8,9,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,8,10}, new int[] {6,9,8,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,3,10}, new int[] {8,8,9,3,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,12,12}, new int[] {3,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,2,1}, new int[] {1,2,4,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {35,2,6,10,4,5,3}, new int[] {35,2,6,10,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,6,10,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2,2,4}, new int[] {1,3,2,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,2,1,1}, new int[] {1,2,3,4,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,10,9,7}, new int[] {7,9,10,9,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,8,9,10,10}, new int[] {7,7,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,8,10}, new int[] {8,8,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,5,3,3}, new int[] {9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,4,9,3}, new int[] {8,2,3,4,4,9,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,8,7,6,10,9}, new int[] {9,9,8,7,6,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,2,2,2,4}, new int[] {1,1,3,2,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,9,9,9,7,7,9,6}, new int[] {8,7,9,9,9,7,7,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,6,9,2,1,1}, new int[] {1,2,3,6,9,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,2}, new int[] {1,1,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2}, new int[] {2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,12,3,4}, new int[] {4,12,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,4,4}, new int[] {1,2,3,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,9,9,8,9,7,7,9,6}, new int[] {8,7,9,9,8,9,7,7,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,0,1,2,2,2,2,1,2}, new int[] {1,1,2,1,0,1,2,2,2,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,-45,12,34}, new int[] {34,-45,12,34}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,12,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2}, new int[] {1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-1,3}, new int[] {-1,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,10,10,10}, new int[] {7,8,9,10,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,8,12}, new int[] {1,2,3,2,8,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,10,-45,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,12,12}, new int[] {4,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,1,2,2,4}, new int[] {34,1,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,5}, new int[] {3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,1,2,2,2,2}, new int[] {1,4,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,-45,12,34,12}, new int[] {34,-45,12,34,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,12,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,2,3,3,3,2}, new int[] {1,1,1,2,2,2,3,2,3,3,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,7,7,7,1,5}, new int[] {9,7,7,7,1,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {35}, new int[] {35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,2,3,12,12}, new int[] {3,2,3,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,10,10,9}, new int[] {7,8,9,10,10,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,10,12,10}, new int[] {4,10,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,8,11,12,10}, new int[] {5,4,8,11,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,8,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,12,7,8,9,10,7}, new int[] {6,12,7,8,9,10,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {35,1,2,4,2,1,4}, new int[] {35,1,2,4,2,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,12}, new int[] {10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,0,2}, new int[] {1,1,2,2,2,0,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,7,2,2,0,2,2}, new int[] {1,1,7,2,2,0,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {6,7,8,9,10,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,9,10}, new int[] {8,9,9,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,10,6}, new int[] {9,6,8,9,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,10,9}, new int[] {7,8,9,10,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,34,3}, new int[] {1,2,6,3,4,34,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,2,2,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,10,8}, new int[] {6,9,8,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,5,5}, new int[] {2,2,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,9,7,7,10,6,7}, new int[] {9,9,9,7,7,10,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,0,3,4,2,1,1}, new int[] {1,2,0,3,4,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,9,8,7,6,10,9}, new int[] {9,9,9,8,7,6,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,1,2}, new int[] {4,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,3,2,2,7}, new int[] {1,7,3,2,2,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,9,8,10,8}, new int[] {9,6,9,8,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,10,6,10}, new int[] {9,6,8,9,10,6,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,9,8,8}, new int[] {9,6,9,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,10,6,9}, new int[] {9,6,8,9,10,6,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,11,3}, new int[] {1,2,3,11,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,8,2,3,4,2,1}, new int[] {1,8,2,3,4,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,36,3,6,9,2,1,1}, new int[] {1,2,36,3,6,9,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,8,8}, new int[] {7,8,9,10,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8}, new int[] {1,2,3,4,5,6,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,2,12,3,12,12}, new int[] {3,2,12,3,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,36,9,10,6,9,9}, new int[] {9,6,36,9,10,6,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,9,10,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,3,1,1,1,2,2,2,3,3,3,2}, new int[] {4,3,3,1,1,1,2,2,2,3,3,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,9,9,9,7,7,10,9,6}, new int[] {8,7,9,9,9,7,7,10,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,4,5,4}, new int[] {6,7,8,9,10,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,1,2,2,4,4}, new int[] {34,1,2,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,12,2,4}, new int[] {4,12,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,7,2,1,2,0,2,2,0}, new int[] {1,1,7,2,1,2,0,2,2,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2}, new int[] {2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,1,2,3,4,5,8,6,5,7,8,8}, new int[] {10,11,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,12,2,4}, new int[] {5,4,12,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,2,2,2,3,2,3,3,3,2,2}, new int[] {2,1,1,2,2,2,3,2,3,3,3,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,9,8,11,12,10}, new int[] {5,4,9,8,11,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,8,9,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,7,1,1}, new int[] {1,1,1,2,2,2,7,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,0,10}, new int[] {8,8,9,0,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2,2}, new int[] {1,3,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,36,11,5}, new int[] {1,2,3,36,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,11,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,9,9,9,7,10,9,6,10}, new int[] {8,7,9,9,9,7,10,9,6,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,7,-45,7,6,1,5}, new int[] {10,7,-45,7,6,1,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,1,5,6,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,9,9,10,8}, new int[] {6,9,9,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {2,1,1,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1}, new int[] {1,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2}, new int[] {1,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,2,2,2,3,3,3,3,2,2}, new int[] {2,1,1,2,2,2,3,3,3,3,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {13,12,3}, new int[] {13,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,12,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,1,2,2,2,2,1,2,1}, new int[] {1,1,2,1,1,2,2,2,2,1,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,4,5,6,5,7,8,9}, new int[] {1,2,4,4,5,6,5,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-1,2}, new int[] {-1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,6,9,8,8}, new int[] {9,8,6,9,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,10,9,6,7}, new int[] {7,9,10,9,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,7,2,1,1}, new int[] {1,2,3,7,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3}, new int[] {1,1,2,2,2,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,3}, new int[] {8,2,3,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,9,10,10,10}, new int[] {8,9,9,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,6,12,7,8,9,0,7}, new int[] {7,6,12,7,8,9,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,6,7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4}, new int[] {7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,2,3,4,5}, new int[] {1,5,2,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,34,4,5,6,7,8,9}, new int[] {1,2,3,34,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,10,6,9,9,9}, new int[] {9,8,9,10,6,9,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,4,2,5}, new int[] {1,1,3,4,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,7,0,10}, new int[] {8,8,9,7,0,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,1}, new int[] {4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,6,7,8,9,1,1}, new int[] {1,2,3,4,6,7,8,9,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,1}, new int[] {1,12,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,8,3,2}, new int[] {3,5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,2,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9}, new int[] {1,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,7,2,2,0,2,2}, new int[] {1,1,1,7,2,2,0,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,9,2,9}, new int[] {1,2,3,9,2,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,10,7}, new int[] {6,7,8,10,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,5,6,7,4}, new int[] {4,5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {69,8,35,10,36,8,1,2}, new int[] {69,8,35,10,36,8,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,8,10,35,36,69}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,7,4,5,3,6,7,8,3}, new int[] {1,2,3,7,4,5,3,6,7,8,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,10}, new int[] {8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,35,12,12}, new int[] {1,35,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,12,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {13,2,5,5,5}, new int[] {13,2,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,4,5,6,7,8,9}, new int[] {1,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,8,3,2}, new int[] {3,5,6,7,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,8,2}, new int[] {1,1,8,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,6,5,3,4,3}, new int[] {1,6,5,3,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,7,8,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,3,2}, new int[] {3,6,7,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,2,9,2,2,4}, new int[] {1,1,3,2,9,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,9,8,8,9}, new int[] {9,6,9,8,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4}, new int[] {7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,3}, new int[] {3,5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,-1}, new int[] {5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,-45,4}, new int[] {4,5,8,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,3,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,8,7,6,5}, new int[] {8,9,8,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,10,4}, new int[] {8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,8,4,4}, new int[] {1,2,3,8,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,-45,4}, new int[] {4,5,8,6,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,36,9,9,7,7,9,6}, new int[] {8,7,36,9,9,7,7,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,10,10,9,10}, new int[] {8,1,10,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,3,4}, new int[] {12,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,8,8,7,6,10,9}, new int[] {9,9,8,8,7,6,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,5,5,3,5}, new int[] {1,12,5,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,-45,4}, new int[] {34,4,5,8,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,10,3}, new int[] {3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,6,12,7,9,0,7}, new int[] {7,6,12,7,9,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,6,7,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,5,6,5,7,8,9}, new int[] {10,11,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,2}, new int[] {8,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,10,10,10,10}, new int[] {8,9,9,10,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3}, new int[] {1,1,2,2,2,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {12,5,6,7,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,8,11,12,10}, new int[] {5,8,11,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,8,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,7,7,6,1,5}, new int[] {7,9,7,7,6,1,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,11,9,4,5,2}, new int[] {2,3,11,9,4,5,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,9,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,7,7,6,6,8}, new int[] {5,7,7,6,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,34,4,5,6,7,9,9,7}, new int[] {2,3,34,4,5,6,7,9,9,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,6,7,9,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2}, new int[] {1,1,1,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10,7,8}, new int[] {8,9,10,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2}, new int[] {1,1,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,2,2,0,2,2}, new int[] {1,7,2,2,0,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,1,3,2,4,2}, new int[] {9,1,3,2,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,1,4}, new int[] {4,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,1,2,3,4,4}, new int[] {34,1,2,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,3,4}, new int[] {2,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,11,10,8}, new int[] {6,9,8,11,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,10,9,10}, new int[] {9,6,8,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,8,9}, new int[] {6,8,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,6,7,4}, new int[] {3,5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,10,3,10}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2,2,2}, new int[] {1,3,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,10,10,6,10}, new int[] {9,6,8,10,10,6,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,12,4,4}, new int[] {5,4,12,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,8,4}, new int[] {1,2,3,8,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4}, new int[] {7,8,9,7,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,9,34,9,10,8,9,9}, new int[] {6,9,9,34,9,10,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,6,5,7,7,6}, new int[] {8,9,7,6,5,7,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,3,1,1,1,2,2,3,3,3,2}, new int[] {4,3,3,1,1,1,2,2,3,3,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1,2,3,13,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10,6,10,9,9}, new int[] {8,9,10,6,10,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,4,5,4}, new int[] {6,7,8,9,10,7,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,7,7,10,6,7}, new int[] {9,9,7,7,10,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,3,2,2,5}, new int[] {0,3,2,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9}, new int[] {8,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,4,4,2}, new int[] {1,2,3,2,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,8,2}, new int[] {1,8,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,6,6,12,7,8,9,0,7}, new int[] {7,6,6,12,7,8,9,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,6,7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,3,9,2,9,9}, new int[] {9,3,9,2,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,1,2,2,2,2,1}, new int[] {1,4,1,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {36}, new int[] {36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,2,3,3,1,1,2,2,2,3,3,3,2,1}, new int[] {4,2,3,3,1,1,2,2,2,3,3,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,6,8,5,7,7}, new int[] {8,9,7,6,8,5,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4,1}, new int[] {7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,3}, new int[] {10,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,6,8,9,10,6,9}, new int[] {8,6,8,9,10,6,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,4,5,5}, new int[] {6,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7}, new int[] {2,1,1,4,2,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,7,11,12,10,8}, new int[] {4,7,11,12,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,7,8,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,70,2,3,2,4,4,2}, new int[] {1,70,2,3,2,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,70}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,6,7,8,9,10,7}, new int[] {2,1,1,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,8,9,2}, new int[] {1,2,3,5,6,8,9,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,4,2}, new int[] {1,3,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,4}, new int[] {1,3,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,69,10,7,8}, new int[] {8,69,10,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,10,69}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,2}, new int[] {8,2,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3}, new int[] {1,1,2,2,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,6,2,3,8,4,4}, new int[] {1,6,2,3,8,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,2,10}, new int[] {8,8,9,2,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {3,4,35,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,7,2,2}, new int[] {1,1,1,2,7,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,-1,7,8,9}, new int[] {6,-1,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,5,3,3}, new int[] {3,4,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,3,36,11,5}, new int[] {1,3,3,36,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,11,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,12,12,12}, new int[] {4,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,4,1,4}, new int[] {34,4,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,9,2,2,4}, new int[] {1,1,2,9,2,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3}, new int[] {4,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2,2,2,1}, new int[] {1,3,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,4,1,6,5,13,13,7,8,9,4}, new int[] {1,2,4,4,1,6,5,13,13,7,8,9,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,7,8,9,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,12}, new int[] {34,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,6,2,3,8,4,4,4}, new int[] {1,6,2,3,8,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,34,4,6,6,8,9}, new int[] {1,2,3,34,4,6,6,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,8,9,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {36,2,3,3,1,1,2,2,2,3,3,3,2,1}, new int[] {36,2,3,3,1,1,2,2,2,3,3,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,4,9,6,7,8,9,4}, new int[] {1,3,4,9,6,7,8,9,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,1,1,2,2,2,3,4,3}, new int[] {9,8,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,7,7,10,6}, new int[] {9,8,9,7,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,10,35}, new int[] {6,7,8,10,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,10,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7,9}, new int[] {2,1,1,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,1,1,2}, new int[] {11,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,5,3,3,4}, new int[] {3,4,5,3,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,2,3}, new int[] {2,3,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,2,12,3,12}, new int[] {3,2,12,3,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {35,5,7,8,7,6,6,8}, new int[] {35,5,7,8,7,6,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,12,3}, new int[] {12,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4}, new int[] {1,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,5,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,-45,10,9}, new int[] {8,9,-45,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,8,8,8,11,12,10,12}, new int[] {5,4,8,8,8,11,12,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,8,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,8,1,10,10,9,10}, new int[] {11,8,1,10,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,8,9,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,1}, new int[] {1,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,5,3}, new int[] {3,5,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,9}, new int[] {7,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,10,4,10}, new int[] {8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10,8,9}, new int[] {8,9,10,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,10,6,9,9,9,6}, new int[] {9,8,9,10,6,9,9,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,4,1,4}, new int[] {6,4,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,6,1,2,3,4,5,8,6,5,7,8}, new int[] {6,6,1,2,3,4,5,8,6,5,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,8,3,6,5,3}, new int[] {8,9,8,3,6,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,4,5,1}, new int[] {1,1,3,4,5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,2,3}, new int[] {3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,4}, new int[] {7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,10,2,6,4,4,6}, new int[] {2,10,2,6,4,4,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,6,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,9,9}, new int[] {9,8,9,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,6,8,5,7,7,5,6}, new int[] {8,9,7,6,8,5,7,7,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,1,4,1,4}, new int[] {34,1,4,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,7,2,1,1,2}, new int[] {1,2,3,7,2,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,3,1,3,10}, new int[] {10,3,1,3,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,9,3}, new int[] {8,2,3,4,9,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {4,6,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,10,6,10,6}, new int[] {9,6,8,9,10,6,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,8,7,7,11,6}, new int[] {9,9,8,7,7,11,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,36,9,9,10,6,9,9}, new int[] {9,6,36,9,9,10,6,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,9,10,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {70,6,7,36,9,10}, new int[] {70,6,7,36,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10,36,70}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,8,9,9,7,10,10}, new int[] {8,8,9,9,7,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,0}, new int[] {4,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5,3,2}, new int[] {1,2,6,3,4,5,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,-45,4}, new int[] {1,2,-45,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,1,2,2,2,2,2}, new int[] {1,4,1,2,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,35,9,10}, new int[] {8,9,9,35,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,6,7,4}, new int[] {5,6,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,10,8,6,7,6}, new int[] {7,10,8,6,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,1,5,2,1,2}, new int[] {1,4,1,5,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,7,10,7,9,8}, new int[] {6,7,8,9,7,10,7,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,4,5}, new int[] {2,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,7,5,7,9}, new int[] {8,9,7,5,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,4,1}, new int[] {1,2,3,2,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,3,2}, new int[] {3,6,7,69,5,4,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,9,8,9}, new int[] {9,6,9,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,4,2,5,4}, new int[] {2,1,1,4,2,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,-45,4,5,6,7,8,8}, new int[] {10,11,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,7,2,2,0,2,2,2}, new int[] {1,2,1,7,2,2,0,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,10,10}, new int[] {9,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,70,2,3,2,4,4,1}, new int[] {1,70,2,3,2,4,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,70}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,6,8,9,8,10,8,9,9}, new int[] {9,6,8,9,8,10,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,4,2,5,4,4}, new int[] {2,1,1,4,2,5,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,10,3,10}, new int[] {3,35,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,4,5,3}, new int[] {8,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,8,2,8}, new int[] {1,1,8,2,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {34,1,2}, new int[] {34,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,34}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,5,1,1,2}, new int[] {1,12,5,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,6,6,12,7,8,9,0,0,7}, new int[] {7,6,6,12,7,8,9,0,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,6,7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,9,9,10}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,7,3,2,2,7,1}, new int[] {1,7,3,2,2,7,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4,2,5}, new int[] {1,1,11,4,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,1,1,2}, new int[] {12,1,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,2,2,2,2,1,3}, new int[] {1,3,2,2,2,2,1,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,35,0,11,9,4,1,2,2,2,2,1}, new int[] {1,1,2,35,0,11,9,4,1,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,4,9,11,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,9,9,7,7,10,6,9}, new int[] {9,9,9,7,7,10,6,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,10,3,6,4,4}, new int[] {2,10,3,6,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,6,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,36,2,11,5,5}, new int[] {1,36,2,11,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,5,11,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,1,2,3,4,5,8,6,5,7,8,8}, new int[] {10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,2,1}, new int[] {1,1,1,2,2,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,6}, new int[] {3,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,35,5,1}, new int[] {1,1,3,35,5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,11,4,4}, new int[] {7,8,9,7,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,8,9,10,9}, new int[] {10,8,9,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,10,35,6}, new int[] {8,10,35,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,10,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,9,3,9,8,9,7,7,9,6}, new int[] {8,7,9,3,9,8,9,7,7,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,7,5}, new int[] {3,4,7,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,7,6,6,12,7,8,9,0,7}, new int[] {2,7,6,6,12,7,8,9,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,6,7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,9,9,10,10}, new int[] {8,9,9,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,6,5}, new int[] {3,5,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,7,6,1,5}, new int[] {7,7,7,6,1,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,9,10,7,7}, new int[] {7,8,9,10,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,4,3}, new int[] {1,2,6,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,10,9}, new int[] {8,9,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,2,2,2,2,3,3,3,2,2,1}, new int[] {2,1,1,2,2,2,2,3,3,3,2,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,1,5,2,1,2,1}, new int[] {1,4,1,5,2,1,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,1,4,2,6,5,4,4}, new int[] {2,1,1,4,2,6,5,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,4,5,4}, new int[] {1,2,3,2,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,8,2}, new int[] {8,2,8,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,0,3,4}, new int[] {1,2,0,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,2,3,6,9,9,2,1}, new int[] {9,2,3,6,9,9,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {36,2,3,3,2,1,1,2,2,2,3,3,3,2,1}, new int[] {36,2,3,3,2,1,1,2,2,2,3,3,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,36}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,1,1,2,2,2,3,3,3,3}, new int[] {1,3,1,1,2,2,2,3,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,2,-45,4}, new int[] {8,1,2,-45,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,1,2,4,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,12,8,8,4}, new int[] {8,12,8,8,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5,2,10,3,10,6,8,9}, new int[] {1,5,2,10,3,10,6,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,4,4}, new int[] {1,2,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,9,1,10,69,10,9,10}, new int[] {8,9,1,10,69,10,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,8,9,10,69}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,8,8,9,10}, new int[] {11,8,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,9,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,10,-45,3}, new int[] {10,10,-45,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-45,3,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,1,8,9}, new int[] {11,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,35}, new int[] {1,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,1,8,9}, new int[] {11,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,9,8,8,3,9}, new int[] {6,9,8,8,3,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3}, new int[] {3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {69,8,3,10,36,8,1,2}, new int[] {69,8,3,10,36,8,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,8,10,36,69}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,6,7,6,1,35,5,6}, new int[] {7,7,6,7,6,1,35,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,6,7,35}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,7,9}, new int[] {1,1,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,8,9,2}, new int[] {1,2,3,5,8,9,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,4,11}, new int[] {1,2,5,4,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,3,4,4,9,8}, new int[] {8,2,3,4,4,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {5,6,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,3,3}, new int[] {2,2,3,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,5,5}, new int[] {6,7,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,4,2}, new int[] {1,2,3,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,5}, new int[] {10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {1,1,1,2,2,2,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,5}, new int[] {6,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,1}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,99}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,4,6,5}, new int[] {9,8,7,4,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,10,5}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,6,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,1}, new int[] {1,1,1,2,2,2,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,5,6,7}, new int[] {4,5,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,3}, new int[] {5,4,3,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,7,5,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5}, new int[] {1,4,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {9,8,7,6,5,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9}, new int[] {10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5}, new int[] {6,5,8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,7,8,9,5}, new int[] {1,2,3,4,5,6,7,7,8,9,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,5}, new int[] {1,2,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,8}, new int[] {1,2,5,3,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3,1}, new int[] {8,7,6,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,2,2,1}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,4,5}, new int[] {1,2,5,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,5}, new int[] {10,11,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,11,7,8,9}, new int[] {1,2,3,4,5,6,11,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5}, new int[] {1,2,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,1}, new int[] {1,2,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,7,8,9,5,5}, new int[] {1,2,3,4,5,6,7,7,8,9,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,1,1,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,7,8,9,5,3,7}, new int[] {1,2,3,4,5,6,7,7,8,9,5,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4,5,5}, new int[] {6,7,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,2,3,12,3}, new int[] {5,1,2,3,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,4,5}, new int[] {6,7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,5,10,5}, new int[] {8,7,2,5,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,3,5}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,1,2,2,3,3,3}, new int[] {1,1,1,1,2,2,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,2,3,4,4,2}, new int[] {1,10,2,3,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,5}, new int[] {-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,7,9,8,12,9,10}, new int[] {6,7,7,9,8,12,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,0,8,9,3,5}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,3,6}, new int[] {1,12,3,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,6,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,5,5}, new int[] {6,7,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,3,4,5,6,7,8,9}, new int[] {1,2,99,2,3,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,1}, new int[] {1,2,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4}, new int[] {3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,6,2,3,4,5,5}, new int[] {1,6,2,3,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,4,5,1}, new int[] {6,7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,5,10,8,9,10}, new int[] {6,7,5,10,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,11,4,7,8,9,3,7}, new int[] {1,2,3,4,5,6,11,4,7,8,9,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,0,2,3}, new int[] {5,4,3,0,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,3,5,4}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,4}, new int[] {1,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,5,10,8,9,8,6}, new int[] {6,7,5,10,8,9,8,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5}, new int[] {6,5,8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,4}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,6}, new int[] {6,7,8,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,3,5,5,5,5}, new int[] {7,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,3,5,5,5,5}, new int[] {7,8,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,2,5}, new int[] {1,2,5,3,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,8,9,3,5,4}, new int[] {1,2,3,5,6,7,8,9,3,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,5,10,5,10}, new int[] {8,7,2,5,10,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,2,3,4,3,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,3,4,5}, new int[] {5,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,12,5}, new int[] {1,4,4,12,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5}, new int[] {1,2,6,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,10,10}, new int[] {6,7,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,9,9,10,10}, new int[] {6,7,8,9,9,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,5,5}, new int[] {6,7,8,9,10,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {11,8,7,6,5,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,0,2,2}, new int[] {5,4,3,0,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1,2,2,3,3,3,1,2}, new int[] {1,1,1,2,1,2,2,3,3,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,0,6,10,12}, new int[] {1,1,1,2,2,2,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,10,5,10,10,11}, new int[] {8,7,2,10,5,10,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,3}, new int[] {8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,3,2,3}, new int[] {5,4,3,2,3,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,5,5,5,5}, new int[] {12,7,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,6,4,3,0,2,3}, new int[] {5,6,4,3,0,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,4,5,1,2}, new int[] {6,7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,3,5}, new int[] {10,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,4}, new int[] {4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,8,9,3,5}, new int[] {10,12,12,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,9,9,9,10,10,10}, new int[] {6,7,8,9,9,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,11,5,6,7,8,9,3,5}, new int[] {10,12,12,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,5,6,8,7}, new int[] {4,5,6,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,11,4,7,8,6,8,3,7}, new int[] {1,2,3,4,5,6,11,4,7,8,6,8,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,11,9,10}, new int[] {6,8,11,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,5,6,7}, new int[] {3,5,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,3,4,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,6,-46,9,9,10,10}, new int[] {6,7,8,6,-46,9,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,4,5,6,7,7,8,9,5,3,7}, new int[] {1,2,4,5,6,7,7,8,9,5,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,5,5,10}, new int[] {8,7,2,5,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,12,3,6}, new int[] {5,1,12,3,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,6,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,2,1,4,5,5}, new int[] {6,2,1,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4,5,6,7,7,8,5,3,7}, new int[] {1,1,4,5,6,7,7,8,5,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,2,1,4,5}, new int[] {6,2,1,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1}, new int[] {9,8,7,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,1}, new int[] {4,1,2,3,9,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,2,1}, new int[] {4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,2}, new int[] {4,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,2,2,1}, new int[] {1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,5,3}, new int[] {4,5,6,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4,5,5}, new int[] {6,10,8,9,10,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4}, new int[] {0,5,6,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,1,2,1,3,5,5,5,5}, new int[] {7,8,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,5,10,8,10}, new int[] {6,7,5,10,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-46,9,8,7,6,10,5}, new int[] {-46,9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {-46,-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,6,10,5,9}, new int[] {9,8,7,6,6,10,5,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,5}, new int[] {6,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,2,8,2,1,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1,2}, new int[] {9,8,7,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5,4}, new int[] {1,4,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,3,2,3,3,3}, new int[] {1,1,1,2,2,3,2,3,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,3,3,3,1}, new int[] {1,1,2,1,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,8,5}, new int[] {1,2,5,3,8,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1}, new int[] {1,1,1,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,3,5,3,6,8,10}, new int[] {4,3,5,3,6,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5,6,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,3,5,4,5,6,7,8,9}, new int[] {1,2,99,2,3,5,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,4,4,12,5}, new int[] {3,1,4,4,12,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,3,0,5,5,5,5,1}, new int[] {1,2,1,3,0,5,5,5,5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,10,8,9,10,10}, new int[] {6,7,10,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,5,5}, new int[] {10,8,9,10,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,0,8,9,3,5}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,5,3,5}, new int[] {2,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,8,5,12,5,8}, new int[] {1,8,5,12,5,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,10,8,9,9}, new int[] {7,10,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,8,7,4,6,5}, new int[] {0,8,7,4,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,1,2}, new int[] {5,4,3,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,8,7,8,9,9,3,5,4}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,8,9,10,10,6}, new int[] {10,8,9,10,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,5,3}, new int[] {1,10,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,1,3,5}, new int[] {6,7,5,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,0,2,2,2,2}, new int[] {1,0,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-46,4,0,4}, new int[] {-46,4,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,0,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5,5}, new int[] {1,4,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,3,5,5,5,5}, new int[] {8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,5,5}, new int[] {5,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3}, new int[] {3,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,6,5}, new int[] {1,2,5,3,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1}, new int[] {1,1,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,5}, new int[] {5,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,12,12,12,10}, new int[] {10,12,12,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,-46,2,2,2}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,12,2,4,4}, new int[] {8,1,12,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,3,9}, new int[] {1,12,3,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,7,6,5}, new int[] {9,7,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,3,3,5,5,5}, new int[] {1,2,1,3,3,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,12,3}, new int[] {5,1,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,3,3,3,1}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,3,5,4,5,6,7,8,9,6}, new int[] {1,2,99,2,3,5,4,5,6,7,8,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,7,5,6}, new int[] {1,2,5,3,7,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,10,12}, new int[] {9,8,7,6,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,99}, new int[] {6,5,8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,4,6}, new int[] {1,1,1,2,2,2,3,4,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-46,1,4,4,5,5}, new int[] {-46,1,4,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,0,8,9,3,5}, new int[] {10,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,2,4,5,5}, new int[] {6,7,8,-46,10,10,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,6,4,3,-46,0,2,3,-46}, new int[] {5,6,4,3,-46,0,2,3,-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,0,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,0,6,6,10,5,9}, new int[] {9,8,0,6,6,10,5,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,5,6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,1,12,6,3}, new int[] {5,1,12,6,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,6,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,10,6}, new int[] {9,8,7,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,2,5,5,10}, new int[] {7,7,2,5,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,12}, new int[] {12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,1,2,1,3,5,5,5,5}, new int[] {8,99,7,8,10,9,11,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,0,8,9,3,5,9}, new int[] {1,2,3,5,6,7,0,8,9,3,5,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,-46,4,3,5,5}, new int[] {1,2,1,-46,4,3,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,10,12}, new int[] {1,1,2,2,2,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,6,4,3,-46,0,2,3,2}, new int[] {5,6,4,3,-46,0,2,3,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,0,2,3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,12,12,12}, new int[] {12,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,7,5,6,2}, new int[] {1,2,5,3,7,5,6,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,3,6}, new int[] {12,3,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,-46,3,2,3,2,3}, new int[] {5,-46,3,2,3,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,2,5,5,10,2}, new int[] {7,7,2,5,5,10,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,5,3,1}, new int[] {6,7,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,-46,7,6,10,12}, new int[] {9,-46,7,6,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,6,7,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,10,9,10,10,10}, new int[] {6,7,10,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5,1}, new int[] {1,4,4,5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,10,5,10}, new int[] {8,7,2,10,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,5,5,5}, new int[] {5,4,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3}, new int[] {9,8,7,6,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,9,4,4,4}, new int[] {1,2,9,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,5,3}, new int[] {4,1,5,6,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11,5}, new int[] {1,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,9,8,12,9,10}, new int[] {6,7,9,8,12,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,6,4,3,0,2}, new int[] {6,6,4,3,0,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,7,2,3,3,3,1,2}, new int[] {1,1,2,7,2,3,3,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,5,3,5}, new int[] {3,4,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,8,2,2,1,2}, new int[] {1,1,2,1,8,2,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1,2,2,3,3,3,2,2}, new int[] {1,1,1,2,1,2,2,3,3,3,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,3,4,5}, new int[] {5,4,3,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,6,4,6,10,5,9,0}, new int[] {9,0,6,4,6,10,5,9,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,3,4,5,6,7,8,9}, new int[] {10,11,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,5,12,5,8}, new int[] {9,8,5,12,5,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,2,3,4,4,1,3}, new int[] {1,10,2,3,4,4,1,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,4,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,5,5}, new int[] {6,7,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1,2}, new int[] {1,1,2,2,2,3,3,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,4,4,12,5,12}, new int[] {3,1,4,4,12,5,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,7,8,9,5}, new int[] {1,2,3,5,6,7,7,8,9,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,7,6,4,6,10,5,0}, new int[] {9,0,7,6,4,6,10,5,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,7,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-47,-46,-46}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,4,4,12,5}, new int[] {8,1,4,4,12,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,5,5}, new int[] {1,2,1,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1,3,2,2,3,3,3,2,99,2}, new int[] {1,1,1,2,1,3,2,2,3,3,3,2,99,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,2,5,5,10,4,2}, new int[] {7,7,2,5,5,10,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,5,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,7,8,8,9,9}, new int[] {12,7,8,8,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,2,1,4,5,5,5}, new int[] {6,2,1,4,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,13,3,6}, new int[] {12,13,3,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6,12,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,7,8,8,9}, new int[] {12,7,8,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,2,7,8,9}, new int[] {1,2,3,4,5,6,2,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,2,5,3,2,5}, new int[] {2,2,5,3,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,1,4,4,12,5,4}, new int[] {3,1,4,4,12,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,9,8,12,9,10,8,9}, new int[] {6,7,9,8,12,9,10,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,0,6,10,12}, new int[] {1,1,1,2,2,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4}, new int[] {1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,1,3,4,99}, new int[] {1,2,6,1,3,4,99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,-46,2,2,2}, new int[] {1,1,1,-46,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,4,5,6,7,8,9}, new int[] {1,2,99,2,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,7,8,9,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,6,4,3,2,0,2}, new int[] {6,6,4,3,2,0,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,-46,7,6,1,12,6}, new int[] {9,-46,7,6,1,12,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,6,7,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,7,8,13,8,9,10,10}, new int[] {6,7,8,13,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1}, new int[] {9,8,2,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,13,2,5,1}, new int[] {5,4,3,13,2,5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,3,2,5,3,3}, new int[] {1,2,5,3,2,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,4,6,5,8}, new int[] {9,8,7,4,6,5,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,2,2}, new int[] {3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,3,2,3,2,3}, new int[] {5,4,3,2,3,2,3,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3,1,1}, new int[] {1,1,1,2,2,2,3,3,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,5,6,5,5}, new int[] {5,4,5,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,9}, new int[] {1,2,6,3,4,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,6,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,12,6,7,8,9}, new int[] {1,2,3,4,5,12,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,3,4,12,5}, new int[] {8,1,3,4,12,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,8,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,1}, new int[] {1,2,4,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,11,4,7,8,6,8,3,7,1,6}, new int[] {1,2,3,4,5,6,11,4,7,8,6,8,3,7,1,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,10,11}, new int[] {7,8,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1,3,2,2,3,3,2,99,2,1,2}, new int[] {1,1,1,2,1,3,2,2,3,3,2,99,2,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,4,7,8,9,9,9,10,10,10}, new int[] {6,4,7,8,9,9,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-46,4,-1,0,4}, new int[] {-46,4,-1,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,-1,0,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-47,8,7,10,12}, new int[] {1,1,2,2,2,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,5,5,5}, new int[] {5,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,7,2,5,10,5}, new int[] {7,7,2,5,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5,11,5}, new int[] {1,4,4,5,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,2}, new int[] {1,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,12}, new int[] {6,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,5,8,9,10,10}, new int[] {6,5,8,9,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,5,6,7,7,7,7}, new int[] {1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,8,9,8,12,9,10}, new int[] {6,8,9,8,12,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,5,10,5,10,8}, new int[] {8,7,2,5,10,5,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,-1}, new int[] {3,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,10,5,12,6,7,8,9}, new int[] {1,2,3,4,10,5,12,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,9,5,10}, new int[] {8,7,2,9,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,-1,7,2,5,5,10,2}, new int[] {7,-1,7,2,5,5,10,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,2,5,7,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,6,7,8,9,3,5,4}, new int[] {1,2,3,4,6,7,8,9,3,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,12,12,12}, new int[] {10,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,2,1}, new int[] {1,2,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,2}, new int[] {1,1,1,-46,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {99,1,4,4,5,4}, new int[] {99,1,4,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,99}, new int[] {6,5,6,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,1,1,2,2,2,2}, new int[] {1,1,6,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,4,5,6,7,7,8,9}, new int[] {10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,3,5,6,7,0,8,9,3,5,6}, new int[] {1,2,3,3,5,6,7,0,8,9,3,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,11,12,11}, new int[] {10,11,12,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,5,6,5,5,5}, new int[] {5,4,5,6,5,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,13,2,5,1,13}, new int[] {5,4,3,13,2,5,1,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,-46,12,3,-46}, new int[] {1,-46,12,3,-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,4,5,6,7,7,5,3,7}, new int[] {1,1,4,5,6,7,7,5,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5,6,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,2}, new int[] {1,10,3,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,11,5,6,7,8,9,3,5,2}, new int[] {10,12,12,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,9,9,4,4,4,9}, new int[] {1,2,9,9,4,4,4,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,3,4,5,1,2}, new int[] {1,2,2,3,4,5,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,99,7,8,8,0,9}, new int[] {12,99,7,8,8,0,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,7,8,9,12,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,7,6,4,6,5,0,6}, new int[] {9,0,7,6,4,6,5,0,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,3,4,5,6,7,8,9,3,5}, new int[] {10,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,5,5}, new int[] {11,6,7,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,2,4}, new int[] {1,10,3,4,4,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,13,1,6,12,3}, new int[] {5,13,1,6,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5,6,12,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1,2,3}, new int[] {1,1,2,2,2,3,3,3,1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5}, new int[] {3,6,5,8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,0,6,6,10,5,9}, new int[] {7,8,0,6,6,10,5,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,5,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,5,4,5,5}, new int[] {12,5,4,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-46,1,4,4,5,5,1,1}, new int[] {-46,1,4,4,5,5,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,6,4,6,10,5,9,0,10}, new int[] {9,0,6,4,6,10,5,9,0,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,5,6,7,1,8,9,3,5,9}, new int[] {1,2,3,5,6,7,1,8,9,3,5,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,3,4,5,5}, new int[] {5,4,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,1,3,8,2,3,3,3,2,99,2}, new int[] {1,1,1,2,1,3,8,2,3,3,3,2,99,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,8,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,2,3,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,4,3,3,1}, new int[] {9,8,7,6,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,5,3,2,11,5}, new int[] {2,5,3,2,11,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,2,9,5,10}, new int[] {8,2,9,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,6,5,5}, new int[] {6,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,3,4}, new int[] {0,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,8,5,10,10,6}, new int[] {10,8,5,10,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,6,8,6,4,4,2,0,2}, new int[] {5,6,8,6,4,4,2,0,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,4,5,6,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,10,8,9,10,10,6}, new int[] {6,10,8,9,10,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {26,-2}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,3,5,5,5,5,1,1}, new int[] {1,1,3,5,5,5,5,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2,3,3}, new int[] {1,1,1,2,2,2,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,2}, new int[] {1,1,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,6,10,11,12}, new int[] {9,8,7,6,10,11,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,-1,3,9,7,4}, new int[] {4,-1,3,9,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,3,4,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,5,5}, new int[] {6,8,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,6,4,6,5,10,5,9,0,10}, new int[] {9,0,6,4,6,5,10,5,9,0,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,10,7,5,10}, new int[] {8,7,2,10,7,5,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,-46,7,6,10,12}, new int[] {8,-46,7,6,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,6,7,8,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,-46,2,2,2}, new int[] {1,1,-46,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-46,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,7,10,5}, new int[] {9,8,7,10,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,4,0}, new int[] {0,4,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4,4,5}, new int[] {4,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,1,1,1,2,2,2,2}, new int[] {1,1,7,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,-3,2,2,2,3,3,1,2}, new int[] {1,1,-3,2,2,2,3,3,1,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-3,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,13,2,5,3,8}, new int[] {1,13,2,5,3,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,8,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,2,5,3,2,5}, new int[] {7,2,5,3,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,5,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,2,4,5}, new int[] {1,2,2,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,5,7,5,-1}, new int[] {1,2,5,7,5,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-1,1,2,5,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,5,8,7,6,10,5}, new int[] {1,1,1,2,2,3,3,3,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,2,3,4,4,2}, new int[] {0,2,3,4,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,6,3,4,5,2}, new int[] {3,5,8,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,4,2,1}, new int[] {5,4,3,4,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,3,3,1}, new int[] {1,1,2,2,2,3,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,8,9,2,10,6}, new int[] {10,8,9,2,10,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,12,3,1}, new int[] {1,12,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,4,5,1,6,7,8}, new int[] {1,2,99,2,4,5,1,6,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,7,8,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,8,10,8}, new int[] {7,8,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,-2,3,3,1,2,3}, new int[] {1,1,2,2,2,3,-2,3,3,1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-2,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-47,4,4,5,4,4}, new int[] {-47,4,4,5,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-47,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,3,4,5,6,7,8,9,3,5}, new int[] {10,12,12,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {7,10,8,10,11}, new int[] {7,10,8,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,2}, new int[] {1,1,1,2,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,13,7,2,5,8,5}, new int[] {1,13,7,2,5,8,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,5,7,8,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,0,6,4,6,10,5,9,0,6}, new int[] {9,0,6,4,6,10,5,9,0,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,5,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,-3,3,4,5,6,7,7,8,9}, new int[] {10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,4,5,4}, new int[] {1,3,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,3,4,2,1,4}, new int[] {5,4,3,4,2,1,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {}, new int[] {1,2,3,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,4,4,5,4,1}, new int[] {1,4,4,5,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {12,2,99,2,3,5,4,5,6,7,8,9}, new int[] {12,2,99,2,3,5,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,4,5,6,7,8,9,12,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,4,5,6,8,7}, new int[] {5,4,5,6,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5,6,7,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,99,2,4,5,6,8,7,8,9,6}, new int[] {1,2,99,2,4,5,6,8,7,8,9,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,7,8,9,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,1}, new int[] {3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,11,5,7,8,9,3,5,2,2}, new int[] {1,2,3,11,5,7,8,9,3,5,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,5,7,8,9,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {8,7,2,5,10,5,10,10}, new int[] {8,7,2,5,10,5,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,5,7,8,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-3,6}, new int[] {-3,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-3,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,4,3,13,2,5,1,13,13}, new int[] {0,4,3,13,2,5,1,13,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,2,3,4,5,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,7}, new int[] {2,3,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,4,7,8,10,9,9,10,10,10}, new int[] {6,4,7,8,10,9,9,10,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,6,7,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {0,6,4,6,10,9,0,6}, new int[] {0,6,4,6,10,9,0,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,4,6,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,1}, new int[] {3,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,13,4,5,6,1}, new int[] {1,2,13,4,5,6,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,4,5,6,13}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,2,8,2,1,2,1}, new int[] {1,1,1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,2,2,3,2,3,3,1}, new int[] {1,1,2,2,2,3,2,3,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,11,5,11,5,11}, new int[] {1,11,5,11,5,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,5,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {-87,-50,26,-83,-1}, new int[] {-46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,2,3,2,5}, new int[] {3,2,3,2,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,-83,5}, new int[] {6,7,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,1,2,1,1}, new int[] {2,1,2,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,10,3,4,4,11,2,4}, new int[] {1,10,3,4,4,11,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {3,4,6,5,5}, new int[] {3,4,6,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4,5,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {9,8,9,7,6,10,12}, new int[] {9,8,9,7,6,10,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,7,8,9,10,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,1,4,-83,5}, new int[] {1,2,1,4,-83,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-83,1,2,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,2,3,1,3,5,5,5,5}, new int[] {8,12,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {11,1,2,3,4,5,6,11,4,7,8,6,8,3,7,6}, new int[] {11,1,2,3,4,5,6,11,4,7,8,6,8,3,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,4,5,6,7,8,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {6,5,8,-87,9,10,8}, new int[] {6,5,8,-87,9,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-87,5,6,8,9,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {10,8,10,11,11,8}, new int[] {10,8,10,11,11,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,10,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,3,5,6,7,8,9}, new int[] {10,11,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {2,3,4,5}, new int[] {6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,3,9,9,4,4,4,9}, new int[] {1,3,9,9,4,4,4,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,3,4,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {99,2,3,-50,1}, new int[] {99,2,3,-50,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-50,1,2,3,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,2,1,2,2,1}, new int[] {1,1,1,-1,2,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1,1,1,2,2,3,3,3,1,2,3}, new int[] {1,1,1,2,2,3,3,3,1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5,5,9,6,8,8}, new int[] {5,5,9,6,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,6,8,9}
        );
    }
}

