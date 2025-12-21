package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_LARGEST_PRIME_FACTOR {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(27);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(63);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(330);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13195);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(100);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(256);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(500);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(873);
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9999);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(121);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1764);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4096);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(243);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1024);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4097);
        org.junit.Assert.assertEquals(
            result, 241
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1765);
        org.junit.Assert.assertEquals(
            result, 353
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(120);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(501);
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4095);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(10000);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(255);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1025);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4094);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(242);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1763);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(254);
        org.junit.Assert.assertEquals(
            result, 127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9998);
        org.junit.Assert.assertEquals(
            result, 4999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(872);
        org.junit.Assert.assertEquals(
            result, 109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9997);
        org.junit.Assert.assertEquals(
            result, 769
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(502);
        org.junit.Assert.assertEquals(
            result, 251
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(119);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9996);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(874);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(253);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(252);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1762);
        org.junit.Assert.assertEquals(
            result, 881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(122);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4098);
        org.junit.Assert.assertEquals(
            result, 683
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(871);
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1023);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9995);
        org.junit.Assert.assertEquals(
            result, 1999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(870);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(99);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(98);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(118);
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1761);
        org.junit.Assert.assertEquals(
            result, 587
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(117);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(123);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(10001);
        org.junit.Assert.assertEquals(
            result, 137
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(87);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(92);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(869);
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1766);
        org.junit.Assert.assertEquals(
            result, 883
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(93);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(875);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(244);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9994);
        org.junit.Assert.assertEquals(
            result, 263
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1767);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1760);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(124);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(245);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(116);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(88);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(10);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(86);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(246);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(85);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(115);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(247);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1022);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(91);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(248);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(125);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(94);
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(10002);
        org.junit.Assert.assertEquals(
            result, 1667
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(249);
        org.junit.Assert.assertEquals(
            result, 83
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1768);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(876);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(38);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(868);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1020);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(8);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1026);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(90);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(866);
        org.junit.Assert.assertEquals(
            result, 433
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(39);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(867);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9993);
        org.junit.Assert.assertEquals(
            result, 3331
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1027);
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9992);
        org.junit.Assert.assertEquals(
            result, 1249
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1029);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1028);
        org.junit.Assert.assertEquals(
            result, 257
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(40);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(18);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(60);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(49);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(95);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(48);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(114);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(96);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(72);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1030);
        org.junit.Assert.assertEquals(
            result, 103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(9991);
        org.junit.Assert.assertEquals(
            result, 103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13433);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456745);
        org.junit.Assert.assertEquals(
            result, 547
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568623);
        org.junit.Assert.assertEquals(
            result, 17231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32767);
        org.junit.Assert.assertEquals(
            result, 151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(4);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(6);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(12);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(21);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13432);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13434);
        org.junit.Assert.assertEquals(
            result, 2239
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(22);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32766);
        org.junit.Assert.assertEquals(
            result, 127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13435);
        org.junit.Assert.assertEquals(
            result, 2687
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(20);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456744);
        org.junit.Assert.assertEquals(
            result, 19031
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568622);
        org.junit.Assert.assertEquals(
            result, 284311
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(81);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456743);
        org.junit.Assert.assertEquals(
            result, 919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456742);
        org.junit.Assert.assertEquals(
            result, 1597
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13431);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32765);
        org.junit.Assert.assertEquals(
            result, 6553
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(80);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456741);
        org.junit.Assert.assertEquals(
            result, 2671
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456746);
        org.junit.Assert.assertEquals(
            result, 113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32764);
        org.junit.Assert.assertEquals(
            result, 8191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32763);
        org.junit.Assert.assertEquals(
            result, 163
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568621);
        org.junit.Assert.assertEquals(
            result, 6389
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(82);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568624);
        org.junit.Assert.assertEquals(
            result, 5077
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32768);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13430);
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456740);
        org.junit.Assert.assertEquals(
            result, 557
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13429);
        org.junit.Assert.assertEquals(
            result, 1033
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456739);
        org.junit.Assert.assertEquals(
            result, 401
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32762);
        org.junit.Assert.assertEquals(
            result, 16381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32769);
        org.junit.Assert.assertEquals(
            result, 331
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456747);
        org.junit.Assert.assertEquals(
            result, 152249
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(14);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32761);
        org.junit.Assert.assertEquals(
            result, 181
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32770);
        org.junit.Assert.assertEquals(
            result, 113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568620);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(24);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(52);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568625);
        org.junit.Assert.assertEquals(
            result, 4549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(51);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456738);
        org.junit.Assert.assertEquals(
            result, 76123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(30);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(50);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32760);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13428);
        org.junit.Assert.assertEquals(
            result, 373
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13427);
        org.junit.Assert.assertEquals(
            result, 463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(1000000);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(16);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(25);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13436);
        org.junit.Assert.assertEquals(
            result, 3359
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456749);
        org.junit.Assert.assertEquals(
            result, 5503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13437);
        org.junit.Assert.assertEquals(
            result, 1493
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(26);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456748);
        org.junit.Assert.assertEquals(
            result, 1283
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(568626);
        org.junit.Assert.assertEquals(
            result, 94771
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13438);
        org.junit.Assert.assertEquals(
            result, 6719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13439);
        org.junit.Assert.assertEquals(
            result, 151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456750);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456751);
        org.junit.Assert.assertEquals(
            result, 691
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456752);
        org.junit.Assert.assertEquals(
            result, 28547
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(28);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(32759);
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(84);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(456753);
        org.junit.Assert.assertEquals(
            result, 13841
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(65);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(64);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
}

