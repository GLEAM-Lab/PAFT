package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_IS_EQUAL_TO_SUM_EVEN {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(10));
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(11));
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(12));
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(13));
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(16));
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(20));
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(22));
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(24));
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(30));
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(36));
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(40));
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(42));
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(48));
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(50));
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(28));
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(41));
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(21));
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(39));
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(23));
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(25));
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(35));
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(19));
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(49));
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(51));
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(52));
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(47));
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(37));
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(34));
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-79));
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(29));
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(53));
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(57));
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(56));
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-2));
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(0));
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(2));
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(5));
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(9));
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(15));
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(27));
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(100));
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(105));
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-3));
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(76));
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(101));
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(98));
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(3));
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(97));
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(7));
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(1));
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(99));
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-50));
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(102));
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-71));
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-1));
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-72));
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-27));
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(104));
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(96));
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-26));
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-39));
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-55));
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-29));
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-66));
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(14));
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-42));
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(77));
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-38));
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-30));
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-25));
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-34));
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(78));
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(103));
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-65));
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-49));
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-18));
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-7));
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(75));
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-37));
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-73));
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-51));
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(106));
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(64));
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-52));
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-8));
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-6));
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-10));
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(107));
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(26));
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(18));
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(108));
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(109));
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(17));
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(110));
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(31));
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-98));
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-87));
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-5));
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-40));
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-88));
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-4));
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(55));
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-86));
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(32));
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(54));
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-68));
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-90));
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-91));
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-78));
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(-80));
    }
}

