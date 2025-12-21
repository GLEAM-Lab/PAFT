package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_DECIMAL_TO_BINARY {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(0);
        org.junit.Assert.assertEquals(
            result, "db0db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(32);
        org.junit.Assert.assertEquals(
            result, "db100000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(103);
        org.junit.Assert.assertEquals(
            result, "db1100111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(15);
        org.junit.Assert.assertEquals(
            result, "db1111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100001);
        org.junit.Assert.assertEquals(
            result, "db11000011010100001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(255);
        org.junit.Assert.assertEquals(
            result, "db11111111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999999);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(7);
        org.junit.Assert.assertEquals(
            result, "db111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1023);
        org.junit.Assert.assertEquals(
            result, "db1111111111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1);
        org.junit.Assert.assertEquals(
            result, "db1db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(2);
        org.junit.Assert.assertEquals(
            result, "db10db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(3);
        org.junit.Assert.assertEquals(
            result, "db11db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(4);
        org.junit.Assert.assertEquals(
            result, "db100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000000);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(6);
        org.junit.Assert.assertEquals(
            result, "db110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000001);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(5);
        org.junit.Assert.assertEquals(
            result, "db101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100002);
        org.junit.Assert.assertEquals(
            result, "db11000011010100010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100000);
        org.junit.Assert.assertEquals(
            result, "db11000011010100000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1022);
        org.junit.Assert.assertEquals(
            result, "db1111111110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8);
        org.junit.Assert.assertEquals(
            result, "db1000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000002);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1024);
        org.junit.Assert.assertEquals(
            result, "db10000000000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100003);
        org.junit.Assert.assertEquals(
            result, "db11000011010100011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999998);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(256);
        org.junit.Assert.assertEquals(
            result, "db100000000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(257);
        org.junit.Assert.assertEquals(
            result, "db100000001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1021);
        org.junit.Assert.assertEquals(
            result, "db1111111101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(259);
        org.junit.Assert.assertEquals(
            result, "db100000011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000004);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000005);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(9);
        org.junit.Assert.assertEquals(
            result, "db1001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(260);
        org.junit.Assert.assertEquals(
            result, "db100000100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100004);
        org.junit.Assert.assertEquals(
            result, "db11000011010100100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(258);
        org.junit.Assert.assertEquals(
            result, "db100000010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000006);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(45);
        org.junit.Assert.assertEquals(
            result, "db101101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100005);
        org.junit.Assert.assertEquals(
            result, "db11000011010100101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(99999);
        org.junit.Assert.assertEquals(
            result, "db11000011010011111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1025);
        org.junit.Assert.assertEquals(
            result, "db10000000001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999997);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999996);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000003);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(44);
        org.junit.Assert.assertEquals(
            result, "db101100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(43);
        org.junit.Assert.assertEquals(
            result, "db101011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000007);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000000111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(42);
        org.junit.Assert.assertEquals(
            result, "db101010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999995);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(46);
        org.junit.Assert.assertEquals(
            result, "db101110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(47);
        org.junit.Assert.assertEquals(
            result, "db101111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(254);
        org.junit.Assert.assertEquals(
            result, "db11111110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(10);
        org.junit.Assert.assertEquals(
            result, "db1010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999994);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(28);
        org.junit.Assert.assertEquals(
            result, "db11100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100007);
        org.junit.Assert.assertEquals(
            result, "db11000011010100111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(41);
        org.junit.Assert.assertEquals(
            result, "db101001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1020);
        org.junit.Assert.assertEquals(
            result, "db1111111100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(27);
        org.junit.Assert.assertEquals(
            result, "db11011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1026);
        org.junit.Assert.assertEquals(
            result, "db10000000010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(23);
        org.junit.Assert.assertEquals(
            result, "db10111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(253);
        org.junit.Assert.assertEquals(
            result, "db11111101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100006);
        org.junit.Assert.assertEquals(
            result, "db11000011010100110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(38);
        org.junit.Assert.assertEquals(
            result, "db100110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100008);
        org.junit.Assert.assertEquals(
            result, "db11000011010101000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(39);
        org.junit.Assert.assertEquals(
            result, "db100111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100009);
        org.junit.Assert.assertEquals(
            result, "db11000011010101001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1027);
        org.junit.Assert.assertEquals(
            result, "db10000000011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(261);
        org.junit.Assert.assertEquals(
            result, "db100000101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(26);
        org.junit.Assert.assertEquals(
            result, "db11010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1019);
        org.junit.Assert.assertEquals(
            result, "db1111111011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000000008);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100101000001000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(11);
        org.junit.Assert.assertEquals(
            result, "db1011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(251);
        org.junit.Assert.assertEquals(
            result, "db11111011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1018);
        org.junit.Assert.assertEquals(
            result, "db1111111010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(48);
        org.junit.Assert.assertEquals(
            result, "db110000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(22);
        org.junit.Assert.assertEquals(
            result, "db10110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(99998);
        org.junit.Assert.assertEquals(
            result, "db11000011010011110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(21);
        org.junit.Assert.assertEquals(
            result, "db10101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(40);
        org.junit.Assert.assertEquals(
            result, "db101000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(37);
        org.junit.Assert.assertEquals(
            result, "db100101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(20);
        org.junit.Assert.assertEquals(
            result, "db10100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(100011);
        org.junit.Assert.assertEquals(
            result, "db11000011010101011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(262);
        org.junit.Assert.assertEquals(
            result, "db100000110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(25);
        org.junit.Assert.assertEquals(
            result, "db11001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1028);
        org.junit.Assert.assertEquals(
            result, "db10000000100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(24);
        org.junit.Assert.assertEquals(
            result, "db11000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999999993);
        org.junit.Assert.assertEquals(
            result, "db111011100110101100100111111001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892743);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1000);
        org.junit.Assert.assertEquals(
            result, "db1111101000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892742);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892740);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892744);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892745);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892741);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(999);
        org.junit.Assert.assertEquals(
            result, "db1111100111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892739);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(998);
        org.junit.Assert.assertEquals(
            result, "db1111100110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1001);
        org.junit.Assert.assertEquals(
            result, "db1111101001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1002);
        org.junit.Assert.assertEquals(
            result, "db1111101010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892737);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892746);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892747);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1003);
        org.junit.Assert.assertEquals(
            result, "db1111101011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(252);
        org.junit.Assert.assertEquals(
            result, "db11111100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892748);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(997);
        org.junit.Assert.assertEquals(
            result, "db1111100101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892736);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892735);
        org.junit.Assert.assertEquals(
            result, "db100001111011000100111111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892738);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101000010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1004);
        org.junit.Assert.assertEquals(
            result, "db1111101100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(996);
        org.junit.Assert.assertEquals(
            result, "db1111100100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892750);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892749);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1006);
        org.junit.Assert.assertEquals(
            result, "db1111101110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892751);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101001111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(99);
        org.junit.Assert.assertEquals(
            result, "db1100011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(98);
        org.junit.Assert.assertEquals(
            result, "db1100010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(92);
        org.junit.Assert.assertEquals(
            result, "db1011100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1005);
        org.junit.Assert.assertEquals(
            result, "db1111101101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(8892752);
        org.junit.Assert.assertEquals(
            result, "db100001111011000101010000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(1007);
        org.junit.Assert.assertEquals(
            result, "db1111101111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(995);
        org.junit.Assert.assertEquals(
            result, "db1111100011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(16);
        org.junit.Assert.assertEquals(
            result, "db10000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(263);
        org.junit.Assert.assertEquals(
            result, "db100000111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(53);
        org.junit.Assert.assertEquals(
            result, "db110101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(30);
        org.junit.Assert.assertEquals(
            result, "db11110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(29);
        org.junit.Assert.assertEquals(
            result, "db11101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(67);
        org.junit.Assert.assertEquals(
            result, "db1000011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(66);
        org.junit.Assert.assertEquals(
            result, "db1000010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(63);
        org.junit.Assert.assertEquals(
            result, "db111111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(81);
        org.junit.Assert.assertEquals(
            result, "db1010001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(82);
        org.junit.Assert.assertEquals(
            result, "db1010010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(80);
        org.junit.Assert.assertEquals(
            result, "db1010000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(68);
        org.junit.Assert.assertEquals(
            result, "db1000100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(31);
        org.junit.Assert.assertEquals(
            result, "db11111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(83);
        org.junit.Assert.assertEquals(
            result, "db1010011db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(79);
        org.junit.Assert.assertEquals(
            result, "db1001111db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(62);
        org.junit.Assert.assertEquals(
            result, "db111110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(61);
        org.junit.Assert.assertEquals(
            result, "db111101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(84);
        org.junit.Assert.assertEquals(
            result, "db1010100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(65);
        org.junit.Assert.assertEquals(
            result, "db1000001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(60);
        org.junit.Assert.assertEquals(
            result, "db111100db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(250);
        org.junit.Assert.assertEquals(
            result, "db11111010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(249);
        org.junit.Assert.assertEquals(
            result, "db11111001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(85);
        org.junit.Assert.assertEquals(
            result, "db1010101db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(89);
        org.junit.Assert.assertEquals(
            result, "db1011001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(49);
        org.junit.Assert.assertEquals(
            result, "db110001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(78);
        org.junit.Assert.assertEquals(
            result, "db1001110db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(50);
        org.junit.Assert.assertEquals(
            result, "db110010db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(88);
        org.junit.Assert.assertEquals(
            result, "db1011000db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(33);
        org.junit.Assert.assertEquals(
            result, "db100001db"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(90);
        org.junit.Assert.assertEquals(
            result, "db1011010db"
        );
    }
}

