package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SUM_TO_N {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(6);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(11);
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(30);
        org.junit.Assert.assertEquals(
            result, 465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(100);
        org.junit.Assert.assertEquals(
            result, 5050
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(2);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(3);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(4);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(7);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(15);
        org.junit.Assert.assertEquals(
            result, 120
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(20);
        org.junit.Assert.assertEquals(
            result, 210
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(25);
        org.junit.Assert.assertEquals(
            result, 325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(50);
        org.junit.Assert.assertEquals(
            result, 1275
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(75);
        org.junit.Assert.assertEquals(
            result, 2850
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1000);
        org.junit.Assert.assertEquals(
            result, 500500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(14);
        org.junit.Assert.assertEquals(
            result, 105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(5);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(16);
        org.junit.Assert.assertEquals(
            result, 136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(26);
        org.junit.Assert.assertEquals(
            result, 351
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(92);
        org.junit.Assert.assertEquals(
            result, 4278
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(19);
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(93);
        org.junit.Assert.assertEquals(
            result, 4371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(94);
        org.junit.Assert.assertEquals(
            result, 4465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(999);
        org.junit.Assert.assertEquals(
            result, 499500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(51);
        org.junit.Assert.assertEquals(
            result, 1326
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(17);
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(21);
        org.junit.Assert.assertEquals(
            result, 231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(22);
        org.junit.Assert.assertEquals(
            result, 253
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(8);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(74);
        org.junit.Assert.assertEquals(
            result, 2775
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(52);
        org.junit.Assert.assertEquals(
            result, 1378
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(23);
        org.junit.Assert.assertEquals(
            result, 276
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(91);
        org.junit.Assert.assertEquals(
            result, 4186
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(76);
        org.junit.Assert.assertEquals(
            result, 2926
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(24);
        org.junit.Assert.assertEquals(
            result, 300
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(90);
        org.junit.Assert.assertEquals(
            result, 4095
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(18);
        org.junit.Assert.assertEquals(
            result, 171
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(13);
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(27);
        org.junit.Assert.assertEquals(
            result, 378
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(998);
        org.junit.Assert.assertEquals(
            result, 498501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(55);
        org.junit.Assert.assertEquals(
            result, 1540
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(65);
        org.junit.Assert.assertEquals(
            result, 2145
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(66);
        org.junit.Assert.assertEquals(
            result, 2211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(73);
        org.junit.Assert.assertEquals(
            result, 2701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(89);
        org.junit.Assert.assertEquals(
            result, 4005
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(56);
        org.junit.Assert.assertEquals(
            result, 1596
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(57);
        org.junit.Assert.assertEquals(
            result, 1653
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(997);
        org.junit.Assert.assertEquals(
            result, 497503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(996);
        org.junit.Assert.assertEquals(
            result, 496506
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(77);
        org.junit.Assert.assertEquals(
            result, 3003
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(28);
        org.junit.Assert.assertEquals(
            result, 406
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(87);
        org.junit.Assert.assertEquals(
            result, 3828
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(88);
        org.junit.Assert.assertEquals(
            result, 3916
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(72);
        org.junit.Assert.assertEquals(
            result, 2628
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(54);
        org.junit.Assert.assertEquals(
            result, 1485
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(53);
        org.junit.Assert.assertEquals(
            result, 1431
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(86);
        org.junit.Assert.assertEquals(
            result, 3741
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(85);
        org.junit.Assert.assertEquals(
            result, 3655
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(78);
        org.junit.Assert.assertEquals(
            result, 3081
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(67);
        org.junit.Assert.assertEquals(
            result, 2278
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(29);
        org.junit.Assert.assertEquals(
            result, 435
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(58);
        org.junit.Assert.assertEquals(
            result, 1711
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(79);
        org.junit.Assert.assertEquals(
            result, 3160
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(995);
        org.junit.Assert.assertEquals(
            result, 495510
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(49);
        org.junit.Assert.assertEquals(
            result, 1225
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(71);
        org.junit.Assert.assertEquals(
            result, 2556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(994);
        org.junit.Assert.assertEquals(
            result, 494515
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(59);
        org.junit.Assert.assertEquals(
            result, 1770
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(37);
        org.junit.Assert.assertEquals(
            result, 703
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(80);
        org.junit.Assert.assertEquals(
            result, 3240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(48);
        org.junit.Assert.assertEquals(
            result, 1176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(47);
        org.junit.Assert.assertEquals(
            result, 1128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(38);
        org.junit.Assert.assertEquals(
            result, 741
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(64);
        org.junit.Assert.assertEquals(
            result, 2080
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(60);
        org.junit.Assert.assertEquals(
            result, 1830
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(992);
        org.junit.Assert.assertEquals(
            result, 492528
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(40);
        org.junit.Assert.assertEquals(
            result, 820
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(993);
        org.junit.Assert.assertEquals(
            result, 493521
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(81);
        org.junit.Assert.assertEquals(
            result, 3321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(12);
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(84);
        org.junit.Assert.assertEquals(
            result, 3570
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(39);
        org.junit.Assert.assertEquals(
            result, 780
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(9);
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(63);
        org.junit.Assert.assertEquals(
            result, 2016
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(10);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(83);
        org.junit.Assert.assertEquals(
            result, 3486
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(62);
        org.junit.Assert.assertEquals(
            result, 1953
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(991);
        org.junit.Assert.assertEquals(
            result, 491536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(61);
        org.junit.Assert.assertEquals(
            result, 1891
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(36);
        org.junit.Assert.assertEquals(
            result, 666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(45);
        org.junit.Assert.assertEquals(
            result, 1035
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(35);
        org.junit.Assert.assertEquals(
            result, 630
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(68);
        org.junit.Assert.assertEquals(
            result, 2346
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(990);
        org.junit.Assert.assertEquals(
            result, 490545
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1001);
        org.junit.Assert.assertEquals(
            result, 501501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(69);
        org.junit.Assert.assertEquals(
            result, 2415
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(95);
        org.junit.Assert.assertEquals(
            result, 4560
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(34);
        org.junit.Assert.assertEquals(
            result, 595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(70);
        org.junit.Assert.assertEquals(
            result, 2485
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(96);
        org.junit.Assert.assertEquals(
            result, 4656
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(215);
        org.junit.Assert.assertEquals(
            result, 23220
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(217);
        org.junit.Assert.assertEquals(
            result, 23653
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(214);
        org.junit.Assert.assertEquals(
            result, 23005
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(216);
        org.junit.Assert.assertEquals(
            result, 23436
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(213);
        org.junit.Assert.assertEquals(
            result, 22791
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(43);
        org.junit.Assert.assertEquals(
            result, 946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(212);
        org.junit.Assert.assertEquals(
            result, 22578
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(44);
        org.junit.Assert.assertEquals(
            result, 990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(42);
        org.junit.Assert.assertEquals(
            result, 903
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(218);
        org.junit.Assert.assertEquals(
            result, 23871
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(46);
        org.junit.Assert.assertEquals(
            result, 1081
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(41);
        org.junit.Assert.assertEquals(
            result, 861
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(211);
        org.junit.Assert.assertEquals(
            result, 22366
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(219);
        org.junit.Assert.assertEquals(
            result, 24090
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(220);
        org.junit.Assert.assertEquals(
            result, 24310
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1002);
        org.junit.Assert.assertEquals(
            result, 502503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(210);
        org.junit.Assert.assertEquals(
            result, 22155
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(209);
        org.junit.Assert.assertEquals(
            result, 21945
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1003);
        org.junit.Assert.assertEquals(
            result, 503506
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(221);
        org.junit.Assert.assertEquals(
            result, 24531
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(82);
        org.junit.Assert.assertEquals(
            result, 3403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1004);
        org.junit.Assert.assertEquals(
            result, 504510
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1005);
        org.junit.Assert.assertEquals(
            result, 505515
        );
    }
}
