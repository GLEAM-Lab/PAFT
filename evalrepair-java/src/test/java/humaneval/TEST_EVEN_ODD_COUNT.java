package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_EVEN_ODD_COUNT {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(7);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-78);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(3452);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(346211);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-345821);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-45347);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(0);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2368);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-111);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468031);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(1010101);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-123456789);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-590);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(125890);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444444);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111111);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222222);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-591);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444443);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444445);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222221);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111110);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-592);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222224);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222223);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-7);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2369);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468032);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-112);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(125889);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-589);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-588);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-123456790);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-593);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468033);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222225);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222226);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2367);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-110);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-113);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444442);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(1010100);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-114);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-67);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-586);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111112);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(1010099);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(1010098);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222227);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468034);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-123456791);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2366);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-9);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-123456792);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-587);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111113);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468035);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444446);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222220);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444447);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-109);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-6);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-585);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(125891);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-93);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-10);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(12);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(125888);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-115);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(125892);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(13);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-48);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(37);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-97);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-94);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-92);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-98);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-11);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(36);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2370);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(14);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111109);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(15);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222228);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-123456793);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(34);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-16);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(35);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(10);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-68);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444441);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111114);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-69);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-222222229);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444440);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-15);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(444444439);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(33);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-5);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468036);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-1111115);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-53);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456789);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813579);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11111);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2222);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456790);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11112);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456792);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2221);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2219);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-70);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-71);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11110);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2223);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-18);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2220);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456788);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(3);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-17);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813578);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-85);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456793);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11109);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-8);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-59);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-19);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-66);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456794);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456787);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-58);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456785);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2218);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-80);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(46);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-60);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-81);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(4);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813577);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-12);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456786);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11107);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(19);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(5);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-61);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-14);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(18);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11106);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-13);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(20);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-56);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456795);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11108);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(17);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456784);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-65);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(1);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(89);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-64);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-82);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-63);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(64);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11105);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(90);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(99);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(65);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11104);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11113);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-83);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(6);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-62);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(53);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-84);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2224);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(66);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(11103);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-86);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(67);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-35);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2217);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2216);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-923456783);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-3);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-57);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-33);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(13579);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,5}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2468);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(2147483647);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2147483648);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813580);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813581);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(16);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(78);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(77);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(76);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(75);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2225);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(58);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813576);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(39);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(246813583);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(38);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(48);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-21);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(40);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,0}
        );
    }
}

