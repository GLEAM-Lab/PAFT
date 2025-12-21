package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_GET_MAX_TRIPLES {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(5);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(10);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(100);
        org.junit.Assert.assertEquals(
            result, 53361
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(3);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(4);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(7);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(12);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(15);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(20);
        org.junit.Assert.assertEquals(
            result, 321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(25);
        org.junit.Assert.assertEquals(
            result, 736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(30);
        org.junit.Assert.assertEquals(
            result, 1260
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(29);
        org.junit.Assert.assertEquals(
            result, 1089
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(16);
        org.junit.Assert.assertEquals(
            result, 175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(19);
        org.junit.Assert.assertEquals(
            result, 306
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(18);
        org.junit.Assert.assertEquals(
            result, 240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(17);
        org.junit.Assert.assertEquals(
            result, 185
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(21);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(26);
        org.junit.Assert.assertEquals(
            result, 764
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(31);
        org.junit.Assert.assertEquals(
            result, 1450
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(11);
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(22);
        org.junit.Assert.assertEquals(
            result, 490
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(8);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(27);
        org.junit.Assert.assertEquals(
            result, 900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(24);
        org.junit.Assert.assertEquals(
            result, 616
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(32);
        org.junit.Assert.assertEquals(
            result, 1495
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(28);
        org.junit.Assert.assertEquals(
            result, 1053
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(33);
        org.junit.Assert.assertEquals(
            result, 1705
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(23);
        org.junit.Assert.assertEquals(
            result, 511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(9);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(14);
        org.junit.Assert.assertEquals(
            result, 94
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(13);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(34);
        org.junit.Assert.assertEquals(
            result, 1936
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(35);
        org.junit.Assert.assertEquals(
            result, 1991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(36);
        org.junit.Assert.assertEquals(
            result, 2244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(49);
        org.junit.Assert.assertEquals(
            result, 6016
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(37);
        org.junit.Assert.assertEquals(
            result, 2520
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(73);
        org.junit.Assert.assertEquals(
            result, 20448
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(77);
        org.junit.Assert.assertEquals(
            result, 23425
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(50);
        org.junit.Assert.assertEquals(
            result, 6136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(74);
        org.junit.Assert.assertEquals(
            result, 20724
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(75);
        org.junit.Assert.assertEquals(
            result, 21900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(76);
        org.junit.Assert.assertEquals(
            result, 23125
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(38);
        org.junit.Assert.assertEquals(
            result, 2586
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(78);
        org.junit.Assert.assertEquals(
            result, 24700
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(48);
        org.junit.Assert.assertEquals(
            result, 5520
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(51);
        org.junit.Assert.assertEquals(
            result, 6664
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(52);
        org.junit.Assert.assertEquals(
            result, 7225
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(98);
        org.junit.Assert.assertEquals(
            result, 49136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(79);
        org.junit.Assert.assertEquals(
            result, 26026
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(53);
        org.junit.Assert.assertEquals(
            result, 7361
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(72);
        org.junit.Assert.assertEquals(
            result, 19320
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(42);
        org.junit.Assert.assertEquals(
            result, 3640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(41);
        org.junit.Assert.assertEquals(
            result, 3289
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(99);
        org.junit.Assert.assertEquals(
            result, 51216
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(80);
        org.junit.Assert.assertEquals(
            result, 26351
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(54);
        org.junit.Assert.assertEquals(
            result, 7956
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(40);
        org.junit.Assert.assertEquals(
            result, 3211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(68);
        org.junit.Assert.assertEquals(
            result, 15961
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(39);
        org.junit.Assert.assertEquals(
            result, 2886
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(81);
        org.junit.Assert.assertEquals(
            result, 27729
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(67);
        org.junit.Assert.assertEquals(
            result, 15730
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(69);
        org.junit.Assert.assertEquals(
            result, 16951
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(43);
        org.junit.Assert.assertEquals(
            result, 4018
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(61);
        org.junit.Assert.assertEquals(
            result, 11800
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(70);
        org.junit.Assert.assertEquals(
            result, 17986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(65);
        org.junit.Assert.assertEquals(
            result, 13881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(71);
        org.junit.Assert.assertEquals(
            result, 18239
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(102);
        org.junit.Assert.assertEquals(
            result, 56100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(101);
        org.junit.Assert.assertEquals(
            result, 53889
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(82);
        org.junit.Assert.assertEquals(
            result, 29160
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(47);
        org.junit.Assert.assertEquals(
            result, 5055
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(46);
        org.junit.Assert.assertEquals(
            result, 4950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(66);
        org.junit.Assert.assertEquals(
            result, 14784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(45);
        org.junit.Assert.assertEquals(
            result, 4515
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(57);
        org.junit.Assert.assertEquals(
            result, 9405
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(60);
        org.junit.Assert.assertEquals(
            result, 11020
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(58);
        org.junit.Assert.assertEquals(
            result, 10108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(59);
        org.junit.Assert.assertEquals(
            result, 10279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(103);
        org.junit.Assert.assertEquals(
            result, 58378
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(97);
        org.junit.Assert.assertEquals(
            result, 48640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(56);
        org.junit.Assert.assertEquals(
            result, 8739
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(104);
        org.junit.Assert.assertEquals(
            result, 58939
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(96);
        org.junit.Assert.assertEquals(
            result, 46624
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(44);
        org.junit.Assert.assertEquals(
            result, 4109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(105);
        org.junit.Assert.assertEquals(
            result, 61285
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(83);
        org.junit.Assert.assertEquals(
            result, 29511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(95);
        org.junit.Assert.assertEquals(
            result, 44671
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(94);
        org.junit.Assert.assertEquals(
            result, 44206
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(64);
        org.junit.Assert.assertEquals(
            result, 13671
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(84);
        org.junit.Assert.assertEquals(
            result, 30996
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(85);
        org.junit.Assert.assertEquals(
            result, 32536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(63);
        org.junit.Assert.assertEquals(
            result, 12810
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(86);
        org.junit.Assert.assertEquals(
            result, 32914
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(55);
        org.junit.Assert.assertEquals(
            result, 8586
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(87);
        org.junit.Assert.assertEquals(
            result, 34510
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(62);
        org.junit.Assert.assertEquals(
            result, 11990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(200);
        org.junit.Assert.assertEquals(
            result, 431211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(199);
        org.junit.Assert.assertEquals(
            result, 429066
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(201);
        org.junit.Assert.assertEquals(
            result, 439989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(198);
        org.junit.Assert.assertEquals(
            result, 420420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(202);
        org.junit.Assert.assertEquals(
            result, 448900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(90);
        org.junit.Assert.assertEquals(
            result, 38280
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(91);
        org.junit.Assert.assertEquals(
            result, 40050
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(92);
        org.junit.Assert.assertEquals(
            result, 40485
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(203);
        org.junit.Assert.assertEquals(
            result, 451111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(93);
        org.junit.Assert.assertEquals(
            result, 42315
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(197);
        org.junit.Assert.assertEquals(
            result, 411905
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(196);
        org.junit.Assert.assertEquals(
            result, 409825
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(195);
        org.junit.Assert.assertEquals(
            result, 401440
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(194);
        org.junit.Assert.assertEquals(
            result, 393184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(204);
        org.junit.Assert.assertEquals(
            result, 460156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(88);
        org.junit.Assert.assertEquals(
            result, 36163
        );
    }
}
