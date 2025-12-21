package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_LARGEST_DIVISOR {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(3);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(10);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(100);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(49);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(2);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(27);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(235);
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500);
        org.junit.Assert.assertEquals(
            result, 250
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(999);
        org.junit.Assert.assertEquals(
            result, 333
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1000);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(36);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(72);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(81);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(499);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(234);
        org.junit.Assert.assertEquals(
            result, 117
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(73);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(998);
        org.junit.Assert.assertEquals(
            result, 499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(35);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(22);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(23);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1001);
        org.junit.Assert.assertEquals(
            result, 143
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(74);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(236);
        org.junit.Assert.assertEquals(
            result, 118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(82);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(75);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(99);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(76);
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(77);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(24);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(28);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(80);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(238);
        org.junit.Assert.assertEquals(
            result, 119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(29);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(237);
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(56);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(57);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(997);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(30);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(4);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(102);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(37);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(233);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(103);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(78);
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(55);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(5);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(58);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(21);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(83);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(25);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1003);
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(996);
        org.junit.Assert.assertEquals(
            result, 498
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(501);
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(34);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(232);
        org.junit.Assert.assertEquals(
            result, 116
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(995);
        org.junit.Assert.assertEquals(
            result, 199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(231);
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(33);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(79);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(502);
        org.junit.Assert.assertEquals(
            result, 251
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1004);
        org.junit.Assert.assertEquals(
            result, 502
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(54);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1005);
        org.junit.Assert.assertEquals(
            result, 335
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1002);
        org.junit.Assert.assertEquals(
            result, 501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(20);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(230);
        org.junit.Assert.assertEquals(
            result, 115
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(98);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(32);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(31);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(53);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(65);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(59);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(38);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(52);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(19);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(97);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(64);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(12);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(51);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1006);
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(39);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(40);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(60);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(61);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(6);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(96);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(63);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(26);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(104);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(239);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(41);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(88);
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(42);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(84);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(503);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(43);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(62);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(18);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(127);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500027);
        org.junit.Assert.assertEquals(
            result, 45457
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732312);
        org.junit.Assert.assertEquals(
            result, 366156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234567);
        org.junit.Assert.assertEquals(
            result, 9721
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732313);
        org.junit.Assert.assertEquals(
            result, 23623
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(126);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500028);
        org.junit.Assert.assertEquals(
            result, 250014
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1322);
        org.junit.Assert.assertEquals(
            result, 661
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732314);
        org.junit.Assert.assertEquals(
            result, 366157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234568);
        org.junit.Assert.assertEquals(
            result, 617284
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1320);
        org.junit.Assert.assertEquals(
            result, 660
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500029);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(95);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500030);
        org.junit.Assert.assertEquals(
            result, 250015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732311);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1323);
        org.junit.Assert.assertEquals(
            result, 441
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234569);
        org.junit.Assert.assertEquals(
            result, 411523
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234566);
        org.junit.Assert.assertEquals(
            result, 617283
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500031);
        org.junit.Assert.assertEquals(
            result, 166677
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(50);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732315);
        org.junit.Assert.assertEquals(
            result, 244105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234570);
        org.junit.Assert.assertEquals(
            result, 617285
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732310);
        org.junit.Assert.assertEquals(
            result, 366155
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(128);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732309);
        org.junit.Assert.assertEquals(
            result, 244103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1324);
        org.junit.Assert.assertEquals(
            result, 662
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500026);
        org.junit.Assert.assertEquals(
            result, 250013
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(71);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732316);
        org.junit.Assert.assertEquals(
            result, 366158
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(131);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(125);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500025);
        org.junit.Assert.assertEquals(
            result, 166675
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(70);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(48);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(47);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(46);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(994);
        org.junit.Assert.assertEquals(
            result, 497
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(69);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(124);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234572);
        org.junit.Assert.assertEquals(
            result, 617286
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1325);
        org.junit.Assert.assertEquals(
            result, 265
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(500024);
        org.junit.Assert.assertEquals(
            result, 250012
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(132);
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234571);
        org.junit.Assert.assertEquals(
            result, 94967
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(94);
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(993);
        org.junit.Assert.assertEquals(
            result, 331
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(130);
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(992);
        org.junit.Assert.assertEquals(
            result, 496
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(129);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1318);
        org.junit.Assert.assertEquals(
            result, 659
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732317);
        org.junit.Assert.assertEquals(
            result, 38543
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732318);
        org.junit.Assert.assertEquals(
            result, 366159
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(990);
        org.junit.Assert.assertEquals(
            result, 495
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(44);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(989);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732308);
        org.junit.Assert.assertEquals(
            result, 366154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732306);
        org.junit.Assert.assertEquals(
            result, 366153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732307);
        org.junit.Assert.assertEquals(
            result, 15581
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732305);
        org.junit.Assert.assertEquals(
            result, 146461
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732304);
        org.junit.Assert.assertEquals(
            result, 366152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(1234565);
        org.junit.Assert.assertEquals(
            result, 246913
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732303);
        org.junit.Assert.assertEquals(
            result, 244101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(8);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(732302);
        org.junit.Assert.assertEquals(
            result, 366151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(92);
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(93);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
}

