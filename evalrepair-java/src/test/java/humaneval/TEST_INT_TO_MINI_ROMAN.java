package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_INT_TO_MINI_ROMAN {
    @org.junit.Test(timeout = 3000)
    public void test() throws java.lang.Exception {
        int[] inputs = new int[] {43, 90, 94, 532, 900, 994, 1000};
        String[] outputs = new String[] {"xliii", "xc", "xciv", "dxxxii", "cm", "cmxciv", "m"};
        for (int i = 0; i < inputs.length; i += 1){
            String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(inputs[i]);
            org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(19);
        org.junit.Assert.assertEquals(
            result, "xix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(152);
        org.junit.Assert.assertEquals(
            result, "clii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(251);
        org.junit.Assert.assertEquals(
            result, "ccli"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(426);
        org.junit.Assert.assertEquals(
            result, "cdxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(500);
        org.junit.Assert.assertEquals(
            result, "d"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(1);
        org.junit.Assert.assertEquals(
            result, "i"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(4);
        org.junit.Assert.assertEquals(
            result, "iv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(43);
        org.junit.Assert.assertEquals(
            result, "xliii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(90);
        org.junit.Assert.assertEquals(
            result, "xc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(94);
        org.junit.Assert.assertEquals(
            result, "xciv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(532);
        org.junit.Assert.assertEquals(
            result, "dxxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(900);
        org.junit.Assert.assertEquals(
            result, "cm"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(994);
        org.junit.Assert.assertEquals(
            result, "cmxciv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(1000);
        org.junit.Assert.assertEquals(
            result, "m"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(111);
        org.junit.Assert.assertEquals(
            result, "cxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(888);
        org.junit.Assert.assertEquals(
            result, "dccclxxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(2);
        org.junit.Assert.assertEquals(
            result, "ii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(10);
        org.junit.Assert.assertEquals(
            result, "x"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(39);
        org.junit.Assert.assertEquals(
            result, "xxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(100);
        org.junit.Assert.assertEquals(
            result, "c"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(399);
        org.junit.Assert.assertEquals(
            result, "cccxcix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(871);
        org.junit.Assert.assertEquals(
            result, "dccclxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(3);
        org.junit.Assert.assertEquals(
            result, "iii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(5);
        org.junit.Assert.assertEquals(
            result, "v"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(37);
        org.junit.Assert.assertEquals(
            result, "xxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(870);
        org.junit.Assert.assertEquals(
            result, "dccclxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(38);
        org.junit.Assert.assertEquals(
            result, "xxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(889);
        org.junit.Assert.assertEquals(
            result, "dccclxxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(400);
        org.junit.Assert.assertEquals(
            result, "cd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(872);
        org.junit.Assert.assertEquals(
            result, "dccclxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(110);
        org.junit.Assert.assertEquals(
            result, "cx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(6);
        org.junit.Assert.assertEquals(
            result, "vi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(8);
        org.junit.Assert.assertEquals(
            result, "viii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(7);
        org.junit.Assert.assertEquals(
            result, "vii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(101);
        org.junit.Assert.assertEquals(
            result, "ci"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(109);
        org.junit.Assert.assertEquals(
            result, "cix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(40);
        org.junit.Assert.assertEquals(
            result, "xl"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(36);
        org.junit.Assert.assertEquals(
            result, "xxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(41);
        org.junit.Assert.assertEquals(
            result, "xli"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(35);
        org.junit.Assert.assertEquals(
            result, "xxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(102);
        org.junit.Assert.assertEquals(
            result, "cii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(34);
        org.junit.Assert.assertEquals(
            result, "xxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(112);
        org.junit.Assert.assertEquals(
            result, "cxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(113);
        org.junit.Assert.assertEquals(
            result, "cxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(114);
        org.junit.Assert.assertEquals(
            result, "cxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(9);
        org.junit.Assert.assertEquals(
            result, "ix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(873);
        org.junit.Assert.assertEquals(
            result, "dccclxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(874);
        org.junit.Assert.assertEquals(
            result, "dccclxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(33);
        org.junit.Assert.assertEquals(
            result, "xxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(891);
        org.junit.Assert.assertEquals(
            result, "dcccxci"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(103);
        org.junit.Assert.assertEquals(
            result, "ciii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(42);
        org.junit.Assert.assertEquals(
            result, "xlii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(108);
        org.junit.Assert.assertEquals(
            result, "cviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(868);
        org.junit.Assert.assertEquals(
            result, "dccclxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(11);
        org.junit.Assert.assertEquals(
            result, "xi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(869);
        org.junit.Assert.assertEquals(
            result, "dccclxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(99);
        org.junit.Assert.assertEquals(
            result, "xcix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(22);
        org.junit.Assert.assertEquals(
            result, "xxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(51);
        org.junit.Assert.assertEquals(
            result, "li"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(887);
        org.junit.Assert.assertEquals(
            result, "dccclxxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(52);
        org.junit.Assert.assertEquals(
            result, "lii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(890);
        org.junit.Assert.assertEquals(
            result, "dcccxc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(63);
        org.junit.Assert.assertEquals(
            result, "lxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(12);
        org.junit.Assert.assertEquals(
            result, "xii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(62);
        org.junit.Assert.assertEquals(
            result, "lxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(55);
        org.junit.Assert.assertEquals(
            result, "lv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(54);
        org.junit.Assert.assertEquals(
            result, "liv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(14);
        org.junit.Assert.assertEquals(
            result, "xiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(21);
        org.junit.Assert.assertEquals(
            result, "xxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(45);
        org.junit.Assert.assertEquals(
            result, "xlv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(107);
        org.junit.Assert.assertEquals(
            result, "cvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(13);
        org.junit.Assert.assertEquals(
            result, "xiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(20);
        org.junit.Assert.assertEquals(
            result, "xx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(398);
        org.junit.Assert.assertEquals(
            result, "cccxcviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(106);
        org.junit.Assert.assertEquals(
            result, "cvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(98);
        org.junit.Assert.assertEquals(
            result, "xcviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(53);
        org.junit.Assert.assertEquals(
            result, "liii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(23);
        org.junit.Assert.assertEquals(
            result, "xxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(115);
        org.junit.Assert.assertEquals(
            result, "cxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(105);
        org.junit.Assert.assertEquals(
            result, "cv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(44);
        org.junit.Assert.assertEquals(
            result, "xliv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(56);
        org.junit.Assert.assertEquals(
            result, "lvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(32);
        org.junit.Assert.assertEquals(
            result, "xxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(104);
        org.junit.Assert.assertEquals(
            result, "civ"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(97);
        org.junit.Assert.assertEquals(
            result, "xcvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(57);
        org.junit.Assert.assertEquals(
            result, "lvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(892);
        org.junit.Assert.assertEquals(
            result, "dcccxcii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(31);
        org.junit.Assert.assertEquals(
            result, "xxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(397);
        org.junit.Assert.assertEquals(
            result, "cccxcvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(886);
        org.junit.Assert.assertEquals(
            result, "dccclxxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(875);
        org.junit.Assert.assertEquals(
            result, "dccclxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(64);
        org.junit.Assert.assertEquals(
            result, "lxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(30);
        org.junit.Assert.assertEquals(
            result, "xxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(26);
        org.junit.Assert.assertEquals(
            result, "xxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(50);
        org.junit.Assert.assertEquals(
            result, "l"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(96);
        org.junit.Assert.assertEquals(
            result, "xcvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(91);
        org.junit.Assert.assertEquals(
            result, "xci"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(46);
        org.junit.Assert.assertEquals(
            result, "xlvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(867);
        org.junit.Assert.assertEquals(
            result, "dccclxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(885);
        org.junit.Assert.assertEquals(
            result, "dccclxxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(866);
        org.junit.Assert.assertEquals(
            result, "dccclxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(18);
        org.junit.Assert.assertEquals(
            result, "xviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(89);
        org.junit.Assert.assertEquals(
            result, "lxxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(88);
        org.junit.Assert.assertEquals(
            result, "lxxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(883);
        org.junit.Assert.assertEquals(
            result, "dccclxxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(15);
        org.junit.Assert.assertEquals(
            result, "xv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(884);
        org.junit.Assert.assertEquals(
            result, "dccclxxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(29);
        org.junit.Assert.assertEquals(
            result, "xxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(276);
        org.junit.Assert.assertEquals(
            result, "cclxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(388);
        org.junit.Assert.assertEquals(
            result, "ccclxxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(877);
        org.junit.Assert.assertEquals(
            result, "dccclxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(935);
        org.junit.Assert.assertEquals(
            result, "cmxxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(999);
        org.junit.Assert.assertEquals(
            result, "cmxcix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(864);
        org.junit.Assert.assertEquals(
            result, "dccclxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(923);
        org.junit.Assert.assertEquals(
            result, "cmxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(603);
        org.junit.Assert.assertEquals(
            result, "dciii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(843);
        org.junit.Assert.assertEquals(
            result, "dcccxliii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(936);
        org.junit.Assert.assertEquals(
            result, "cmxxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(934);
        org.junit.Assert.assertEquals(
            result, "cmxxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(865);
        org.junit.Assert.assertEquals(
            result, "dccclxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(878);
        org.junit.Assert.assertEquals(
            result, "dccclxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(937);
        org.junit.Assert.assertEquals(
            result, "cmxxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(389);
        org.junit.Assert.assertEquals(
            result, "ccclxxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(933);
        org.junit.Assert.assertEquals(
            result, "cmxxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(876);
        org.junit.Assert.assertEquals(
            result, "dccclxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(95);
        org.junit.Assert.assertEquals(
            result, "xcv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(932);
        org.junit.Assert.assertEquals(
            result, "cmxxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(998);
        org.junit.Assert.assertEquals(
            result, "cmxcviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(924);
        org.junit.Assert.assertEquals(
            result, "cmxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(997);
        org.junit.Assert.assertEquals(
            result, "cmxcvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(938);
        org.junit.Assert.assertEquals(
            result, "cmxxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(386);
        org.junit.Assert.assertEquals(
            result, "ccclxxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(925);
        org.junit.Assert.assertEquals(
            result, "cmxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(385);
        org.junit.Assert.assertEquals(
            result, "ccclxxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(922);
        org.junit.Assert.assertEquals(
            result, "cmxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(387);
        org.junit.Assert.assertEquals(
            result, "ccclxxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(602);
        org.junit.Assert.assertEquals(
            result, "dcii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(842);
        org.junit.Assert.assertEquals(
            result, "dcccxlii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(921);
        org.junit.Assert.assertEquals(
            result, "cmxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(275);
        org.junit.Assert.assertEquals(
            result, "cclxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(863);
        org.junit.Assert.assertEquals(
            result, "dccclxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(840);
        org.junit.Assert.assertEquals(
            result, "dcccxl"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(277);
        org.junit.Assert.assertEquals(
            result, "cclxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(931);
        org.junit.Assert.assertEquals(
            result, "cmxxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(930);
        org.junit.Assert.assertEquals(
            result, "cmxxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(844);
        org.junit.Assert.assertEquals(
            result, "dcccxliv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(274);
        org.junit.Assert.assertEquals(
            result, "cclxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(927);
        org.junit.Assert.assertEquals(
            result, "cmxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(384);
        org.junit.Assert.assertEquals(
            result, "ccclxxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(928);
        org.junit.Assert.assertEquals(
            result, "cmxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(845);
        org.junit.Assert.assertEquals(
            result, "dcccxlv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(841);
        org.junit.Assert.assertEquals(
            result, "dcccxli"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(27);
        org.junit.Assert.assertEquals(
            result, "xxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(996);
        org.junit.Assert.assertEquals(
            result, "cmxcvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(926);
        org.junit.Assert.assertEquals(
            result, "cmxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(28);
        org.junit.Assert.assertEquals(
            result, "xxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(604);
        org.junit.Assert.assertEquals(
            result, "dciv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(279);
        org.junit.Assert.assertEquals(
            result, "cclxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(601);
        org.junit.Assert.assertEquals(
            result, "dci"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(278);
        org.junit.Assert.assertEquals(
            result, "cclxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(273);
        org.junit.Assert.assertEquals(
            result, "cclxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(929);
        org.junit.Assert.assertEquals(
            result, "cmxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(272);
        org.junit.Assert.assertEquals(
            result, "cclxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(280);
        org.junit.Assert.assertEquals(
            result, "cclxxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(281);
        org.junit.Assert.assertEquals(
            result, "cclxxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(600);
        org.junit.Assert.assertEquals(
            result, "dc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(271);
        org.junit.Assert.assertEquals(
            result, "cclxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(605);
        org.junit.Assert.assertEquals(
            result, "dcv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(93);
        org.junit.Assert.assertEquals(
            result, "xciii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(879);
        org.junit.Assert.assertEquals(
            result, "dccclxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(24);
        org.junit.Assert.assertEquals(
            result, "xxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(995);
        org.junit.Assert.assertEquals(
            result, "cmxcv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(383);
        org.junit.Assert.assertEquals(
            result, "ccclxxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(25);
        org.junit.Assert.assertEquals(
            result, "xxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(839);
        org.junit.Assert.assertEquals(
            result, "dcccxxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(382);
        org.junit.Assert.assertEquals(
            result, "ccclxxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(606);
        org.junit.Assert.assertEquals(
            result, "dcvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(390);
        org.junit.Assert.assertEquals(
            result, "cccxc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(599);
        org.junit.Assert.assertEquals(
            result, "dxcix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(598);
        org.junit.Assert.assertEquals(
            result, "dxcviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(939);
        org.junit.Assert.assertEquals(
            result, "cmxxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(48);
        org.junit.Assert.assertEquals(
            result, "xlviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(391);
        org.junit.Assert.assertEquals(
            result, "cccxci"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(78);
        org.junit.Assert.assertEquals(
            result, "lxxviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(392);
        org.junit.Assert.assertEquals(
            result, "cccxcii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(992);
        org.junit.Assert.assertEquals(
            result, "cmxcii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(79);
        org.junit.Assert.assertEquals(
            result, "lxxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(76);
        org.junit.Assert.assertEquals(
            result, "lxxvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(71);
        org.junit.Assert.assertEquals(
            result, "lxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(862);
        org.junit.Assert.assertEquals(
            result, "dccclxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(77);
        org.junit.Assert.assertEquals(
            result, "lxxvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(861);
        org.junit.Assert.assertEquals(
            result, "dccclxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(75);
        org.junit.Assert.assertEquals(
            result, "lxxv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(80);
        org.junit.Assert.assertEquals(
            result, "lxxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(993);
        org.junit.Assert.assertEquals(
            result, "cmxciii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(70);
        org.junit.Assert.assertEquals(
            result, "lxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(72);
        org.junit.Assert.assertEquals(
            result, "lxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(61);
        org.junit.Assert.assertEquals(
            result, "lxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(282);
        org.junit.Assert.assertEquals(
            result, "cclxxxii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(81);
        org.junit.Assert.assertEquals(
            result, "lxxxi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(69);
        org.junit.Assert.assertEquals(
            result, "lxix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(73);
        org.junit.Assert.assertEquals(
            result, "lxxiii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(859);
        org.junit.Assert.assertEquals(
            result, "dccclix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(74);
        org.junit.Assert.assertEquals(
            result, "lxxiv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(846);
        org.junit.Assert.assertEquals(
            result, "dcccxlvi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(393);
        org.junit.Assert.assertEquals(
            result, "cccxciii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(860);
        org.junit.Assert.assertEquals(
            result, "dccclx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(920);
        org.junit.Assert.assertEquals(
            result, "cmxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(847);
        org.junit.Assert.assertEquals(
            result, "dcccxlvii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(858);
        org.junit.Assert.assertEquals(
            result, "dccclviii"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(49);
        org.junit.Assert.assertEquals(
            result, "xlix"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(82);
        org.junit.Assert.assertEquals(
            result, "lxxxii"
        );
    }
}

