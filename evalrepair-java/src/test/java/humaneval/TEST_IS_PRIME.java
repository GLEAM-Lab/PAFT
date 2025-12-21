package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_IS_PRIME {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(101);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(11);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(13441);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(61);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(17);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(85);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(77);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(255379);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(2);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(31);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(40);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(103);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(199);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1009);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(8999);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234567);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9000);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(32);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9001);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(39);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234566);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9002);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(102);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(200);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(56);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(38);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(37);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1010);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234568);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1008);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(33);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(35);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(64);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(63);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234564);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1011);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234569);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(197);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(8998);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(57);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(28);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(3);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234563);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(36);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9003);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1234570);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9004);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(1012);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(55);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-30);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7937);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34981);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42043);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(123456789);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42042);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(123456790);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7939);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7938);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7936);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7935);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(23);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42044);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-11);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7934);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7933);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(14);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34980);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(24);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42041);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-8);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7940);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(70);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-13);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-40);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(18);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-12);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-47);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-49);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34979);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42040);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34978);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-41);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-42);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(25);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(67);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-39);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(26);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(62);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-48);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(66);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-20);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(7941);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-50);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-37);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-28);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-101);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-255379);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-2147483648);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(9999991);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34982);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34977);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(123456788);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(123456791);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-91);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(93);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-90);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(92);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(34983);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-92);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-89);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-78);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(82);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-76);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(45);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(42045);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(44);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(46);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-100);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(19);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(72);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(91);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-38);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_PRIME.is_prime(-75);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}

