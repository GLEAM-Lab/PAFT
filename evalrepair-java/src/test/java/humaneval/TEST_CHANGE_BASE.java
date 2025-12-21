package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CHANGE_BASE {
    @org.junit.Test(timeout = 3000)
    public void test() throws java.lang.Exception {
        for (int x = 2; x < 8; x += 1){
            String result = humaneval.buggy.CHANGE_BASE.change_base(x, x + 1);
            org.junit.Assert.assertEquals(
                result, x + ""
            );
        }
    }
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 3);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 3);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(234, 2);
        org.junit.Assert.assertEquals(
            result, "11101010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 2);
        org.junit.Assert.assertEquals(
            result, "10000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 2);
        org.junit.Assert.assertEquals(
            result, "1000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 2);
        org.junit.Assert.assertEquals(
            result, "111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 3);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 4);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 5);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 6);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 7);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 8);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 5);
        org.junit.Assert.assertEquals(
            result, "20"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 4);
        org.junit.Assert.assertEquals(
            result, "33"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 6);
        org.junit.Assert.assertEquals(
            result, "41"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(33, 7);
        org.junit.Assert.assertEquals(
            result, "45"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(45, 8);
        org.junit.Assert.assertEquals(
            result, "55"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(50, 9);
        org.junit.Assert.assertEquals(
            result, "55"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(13, 5);
        org.junit.Assert.assertEquals(
            result, "23"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(17, 3);
        org.junit.Assert.assertEquals(
            result, "122"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(42, 8);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 2);
        org.junit.Assert.assertEquals(
            result, "1111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 4);
        org.junit.Assert.assertEquals(
            result, "20"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(17, 8);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 5);
        org.junit.Assert.assertEquals(
            result, "14"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 6);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 8);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(45, 7);
        org.junit.Assert.assertEquals(
            result, "63"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 9);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 3);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 8);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 8);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 7);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(50, 5);
        org.junit.Assert.assertEquals(
            result, "200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 7);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 5);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(17, 9);
        org.junit.Assert.assertEquals(
            result, "18"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 9);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 6);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 9);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 4);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 7);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 4);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 7);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(13, 7);
        org.junit.Assert.assertEquals(
            result, "16"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 3);
        org.junit.Assert.assertEquals(
            result, "120"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 2);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(17, 7);
        org.junit.Assert.assertEquals(
            result, "23"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 5);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 8);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 6);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 8);
        org.junit.Assert.assertEquals(
            result, "20"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(18, 2);
        org.junit.Assert.assertEquals(
            result, "10010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 5);
        org.junit.Assert.assertEquals(
            result, "30"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 6);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(46, 8);
        org.junit.Assert.assertEquals(
            result, "56"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 9);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(50, 2);
        org.junit.Assert.assertEquals(
            result, "110010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(41, 8);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 4);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(46, 5);
        org.junit.Assert.assertEquals(
            result, "141"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(17, 2);
        org.junit.Assert.assertEquals(
            result, "10001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 2);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 9);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(13, 8);
        org.junit.Assert.assertEquals(
            result, "15"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 6);
        org.junit.Assert.assertEquals(
            result, "13"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(42, 7);
        org.junit.Assert.assertEquals(
            result, "60"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 4);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(45, 6);
        org.junit.Assert.assertEquals(
            result, "113"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 8);
        org.junit.Assert.assertEquals(
            result, "17"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(43, 7);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 5);
        org.junit.Assert.assertEquals(
            result, "10"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 5);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 3);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(13, 9);
        org.junit.Assert.assertEquals(
            result, "14"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 8);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(33, 9);
        org.junit.Assert.assertEquals(
            result, "36"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 3);
        org.junit.Assert.assertEquals(
            result, "20"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 7);
        org.junit.Assert.assertEquals(
            result, "13"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 9);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(18, 7);
        org.junit.Assert.assertEquals(
            result, "24"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(19, 7);
        org.junit.Assert.assertEquals(
            result, "25"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(43, 5);
        org.junit.Assert.assertEquals(
            result, "133"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(46, 7);
        org.junit.Assert.assertEquals(
            result, "64"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 5);
        org.junit.Assert.assertEquals(
            result, "13"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 7);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34, 3);
        org.junit.Assert.assertEquals(
            result, "1021"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 6);
        org.junit.Assert.assertEquals(
            result, "24"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 4);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 6);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 7);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(15, 6);
        org.junit.Assert.assertEquals(
            result, "23"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(14, 5);
        org.junit.Assert.assertEquals(
            result, "24"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(14, 6);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 9);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(46, 6);
        org.junit.Assert.assertEquals(
            result, "114"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 2);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(18, 9);
        org.junit.Assert.assertEquals(
            result, "20"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(18, 8);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 4);
        org.junit.Assert.assertEquals(
            result, "13"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(35, 9);
        org.junit.Assert.assertEquals(
            result, "38"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 8);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 5);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(50, 7);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(50, 8);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(13, 4);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 5);
        org.junit.Assert.assertEquals(
            result, "2011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 3);
        org.junit.Assert.assertEquals(
            result, "2202210"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 9);
        org.junit.Assert.assertEquals(
            result, "52367"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 3);
        org.junit.Assert.assertEquals(
            result, "1000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 8);
        org.junit.Assert.assertEquals(
            result, "7267464261"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 9);
        org.junit.Assert.assertEquals(
            result, "20731370"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 3);
        org.junit.Assert.assertEquals(
            result, "22121022020212200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 7);
        org.junit.Assert.assertEquals(
            result, "10532"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 8);
        org.junit.Assert.assertEquals(
            result, "270174735"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 7);
        org.junit.Assert.assertEquals(
            result, "2042156"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 8);
        org.junit.Assert.assertEquals(
            result, "46113177"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 4);
        org.junit.Assert.assertEquals(
            result, "133203"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 9);
        org.junit.Assert.assertEquals(
            result, "2484401020"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 8);
        org.junit.Assert.assertEquals(
            result, "737656"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 8);
        org.junit.Assert.assertEquals(
            result, "726746425"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 9);
        org.junit.Assert.assertEquals(
            result, "2683"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 9);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 9);
        org.junit.Assert.assertEquals(
            result, "2682"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 4);
        org.junit.Assert.assertEquals(
            result, "13112330310111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 4);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 4);
        org.junit.Assert.assertEquals(
            result, "20130013"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 4);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 9);
        org.junit.Assert.assertEquals(
            result, "314"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213131"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 3);
        org.junit.Assert.assertEquals(
            result, "110111000012"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 9);
        org.junit.Assert.assertEquals(
            result, "110784027"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 4);
        org.junit.Assert.assertEquals(
            result, "221231"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 3);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 9);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213132"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 3);
        org.junit.Assert.assertEquals(
            result, "2202211"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 2);
        org.junit.Assert.assertEquals(
            result, "11011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 8);
        org.junit.Assert.assertEquals(
            result, "5155"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 2);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 5);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 9);
        org.junit.Assert.assertEquals(
            result, "414005"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 7);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 2);
        org.junit.Assert.assertEquals(
            result, "10111000001111100111011101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 6);
        org.junit.Assert.assertEquals(
            result, "554200143"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 5);
        org.junit.Assert.assertEquals(
            result, "10024444444"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 4);
        org.junit.Assert.assertEquals(
            result, "323332232"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 2);
        org.junit.Assert.assertEquals(
            result, "11010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 4);
        org.junit.Assert.assertEquals(
            result, "133210"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 3);
        org.junit.Assert.assertEquals(
            result, "2112211110001000200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 8);
        org.junit.Assert.assertEquals(
            result, "3742"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 9);
        org.junit.Assert.assertEquals(
            result, "52368"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 2);
        org.junit.Assert.assertEquals(
            result, "1010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 3);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 8);
        org.junit.Assert.assertEquals(
            result, "33"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 4);
        org.junit.Assert.assertEquals(
            result, "10000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 4);
        org.junit.Assert.assertEquals(
            result, "10001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 2);
        org.junit.Assert.assertEquals(
            result, "1000011100001000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 2);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 2);
        org.junit.Assert.assertEquals(
            result, "1000011100001001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 2);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 5);
        org.junit.Assert.assertEquals(
            result, "30330203"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 7);
        org.junit.Assert.assertEquals(
            result, "10533"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2, 7);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 9);
        org.junit.Assert.assertEquals(
            result, "30"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(5, 3);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 2);
        org.junit.Assert.assertEquals(
            result, "1000011100000111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 4);
        org.junit.Assert.assertEquals(
            result, "20130020"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 2);
        org.junit.Assert.assertEquals(
            result, "101001101101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 4);
        org.junit.Assert.assertEquals(
            result, "122"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 8);
        org.junit.Assert.assertEquals(
            result, "3743"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 9);
        org.junit.Assert.assertEquals(
            result, "52370"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 3);
        org.junit.Assert.assertEquals(
            result, "1202102021"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 8);
        org.junit.Assert.assertEquals(
            result, "401"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 3);
        org.junit.Assert.assertEquals(
            result, "10122212"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 7);
        org.junit.Assert.assertEquals(
            result, "35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 5);
        org.junit.Assert.assertEquals(
            result, "31034"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 3);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 8);
        org.junit.Assert.assertEquals(
            result, "726746426"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 8);
        org.junit.Assert.assertEquals(
            result, "103407"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 7);
        org.junit.Assert.assertEquals(
            result, "515"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 6);
        org.junit.Assert.assertEquals(
            result, "4443111553"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 8);
        org.junit.Assert.assertEquals(
            result, "400"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 6);
        org.junit.Assert.assertEquals(
            result, "20205"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 6);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 3);
        org.junit.Assert.assertEquals(
            result, "1202102022"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 5);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 5);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 4);
        org.junit.Assert.assertEquals(
            result, "212021121333"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 2);
        org.junit.Assert.assertEquals(
            result, "10111000001111100111011100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 6);
        org.junit.Assert.assertEquals(
            result, "13203"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 9);
        org.junit.Assert.assertEquals(
            result, "110784025"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 6);
        org.junit.Assert.assertEquals(
            result, "4443111555"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 7);
        org.junit.Assert.assertEquals(
            result, "1124346560"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 9);
        org.junit.Assert.assertEquals(
            result, "277266781"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 9);
        org.junit.Assert.assertEquals(
            result, "110784028"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 6);
        org.junit.Assert.assertEquals(
            result, "43"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 4);
        org.junit.Assert.assertEquals(
            result, "20130021"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 4);
        org.junit.Assert.assertEquals(
            result, "123"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 9);
        org.junit.Assert.assertEquals(
            result, "52371"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 3);
        org.junit.Assert.assertEquals(
            result, "100111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 4);
        org.junit.Assert.assertEquals(
            result, "323332233"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 8);
        org.junit.Assert.assertEquals(
            result, "737657"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 9);
        org.junit.Assert.assertEquals(
            result, "315"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 3);
        org.junit.Assert.assertEquals(
            result, "222"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 2);
        org.junit.Assert.assertEquals(
            result, "100110001001011001111111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 6);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 8);
        org.junit.Assert.assertEquals(
            result, "270174737"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 5);
        org.junit.Assert.assertEquals(
            result, "41134"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 9);
        org.junit.Assert.assertEquals(
            result, "277266782"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 6);
        org.junit.Assert.assertEquals(
            result, "1105"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 7);
        org.junit.Assert.assertEquals(
            result, "3026236222"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 3);
        org.junit.Assert.assertEquals(
            result, "100112"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 9);
        org.junit.Assert.assertEquals(
            result, "414006"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 7);
        org.junit.Assert.assertEquals(
            result, "202534"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 5);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 4);
        org.junit.Assert.assertEquals(
            result, "13112330310112"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 2);
        org.junit.Assert.assertEquals(
            result, "10111000001111100111011110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 7);
        org.junit.Assert.assertEquals(
            result, "150666342"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 3);
        org.junit.Assert.assertEquals(
            result, "1202102100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 4);
        org.junit.Assert.assertEquals(
            result, "13112330310113"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 5);
        org.junit.Assert.assertEquals(
            result, "2010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 4);
        org.junit.Assert.assertEquals(
            result, "13112330310110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456792, 4);
        org.junit.Assert.assertEquals(
            result, "13112330310120"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 6);
        org.junit.Assert.assertEquals(
            result, "1103"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 8);
        org.junit.Assert.assertEquals(
            result, "46113200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 9);
        org.junit.Assert.assertEquals(
            result, "313"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 6);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 3);
        org.junit.Assert.assertEquals(
            result, "22121022020212202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 2);
        org.junit.Assert.assertEquals(
            result, "11111111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 8);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 8);
        org.junit.Assert.assertEquals(
            result, "103410"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 5);
        org.junit.Assert.assertEquals(
            result, "10030000000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 3);
        org.junit.Assert.assertEquals(
            result, "100110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 3);
        org.junit.Assert.assertEquals(
            result, "10100212211000220"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 9);
        org.junit.Assert.assertEquals(
            result, "110784026"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 3);
        org.junit.Assert.assertEquals(
            result, "22121022020212201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 7);
        org.junit.Assert.assertEquals(
            result, "202533"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 3);
        org.junit.Assert.assertEquals(
            result, "1202102101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 6);
        org.junit.Assert.assertEquals(
            result, "20130035113"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 3);
        org.junit.Assert.assertEquals(
            result, "22121022020212122"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 5);
        org.junit.Assert.assertEquals(
            result, "2012"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 5);
        org.junit.Assert.assertEquals(
            result, "4010314414241"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 9);
        org.junit.Assert.assertEquals(
            result, "2684"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 6);
        org.junit.Assert.assertEquals(
            result, "13202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 7);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 5);
        org.junit.Assert.assertEquals(
            result, "44331022321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 8);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 8);
        org.junit.Assert.assertEquals(
            result, "270174736"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 7);
        org.junit.Assert.assertEquals(
            result, "202535"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 2);
        org.junit.Assert.assertEquals(
            result, "1000011100001011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 7);
        org.junit.Assert.assertEquals(
            result, "40"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 4);
        org.junit.Assert.assertEquals(
            result, "20130023"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(257, 2);
        org.junit.Assert.assertEquals(
            result, "100000001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 5);
        org.junit.Assert.assertEquals(
            result, "2101234"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(11, 9);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298461, 7);
        org.junit.Assert.assertEquals(
            result, "1124346561"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 6);
        org.junit.Assert.assertEquals(
            result, "4443111554"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245680, 4);
        org.junit.Assert.assertEquals(
            result, "323332300"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(11, 6);
        org.junit.Assert.assertEquals(
            result, "15"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 5);
        org.junit.Assert.assertEquals(
            result, "2101233"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 6);
        org.junit.Assert.assertEquals(
            result, "554200144"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 3);
        org.junit.Assert.assertEquals(
            result, "10100212211000221"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 3);
        org.junit.Assert.assertEquals(
            result, "2202202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34569, 8);
        org.junit.Assert.assertEquals(
            result, "103411"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 5);
        org.junit.Assert.assertEquals(
            result, "30330204"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245680, 3);
        org.junit.Assert.assertEquals(
            result, "110111000021"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 4);
        org.junit.Assert.assertEquals(
            result, "212021122000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 7);
        org.junit.Assert.assertEquals(
            result, "150666343"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999999, 3);
        org.junit.Assert.assertEquals(
            result, "200211001102100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 6);
        org.junit.Assert.assertEquals(
            result, "424015"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 9);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(1, 4);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(11, 7);
        org.junit.Assert.assertEquals(
            result, "14"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 4);
        org.junit.Assert.assertEquals(
            result, "221232"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 8);
        org.junit.Assert.assertEquals(
            result, "726746427"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 5);
        org.junit.Assert.assertEquals(
            result, "10024444443"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 8);
        org.junit.Assert.assertEquals(
            result, "103413"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 3);
        org.junit.Assert.assertEquals(
            result, "110111000020"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456792, 7);
        org.junit.Assert.assertEquals(
            result, "3026236224"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 7);
        org.junit.Assert.assertEquals(
            result, "202532"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456792, 5);
        org.junit.Assert.assertEquals(
            result, "223101104132"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34568, 6);
        org.junit.Assert.assertEquals(
            result, "424012"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 5);
        org.junit.Assert.assertEquals(
            result, "223101104123"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 2);
        org.junit.Assert.assertEquals(
            result, "11111100100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 6);
        org.junit.Assert.assertEquals(
            result, "20210"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 8);
        org.junit.Assert.assertEquals(
            result, "270174734"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 6);
        org.junit.Assert.assertEquals(
            result, "5133222"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 3);
        org.junit.Assert.assertEquals(
            result, "200211001102022"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 5);
        org.junit.Assert.assertEquals(
            result, "2101240"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 5);
        org.junit.Assert.assertEquals(
            result, "44331022320"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 2);
        org.junit.Assert.assertEquals(
            result, "100110001001011010000000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456792, 3);
        org.junit.Assert.assertEquals(
            result, "22121022020212210"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 8);
        org.junit.Assert.assertEquals(
            result, "3744"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 3);
        org.junit.Assert.assertEquals(
            result, "1202102102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245680, 8);
        org.junit.Assert.assertEquals(
            result, "737660"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 7);
        org.junit.Assert.assertEquals(
            result, "3026236223"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(6, 2);
        org.junit.Assert.assertEquals(
            result, "110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 8);
        org.junit.Assert.assertEquals(
            result, "726746424"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 8);
        org.junit.Assert.assertEquals(
            result, "377"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456792, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100011000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(258, 5);
        org.junit.Assert.assertEquals(
            result, "2013"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(258, 9);
        org.junit.Assert.assertEquals(
            result, "316"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 3);
        org.junit.Assert.assertEquals(
            result, "10100212211000222"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2671, 2);
        org.junit.Assert.assertEquals(
            result, "101001101111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 4);
        org.junit.Assert.assertEquals(
            result, "323332231"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 2);
        org.junit.Assert.assertEquals(
            result, "100110001001011010000001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 8);
        org.junit.Assert.assertEquals(
            result, "46113201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213133"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 8);
        org.junit.Assert.assertEquals(
            result, "103412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34571, 9);
        org.junit.Assert.assertEquals(
            result, "52372"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 7);
        org.junit.Assert.assertEquals(
            result, "1124346562"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213130"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 2);
        org.junit.Assert.assertEquals(
            result, "100110001001011001111110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(11, 3);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 6);
        org.junit.Assert.assertEquals(
            result, "554200142"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2671, 4);
        org.junit.Assert.assertEquals(
            result, "221233"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 2);
        org.junit.Assert.assertEquals(
            result, "11111100010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245676, 5);
        org.junit.Assert.assertEquals(
            result, "30330201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456791, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 7);
        org.junit.Assert.assertEquals(
            result, "150666341"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 2);
        org.junit.Assert.assertEquals(
            result, "11100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 5);
        org.junit.Assert.assertEquals(
            result, "103"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 6);
        org.junit.Assert.assertEquals(
            result, "554200145"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 2);
        org.junit.Assert.assertEquals(
            result, "1000011100001010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245676, 2);
        org.junit.Assert.assertEquals(
            result, "111011111110101100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(11, 5);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2672, 5);
        org.junit.Assert.assertEquals(
            result, "41142"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298460, 6);
        org.junit.Assert.assertEquals(
            result, "4443111552"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34570, 4);
        org.junit.Assert.assertEquals(
            result, "20130022"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 6);
        org.junit.Assert.assertEquals(
            result, "1104"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 5);
        org.junit.Assert.assertEquals(
            result, "223101104130"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298464, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2669, 9);
        org.junit.Assert.assertEquals(
            result, "3585"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456790, 6);
        org.junit.Assert.assertEquals(
            result, "20130035114"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 5);
        org.junit.Assert.assertEquals(
            result, "30330202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 7);
        org.junit.Assert.assertEquals(
            result, "5614"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(255, 4);
        org.junit.Assert.assertEquals(
            result, "3333"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2019, 2);
        org.junit.Assert.assertEquals(
            result, "11111100011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 4);
        org.junit.Assert.assertEquals(
            result, "130"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 7);
        org.junit.Assert.assertEquals(
            result, "150666344"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298464, 6);
        org.junit.Assert.assertEquals(
            result, "4443112000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(30, 2);
        org.junit.Assert.assertEquals(
            result, "11110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 2);
        org.junit.Assert.assertEquals(
            result, "11001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 6);
        org.junit.Assert.assertEquals(
            result, "20130035112"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(258, 2);
        org.junit.Assert.assertEquals(
            result, "100000010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 8);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 6);
        org.junit.Assert.assertEquals(
            result, "5133223"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 4);
        org.junit.Assert.assertEquals(
            result, "133202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 7);
        org.junit.Assert.assertEquals(
            result, "202531"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 5);
        org.junit.Assert.assertEquals(
            result, "31033"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(27, 7);
        org.junit.Assert.assertEquals(
            result, "36"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000000, 9);
        org.junit.Assert.assertEquals(
            result, "20731371"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 8);
        org.junit.Assert.assertEquals(
            result, "7267464260"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 7);
        org.junit.Assert.assertEquals(
            result, "2042160"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(3, 8);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 9);
        org.junit.Assert.assertEquals(
            result, "414004"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 6);
        org.junit.Assert.assertEquals(
            result, "424011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 6);
        org.junit.Assert.assertEquals(
            result, "242000505412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 7);
        org.junit.Assert.assertEquals(
            result, "2042155"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 6);
        org.junit.Assert.assertEquals(
            result, "5133221"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 6);
        org.junit.Assert.assertEquals(
            result, "242000505413"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 8);
        org.junit.Assert.assertEquals(
            result, "34"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 9);
        org.junit.Assert.assertEquals(
            result, "2484401018"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 8);
        org.junit.Assert.assertEquals(
            result, "737655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 7);
        org.junit.Assert.assertEquals(
            result, "33321631442"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 5);
        org.junit.Assert.assertEquals(
            result, "4010314414240"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(4, 7);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 3);
        org.junit.Assert.assertEquals(
            result, "110111000011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 2);
        org.junit.Assert.assertEquals(
            result, "100000000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245678, 2);
        org.junit.Assert.assertEquals(
            result, "111011111110101110"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(26, 9);
        org.junit.Assert.assertEquals(
            result, "28"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245679, 2);
        org.junit.Assert.assertEquals(
            result, "111011111110101111"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 5);
        org.junit.Assert.assertEquals(
            result, "41140"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 8);
        org.junit.Assert.assertEquals(
            result, "5156"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 6);
        org.junit.Assert.assertEquals(
            result, "242000505414"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010110010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2017, 3);
        org.junit.Assert.assertEquals(
            result, "2202201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 5);
        org.junit.Assert.assertEquals(
            result, "31040"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 4);
        org.junit.Assert.assertEquals(
            result, "212021122001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010110001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 9);
        org.junit.Assert.assertEquals(
            result, "277266780"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000002, 6);
        org.junit.Assert.assertEquals(
            result, "554200150"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010110011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000002, 7);
        org.junit.Assert.assertEquals(
            result, "150666345"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456788, 9);
        org.junit.Assert.assertEquals(
            result, "277266778"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(28, 6);
        org.junit.Assert.assertEquals(
            result, "44"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2017, 7);
        org.junit.Assert.assertEquals(
            result, "5611"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 7);
        org.junit.Assert.assertEquals(
            result, "34"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 9);
        org.junit.Assert.assertEquals(
            result, "3586"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 8);
        org.junit.Assert.assertEquals(
            result, "7267464262"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 9);
        org.junit.Assert.assertEquals(
            result, "20731372"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 4);
        org.junit.Assert.assertEquals(
            result, "322313212202303"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 3);
        org.junit.Assert.assertEquals(
            result, "221"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(29, 2);
        org.junit.Assert.assertEquals(
            result, "11101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10, 6);
        org.junit.Assert.assertEquals(
            result, "14"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 7);
        org.junit.Assert.assertEquals(
            result, "33321631445"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 4);
        org.junit.Assert.assertEquals(
            result, "322313212202301"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(29, 3);
        org.junit.Assert.assertEquals(
            result, "1002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2020, 6);
        org.junit.Assert.assertEquals(
            result, "13204"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 2);
        org.junit.Assert.assertEquals(
            result, "111010110111100110100010110000"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245676, 3);
        org.junit.Assert.assertEquals(
            result, "110111000010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 9);
        org.junit.Assert.assertEquals(
            result, "20731368"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245676, 4);
        org.junit.Assert.assertEquals(
            result, "323332230"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245676, 9);
        org.junit.Assert.assertEquals(
            result, "414003"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2016, 7);
        org.junit.Assert.assertEquals(
            result, "5610"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 6);
        org.junit.Assert.assertEquals(
            result, "242000505411"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 8);
        org.junit.Assert.assertEquals(
            result, "7267464257"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000002, 5);
        org.junit.Assert.assertEquals(
            result, "10030000002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2671, 6);
        org.junit.Assert.assertEquals(
            result, "20211"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 3);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 4);
        org.junit.Assert.assertEquals(
            result, "322313212202233"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2017, 2);
        org.junit.Assert.assertEquals(
            result, "11111100001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 5);
        org.junit.Assert.assertEquals(
            result, "4010314414234"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2670, 3);
        org.junit.Assert.assertEquals(
            result, "10122220"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2018, 7);
        org.junit.Assert.assertEquals(
            result, "5612"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 4);
        org.junit.Assert.assertEquals(
            result, "121"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 7);
        org.junit.Assert.assertEquals(
            result, "33321631441"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 3);
        org.junit.Assert.assertEquals(
            result, "200211001102102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(256, 7);
        org.junit.Assert.assertEquals(
            result, "514"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2016, 5);
        org.junit.Assert.assertEquals(
            result, "31031"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245677, 2);
        org.junit.Assert.assertEquals(
            result, "111011111110101101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(34567, 5);
        org.junit.Assert.assertEquals(
            result, "2101232"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2017, 6);
        org.junit.Assert.assertEquals(
            result, "13201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(29, 4);
        org.junit.Assert.assertEquals(
            result, "131"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000001, 5);
        org.junit.Assert.assertEquals(
            result, "10030000001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(29, 9);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298462, 5);
        org.junit.Assert.assertEquals(
            result, "44331022322"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654320, 3);
        org.junit.Assert.assertEquals(
            result, "2112211110001000122"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9999998, 8);
        org.junit.Assert.assertEquals(
            result, "46113176"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 7);
        org.junit.Assert.assertEquals(
            result, "1124346563"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 3);
        org.junit.Assert.assertEquals(
            result, "2112211110001000202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2671, 8);
        org.junit.Assert.assertEquals(
            result, "5157"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298459, 2);
        org.junit.Assert.assertEquals(
            result, "10111000001111100111011011"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(10000002, 2);
        org.junit.Assert.assertEquals(
            result, "100110001001011010000010"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 4);
        org.junit.Assert.assertEquals(
            result, "322313212202302"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 6);
        org.junit.Assert.assertEquals(
            result, "242000505415"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(25, 9);
        org.junit.Assert.assertEquals(
            result, "27"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2016, 4);
        org.junit.Assert.assertEquals(
            result, "133200"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245680, 7);
        org.junit.Assert.assertEquals(
            result, "2042161"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 7);
        org.junit.Assert.assertEquals(
            result, "3026236221"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2668, 8);
        org.junit.Assert.assertEquals(
            result, "5154"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(123456789, 5);
        org.junit.Assert.assertEquals(
            result, "223101104124"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 3);
        org.junit.Assert.assertEquals(
            result, "2112211110001000201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(245675, 4);
        org.junit.Assert.assertEquals(
            result, "323332223"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2017, 8);
        org.junit.Assert.assertEquals(
            result, "3741"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654321, 7);
        org.junit.Assert.assertEquals(
            result, "33321631443"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298463, 5);
        org.junit.Assert.assertEquals(
            result, "44331022323"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298459, 4);
        org.junit.Assert.assertEquals(
            result, "2320033213123"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654322, 7);
        org.junit.Assert.assertEquals(
            result, "33321631444"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(48298459, 3);
        org.junit.Assert.assertEquals(
            result, "10100212211000211"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(12, 9);
        org.junit.Assert.assertEquals(
            result, "13"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(2021, 2);
        org.junit.Assert.assertEquals(
            result, "11111100101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654323, 8);
        org.junit.Assert.assertEquals(
            result, "7267464263"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(12, 8);
        org.junit.Assert.assertEquals(
            result, "14"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(987654319, 9);
        org.junit.Assert.assertEquals(
            result, "2484401017"
        );
    }
}


