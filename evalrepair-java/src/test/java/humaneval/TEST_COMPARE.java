package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_COMPARE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,2,3,4,5,1}, new int[] {1,2,3,4,2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0,0}, new int[] {0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,2,3}, new int[] {-1,-2,-3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,2,3,5}, new int[] {-1,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0,0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1}, new int[] {0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50}, new int[] {12,22,32,42,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2,2,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,6,8}, new int[] {3,5,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-5,0,5}, new int[] {-2,-4,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400}, new int[] {100,202,301,400}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0}, new int[] {1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,6,8}, new int[] {-2,2,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,2,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30}, new int[] {20,10,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,10,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30}, new int[] {11,19,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-10,0,10,20}, new int[] {-12,1,8,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1,2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,100,30}, new int[] {10,100,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,2,6,8}, new int[] {-2,2,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,2,6,30,8}, new int[] {-2,2,6,30,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42,52}, new int[] {12,22,32,42,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1}, new int[] {1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,6,8}, new int[] {2,4,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30}, new int[] {10,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10}, new int[] {10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,20,30}, new int[] {19,19,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,1,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,52}, new int[] {12,22,32,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50,50}, new int[] {10,20,30,40,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30,8}, new int[] {-2,6,30,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42,52,12,42,42}, new int[] {12,22,32,42,52,12,42,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,100,30}, new int[] {9,100,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,20,30,29}, new int[] {4,20,30,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30}, new int[] {20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,30,12,29,30}, new int[] {4,30,12,29,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,202,301,400,301}, new int[] {100,202,301,400,301}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {99,202,301,400,301}, new int[] {99,202,301,400,301}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-5,0,5,5}, new int[] {-1,-5,0,5,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-12,1,1,19}, new int[] {-12,1,1,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30,7}, new int[] {-2,6,30,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30}, new int[] {-2,6,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,20,30}, new int[] {4,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,6,8,6}, new int[] {2,4,6,8,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1}, new int[] {0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-10,0,10,20}, new int[] {-10,0,10,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-1,0,0,0}, new int[] {0,-1,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30,8,8}, new int[] {-2,6,30,8,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,100,30,30}, new int[] {9,100,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,4,30,7}, new int[] {-2,4,30,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,201,301,400,301,202,202}, new int[] {100,201,301,400,301,202,202}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {6,8,7}, new int[] {6,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,19,35,11}, new int[] {11,19,35,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,0,5}, new int[] {-1,0,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-5,0,5}, new int[] {-2,-3,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,19,35,19,19}, new int[] {19,19,35,19,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0,0,0}, new int[] {0,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-5,0,5,1,6}, new int[] {-5,0,5,1,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42,52,42}, new int[] {12,22,32,42,52,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30,30}, new int[] {-2,6,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,11,8}, new int[] {2,4,11,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,201,301,400,301,202,202,201}, new int[] {100,201,301,400,301,202,202,201}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,6,30,8,-2}, new int[] {-2,6,30,8,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,19,35,35}, new int[] {11,19,35,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,6,0,5,5,-1}, new int[] {-1,6,0,5,5,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-4,4,6,8}, new int[] {-4,4,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,202,0,0,0,0,0}, new int[] {0,202,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,20,30}, new int[] {0,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,19,19,35}, new int[] {8,19,19,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,30,29,30}, new int[] {4,30,29,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {3,0,0,0,0,0}, new int[] {3,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,19,19,19,19}, new int[] {19,19,19,19,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,32,42,52,12,42,42}, new int[] {12,32,42,52,12,42,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,4,19,19,19,19}, new int[] {19,4,19,19,19,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,11,8,2,2}, new int[] {2,4,11,8,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,6,30,8,-2}, new int[] {-1,6,30,8,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0}, new int[] {0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,0,1}, new int[] {0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,20}, new int[] {20,30,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,19,19,19,20,19}, new int[] {19,19,19,19,20,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,4,42,31,4,4}, new int[] {-2,4,42,31,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,4,30,7,4}, new int[] {-2,4,30,7,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-4,100,30}, new int[] {-4,100,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,30,11,8,2,2,30}, new int[] {2,30,11,8,2,2,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,35,11}, new int[] {20,35,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {6,8,7,8}, new int[] {6,8,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,10}, new int[] {10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,6,0,5,5,-1,0}, new int[] {-1,6,0,5,5,-1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42,52,12,42}, new int[] {12,22,32,42,52,12,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,20,30,-2}, new int[] {4,20,30,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,20,20}, new int[] {20,30,20,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,202,301,300,301}, new int[] {100,202,301,300,301}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {200,3,6,8}, new int[] {200,3,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,100}, new int[] {10,100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-1,-3,0,0}, new int[] {0,-1,-3,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,30,6,8,4}, new int[] {2,4,30,6,8,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,0}, new int[] {1,1,1,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,6,201,8,6}, new int[] {4,6,201,8,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,5}, new int[] {0,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,202,0,0,1,0,-1}, new int[] {0,202,0,0,1,0,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,20,30,20}, new int[] {20,30,20,30,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,19}, new int[] {19,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42}, new int[] {12,22,32,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,6,8}, new int[] {4,6,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-12,0,8}, new int[] {-12,0,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,-1,0,5}, new int[] {12,-1,0,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,22,32,42,52,13,12,42,52}, new int[] {12,22,32,42,52,13,12,42,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,10,100}, new int[] {11,10,100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,1,1,1,1,0}, new int[] {-1,1,1,1,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,10,11}, new int[] {7,8,9,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1}, new int[] {0,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,17,25}, new int[] {11,20,10,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,1,3,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,72,48}, new int[] {56,59,70,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500}, new int[] {10,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {90,180,270,360,450}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50}, new int[] {11,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0,0}, new int[] {-1,-2,1,-1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,1,1,2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {5,10,15,20,30}, new int[] {4,9,15,21,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,0,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20}, new int[] {18,39,10,47,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,4,5,2,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500}, new int[] {90,180,310,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,20,10,20,100}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20}, new int[] {18,39,14,47,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,4,1,2,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50}, new int[] {11,20,35,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0,5,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,8}, new int[] {11,20,35,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0,5,0,42}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,1,-2,-2,1,-2,-1}, new int[] {-1,-2,1,-2,-2,1,-2,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50}, new int[] {10,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,25}, new int[] {11,20,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,1,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20}, new int[] {25,35,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,6,10,11}, new int[] {7,8,9,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,3,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,-2,1,-2,-2,1,-2,-1,1,-2}, new int[] {300,-1,-2,1,-2,-2,1,-2,-1,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500}, new int[] {100,200,300,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,50}, new int[] {60,10,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,20,10,14}, new int[] {0,20,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {600,7,10}, new int[] {600,7,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49}, new int[] {10,20,30,40,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,40}, new int[] {60,10,20,30,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49,40}, new int[] {10,20,30,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,11,49}, new int[] {20,30,11,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,6}, new int[] {0,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,11,49,30}, new int[] {20,30,11,49,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,35,50}, new int[] {11,20,35,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1}, new int[] {-1,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50,10}, new int[] {10,20,30,40,50,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49,50,40}, new int[] {10,20,30,40,49,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-2,72,48}, new int[] {56,59,70,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,61,2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,47,50}, new int[] {11,20,47,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,19,30,40,50,10}, new int[] {10,20,19,30,40,50,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,10,11}, new int[] {7,8,9,11,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,41,20,30,40,49,41}, new int[] {10,41,20,30,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,40,49,41}, new int[] {41,20,30,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,39,10,47,15,18}, new int[] {25,35,15,45,20,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,4,5,2,5,27}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,100,70,45}, new int[] {56,100,70,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,11}, new int[] {20,30,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49,50,40,50}, new int[] {10,20,30,40,49,50,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,6,6}, new int[] {-1,2,3,4,5,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-2,10,14}, new int[] {0,-2,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,0,0}, new int[] {56,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0,-1}, new int[] {-1,-2,1,-1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,1,1,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,11,30}, new int[] {20,30,11,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {600,7,54}, new int[] {600,7,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,11,400,500}, new int[] {100,200,11,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,20,10,14,10}, new int[] {2,20,10,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {500,100,200,300,400,500}, new int[] {500,100,200,300,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,45,20,35}, new int[] {25,45,20,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,40,59,49,42}, new int[] {41,20,30,40,59,49,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,90,4,5,6,4}, new int[] {0,2,3,90,4,5,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,14,45,20,49,14}, new int[] {25,35,14,45,20,49,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,500,5,6}, new int[] {0,2,3,500,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,1,-2,-2,-2,1,-2,-1}, new int[] {-1,-2,1,-2,-2,-2,1,-2,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,10,30,40,50}, new int[] {90,10,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,11,20,47}, new int[] {41,11,20,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,40,50}, new int[] {60,10,20,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,20,1,1,1,1}, new int[] {-1,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,18,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40}, new int[] {10,20,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,1,-2,-2,1,-2,-1,1,-2}, new int[] {300,0,-2,1,-2,-2,1,-2,-1,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49,40,30}, new int[] {10,20,30,40,49,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40}, new int[] {60,10,20,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,3,30,40,50,20}, new int[] {60,10,20,3,30,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,20,1,1,1,19,600,1,1}, new int[] {1,20,1,1,1,19,600,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,14,45,20,90,49,14}, new int[] {25,35,14,45,20,90,49,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,45,11,10,11,8}, new int[] {7,8,9,45,11,10,11,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,50}, new int[] {11,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,13,49,13,41}, new int[] {41,20,30,13,49,13,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,20,10,14,10,2}, new int[] {2,20,10,14,10,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,42,40,49,49,50,40,50,40}, new int[] {10,20,30,42,40,49,49,50,40,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,3,11,40}, new int[] {10,20,3,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,10,23}, new int[] {7,8,9,11,10,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,40}, new int[] {20,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,11,30}, new int[] {20,11,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,10,10}, new int[] {7,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,49,11}, new int[] {20,21,49,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,10,15,14,10}, new int[] {47,2,20,10,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,42,40,49,49,50,40,40,50,40}, new int[] {10,20,30,42,40,49,49,50,40,40,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,50,30}, new int[] {11,20,30,40,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,50,20}, new int[] {60,10,20,30,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50,40,50}, new int[] {10,20,30,40,50,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,10,15,14,10,10}, new int[] {47,2,20,10,15,14,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,2,20,10,15,14,10}, new int[] {13,2,20,10,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,9,11,10,23,23}, new int[] {7,9,9,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,11,49}, new int[] {30,11,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,8}, new int[] {7,8,9,11,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {500,100,200,300,400,500,400}, new int[] {500,100,200,300,400,500,400}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,10,20,30,40,49,40}, new int[] {11,10,20,30,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,40,49,41}, new int[] {41,30,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,19,200,1,1}, new int[] {1,1,1,1,19,200,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,14,10}, new int[] {47,2,20,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,1,-2,-2,-2,1,-2,-2}, new int[] {300,0,-2,1,-2,-2,-2,1,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,5,3,4,5,6}, new int[] {0,2,5,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,10}, new int[] {7,8,9,11,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,9,11,10,23,23,11}, new int[] {7,9,9,11,10,23,23,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,56,310,420,600}, new int[] {90,56,310,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,20,15,14,10}, new int[] {47,2,20,20,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,0,2,3,90,4,5,6,4}, new int[] {1,0,2,3,90,4,5,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,500,5,6,6}, new int[] {0,2,3,500,5,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,50,70,49,49}, new int[] {56,50,70,49,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,5,6,6}, new int[] {-1,90,3,4,5,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,30,21,50}, new int[] {90,30,21,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,19,30,59,42}, new int[] {41,19,30,59,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,11,11,9}, new int[] {8,11,11,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,40,40}, new int[] {60,10,20,30,40,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,600,2,5,3,4,5,6}, new int[] {0,600,2,5,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {501,0,2,3,500,5,6}, new int[] {501,0,2,3,500,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,310,11,30}, new int[] {20,20,310,11,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,19,30,42,40,49,49,50,40,50,40,40}, new int[] {10,19,30,42,40,49,49,50,40,50,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,16,47,15,18}, new int[] {18,10,16,47,15,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,11}, new int[] {20,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,180,56,310,420,600}, new int[] {90,180,56,310,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,6,40,50}, new int[] {11,20,30,6,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,6}, new int[] {-1,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,48,20,30,40,49,40}, new int[] {10,48,20,30,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,5,6,6,6}, new int[] {-1,2,3,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,5,6,6,6}, new int[] {-1,3,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,11,11,9,8}, new int[] {8,11,11,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,15,45,20}, new int[] {25,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,11,400,500,11}, new int[] {100,200,11,400,500,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,19,41,30,42,40,49,49,50,40,50,40,40}, new int[] {10,19,41,30,42,40,49,49,50,40,50,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,35,420,420}, new int[] {11,35,420,420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,13,20,3,11,40}, new int[] {10,13,20,3,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,20,15,15,14}, new int[] {47,2,20,20,15,15,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,40,49,41}, new int[] {30,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-2,10,14,14}, new int[] {0,-2,10,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,19,40,50,10}, new int[] {10,20,19,40,50,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,11,30,30}, new int[] {20,30,11,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,-1,100}, new int[] {20,-1,100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,39,30,13,49,13}, new int[] {41,39,30,13,49,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,48,20,30,40,49,40,49}, new int[] {10,48,20,30,40,49,40,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,10,10}, new int[] {10,30,40,50,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,14,45,20,14,35}, new int[] {25,35,14,45,20,14,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,40,49,41,41}, new int[] {41,20,30,40,49,41,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,48,9,20,30,40,49,40}, new int[] {10,48,9,20,30,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,4}, new int[] {-1,2,3,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1}, new int[] {-1,2,3,45,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1,2,44,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,29,49}, new int[] {11,20,30,40,29,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,5,6}, new int[] {-1,90,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,90,310,420,600}, new int[] {8,90,310,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,1,-2,-2,29,-2,1,-2,-2,-2}, new int[] {300,0,-2,1,-2,-2,29,-2,1,-2,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,2,3,6,4,5,4}, new int[] {-1,3,2,3,6,4,5,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,17,0}, new int[] {0,0,0,0,17,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {49,60,10,20,40,50}, new int[] {49,60,10,20,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {180,90,30,21,50}, new int[] {180,90,30,21,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,19,30,59,19,42}, new int[] {41,19,30,59,19,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,14,10,20}, new int[] {47,2,20,15,14,10,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {600,7,54,54}, new int[] {600,7,54,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40}, new int[] {10,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,29,1,-2,-2,29,-2,1,-2,-2,-2,-2,-2}, new int[] {300,0,-2,29,1,-2,-2,29,-2,1,-2,-2,-2,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,41,5,6,6,500}, new int[] {0,2,3,41,5,6,6,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,11,9,8,9}, new int[] {8,11,9,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {500,600,7,54}, new int[] {500,600,7,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,420,0,0,0}, new int[] {0,0,0,420,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,11,17,47}, new int[] {41,11,17,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,19}, new int[] {20,30,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,56,310,600,90}, new int[] {90,56,310,600,90}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,5,6,6,6,5}, new int[] {-1,3,6,5,6,6,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,8,11}, new int[] {7,8,9,11,8,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,8}, new int[] {10,20,30,40,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,13,20,3,11,11,40}, new int[] {10,13,20,3,11,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,14}, new int[] {47,2,20,15,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,40,59,49,42,49}, new int[] {41,20,30,40,59,49,42,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {3,11,49,9}, new int[] {3,11,49,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,19,40,50}, new int[] {10,20,19,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,100,70}, new int[] {56,100,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,500,10}, new int[] {10,30,40,50,500,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,3,30,31,40,50,20,30}, new int[] {60,10,20,3,30,31,40,50,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,30,11,49}, new int[] {4,30,11,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {49,60,10,20,40,51,50}, new int[] {49,60,10,20,40,51,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,11,36,420,420,36}, new int[] {47,11,36,420,420,36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,11,17,47}, new int[] {60,11,17,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,11,21,11,11}, new int[] {20,11,21,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,9,20,30,40,49,25,30}, new int[] {10,9,20,30,40,49,25,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,40,49,50,40}, new int[] {20,30,40,49,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,50,49,70,49,49,70}, new int[] {56,50,49,70,49,49,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,40,40,10,40}, new int[] {60,10,20,30,40,40,40,10,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,47,50,47,47}, new int[] {11,20,47,50,47,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,13,49,13,41,13}, new int[] {41,20,30,13,49,13,41,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,20,30,6,6,40,50}, new int[] {12,20,30,6,6,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,29,49,30}, new int[] {11,20,30,40,29,49,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,9,20,30,40,25,30}, new int[] {10,9,20,30,40,25,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,19,30,59}, new int[] {41,19,30,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,11,1,-2,-2,23,29,-2,1,-2,-2,-2,-2,-2}, new int[] {300,0,-2,11,1,-2,-2,23,29,-2,1,-2,-2,-2,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,42,40,49,49,50,40,40,50,40,40}, new int[] {10,20,30,42,40,49,49,50,40,40,50,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,20,30,40,49,25,30,9}, new int[] {12,9,20,30,40,49,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,60,17,47,41}, new int[] {41,60,17,47,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {40}, new int[] {40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,600,60,5,3,18,600,4,5,6}, new int[] {0,600,60,5,3,18,600,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {39,54,55,54}, new int[] {39,54,55,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {16,41,60,17,47,41}, new int[] {16,41,60,17,47,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,1,4,5,6}, new int[] {-1,3,1,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,13,49,13,41,13,13}, new int[] {41,20,30,13,49,13,41,13,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,10,11}, new int[] {10,30,40,50,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,49,40,30,49}, new int[] {10,20,30,40,49,40,30,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,48,9,20,30,55,49}, new int[] {10,48,9,20,30,55,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,36,420,41,13,36}, new int[] {11,36,420,41,13,36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,12,11,20}, new int[] {20,12,11,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,13,49,13,41,13}, new int[] {41,30,13,49,13,41,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,42,20,41,30,40,40}, new int[] {60,42,20,41,30,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,40,49,50,41}, new int[] {20,30,40,49,50,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,11,30}, new int[] {20,20,11,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {49,60,51,10,20,40,51,50}, new int[] {49,60,51,10,20,40,51,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {16,47,11,36,420,18,36,16}, new int[] {16,47,11,36,420,18,36,16}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,47,50,47,47,47}, new int[] {11,20,47,50,47,47,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {500,100,200,300,400,500,400,500}, new int[] {500,100,200,300,400,500,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,42,40,49,14,50,40,50,40}, new int[] {10,20,30,42,40,49,14,50,40,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,5,0}, new int[] {-1,2,3,5,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,14,45,20,14,35,35}, new int[] {25,35,14,45,20,14,35,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,5,6,6,6}, new int[] {-1,3,6,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,20,15,14,42,10,15}, new int[] {47,2,20,20,15,14,42,10,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,40,59,49,42}, new int[] {20,40,59,49,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,55,20,30,40,25,30,9}, new int[] {12,9,55,20,30,40,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,90,21,11,11}, new int[] {20,90,21,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,10,14}, new int[] {0,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,0,0,56}, new int[] {56,0,0,0,0,0,56}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,13,49,13,41,14,13}, new int[] {41,20,30,13,49,13,41,14,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,20,40,50}, new int[] {60,20,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,0,200,300,400,500}, new int[] {100,0,200,300,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {3,2,20,20,15,3,14,42,9,10,15}, new int[] {3,2,20,20,15,3,14,42,9,10,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,-2,1,-2,-2,200,1,-2,-1}, new int[] {-1,-2,-2,1,-2,-2,200,1,-2,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,40,40,40,60,40}, new int[] {60,10,20,30,40,40,40,60,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,11,19,30}, new int[] {20,20,11,19,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,39,40,30}, new int[] {60,10,20,30,39,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,39,20,30,40,25,30,9}, new int[] {12,9,39,20,30,40,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,10}, new int[] {20,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,11,9,8}, new int[] {11,11,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-2,72,48,-2}, new int[] {54,-2,72,48,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,11,419,36,420,420,36}, new int[] {47,11,419,36,420,420,36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,9,30,40,50}, new int[] {90,9,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,30,14,50,50}, new int[] {90,30,14,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,3,30,40,49,40,30,40}, new int[] {10,3,30,40,49,40,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,9,11,90,10,23,23,12,11}, new int[] {7,9,9,11,90,10,23,23,12,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,11,49,30}, new int[] {30,11,49,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,30,40,20,50,29}, new int[] {11,30,40,20,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,40,50,30}, new int[] {11,20,40,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,10,14}, new int[] {-2,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,10,13,20,3,11,40}, new int[] {19,10,13,20,3,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,13,49,40,13,41}, new int[] {41,20,30,13,49,40,13,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,55,20,30,40,25,30,9}, new int[] {9,55,20,30,40,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,300,9,10,11,10,23,23}, new int[] {7,300,9,10,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,9,11,10,10}, new int[] {8,9,11,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,16,25}, new int[] {11,20,10,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,1,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,10,30,40}, new int[] {90,10,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0}, new int[] {0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,16,35,25}, new int[] {13,23,9,16,35,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,14,14}, new int[] {47,2,20,15,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,12,50,10,11}, new int[] {10,30,40,12,50,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500,500}, new int[] {10,20,29,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {90,180,271,360,450,480}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,300,21,29}, new int[] {4,9,300,21,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {40,49,41,30}, new int[] {40,49,41,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,39,9,20,30,40,40,25,30,9}, new int[] {12,9,39,9,20,30,40,40,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {5,10,15,20,30,30}, new int[] {4,9,15,21,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,0,1,1,21}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,9,11,90,10,23,11,11}, new int[] {7,9,9,11,90,10,23,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,90,4,5,6,4}, new int[] {0,2,90,4,5,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,5,6,6,6,6}, new int[] {-1,5,6,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,56,420,600}, new int[] {90,56,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,21,20,30,14,49,13,41}, new int[] {41,21,20,30,14,49,13,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,54,500}, new int[] {100,200,54,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,42,40,49,49,50,40,400,40}, new int[] {10,20,30,42,40,49,49,50,40,400,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {101,200,11,400,600,11}, new int[] {101,200,11,400,600,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,48,9,20,49,30,55,49}, new int[] {10,48,9,20,49,30,55,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,50,10,14,0}, new int[] {0,50,10,14,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,4,5,0}, new int[] {-1,2,4,5,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50,50,40,50,40}, new int[] {10,20,30,40,50,50,40,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {31,10,48,9,20,30,55,49,20}, new int[] {31,10,48,9,20,30,55,49,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,14,42,10,15}, new int[] {47,2,20,15,14,42,10,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,90,3,5,6,4,2}, new int[] {0,2,3,90,3,5,6,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,55,20,30,40,48,30,9}, new int[] {9,55,20,30,40,48,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,29,0}, new int[] {56,0,0,0,29,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,501,10,15,14,10,10}, new int[] {47,2,20,501,10,15,14,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,10}, new int[] {10,30,40,50,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {101,599,-1,200,11,400,600,11}, new int[] {101,599,-1,200,11,400,600,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,11,10,10}, new int[] {7,11,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,5,6,-1}, new int[] {-1,90,3,4,5,6,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,300,9,10,35,11,10,23,23}, new int[] {7,300,9,10,35,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,25,9}, new int[] {13,23,9,25,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,40,40,40}, new int[] {10,20,30,40,40,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,20,40,49,25,30,9}, new int[] {12,9,20,40,49,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,399,500}, new int[] {10,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {90,180,270,359,450}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,0,2,3,90,4,6,4}, new int[] {1,0,2,3,90,4,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,11,20}, new int[] {9,11,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,20,12,20}, new int[] {13,20,12,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,55,54}, new int[] {54,55,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,40}, new int[] {10,30,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,400,6}, new int[] {-1,2,3,4,5,400,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,45,20}, new int[] {25,35,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,7,5,6,6,6}, new int[] {-1,3,6,7,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,40,49,17,41}, new int[] {41,20,30,40,49,17,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,41,20,30,42,40,49,41}, new int[] {10,41,20,30,42,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,42,10,11}, new int[] {10,30,40,42,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,4,-1}, new int[] {-1,2,3,4,5,4,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,48,0,17,0}, new int[] {0,0,0,48,0,17,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,42,0,0,0}, new int[] {0,0,0,0,42,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {500,100,300,60,400,500}, new int[] {500,100,300,60,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,12,50,10,11}, new int[] {10,30,12,50,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,13,49,13,12,41}, new int[] {41,30,13,49,13,12,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,17,20,20,15,15,14}, new int[] {47,17,20,20,15,15,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,-2,1,-1,-2,1,-2,-1,-1,1,-2}, new int[] {300,-1,-2,1,-1,-2,1,-2,-1,-1,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,50,49,70,49,49,70,70}, new int[] {56,50,49,70,49,49,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,51,15,45,20}, new int[] {25,35,51,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,11,90,10,23,23,12,11}, new int[] {7,9,11,90,10,23,23,12,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,30}, new int[] {20,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,20,10,15,14,10}, new int[] {47,20,10,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,41,20,30,40,49,41,30,40}, new int[] {41,41,20,30,40,49,41,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,21,29}, new int[] {4,9,15,21,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,11,14,11}, new int[] {11,20,10,11,14,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,59,12,10,23,7}, new int[] {7,8,59,12,10,23,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,39,20,30,40,25,30,9,39}, new int[] {12,9,39,20,30,40,25,30,9,39}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,600,60,5,3,419,18,600,4,5,6}, new int[] {0,600,60,5,3,419,18,600,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,20,30,40,50,20}, new int[] {60,20,30,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {16,41,60,17,47,41,41}, new int[] {16,41,60,17,47,41,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,36,11,10,23}, new int[] {7,8,36,11,10,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,29,399}, new int[] {56,0,0,0,29,399}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,29,399,29}, new int[] {56,0,0,0,29,399,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,40,51,50}, new int[] {60,10,20,40,51,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,180,40}, new int[] {20,30,180,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,54,40,49,40}, new int[] {10,20,54,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {21,10}, new int[] {21,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,5,6,6,6}, new int[] {-1,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,0,2,2,90,4,5,6,4,1}, new int[] {1,0,2,2,90,4,5,6,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,45,17,47}, new int[] {41,45,17,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-2,48,-2}, new int[] {54,-2,48,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,5,6,6,4}, new int[] {-1,90,3,4,5,6,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,-2,1,51,-1,-2,1,-2,-1,-1,1,-2}, new int[] {300,-1,-2,1,51,-1,-2,1,-2,-1,-1,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,-2,10,14}, new int[] {20,-2,10,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-1,90,3,5,6}, new int[] {-1,-1,90,3,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,39,30,40,25,30,9}, new int[] {12,9,39,30,40,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,-1,-2,1,-2,-2,200,1,-2,-1,-2}, new int[] {-1,-2,-1,-2,1,-2,-2,200,1,-2,-1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,11,23}, new int[] {7,8,9,11,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,35,51}, new int[] {20,35,51}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,10,13}, new int[] {0,10,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,310,420,600}, new int[] {90,310,420,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,40,8,20,10}, new int[] {10,11,20,40,8,20,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {24,10,20,30,40,49,40,30}, new int[] {24,10,20,30,40,49,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,20,1,14,0,2}, new int[] {2,20,1,14,0,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,600,40,599,49,25,30,11}, new int[] {12,9,600,40,599,49,25,30,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {16,41,60,17,41,17}, new int[] {16,41,60,17,41,17}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {31,10,48,9,20,30,41,49,20}, new int[] {31,10,48,9,20,30,41,49,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,20,310,11,30}, new int[] {20,20,20,310,11,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,11,17,47,11}, new int[] {60,11,17,47,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-2,14,14}, new int[] {0,-2,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {22,21,-1,5,6,6,0,6,6}, new int[] {22,21,-1,5,6,6,0,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,5,200,11,400,500,42}, new int[] {100,5,200,11,400,500,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,0,30,2,3,90,4,5,6,4}, new int[] {1,0,30,2,3,90,4,5,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,40,39,8,20,10}, new int[] {10,11,20,40,39,8,20,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,10,11,11}, new int[] {7,8,9,10,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,10,20,13,20,3,11,40}, new int[] {19,10,20,13,20,3,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,19,10,13,20,11,40,18}, new int[] {18,19,10,13,20,11,40,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {22,21,-1,5,6,-1,14,0,6,6}, new int[] {22,21,-1,5,6,-1,14,0,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {59,11,9,40,50}, new int[] {59,11,9,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,15,13,14,10,20}, new int[] {47,2,20,15,13,14,10,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,20,30,5,6,40,50}, new int[] {12,20,30,5,6,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,22,40,49,41}, new int[] {41,30,22,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,20,15,10}, new int[] {47,2,20,20,15,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,30,40,51,50}, new int[] {20,20,30,40,51,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,20,1,14,0,41,2}, new int[] {2,20,1,14,0,41,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,400,19,30,70,42,41,19}, new int[] {41,400,19,30,70,42,41,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,40,599,10}, new int[] {30,40,599,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,-2,1,-2,-2,29,-2,1,-2,-2,-2,-2,-2}, new int[] {300,0,-2,1,-2,-2,29,-2,1,-2,-2,-2,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,7,5,6,6,6,6}, new int[] {-1,3,6,7,5,6,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,40,10,20,30,39,30}, new int[] {60,40,10,20,30,39,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,10,20,30,40,49,40,30,49}, new int[] {11,10,20,30,40,49,40,30,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,49,13,41,13}, new int[] {41,30,49,13,41,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,70,5,6,6,5,6,6,6}, new int[] {-1,3,6,70,5,6,6,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,180}, new int[] {20,30,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,20,9,40,49,25,30,9,9}, new int[] {12,9,20,9,40,49,25,30,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,10,42}, new int[] {0,10,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {31,10,-1,30,40,50}, new int[] {31,10,-1,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,56,420,600,600,56,90}, new int[] {90,56,420,600,600,56,90}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,8,30}, new int[] {20,20,8,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,4,5,6,6,2,2}, new int[] {-1,2,3,4,5,6,6,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,-1,15,45,20}, new int[] {25,-1,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {59,11,500,40,58,50}, new int[] {59,11,500,40,58,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,41,20,30,40,49,41,30,41,40}, new int[] {41,41,20,30,40,49,41,30,41,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,11,14,12,420,420,420}, new int[] {34,11,14,12,420,420,420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,0,300,-2,1,-2,-2,1,-2,-1,1,-2}, new int[] {300,0,300,-2,1,-2,-2,1,-2,-1,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,30,22,50}, new int[] {90,30,22,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,19,11,10,23,23}, new int[] {7,8,19,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,20,311,11}, new int[] {20,20,20,311,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,42,40,49,49,50,40,40,50,40,40,30}, new int[] {20,30,42,40,49,49,50,40,40,50,40,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,30,420,40}, new int[] {90,30,420,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,24,45,20}, new int[] {25,35,15,24,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-2,72,48,-2,-2}, new int[] {54,-2,72,48,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {501,0,2,3,500,6}, new int[] {501,0,2,3,500,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {45,20,30,40,50,50,40,50,40}, new int[] {45,20,30,40,50,50,40,50,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,25,36,40,41,13,25,36}, new int[] {11,25,36,40,41,13,25,36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,40,8,20,10,10}, new int[] {10,11,20,40,8,20,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,400,5,6}, new int[] {-1,90,3,4,400,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,11,101,4,5,6}, new int[] {-1,11,101,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,11,10,20,30,40,49,40}, new int[] {60,11,10,20,30,40,49,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,19,11,10,23}, new int[] {7,8,19,11,10,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,400,6,4,5}, new int[] {-1,90,3,4,400,6,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-1,3,6,40,7,5,6,6,6}, new int[] {54,-1,3,6,40,7,5,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,50,9,10,14,0}, new int[] {0,50,9,10,14,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,19,10,13,21,11,40,18}, new int[] {18,19,10,13,21,11,40,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,48,50,40,50,20}, new int[] {10,20,30,40,48,50,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {22,21,-1,5,6,-1,15,0,6,6}, new int[] {22,21,-1,5,6,-1,15,0,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,0,2,3,90,4,5,6,5,4,3}, new int[] {1,0,2,3,90,4,5,6,5,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,3,6,5,6,6,19,5}, new int[] {-1,3,6,5,6,6,19,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,56,101,70,44}, new int[] {100,56,101,70,44}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,10,15,14,10,10}, new int[] {47,2,10,15,14,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,19,56,200,300,400,500}, new int[] {100,19,56,200,300,400,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,40,49,25,30,9}, new int[] {12,9,40,49,25,30,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-1,3,6,40,8,4,6,6,6}, new int[] {54,-1,3,6,40,8,4,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,50,48,70,49,49,70,70}, new int[] {56,50,48,70,49,49,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,10,11,40}, new int[] {10,30,40,50,10,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,29,0,0}, new int[] {56,0,0,0,29,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {90,21,56,420,600,600,56,90}, new int[] {90,21,56,420,600,600,56,90}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,5,200,11,400,500,42,500}, new int[] {100,5,200,11,400,500,42,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,2,3,5,5,6}, new int[] {-2,2,3,5,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {399,20,30,40,50,20}, new int[] {399,20,30,40,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,7,9,599,10,600}, new int[] {34,7,9,599,10,600}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,1,-2,-2,-2,-2,1,-2,-1}, new int[] {-2,1,-2,-2,-2,-2,1,-2,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,300,9,14,10,11,10,20,23,23}, new int[] {7,300,9,14,10,11,10,20,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,-2,20,48,-2}, new int[] {54,-2,20,48,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,0,0,56,56}, new int[] {56,0,0,0,0,0,56,56}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,600,5,6,6,6,6}, new int[] {-1,600,5,6,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,2,9,10,11,10,20,23,23}, new int[] {7,2,9,10,11,10,20,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,20,1,1,1,1}, new int[] {-1,2,3,4,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {48,18,2,3,4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,11,14,12,420,420,420,420}, new int[] {34,11,14,12,420,420,420,420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,5,5,6,6,6,6}, new int[] {-1,5,5,6,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,54,40}, new int[] {10,20,54,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,13,12,11}, new int[] {20,13,12,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,50,50,50}, new int[] {10,20,30,40,50,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {24,10,19,30,40,18,49,40,30}, new int[] {24,10,19,30,40,18,49,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-1,1,-2,-2,1,-2,-1,-2}, new int[] {-1,-1,1,-2,-2,1,-2,-1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,3,5,6,6,6,6}, new int[] {-1,2,3,5,6,6,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {600,7,54,7,54}, new int[] {600,7,54,7,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,16,0,47,15,-1}, new int[] {18,10,16,0,47,15,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,42,5,3,4,5,6,5}, new int[] {0,2,42,5,3,4,5,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,19,54,40}, new int[] {60,10,20,19,54,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,55,20,70,30,40,25,30,9,30}, new int[] {12,9,55,20,70,30,40,25,30,9,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,13,3,20,3,11,11,40}, new int[] {10,13,3,20,3,11,11,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,10,35,11,10,23,23}, new int[] {7,9,10,35,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,-2,1,-2,-2,1,-2,-1,1}, new int[] {300,-1,-2,1,-2,-2,1,-2,-1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,20,1,1,1,19,200,1,1}, new int[] {1,20,1,1,1,19,200,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,10,300,21}, new int[] {55,10,300,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,20,50,30}, new int[] {11,20,30,40,20,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,-2,10,14,14,14}, new int[] {0,-2,10,14,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,40,40,40}, new int[] {10,30,40,40,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,0,5,6}, new int[] {-1,90,3,0,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,10,15,14,60,10}, new int[] {47,2,20,10,15,14,60,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,49,40,13,41,41}, new int[] {41,20,30,49,40,13,41,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,20,30,40}, new int[] {56,20,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,55,20,30,40,48,30,9,55}, new int[] {9,55,20,30,40,48,30,9,55}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {36,41,20,30,40,49,17,41,41}, new int[] {36,41,20,30,40,49,17,41,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,25,0,0,0}, new int[] {0,0,25,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,300,9,10,11,10,23,23}, new int[] {12,300,9,10,11,10,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,-2,1,-1,-2,1,-2,-1,1,0,-2}, new int[] {300,-1,-2,1,-1,-2,1,-2,-1,1,0,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,39,40,25,30,10}, new int[] {12,9,39,40,25,30,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,20,30,180}, new int[] {12,20,30,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,20,-1,40,49,25,30,9,9}, new int[] {12,9,20,-1,40,49,25,30,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,0,0,0,29,0,-1}, new int[] {56,0,0,0,29,0,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {22,21,-1,5,6,-1,15,0,6,6,-1}, new int[] {22,21,-1,5,6,-1,15,0,6,6,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,20,15,13,14,10,20,13}, new int[] {2,20,15,13,14,10,20,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50,10,11,11}, new int[] {10,30,40,50,10,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,11,15,12,14,399,420,420}, new int[] {34,11,15,12,14,399,420,420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,2,20,501,10,15,14,10}, new int[] {47,2,20,501,10,15,14,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,8,9,11}, new int[] {7,8,8,9,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,72,311,48,-2}, new int[] {-2,72,311,48,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,60,17,41,41}, new int[] {41,60,17,41,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,18,16,35,25}, new int[] {13,23,18,16,35,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,59,70,50}, new int[] {56,59,70,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {3,2,20,20,15,3,14,42,9,10,15,15,3}, new int[] {3,2,20,20,15,3,14,42,9,10,15,15,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {599,20,20,10}, new int[] {599,20,20,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {16,41,16,17,41,17}, new int[] {16,41,16,17,41,17}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {6,11,10,10}, new int[] {6,11,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,20,40,49,25,30,9,20}, new int[] {12,9,20,40,49,25,30,9,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,16,35,49,25}, new int[] {13,23,9,16,35,49,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {47,20,1,1,1,1}, new int[] {47,20,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,30,13,49,13,39,12,41}, new int[] {41,30,13,49,13,39,12,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,36,420,72}, new int[] {11,36,420,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,48,0,17,0}, new int[] {0,0,0,0,48,0,17,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,59,40,10,11}, new int[] {10,30,59,40,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,49,25,36,40,41,13,25,36,13}, new int[] {11,49,25,36,40,41,13,25,36,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,39,10,47,15,18}, new int[] {18,39,10,47,15,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,19,200,1,1}, new int[] {1,1,1,1,1,19,200,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,1,40,50,500,10,10}, new int[] {10,30,1,40,50,500,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,11,90,10,23,23,12,599}, new int[] {7,9,11,90,10,23,23,12,599}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,9,60,39,40,25,30,10}, new int[] {12,9,60,39,40,25,30,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,599,3,500,5,6}, new int[] {0,2,599,3,500,5,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,30,40,29,49,11,11,11}, new int[] {11,20,30,40,29,49,11,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,11,4,5,6,6,5}, new int[] {-1,90,11,4,5,6,6,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,70,50,10,10}, new int[] {10,30,70,50,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,9,11,51,23}, new int[] {7,9,11,51,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,20}, new int[] {9,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,10,20,30,59,59}, new int[] {60,10,20,30,59,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,29,0,0,29,0}, new int[] {56,29,0,0,29,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {180,-1,3,6,5,10,6,6}, new int[] {180,-1,3,6,5,10,6,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,30,41}, new int[] {34,30,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,19,30,42,40,49,49,50,40,50,40,40,40}, new int[] {10,19,30,42,40,49,49,50,40,50,40,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,19,30,59,42,59}, new int[] {41,19,30,59,42,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,36,11,599,10,23}, new int[] {7,8,36,11,599,10,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,90,3,4,400,6}, new int[] {-1,90,3,4,400,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,90,4,5,6,4,4}, new int[] {0,2,3,90,4,5,6,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,11,15,12,14,420,420}, new int[] {34,11,15,12,14,420,420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,40,599,10,599}, new int[] {30,40,599,10,599}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,23,40}, new int[] {10,20,23,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,11,17}, new int[] {60,11,17}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,20,30,-2,40,49,41}, new int[] {41,20,30,-2,40,49,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,-3,-4,-5}, new int[] {-1,-2,-3,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0}, new int[] {0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,0,0,0,0,0}, new int[] {1,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,5,0,0,0,4}, new int[] {4,1,1,0,0,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,4,1,0,0,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1}, new int[] {1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1}, new int[] {-5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0}, new int[] {1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-3,-2,0,4}, new int[] {-2,-4,-1,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1,1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,10000000}, new int[] {10000000,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10000000,10000000}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,59,70,45,45}, new int[] {56,59,70,45,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,72,48}, new int[] {54,60,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5}, new int[] {0,2,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1,1}, new int[] {1,1,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,40,50}, new int[] {20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,72,48}, new int[] {54,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48}, new int[] {54,60,71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,21,28,29}, new int[] {4,9,15,21,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,46,70,45,45}, new int[] {56,46,70,45,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,10}, new int[] {7,8,9,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20,35}, new int[] {25,35,15,45,20,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48,54}, new int[] {54,60,71,48,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,17,25,23}, new int[] {11,20,10,13,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3,1,4,11,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,21,28,29}, new int[] {4,9,16,21,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,61,71,48}, new int[] {54,61,71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,60,71,48,48}, new int[] {55,60,71,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,46,70,45,45,70}, new int[] {56,46,70,45,45,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,46,70,17,70}, new int[] {60,46,70,17,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,3}, new int[] {0,2,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,48}, new int[] {54,0,71,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,-1,4,5,3}, new int[] {0,2,3,-1,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,61,71,48,61}, new int[] {54,61,71,48,61}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,50}, new int[] {10,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,28,29}, new int[] {4,9,16,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20,35,45,15,35}, new int[] {25,35,15,45,20,35,45,15,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,1,-1,-2,1}, new int[] {0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2,1,1,2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23}, new int[] {11,20,10,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,31,40,13}, new int[] {10,30,31,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {72,48}, new int[] {72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23,14}, new int[] {11,20,10,14,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,50,50}, new int[] {10,30,39,39,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,32,40,13}, new int[] {10,30,32,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,70,20,30,40,50}, new int[] {10,70,20,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,30,40,50}, new int[] {20,49,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1}, new int[] {1,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,60,71,48}, new int[] {55,60,71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71,48}, new int[] {71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71,25,35,15,45,20}, new int[] {71,25,35,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,29}, new int[] {4,9,15,40,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,72}, new int[] {54,60,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,30}, new int[] {10,20,30,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,72,40,13}, new int[] {10,30,72,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,15,21,28,29}, new int[] {100,15,21,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,19,23}, new int[] {11,20,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,3,1,1,1,1,1}, new int[] {1,3,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,10,14,19,23}, new int[] {20,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,1,-1,-2,1}, new int[] {-1,-2,1,-1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,59,4,5,3}, new int[] {2,3,59,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,1,-1,-2,1,-2}, new int[] {300,-1,1,-1,-2,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,31,4,5,3}, new int[] {0,2,31,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,19,23}, new int[] {11,20,10,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,5,3}, new int[] {2,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,50}, new int[] {10,30,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,24,9,17,25,23}, new int[] {11,20,10,13,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4,1,4,11,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,11,50,20}, new int[] {20,49,11,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,72,48}, new int[] {60,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,30,50}, new int[] {20,49,30,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,19,10,14,19,23}, new int[] {11,19,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,60,48,48}, new int[] {55,60,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,10,20,30,35}, new int[] {9,10,20,30,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30}, new int[] {10,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,14,19,23,20}, new int[] {20,21,14,19,23,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,70,30,40,50,70}, new int[] {70,70,30,40,50,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,50,50}, new int[] {10,30,39,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,6}, new int[] {0,2,3,4,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,9,29,9}, new int[] {4,9,15,40,28,9,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,71,40,13}, new int[] {10,30,71,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,50}, new int[] {20,30,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23,14,10,20}, new int[] {11,20,10,14,23,14,10,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,14,19,23}, new int[] {20,21,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60}, new int[] {54,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48,54,60}, new int[] {54,60,71,48,54,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,6,8,9,10,7,28,11}, new int[] {10,6,8,9,10,7,28,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {6,54,60}, new int[] {6,54,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,48}, new int[] {60,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,3,5,3}, new int[] {2,3,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,200,29}, new int[] {4,9,15,40,200,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {48,48,48}, new int[] {48,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,500}, new int[] {20,30,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,20}, new int[] {10,20,30,40,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48,60}, new int[] {54,60,71,48,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48,54,60,60,60}, new int[] {54,60,71,48,54,60,60,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,45,70,17,70,70}, new int[] {60,45,70,17,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,10,20,35}, new int[] {9,10,20,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,48,48}, new int[] {60,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,11,12,50}, new int[] {20,49,11,12,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,30,20,30,500}, new int[] {9,30,20,30,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,71,48}, new int[] {60,71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71,48,48}, new int[] {71,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,72,48}, new int[] {54,0,71,72,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,29,28}, new int[] {4,9,15,40,28,29,28}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,4,3,4,5,3}, new int[] {0,2,4,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {180,0,2,3,-1,4,5,3}, new int[] {180,0,2,3,-1,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,0,48,0}, new int[] {54,0,71,72,0,48,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20,35,45,15,49,35}, new int[] {25,35,15,45,20,35,45,15,49,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,31,4,5,600,3}, new int[] {0,2,31,4,5,600,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,56,23}, new int[] {11,20,10,56,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15}, new int[] {18,10,47,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,18,18}, new int[] {18,10,47,15,18,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,0,48,71,0}, new int[] {54,0,71,72,0,48,71,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,420,23,14}, new int[] {11,20,10,14,420,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {48,48,48,48}, new int[] {48,48,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,70,30,30,30,40,50}, new int[] {10,70,30,30,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,19,10,19,23}, new int[] {10,11,20,19,10,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,8}, new int[] {7,8,9,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,9,29,9,4}, new int[] {4,9,15,40,28,9,29,9,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,40,15}, new int[] {10,30,40,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,9,70,9}, new int[] {4,9,15,40,28,9,70,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,4,2}, new int[] {0,2,3,4,5,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,30}, new int[] {20,49,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,21,10,29}, new int[] {4,9,21,10,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,5,3,3}, new int[] {2,3,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,0,48,0,72,0}, new int[] {54,0,71,72,0,48,0,72,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,20,30,40}, new int[] {-1,20,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,3,3,4,5}, new int[] {0,3,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,71,40,13,13,30}, new int[] {30,71,40,13,13,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,59,23,11}, new int[] {11,20,10,59,23,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,40,28,29,180}, new int[] {4,9,40,28,29,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4}, new int[] {0,2,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20,35,45,15,49,35,25}, new int[] {25,35,15,45,20,35,45,15,49,35,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {48}, new int[] {48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,29,1,1,1}, new int[] {1,1,1,1,29,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,21,-2}, new int[] {4,9,15,21,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,30}, new int[] {9,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,30}, new int[] {10,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,29}, new int[] {4,9,15,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,71,48,54,54}, new int[] {60,71,48,54,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,28,29,180}, new int[] {4,9,28,29,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,11,55,50}, new int[] {20,49,11,55,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,10,30,31,40,13}, new int[] {25,10,30,31,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,3,16,15}, new int[] {18,10,47,3,16,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,23,9,17,25}, new int[] {13,23,9,17,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,70,30,40,70}, new int[] {70,70,30,40,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71,48,49}, new int[] {71,48,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,3,4,5,3,5}, new int[] {0,3,4,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,71}, new int[] {54,60,71,71}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,59,22,23,11,11}, new int[] {11,20,10,59,22,23,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,46,70,69,45,45}, new int[] {56,46,70,69,45,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,70,30,30,30,50}, new int[] {10,70,30,30,30,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,46,3,3,5,3}, new int[] {2,46,3,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,59,70,45,59}, new int[] {56,59,70,45,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,9,10,20,35}, new int[] {9,9,10,20,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,29,9,29,9}, new int[] {4,9,15,40,29,9,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,40,200,29}, new int[] {4,9,16,40,200,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,30,40}, new int[] {8,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,19,10,19,23,10}, new int[] {10,11,20,19,10,19,23,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,11,20,22,9,19,23}, new int[] {12,11,20,22,9,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,13,20,10,14,420,23,14}, new int[] {11,13,20,10,14,420,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,40,28,29,180,9}, new int[] {4,9,40,28,29,180,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,47,47}, new int[] {18,10,47,15,47,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,71,73,72,48,54}, new int[] {54,71,73,72,48,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,5}, new int[] {2,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,200,29,40}, new int[] {4,9,15,40,200,29,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,21,29,29}, new int[] {4,9,15,21,29,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,14,19,23,21}, new int[] {20,21,14,19,23,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30}, new int[] {30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,40,28,29,9}, new int[] {9,40,28,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,14,19,420,23,20,19,21}, new int[] {20,21,14,19,420,23,20,19,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,45,17,70,70}, new int[] {60,45,17,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {24,10,30,31,40,13}, new int[] {24,10,30,31,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,3,59,4,5,3,5}, new int[] {2,3,59,4,5,3,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {5,2,5,3,3}, new int[] {5,2,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,50,20}, new int[] {20,30,50,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23,23}, new int[] {11,20,10,14,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,10,14,19,23,23}, new int[] {20,10,14,19,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,50,50,39}, new int[] {10,30,39,50,50,39}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,-2,1,-1,-2,1}, new int[] {-1,-2,-2,1,-1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,15,1,1,1}, new int[] {1,1,1,15,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,30}, new int[] {30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,46,48,60,60}, new int[] {54,60,71,46,48,60,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {9,10,40,28,29,9}, new int[] {9,10,40,28,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,71,72,72,48}, new int[] {54,71,72,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,29,1,1,1}, new int[] {1,1,1,29,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,4,3,4,5}, new int[] {0,2,4,3,4,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,72,54}, new int[] {54,60,72,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,60,40,14,28,9,29,9,4}, new int[] {4,9,60,40,14,28,9,29,9,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,20,30}, new int[] {10,20,30,40,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,23}, new int[] {10,20,30,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,41,9,40,28,29,180,9,4}, new int[] {4,41,9,40,28,29,180,9,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,10,6,8,10,7,28,11}, new int[] {10,10,6,8,10,7,28,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,31,4,5,600,3,3,5,3}, new int[] {0,2,31,4,5,600,3,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,19,10,19,41,10}, new int[] {10,11,20,19,10,19,41,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,11,20,10,14,23,14}, new int[] {13,11,20,10,14,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,48,47,15,47,47}, new int[] {18,10,48,47,15,47,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,72,48,48,72}, new int[] {54,72,48,48,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {19,10,14,19,23,23}, new int[] {19,10,14,19,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,21,14,19,420,23,20,19,21,19}, new int[] {20,21,14,19,420,23,20,19,21,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,3,16,54,15}, new int[] {18,10,47,3,16,54,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {72,47,48}, new int[] {72,47,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,61,3,4,400}, new int[] {0,61,3,4,400}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,3,16,18}, new int[] {18,10,47,3,16,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,10,20,19,10,19,41,10,41}, new int[] {10,10,20,19,10,19,41,10,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,59,70,45,58}, new int[] {56,59,70,45,58}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,59,10,10}, new int[] {18,10,47,59,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,11,20,400,10,14,23,14,14,14}, new int[] {13,11,20,400,10,14,23,14,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,71,29,28}, new int[] {4,9,15,40,28,71,29,28}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,71,48,61}, new int[] {54,71,48,61}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,1,-2,1,-2}, new int[] {300,-1,1,-2,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,46,70,69,45,45,69}, new int[] {56,46,70,69,45,45,69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,61,3,4}, new int[] {0,61,3,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,0,47}, new int[] {18,10,47,15,0,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {53,54,60}, new int[] {53,54,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {51,53,54,60}, new int[] {51,53,54,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20}, new int[] {18,10,47,15,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,25,32,30,27}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71}, new int[] {71}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,72,61,48}, new int[] {60,72,61,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,71,40,13,30}, new int[] {10,30,71,40,13,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,6,71,72,72,48}, new int[] {54,6,71,72,72,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,9,70,3,9}, new int[] {4,9,15,40,28,9,70,3,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,69,30,40,50}, new int[] {10,69,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,2,3,3,5,3,3}, new int[] {4,2,3,3,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,4,48,48}, new int[] {55,4,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,1,-2,1,-2,1}, new int[] {300,-1,1,-2,1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,47,10}, new int[] {18,10,47,15,47,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,11,10,20,10,59,23,11,11}, new int[] {41,11,10,20,10,59,23,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500,500}, new int[] {100,200,300,400,500,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,61,48,61}, new int[] {54,61,48,61}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,21,10,14,19,23}, new int[] {11,20,21,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,59,22,23,11,11,11}, new int[] {11,20,10,59,22,23,11,11,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,46,3,35,3,5,3}, new int[] {2,46,3,35,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,41,20}, new int[] {10,20,41,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {24,50,9,15,40,28,29}, new int[] {24,50,9,15,40,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,50,50,39}, new int[] {10,30,39,39,50,50,39}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,28,29,180,9}, new int[] {4,9,28,29,180,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,51}, new int[] {30,51}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,50,60,71,48,60}, new int[] {54,50,60,71,48,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {200,72}, new int[] {200,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,71,48,60}, new int[] {60,71,48,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,39,10,47,15}, new int[] {18,39,10,47,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1,1,1}, new int[] {1,1,1,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,13,20,10,14,420,23,15}, new int[] {11,13,20,10,14,420,23,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,11,1,1,14,15,20,1,1,1}, new int[] {1,11,1,1,14,15,20,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,4,2,0}, new int[] {0,2,3,4,5,4,2,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,34,15,45,20,35,45,15,49,35,25}, new int[] {25,34,15,45,20,35,45,15,49,35,25}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,90,3,28,28,29,29,180,9}, new int[] {4,90,3,28,28,29,29,180,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {310,10,20,35}, new int[] {310,10,20,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,40}, new int[] {30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,40,40,40}, new int[] {30,40,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,35,50,39}, new int[] {10,30,39,39,35,50,39}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {48,48}, new int[] {48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,14,47,15,24,10}, new int[] {18,10,14,47,15,24,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,20,30,500}, new int[] {30,20,30,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,4,3,4,5,3}, new int[] {-1,2,4,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,46,3,3,2,5,3,3}, new int[] {2,46,3,3,2,5,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,2,4,3,4,5,0,3}, new int[] {-1,2,4,3,4,5,0,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,11,10,19,23}, new int[] {11,20,11,10,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,21,10,14,19,23,19}, new int[] {11,20,21,10,14,19,23,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {35,4,16,40,200,29,9}, new int[] {35,4,16,40,200,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,50,30}, new int[] {20,49,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,45,71,48,62}, new int[] {54,45,71,48,62}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {71,48,70,49}, new int[] {71,48,70,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {49,47,48}, new int[] {49,47,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,24,19,10,14,19,23}, new int[] {11,24,19,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {420,60}, new int[] {420,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,59,10}, new int[] {18,10,47,59,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,35,50}, new int[] {10,30,39,39,35,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {24,19,10,14,19,23}, new int[] {24,19,10,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,30,30}, new int[] {20,49,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,11,1,1,14,15,20,1,11,1,1,20,15}, new int[] {1,11,1,1,14,15,20,1,11,1,1,20,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,69,30,47,50,50}, new int[] {10,69,30,47,50,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,48,11,20,41,400,10,14,23,14,14,14}, new int[] {13,48,11,20,41,400,10,14,23,14,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,60,61,-2,71,48}, new int[] {55,60,61,-2,71,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,4,3,4,5,3}, new int[] {2,4,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,50,39}, new int[] {10,30,39,39,50,39}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {7,8,9,18,10,7}, new int[] {7,8,9,18,10,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,70,30,49,50}, new int[] {20,49,70,30,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,25,35,15,45,20}, new int[] {70,25,35,15,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,11,20,22,9,10,19,23,11}, new int[] {12,11,20,22,9,10,19,23,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,13,14,23}, new int[] {11,20,10,13,14,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,14,18,23,21}, new int[] {20,20,14,18,23,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,21,28,29}, new int[] {100,21,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23,13}, new int[] {11,20,10,14,23,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,24,19,10,50,14,19,23}, new int[] {11,24,19,10,50,14,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,25,35,45,70}, new int[] {70,25,35,45,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-2,1,-1,-2,1}, new int[] {-2,1,-1,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {32,49,11,55,55,50}, new int[] {32,49,11,55,55,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {400,30,40}, new int[] {400,30,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {17,0,2,4,3,4,5,3}, new int[] {17,0,2,4,3,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,11,12,51,12}, new int[] {20,49,11,12,51,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,59,70,45,59,56}, new int[] {56,59,70,45,59,56}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,13,20,10,14,23,14}, new int[] {11,13,20,10,14,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,4,2,2}, new int[] {0,2,3,4,5,4,2,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,19,10,14,19,62}, new int[] {11,19,10,14,19,62}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,39,180,28,29,180}, new int[] {4,9,39,180,28,29,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {420,60,60}, new int[] {420,60,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,54,60,72,72,54}, new int[] {1,54,60,72,72,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,49}, new int[] {70,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,4,6,4}, new int[] {0,2,4,6,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {8,46,10,40,29,9}, new int[] {8,46,10,40,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,49,49,50,30}, new int[] {20,49,49,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {300,-1,1,-2,2,45,-2}, new int[] {300,-1,1,-2,2,45,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,14,14,19,22,23,23}, new int[] {20,14,14,19,22,23,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {100,200,300,400,500,500,500}, new int[] {100,200,300,400,500,500,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,15,40,29,29,40,4}, new int[] {4,9,16,15,40,29,29,40,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {72,1,47,48}, new int[] {72,1,47,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,23,13,10}, new int[] {11,20,10,14,23,13,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {39,30,70,40,13,13,30}, new int[] {39,30,70,40,13,13,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,46,21,28,29,4}, new int[] {4,9,16,46,21,28,29,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,35}, new int[] {25,35,15,45,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {27,100,21,28,29}, new int[] {27,100,21,28,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,29,1,1,1}, new int[] {1,1,29,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,71,40,13}, new int[] {10,71,40,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,4,3,4,5,18,0,3,3}, new int[] {-1,4,3,4,5,18,0,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {180,10,6,8,9,10,7,28,11}, new int[] {180,10,6,8,9,10,7,28,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {41,11,10,20,59,11,11,10}, new int[] {41,11,10,20,59,11,11,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,11,20,22,9,19,23,9}, new int[] {12,11,20,22,9,19,23,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,10,14,19,23,14}, new int[] {20,10,14,19,23,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,47,45,20}, new int[] {25,35,15,47,45,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,1,47}, new int[] {18,10,47,15,1,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,21,28,29,9,9}, new int[] {4,9,16,21,28,29,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {6,8,54}, new int[] {6,8,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,40,28,9,70,3,9,70}, new int[] {4,9,15,40,28,9,70,3,9,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,8,15,40,28,9,29,9}, new int[] {4,8,15,40,28,9,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,14,420,23,32}, new int[] {11,20,10,14,420,23,32}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,56}, new int[] {11,20,10,56}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,27,-2,1,-1,-2,0}, new int[] {-1,27,-2,1,-1,-2,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,30,1,29,1,1,1}, new int[] {1,1,30,1,29,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {30,51,12}, new int[] {30,51,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,20,40,30}, new int[] {10,20,20,40,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,53,72,48,54}, new int[] {54,53,72,48,54}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,10,14,19,23,22}, new int[] {20,10,14,19,23,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45,20,35,45,15,49,35,35}, new int[] {25,35,15,45,20,35,45,15,49,35,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,-2,1,-1,-2,1,-2}, new int[] {-1,-2,-2,1,-1,-2,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {69,30,40,50}, new int[] {69,30,40,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {56,46,70,45,45,56}, new int[] {56,46,70,45,45,56}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,40,28,9,70,3,9,70}, new int[] {4,9,40,28,9,70,3,9,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,20,30,40,20,10,10}, new int[] {10,20,30,40,20,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {32,8,10}, new int[] {32,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {70,69,70,40,50,72}, new int[] {70,69,70,40,50,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,48,21,60}, new int[] {54,60,71,48,21,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,35,15,45}, new int[] {25,35,15,45}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,45,17,70,70,70}, new int[] {60,45,17,70,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,1,1,1,1,1,1,1,1}, new int[] {1,1,1,1,1,1,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,59,22,23,16,11,11,59}, new int[] {11,20,10,59,22,23,16,11,11,59}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {55,4,48,48,48}, new int[] {55,4,48,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,73,49}, new int[] {54,73,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,10,20,19,10,19,41,41,10,41}, new int[] {10,10,20,19,10,19,41,41,10,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,21,14,56,19,23}, new int[] {11,20,21,14,56,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,30,39,39,35,49,39,30}, new int[] {10,30,39,39,35,49,39,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,15,3,29,9}, new int[] {4,9,15,3,29,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,13,20,10,14,420,23}, new int[] {11,13,20,10,14,420,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,0,47,10}, new int[] {18,10,47,15,0,47,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,11,9,1,14,15,20,1,1,1,20,15}, new int[] {1,11,9,1,14,15,20,1,1,1,20,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,72,48,73}, new int[] {54,0,71,72,48,73}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {50,4,16,40,0,9}, new int[] {50,4,16,40,0,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {420,59,60}, new int[] {420,59,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,60,71,47}, new int[] {54,60,71,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,31,4,5,600,3}, new int[] {0,31,4,5,600,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,72,48,48,45,72}, new int[] {54,72,48,48,45,72}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,9,20,19,10,19,41,10,41}, new int[] {10,9,20,19,10,19,41,10,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,21,28,61,29}, new int[] {4,9,16,21,28,61,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,46,35,3,5,3,35}, new int[] {2,46,35,3,5,3,35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,3,4,5,4,200,2}, new int[] {0,2,3,4,5,4,200,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,20,49,49,34,50,30}, new int[] {20,20,49,49,34,50,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {2,0,2,3,4,5,4,2}, new int[] {2,0,2,3,4,5,4,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,71,48,21,60}, new int[] {54,71,48,21,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {60,91,17,70,70,70}, new int[] {60,91,17,70,70,70}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,16,46,21,19,28,29,5}, new int[] {4,9,16,46,21,19,28,29,5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {-1,-2,1,-1,-2,41}, new int[] {-1,-2,1,-1,-2,41}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,14,14,19,22,23,20,23}, new int[] {20,14,14,19,22,23,20,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {48,48,48,47,48}, new int[] {48,48,48,47,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {23,11,20,10,14,23,20}, new int[] {23,11,20,10,14,23,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {400,30,40,40}, new int[] {400,30,40,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,31,4,3,5,3}, new int[] {0,2,31,4,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,15,40,200,29,40}, new int[] {4,15,40,200,29,40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,3}, new int[] {18,10,47,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {25,10,30,31}, new int[] {25,10,30,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,20,19,10,19,23}, new int[] {10,11,20,20,19,10,19,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {32,49,11,59,55,55,50,50,49}, new int[] {32,49,11,59,55,55,50,50,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {34,18,10,47,15,47,46,47}, new int[] {34,18,10,47,15,47,46,47}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {54,0,71,48,54,60,60,60}, new int[] {54,0,71,48,54,60,60,60}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,11,20,19,10,19,23,10,10}, new int[] {10,11,20,19,10,19,23,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {20,30,50,20,30}, new int[] {20,30,50,20,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {27,45,71,48,62}, new int[] {27,45,71,48,62}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {11,20,10,59,14,420,23,14,14}, new int[] {11,20,10,59,14,420,23,14,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {29,20,30,20}, new int[] {29,20,30,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {10,6,8,9,10,7,28,11,28,8}, new int[] {10,6,8,9,10,7,28,11,28,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,45,4,3,5,3}, new int[] {0,2,45,4,3,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {12,11,19,22,9,34,10,19,23,11}, new int[] {12,11,19,22,9,34,10,19,23,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0,2,35,3,-1,34,4,5,3}, new int[] {0,2,35,3,-1,34,4,5,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {18,10,47,15,0,47,10,15}, new int[] {18,10,47,15,0,47,10,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {13,11,20,10,14,23,4,14}, new int[] {13,11,20,10,14,23,4,14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {72,1,47,48,48}, new int[] {72,1,47,48,48}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {4,9,28,9,29,14,180}, new int[] {4,9,28,9,29,14,180}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0,0}
        );
    }
}

