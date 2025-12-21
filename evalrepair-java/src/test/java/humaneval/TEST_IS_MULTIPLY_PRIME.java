package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_IS_MULTIPLY_PRIME {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(30);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(33);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(49);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(77);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(91);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(99);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(90);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(98);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(25);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(21);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(48);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(20);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(22);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(32);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(26);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(78);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(19);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(47);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(31);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(29);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-98);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-37);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-38);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(28);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(18);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(23);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-92);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(57);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-99);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(58);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(56);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(92);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-80);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(34);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-75);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-100);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-95);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-94);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(17);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(59);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(93);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-82);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-81);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-96);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-74);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(97);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(42);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-101);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(43);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(44);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(45);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-56);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(60);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-55);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(46);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(62);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(55);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(61);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(41);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(40);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-57);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(63);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-102);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(52);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-72);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-97);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(94);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(12);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(89);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(53);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(0);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(64);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-58);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(65);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-71);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(95);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(35);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-70);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(96);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-59);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(15);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(-33);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}

