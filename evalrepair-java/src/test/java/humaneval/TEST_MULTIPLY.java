package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_MULTIPLY {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(148, 412);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(19, 28);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2020, 1851);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(14, -15);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(76, 67);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(17, 27);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -9);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-87, 5);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(39, 25);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -12);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-5, 9);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -16);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, 321);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -5);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, 8);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-87, -87);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, -12);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 25);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, -16);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(125, 124);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -4);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, 5);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, -9);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -9);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -6);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, -16);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, -7);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -6);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-86, -87);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -7);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, -9);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(9, 25);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -5);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -12);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -9);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-5, 8);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(125, 125);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 5);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -12);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-4, -4);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -13);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-86, -86);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, 99);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-4, -5);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 8);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, 123);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -9);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-5, -4);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -16);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(100, 99);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -15);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-87, -86);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, -4);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(25, -9);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, 8);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(8, -8);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, -6);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, 124);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -5);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -8);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(9, 9);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(9, 5);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-5, -5);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(100, 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-86, -12);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, -8);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(125, -6);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, 98);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -86);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-13, -4);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-86, 5);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(123, -3);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -11);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 5);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(25, 8);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-87, 321);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-86, 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(9, -16);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 123);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(9, -12);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 99);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, -7);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, 8);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -15);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -16);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-5, -3);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -87);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 1);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(124, -8);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -86);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 3);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -975312468);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -99);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 6789);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -123457);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -123457);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 6789);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -987654);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 987654);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -17);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 6788);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, -123457);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -99);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, -987654);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 2);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, -123457);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, 987654);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -17);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 987654);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, -99);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -17);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 1234567892);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, -99);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 6789);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -17);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 3);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, -12345);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 6786);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, -12346);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -12347);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 6789);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 6787);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 246813579);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 6788);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 6787);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 3);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, 987653);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, -123457);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1234567891);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -12345);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 6787);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -123457);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, 2);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 987654);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, -12345);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 1092387466);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312467, 246813579);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 6789);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 6788);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -17);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1234567892);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -123457);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 3);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, 1);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, -12346);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, -975312468);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 1092387466);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 987655);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -975312468);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 3);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, -123457);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, -123457);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 6789);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, 987655);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 246813579);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 1092387466);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 4);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, 6789);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -16);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, -12346);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, 6789);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -123458);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -987654);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -12347);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, -975312469);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 6789);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -17);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, 1234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, -123457);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, 6785);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 1234567889);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987657, 246813579);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 3);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -16);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, -987654);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987657, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 6787);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 6788);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -123458);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, 6788);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, 6785);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, 1234567893);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 3);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, 1092387466);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -123457);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -123458);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, -987655);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 4);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, 6788);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -123457);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -987655);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-18, -17);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -99);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -123459);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 6786);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, -12346);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, -16);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -987654);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987653, -987653);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 246813579);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, 1234567892);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 246813579);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, -12345);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123459, -123459);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, -99);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-18, -19);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 1234567892);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-18, -987654);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 1092387466);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, -987656);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 1234567891);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -975312468);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -987655);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 2);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 6788);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -12346);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 5);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -975312469);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -12344);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -12347);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 6789);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 1092387466);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -12345);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, 6787);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1092387465);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -987656);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 6785);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-18, -18);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, -17);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 2);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, -123458);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123459, -99);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -16);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, -123458);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 6788);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 6787);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, -12344);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 6789);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, -17);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 6786);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 987654);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -12344);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -12345);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-52, 1234567889);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1234567891);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, 1234567893);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 2);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 1092387465);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6791, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, -12346);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -12346);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -99);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, 6787);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, 6789);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -12345);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 3);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, -9);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, -8);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -123457);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 1234567891);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -12344);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 246813579);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 2);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 6787);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 75);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 987654);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, -975312468);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -11);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -12344);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 987654);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6791, -975312468);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 3);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 246813579);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 987654);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 5);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -18);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -123457);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312467, -9);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 1234567891);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, 3);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 6788);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, -11);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 1092387466);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -987655);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, -12345);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, -100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -12347);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -18);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, 6786);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, 1);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 6789);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, 6786);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-19, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -99);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, -18);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, -12347);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 6788);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987653, -99);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 246813579);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, 6788);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -975312469);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -12346);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 4);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387464, 1092387464);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -16);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -975312468);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 1092387464);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -8);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, 1234567891);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -987656);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -17);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -8);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -987656);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 6787);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -123458);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12348, -12347);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, -987655);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 4);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, -8);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, -987657);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12348, -16);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -8);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 1234567891);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, -987657);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 5);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -12);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 6789);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 2);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, -9);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-18, 3);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-100, -9);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -975312468);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 4);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, -12347);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 6789);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 1);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, -11);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, 6785);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -123457);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, -11);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387464, -100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -11);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 1234567891);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 4);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -975312469);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12348, 6788);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 2);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 4);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 3);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6785, -987654);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, -17);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987657, -987657);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1092387465);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, -19);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987656, -12345);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6784, -987654);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 6788);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6786, -975312468);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1234567892);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 3);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-52, -99);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 1092387465);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 987655);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 6791);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-19, -19);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987655, 6);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-15, 3);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12347, 2);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123459, 5);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -987653);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 6787);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -12346);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -11);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, -99);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 4);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -99);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987653, -51);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312467, -8);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312467, -12345);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -16);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6784, -987653);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -8);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 246813579);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 5);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 7);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(56789, 126);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 15);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(25, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-1, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, -1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-1, -1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1092387466);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 987654);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 1234567889);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -99);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 1092387465);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -975312469);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -123457);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 1234567891);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, 1092387466);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, 246813579);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 6789);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -975312469);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 1092387465);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 2);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 1234567892);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 1234567893);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, -98);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 1234567893);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -9);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 1092387464);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -975312471);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -8);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 2);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, -11);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1092387466);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-100, 1092387466);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 4);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -17);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2, 1092387464);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, -123457);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, 246813579);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -12345);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -975312468);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -123457);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 1092387466);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 1092387464);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1092387465);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, 1234567888);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, 1234567888);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -123457);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 246813579);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 1234567891);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, 4);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 246813579);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-100, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 1092387466);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, 1234567893);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, -975312469);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 1234567893);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -12344);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, -12344);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, -9);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567890, 1092387464);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, 4);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, 1234567891);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 246813578);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 1234567891);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, -7);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -7);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, 1234567888);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, -123457);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 1092387466);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1092387467);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -12346);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -98);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, 1);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, -17);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -975312469);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567894, -8);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 1234567889);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, 4);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -7);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -123457);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 6788);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 1234567892);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 3);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -975312472);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -12345);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -975312471);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 6789);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, 3);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, 6787);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, 1234567888);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1234567888);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -975312471);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, -975312471);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -12346);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -12344);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567894, 1234567894);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 2);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813582, 246813582);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387467, 1092387466);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -98);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387464, 6791);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, 31);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-97, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, -11);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, -97);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, -9);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-100, 1092387464);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -12346);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -123458);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -8);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -12346);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 1234567891);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, -987654);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -123458);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, -975312468);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, -975312471);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 1092387466);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6791, 6791);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, 246813582);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 1234567889);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567894, 1234567895);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, -123457);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -123458);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, -12344);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, -123457);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -123457);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387466, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-13, -13);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -123457);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, 1092387466);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567895, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, 2);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -975312469);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -975312468);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, -12346);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813581, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1092387463);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, -101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 6791);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, 1234567893);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 246813579);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, 6789);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 1234567888);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312472, -13);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, 1092387465);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, 1234567892);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -12346);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -12345);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, 1234567888);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567895, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, -11);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 1092387462);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -9);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, -10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6791, 1234567895);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, -11);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312472, -9);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, -97);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567894, 1234567893);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-97, -123457);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-97, 1092387465);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -98);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, 1234567891);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, -975312471);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -8);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813583, 246813582);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -12345);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, -123457);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 987653);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, -8);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387468, 1092387468);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 1234567889);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, -99);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, -12);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312470, -123456);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312472, -12345);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567894, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(31, 246813578);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -12344);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 246813578);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 1234567892);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6790, 6791);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 246813582);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, -7);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, 1234567891);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-8, -12345);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(31, 987654);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, -12346);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(31, 2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567895, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567895, 1234567895);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, -975312472);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 1092387464);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987655, 2);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -123457);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, 6791);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, 246813582);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 1092387464);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, -100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987654, -8);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387467, 246813579);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, 1092387463);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387464, -975312471);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6792, 6791);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-98, -99);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6792, 2);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, 1234567889);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567889, -975312469);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813579, 5);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6791, 6789);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, -123457);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1092387467);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813580, -975312468);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, -99);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6788, 246813582);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6792, 1234567892);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-17, 1234567888);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-6, -12344);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(32, 31);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12345, 1092387464);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387464, 246813583);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(32, 1234567895);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387468, 3);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 5);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-7, 1092387463);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(31, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, 6791);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, 246813581);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 1234567896);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, -975312468);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6792, 246813581);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, -975312470);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -12345);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, -98);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 6791);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, 1092387467);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 1234567888);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, 1234567895);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, -123456);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -98);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312472, -975312472);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12346, -975312469);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, -123457);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, 1234567889);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312468, -123458);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, -16);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, 1092387464);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312469, 1234567895);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567891, 1092387465);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, 6790);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-99, -12346);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-10, 246813579);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 6789);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12344, -11);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567888, -11);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1, -13);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567893, 1234567892);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -975312472);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567896, 987654);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(987653, -101);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -123457);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123458, -12);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123455, 1234567888);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123456, 1234567893);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 6);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 246813578);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6787, 246813579);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-11, -12345);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1234567891);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-16, -123455);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387468, -97);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-14, -14);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-97, 4);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-97, 6788);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813582, -99);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-987654, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-101, 6791);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1234567895);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387465, 1234567890);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1234567892, 6792);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312467, 1234567889);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, -9);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6792, 6792);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 246813580);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-975312471, 246813583);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(4, 1092387467);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(6789, -9);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-12, 1092387466);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(5, 1234567891);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-9, 1092387468);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813578, 32);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(-123457, -123456);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(3, -16);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(1092387463, 1092387464);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(246813581, -11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
}

