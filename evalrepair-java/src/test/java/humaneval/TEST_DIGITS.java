package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_DIGITS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(5));
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(54));
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(120));
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(5014));
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(315, humaneval.buggy.DIGITS.digits(98765));
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2625, humaneval.buggy.DIGITS.digits(5576543));
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(2468));
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(951));
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(246));
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797531));
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(888));
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        org.junit.Assert.assertEquals(15, humaneval.buggy.DIGITS.digits(182135));
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        org.junit.Assert.assertEquals(21, humaneval.buggy.DIGITS.digits(703));
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        org.junit.Assert.assertEquals(729, humaneval.buggy.DIGITS.digits(999));
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(111));
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(1001));
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(3));
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(952));
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(889));
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(998));
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(2));
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(182136));
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(25));
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(701));
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(4));
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(24));
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        org.junit.Assert.assertEquals(567, humaneval.buggy.DIGITS.digits(997));
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(247));
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(6));
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        org.junit.Assert.assertEquals(135, humaneval.buggy.DIGITS.digits(953));
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797532));
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(7));
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(248));
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(23));
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(996));
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        org.junit.Assert.assertEquals(297675, humaneval.buggy.DIGITS.digits(135797533));
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        org.junit.Assert.assertEquals(405, humaneval.buggy.DIGITS.digits(995));
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(994));
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(891));
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(26));
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(8));
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(112));
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(22));
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(950));
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(702));
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(1000));
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(704));
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        org.junit.Assert.assertEquals(21, humaneval.buggy.DIGITS.digits(182137));
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        org.junit.Assert.assertEquals(27, humaneval.buggy.DIGITS.digits(893));
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        org.junit.Assert.assertEquals(243, humaneval.buggy.DIGITS.digits(993));
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797534));
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        org.junit.Assert.assertEquals(496125, humaneval.buggy.DIGITS.digits(135797535));
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(245));
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(249));
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(9));
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(244));
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(890));
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(47));
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(992));
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(700));
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797530));
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        org.junit.Assert.assertEquals(35, humaneval.buggy.DIGITS.digits(705));
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(243));
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(27));
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(182134));
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(887));
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(46));
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(894));
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(699));
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(45));
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        org.junit.Assert.assertEquals(49, humaneval.buggy.DIGITS.digits(707));
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(892));
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(182138));
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        org.junit.Assert.assertEquals(27, humaneval.buggy.DIGITS.digits(182139));
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(1002));
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(113));
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(1));
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(88));
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(706));
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(250));
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(110));
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(949));
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(698));
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(242));
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(11));
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        org.junit.Assert.assertEquals(297675, humaneval.buggy.DIGITS.digits(135797529));
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(1003));
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(109));
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797536));
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(182133));
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(43));
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        org.junit.Assert.assertEquals(99225, humaneval.buggy.DIGITS.digits(135797538));
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(241));
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(71));
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(114));
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(28));
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        org.junit.Assert.assertEquals(893025, humaneval.buggy.DIGITS.digits(135797539));
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(10));
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(89));
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(954));
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(240));
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(44));
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(886));
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(115));
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(70));
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(991));
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        org.junit.Assert.assertEquals(945, humaneval.buggy.DIGITS.digits(13579));
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        org.junit.Assert.assertEquals(945, humaneval.buggy.DIGITS.digits(123456789));
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(945));
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        org.junit.Assert.assertEquals(105, humaneval.buggy.DIGITS.digits(123456788));
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        org.junit.Assert.assertEquals(735, humaneval.buggy.DIGITS.digits(123456787));
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(944));
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        org.junit.Assert.assertEquals(27, humaneval.buggy.DIGITS.digits(943));
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(942));
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(941));
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        org.junit.Assert.assertEquals(105, humaneval.buggy.DIGITS.digits(123456786));
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        org.junit.Assert.assertEquals(105, humaneval.buggy.DIGITS.digits(13578));
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        org.junit.Assert.assertEquals(15, humaneval.buggy.DIGITS.digits(53));
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(940));
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(52));
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(946));
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        org.junit.Assert.assertEquals(21, humaneval.buggy.DIGITS.digits(73));
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        org.junit.Assert.assertEquals(63, humaneval.buggy.DIGITS.digits(947));
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        org.junit.Assert.assertEquals(25, humaneval.buggy.DIGITS.digits(55));
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(16));
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(69));
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(15));
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        org.junit.Assert.assertEquals(735, humaneval.buggy.DIGITS.digits(13577));
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(30));
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(74));
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(64));
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(72));
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(17));
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(14));
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(51));
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(95));
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(94));
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        org.junit.Assert.assertEquals(525, humaneval.buggy.DIGITS.digits(123456785));
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        org.junit.Assert.assertEquals(35, humaneval.buggy.DIGITS.digits(57));
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(32));
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(65));
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(62));
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(68));
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        org.junit.Assert.assertEquals(105, humaneval.buggy.DIGITS.digits(123456784));
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(18));
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(33));
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(96));
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        org.junit.Assert.assertEquals(7, humaneval.buggy.DIGITS.digits(76));
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(948));
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        org.junit.Assert.assertEquals(35, humaneval.buggy.DIGITS.digits(75));
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        org.junit.Assert.assertEquals(15, humaneval.buggy.DIGITS.digits(13580));
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.DIGITS.digits(13));
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        org.junit.Assert.assertEquals(315, humaneval.buggy.DIGITS.digits(123456783));
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(100));
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        org.junit.Assert.assertEquals(15, humaneval.buggy.DIGITS.digits(13581));
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        org.junit.Assert.assertEquals(945, humaneval.buggy.DIGITS.digits(123456790));
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        org.junit.Assert.assertEquals(105, humaneval.buggy.DIGITS.digits(13576));
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        org.junit.Assert.assertEquals(15, humaneval.buggy.DIGITS.digits(13582));
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        org.junit.Assert.assertEquals(945, humaneval.buggy.DIGITS.digits(123456791));
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        org.junit.Assert.assertEquals(45, humaneval.buggy.DIGITS.digits(13583));
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(21));
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        org.junit.Assert.assertEquals(9, humaneval.buggy.DIGITS.digits(49));
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(20));
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        org.junit.Assert.assertEquals(75, humaneval.buggy.DIGITS.digits(13585));
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        org.junit.Assert.assertEquals(945, humaneval.buggy.DIGITS.digits(123456792));
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        org.junit.Assert.assertEquals(81, humaneval.buggy.DIGITS.digits(99));
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(48));
    }
}

