package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_GREATEST_COMMON_DIVISOR {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 14);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(144, 60);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100, 50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(98, 56);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(540, 288);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 27);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(33, 55);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(7, 13);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(14, 28);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 25);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 54);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(21, 35);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100, 27);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(98, 10);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 81);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(33, 56);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 57);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(13, 14);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(540, 540);
        org.junit.Assert.assertEquals(
            result, 540
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 80);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(34, 33);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(287, 13);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(80, 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 28);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(14, 14);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(54, 33);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(57, 57);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(13, 33);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(14, 540);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 12);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(56, 56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(33, 54);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 49);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(28, 29);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 10);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(14, 27);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(50, 28);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 28);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(50, 29);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(25, 24);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(21, 20);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(82, 81);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(80, 49);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 56);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(9, 9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(57, 56);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 24);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(287, 12);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 54);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(56, 35);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(56, 10);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(287, 56);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(35, 20);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 287);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(15, 33);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(27, 27);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(20, 81);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(24, 23);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(15, 80);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 80);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(28, 12);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 57);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(29, 35);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 50);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(29, 28);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 9);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99, 56);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(80, 81);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 26);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(540, 541);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100, 10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 81);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100, 9);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(101, 27);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(13, 55);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(55, 541);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(540, 25);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(287, 287);
        org.junit.Assert.assertEquals(
            result, 287
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100, 287);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(9, 98);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(15, 11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(34, 34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(98, 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(98, 28);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(11, 10);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(286, 286);
        org.junit.Assert.assertEquals(
            result, 286
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(27, 26);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(58, 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(21, 54);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(58, 15);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(54, 9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(81, 55);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(21, 36);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(540, 10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(13, 288);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(50, 49);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(14, 15);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(28, 28);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 192);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 123456789);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 987654321);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 111111111);
        org.junit.Assert.assertEquals(
            result, 111111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 987654321);
        org.junit.Assert.assertEquals(
            result, 987654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 111111111);
        org.junit.Assert.assertEquals(
            result, 111111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 999999999);
        org.junit.Assert.assertEquals(
            result, 999999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 999999999);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 100000000);
        org.junit.Assert.assertEquals(
            result, 100000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 3699637);
        org.junit.Assert.assertEquals(
            result, 3699637
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 987654322);
        org.junit.Assert.assertEquals(
            result, 987654322
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 967);
        org.junit.Assert.assertEquals(
            result, 967
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 3699636);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 987654322);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 192);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 987654323);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 192);
        org.junit.Assert.assertEquals(
            result, 192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 108);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 1000000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1000000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(106, 108);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 193);
        org.junit.Assert.assertEquals(
            result, 193
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 999999999);
        org.junit.Assert.assertEquals(
            result, 111111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 987654320);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 987654323);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654323, 987654323);
        org.junit.Assert.assertEquals(
            result, 987654323
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 108);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 966);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 193);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 987654324);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 100000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 10);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 108);
        org.junit.Assert.assertEquals(
            result, 108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654323, 987654322);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 987654322);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 234567890);
        org.junit.Assert.assertEquals(
            result, 234567890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(105, 108);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 99999999);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 987654323);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 3699636);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 987654320);
        org.junit.Assert.assertEquals(
            result, 123456790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 3699638);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 234567888);
        org.junit.Assert.assertEquals(
            result, 234567888
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(109, 108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 10);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 108);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 111111110);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 100000000);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 999999998);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 999999999);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000002, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 966);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 1234567890);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 3699636);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 194);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1000000001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 108);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 419);
        org.junit.Assert.assertEquals(
            result, 419
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 111111110);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 194);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 987654319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 987654322);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000002, 1000000002);
        org.junit.Assert.assertEquals(
            result, 1000000002
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 987654321);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 193);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 108);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654318, 108);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 987654318);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 987654321);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 108);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 99999999);
        org.junit.Assert.assertEquals(
            result, 99999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(109, 109);
        org.junit.Assert.assertEquals(
            result, 109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 987654320);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 3699638);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 194);
        org.junit.Assert.assertEquals(
            result, 194
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 123456788);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 966);
        org.junit.Assert.assertEquals(
            result, 966
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 987654320);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 1000000000);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(106, 106);
        org.junit.Assert.assertEquals(
            result, 106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 106);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 193);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(105, 111111111);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 123456788);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 987654322);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 193);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 123456790);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 987654320);
        org.junit.Assert.assertEquals(
            result, 987654320
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 194);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 193);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 987654320);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 987654322);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 108);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 191);
        org.junit.Assert.assertEquals(
            result, 191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 234567888);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 234567889);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 106);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 987654318);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 3699638);
        org.junit.Assert.assertEquals(
            result, 3699638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 12);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 195);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 987654321);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 123456788);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 987654320);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 3699639);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(11, 11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 234567889);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 234567892);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 999999998);
        org.junit.Assert.assertEquals(
            result, 999999998
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 966);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(195, 123456789);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 234567889);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 965);
        org.junit.Assert.assertEquals(
            result, 965
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(195, 195);
        org.junit.Assert.assertEquals(
            result, 195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 987654320);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 100000000);
        org.junit.Assert.assertEquals(
            result, 100000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 418);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(106, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 234567888);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 1000000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 106);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(420, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 3699636);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 987654321);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 968);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 987654318);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 12);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 987654324);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 234567889);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 105);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 1234567890);
        org.junit.Assert.assertEquals(
            result, 1234567890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000002, 1000000000);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(105, 111111112);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 123456788);
        org.junit.Assert.assertEquals(
            result, 123456788
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 234567889);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 987654319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(190, 1000000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 195);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 987654318);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 418);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 987654320);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(968, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 194);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 987654320);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 987654319);
        org.junit.Assert.assertEquals(
            result, 987654319
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 3699636);
        org.junit.Assert.assertEquals(
            result, 3699636
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 123456788);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 108);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 987654321);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000002, 100000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 966);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 100000003);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(9, 987654320);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 123456790);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 123456790);
        org.junit.Assert.assertEquals(
            result, 123456790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 1000000002);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 234567892);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 987654318);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000004, 100000000);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699640, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 234567891);
        org.junit.Assert.assertEquals(
            result, 234567891
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654323, 12);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000002, 106);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 12);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(190, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000003, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 3699636);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000003, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 987654321);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567892, 234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 3699639);
        org.junit.Assert.assertEquals(
            result, 3699639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000003, 100000003);
        org.junit.Assert.assertEquals(
            result, 100000003
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(190, 190);
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 420);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 987654324);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000005, 420);
        org.junit.Assert.assertEquals(
            result, 105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 100000003);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 195);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(195, 965);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 107);
        org.junit.Assert.assertEquals(
            result, 107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567892, 234567892);
        org.junit.Assert.assertEquals(
            result, 234567892
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 1234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 100000003);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 195);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 111111110);
        org.junit.Assert.assertEquals(
            result, 111111110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(110, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 100000001);
        org.junit.Assert.assertEquals(
            result, 100000001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(968, 100000000);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 234567892);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 3699639);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 999999999);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 987654321);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 9);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(13, 12);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 123456787);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 3699635);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 3699636);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 195);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000002, 1234567890);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 3699636);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(11, 195);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 234567893);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 111111110);
        org.junit.Assert.assertEquals(
            result, 11111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999997, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000001, 100000002);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(194, 195);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 111111112);
        org.junit.Assert.assertEquals(
            result, 111111112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 234567892);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(12, 11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567887, 1234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 100000005);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456787, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 968);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699640, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(110, 987654319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456787, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(968, 968);
        org.junit.Assert.assertEquals(
            result, 968
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 968);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567888, 194);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 234567888);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 234567888);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 123456790);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 987654323);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654324, 987654324);
        org.junit.Assert.assertEquals(
            result, 987654324
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(109, 3699639);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 99999999);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 191);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(193, 194);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 108);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 123456789);
        org.junit.Assert.assertEquals(
            result, 123456789
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999997, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567889, 987654323);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 100000005);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567889, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 195);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 105);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456791, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 111111111);
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654325, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567889, 1234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(11, 3699639);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 195);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567886, 418);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654325, 987654319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 969);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 100000004);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 234567893);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(2147483647, 1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1, 1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(2147483647, 2147483647);
        org.junit.Assert.assertEquals(
            result, 2147483647
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 966);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 49);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 49);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 123456790);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 100000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 987654320);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 965);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 48);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 123456790);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 966);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 965);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 48);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 999999999);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 123456790);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 965);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 999999999);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 1234567890);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 30);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 108);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(419, 49);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 111111110);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 192);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(18, 192);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 1234567890);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 1000000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 1234567890);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 987654320);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 111111109);
        org.junit.Assert.assertEquals(
            result, 111111109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 987654320);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(30, 30);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 1000000000);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 123456788);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(30, 234567891);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 192);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 1000000000);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 965);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(30, 100000000);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(109, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 123456789);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 50);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(420, 123456790);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(420, 420);
        org.junit.Assert.assertEquals(
            result, 420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 29);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699638, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 999999998);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 999999999);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 99999999);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(109, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456787, 123456787);
        org.junit.Assert.assertEquals(
            result, 123456787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 987654318);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 965);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 18);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 420);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 1234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 987654321);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 18);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(48, 234567891);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456787, 420);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 987654322);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 123456787);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(192, 234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(964, 965);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567891, 999999999);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 111111112);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 999999998);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(18, 18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 123456787);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456787, 111111113);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999999, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 964);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 123456790);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 234567890);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 111111110);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 106);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(29, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(969, 969);
        org.junit.Assert.assertEquals(
            result, 969
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(30, 987654320);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 111111113);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 967);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 987654319);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 192);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 418);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 28);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111114, 111111113);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 106);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(964, 3699637);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699640, 3699639);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 123456788);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(108, 106);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 28);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(968, 966);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654318, 987654320);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(47, 234567891);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(191, 192);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111113, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 234567890);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(50, 234567890);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000000, 987654318);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(999999998, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654321, 18);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(969, 968);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 106);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(29, 29);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 123456788);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654318, 76);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 987654322);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 1000000001);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456789, 107);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111113, 1234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(19, 18);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 1234567890);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1234567890, 966);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654322, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(51, 50);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 418);
        org.junit.Assert.assertEquals(
            result, 418
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(969, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(51, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699637, 418);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 418);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 987654321);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(99999999, 999999998);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(417, 418);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 111111113);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(110, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(28, 47);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 50);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699635, 3699635);
        org.junit.Assert.assertEquals(
            result, 3699635
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(1000000001, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 3699634);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 77);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 234567892);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(100000000, 420);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 123456788);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654318, 999999998);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(19, 30);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(76, 111111110);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(19, 19);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 99999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(418, 987654322);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 111111111);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456788, 123456787);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(30, 111111111);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111113, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 111111110);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(964, 964);
        org.junit.Assert.assertEquals(
            result, 964
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 111111110);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(107, 48);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(48, 964);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699639, 966);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 421);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 419);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111112, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 968);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 111111112);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(27, 28);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 111111111);
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567890, 123456788);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111110, 999999999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111113, 111111113);
        org.junit.Assert.assertEquals(
            result, 111111113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(29, 30);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(965, 111111109);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654319, 3699638);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3699636, 28);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(966, 111111112);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654318, 968);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 123456789);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111109, 111111108);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(123456790, 29);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(48, 48);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(50, 51);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 987654320);
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(234567889, 100000000);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(987654320, 421);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(964, 48);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(111111111, 190);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(967, 966);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
}

