package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_DIGIT_SUM {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abAB");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcCd");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("helloE");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("woArBld");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aAaaaXa");
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(" How are yOu?");
        org.junit.Assert.assertEquals(
            result, 151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("You arE Very Smart");
        org.junit.Assert.assertEquals(
            result, 327
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCD");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOworld");
        org.junit.Assert.assertEquals(
            result, 372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[\\]^_`{|}~");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123def456GHI");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A  B C  D  ");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("UPPER");
        org.junit.Assert.assertEquals(
            result, 396
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercase");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Ab56");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowrcase");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123def45l6GHlowrcaseI");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[\\]^_`{ABC123def456GHI");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOworrld");
        org.junit.Assert.assertEquals(
            result, 372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercalowercasese");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A  B C  D ");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B  C  D ");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1Ab56cacbcd23");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELrLOworrld");
        org.junit.Assert.assertEquals(
            result, 372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1123ABCD");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12:;<=>?@[\\]^_`{|}~ABC123def456GHI3");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Ab556");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112lowercalowercasese3");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[\\]^_`{_|}~");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercase123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B  C  D 23");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A  C  D ");
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1Ab56caacbcd23");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("   A  C  D ");
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOworld  A  B C  D  ");
        org.junit.Assert.assertEquals(
            result, 638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLrOworrld");
        org.junit.Assert.assertEquals(
            result, 372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112lowercalowercasese31123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A12:;<=>?@[\\]^_`{|}~ABC123def456GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B  C   D ");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abc1Ab56cacbcd23d");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELrLOworrlHELLOworld");
        org.junit.Assert.assertEquals(
            result, 744
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("UPPRER");
        org.junit.Assert.assertEquals(
            result, 478
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A1C123def456GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A  B CC  D ");
        org.junit.Assert.assertEquals(
            result, 333
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[]\\]^_`{|}~");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercasese31123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A  B   A  C  D  C  D  ");
        org.junit.Assert.assertEquals(
            result, 466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B C  D ");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  AHELrLOworrld   B C  D ");
        org.junit.Assert.assertEquals(
            result, 638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   C  D ");
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abc1Ab56cacd23d");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B    A  C  D C  D 23");
        org.junit.Assert.assertEquals(
            result, 466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B       A  B C  D A  C 3");
        org.junit.Assert.assertEquals(
            result, 529
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("DABCD");
        org.junit.Assert.assertEquals(
            result, 334
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A    A   B C  D B CC  D ");
        org.junit.Assert.assertEquals(
            result, 599
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A12:;<=>?@[\\]^_`3{|}~ABC123def456GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercalowe1Ab56caacbcd23casese");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AB  A  C  D C123def456GHHI");
        org.junit.Assert.assertEquals(
            result, 686
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowrcacse");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[]\\]^_`{|");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  AHELrLOwo  A   B  C  D d   B C  D ");
        org.junit.Assert.assertEquals(
            result, 904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[]\\]^_`  A  B C  D  {|}~");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  :;<=>?@[\\]^_`{ABC123def456G  A   B       A  B C  D A  C 3HIA  B C  D ");
        org.junit.Assert.assertEquals(
            result, 1209
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A12:;<=>?@[\\]^_`3{|}~ABC123def4lowercase56GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123deIf456GHI");
        org.junit.Assert.assertEquals(
            result, 487
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  AHELr1123ABCDLO   B C  1D ");
        org.junit.Assert.assertEquals(
            result, 904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[\\]^:_`{ABC123def=456GHI");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  :;<=>?@lC 3HIA  B C  D ");
        org.junit.Assert.assertEquals(
            result, 478
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112lowercaercasese31123");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("UPR");
        org.junit.Assert.assertEquals(
            result, 247
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("alowerwercasese");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  AabcdHELr1123ABCDLO   B C  1D ");
        org.junit.Assert.assertEquals(
            result, 904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A12  A  B C  D  :;<=>?@[\\]^_`{|}~ABC123def456GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123def:;<=>?@[\\]^_`{|}~456GHI");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<:;<=>?@[\\]^:_`{ABC123def=456GHID  {|}~");
        org.junit.Assert.assertEquals(
            result, 482
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(" HELLOworrld A   B  C   D ");
        org.junit.Assert.assertEquals(
            result, 638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  AabcdHELr1123ABCDLO   BC  1D ");
        org.junit.Assert.assertEquals(
            result, 904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abc1HELLOworrldAb56cacbcd23d");
        org.junit.Assert.assertEquals(
            result, 437
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[]\\]^_`{  AabcdHELr1123ABCDLO   BC  1D |}~");
        org.junit.Assert.assertEquals(
            result, 904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1Ab56ca1cbcd23");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("H:;<:;<=>?@[\\]^:_`{ABC123def=456GHID  {|}~");
        org.junit.Assert.assertEquals(
            result, 554
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B    A  C  D  C  D 23");
        org.junit.Assert.assertEquals(
            result, 466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcd1123A12:;<=>?@[\\]^_ HELLOworrld A   B  C   D `3{|}~ABC123def456GHI3BCD");
        org.junit.Assert.assertEquals(
            result, 1318
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercasese23");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  :;<=>?@[\\]^_`{ABC123def456G  A   B    A   A  B C  A   B  C  D 23  D A  C 3HIA  B C  D ");
        org.junit.Assert.assertEquals(
            result, 1540
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112lowercalow HELLOworrld A   B  C   D ercasese3");
        org.junit.Assert.assertEquals(
            result, 638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("   A abcd C  D ");
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<:=>?@AB  A  C  D C123def456GHHI6GHI");
        org.junit.Assert.assertEquals(
            result, 902
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123deabcd1123A12:;<=>?@[\\]^_`3{|}~ABC123def4lowercase56GHI3BCDIf456GHI");
        org.junit.Assert.assertEquals(
            result, 1167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<:;<=>?@[\\]^:_`{ABC123def=456GHID  UPPER{|}~");
        org.junit.Assert.assertEquals(
            result, 878
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B   A  C  D  C  D  ");
        org.junit.Assert.assertEquals(
            result, 466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112lowercalrow HELLOworrld A   B  C   D ercasese3");
        org.junit.Assert.assertEquals(
            result, 638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("URPPRER");
        org.junit.Assert.assertEquals(
            result, 560
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("l    :;<=>?@[\\]^_`>{ABC123def456G  A   B       A  B C  D A  C 3HIA  B C  D A   B  C  D 23owercase");
        org.junit.Assert.assertEquals(
            result, 1475
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B  C   D");
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12:;<=>?@[\\`]^_`{|}~ABC123def456GHI3");
        org.junit.Assert.assertEquals(
            result, 414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  :;<=>?  AabcdHELr1123ABCDLO   BC  1D lC 3HIA  B C  D ");
        org.junit.Assert.assertEquals(
            result, 1382
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("lowercalowesle");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELL   A  C  D Oworld");
        org.junit.Assert.assertEquals(
            result, 572
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123def1Ab56ca1cbcd23456GHI");
        org.junit.Assert.assertEquals(
            result, 479
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC123def1Ab56ca1cbcd  AabcdHELr1123ABCDLO   BC  1D 23456GHI");
        org.junit.Assert.assertEquals(
            result, 1383
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(":;<=>?@[\\]^_`{;_|}~");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("  A   B    AHELr1123ABCDLO   B C  1D   AAb556");
        org.junit.Assert.assertEquals(
            result, 1165
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HEL  AHELrLOwo  A   B  C  D d   B C  D LOworld");
        org.junit.Assert.assertEquals(
            result, 1276
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Def3@F");
        org.junit.Assert.assertEquals(
            result, 269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 3975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 2015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5624
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.");
        org.junit.Assert.assertEquals(
            result, 2262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 8118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 2089
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1401
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nnewlines\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("with");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERS");
        org.junit.Assert.assertEquals(
            result, 686
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("and");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabs");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 3975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 6325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 8202
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("is");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 6064
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2603
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines");
        org.junit.Assert.assertEquals(
            result, 2015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("a");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 6970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttabs");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 9454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPTHISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACESACES");
        org.junit.Assert.assertEquals(
            result, 10945
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4865
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 9974
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 2330
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8498
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 10207
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Def3@FandloWeBrcaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thhis");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEtHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSFGQRSTUVWXYZnewlines");
        org.junit.Assert.assertEquals(
            result, 10785
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 13826
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 6954
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZnewlinesand");
        org.junit.Assert.assertEquals(
            result, 2015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2603
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 7639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNOnPQRSTUVWXYZnewlinesand");
        org.junit.Assert.assertEquals(
            result, 3212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 7887
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNOnPQRSTUVWXYZnewlinesandY?IHopDeYOURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 5542
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thshisd");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPwitWOWTHIttabs.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1734
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8586
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlwines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTHERSANDNOSPACESNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7042
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7054
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.JIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 9232
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinThhis");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThhiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10058
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTCODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4932
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4865
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.STUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRZ");
        org.junit.Assert.assertEquals(
            result, 11728
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGST12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890RINGWITHMANYUPPERCASELETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 14182
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Def3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 1818
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("iABCDEFGHIJKLMNOPQRSTUVWXYZs");
        org.junit.Assert.assertEquals(
            result, 2015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 10293
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesand");
        org.junit.Assert.assertEquals(
            result, 10133
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 2099
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 5701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 9798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5tABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesand4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 12736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 8655
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thRy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sis5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4382
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPACESWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10300
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 15355
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSPACESNDNOSPACESTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 8122
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$Bc&Def3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 11951
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BLENTERRS");
        org.junit.Assert.assertEquals(
            result, 11660
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3813
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("JZApAM");
        org.junit.Assert.assertEquals(
            result, 371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("nWOWTHISISSUCHALONGSLTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESASELETTERS.ewlinThhis");
        org.junit.Assert.assertEquals(
            result, 14342
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 6414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinesandY?IHopDeYOURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 4552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPMQRSTUVWXYZnewlines");
        org.junit.Assert.assertEquals(
            result, 2092
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("JZMApAM");
        org.junit.Assert.assertEquals(
            result, 448
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPERandloWercaseLENaTERS");
        org.junit.Assert.assertEquals(
            result, 1401
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 4570
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345AB0");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 6718
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.PPER1A$Bc&Def3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 10473
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPERandseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Decf3@FandloWeBrcaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n55t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 6426
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("weeZIF");
        org.junit.Assert.assertEquals(
            result, 233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nnewlines\tasns");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345UVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 525
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5n");
        org.junit.Assert.assertEquals(
            result, 2195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKPQRSTUVWXYZnewlines");
        org.junit.Assert.assertEquals(
            result, 1705
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3813
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERS");
        org.junit.Assert.assertEquals(
            result, 1481
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10056
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4688
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVEWRFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 9541
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("bsSPbpM");
        org.junit.Assert.assertEquals(
            result, 240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJThis\nis\ta\ttest\twith\nnewlines\tansKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 2173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPTPERCASELETTisERSANDNOSPACESWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10384
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("isThis\nis\ta\ttest\twith\nnewlines\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345UVWXYZ678W90");
        org.junit.Assert.assertEquals(
            result, 612
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinThhiTHISISALONGSTRINGWITHMANYUPTPERCASELETTisERSANDNOSPACESWLOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.s");
        org.junit.Assert.assertEquals(
            result, 10544
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 11254
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOS12345ABCDEFGHJIJKLMNOPTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nQRSTUVWXYZ67890PACESWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 17254
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISIStHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 15779
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1267
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("T12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONABCDEFGHIJKLMNOPQRSTUVWXYZnewlinesandOSPACES");
        org.junit.Assert.assertEquals(
            result, 6809
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 1680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPACESWOMWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10377
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thhihs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCraXzyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1571
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nnewleines\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345AB20");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Def3@FandloWeBrcaseLaENTERS");
        org.junit.Assert.assertEquals(
            result, 1736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("TtHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 7971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witWOWTHISISSUCHALOOREVENALARGBUFFER.ITASJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 4841
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRIN12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890GWITHMANYUPPERCASELETTisERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 14268
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTUUVVVVWWWXXXYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 5617
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.QQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 11399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newiThhisnes");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10547
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGiABCDEFGHIJKLMNOPQRSTUVWWXYZsIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 8528
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5802
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKTAnTG");
        org.junit.Assert.assertEquals(
            result, 379
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5699
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 4082
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 4447
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQRSTUVWXYZnewind");
        org.junit.Assert.assertEquals(
            result, 1680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("bsPSPbp");
        org.junit.Assert.assertEquals(
            result, 243
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThis\nis\ta\ttest\twith\nnewlines\tasnsZ67890");
        org.junit.Assert.assertEquals(
            result, 4422
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("mPZHOE");
        org.junit.Assert.assertEquals(
            result, 390
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 3986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ans");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("isThis");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4942
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 11254
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERItHisRIsaCrazyMiXofUPPERandloWercaseLENTERSFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 9981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5Nyn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10625
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQDRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 2167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQDRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 1748
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKTAnTAG");
        org.junit.Assert.assertEquals(
            result, 444
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSbsSPbpMPACESNDNOSPACESTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 8362
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis\nis\ta\ttest\twith\nnewliTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 3714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKKTAnTG");
        org.junit.Assert.assertEquals(
            result, 454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nnewleidnes\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThis");
        org.junit.Assert.assertEquals(
            result, 4332
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLEMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BLENTERRS");
        org.junit.Assert.assertEquals(
            result, 11729
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("new12345UVWXYZ678W90ines");
        org.junit.Assert.assertEquals(
            result, 612
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Dandef3@F");
        org.junit.Assert.assertEquals(
            result, 269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSbsSPbpMPACESNDNOSPACESTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 6249
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTOD5AY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALIONGSTRINGIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 6499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nThhis");
        org.junit.Assert.assertEquals(
            result, 4949
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERaTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACESseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 13770
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGHIJKLMNOPQRSTUVWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 11385
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1XYZ67890");
        org.junit.Assert.assertEquals(
            result, 267
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinThhiTHISITh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nETTERS.s");
        org.junit.Assert.assertEquals(
            result, 5882
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 21716
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNJOTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 4060
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 16589
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thhhihs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5yS5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdePQQQQVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 1799
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIscaCrazyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLaHELLOthereWHATareYOUdoingTODAABCDtHisIsaCrazyMiXofUPPERandloWercaseLENaTERSEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.dYZnewlind");
        org.junit.Assert.assertEquals(
            result, 6173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPACESWOMWFTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10447
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5S5T5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinesandY?IHopDeYOURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 4552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWOaNDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10056
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJThis\nis\ta\ttest\twith\nnewlines\tansK12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThisLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 6505
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELtL.");
        org.junit.Assert.assertEquals(
            result, 2262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFRUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 6800
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDMNOPMQRSTUVWXYZnewlines");
        org.junit.Assert.assertEquals(
            result, 1512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\tw\tith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ad");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERItHisRIrpaKTAnTGsaCrazyMiXofUPPERandloWercaseLENTERSFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 10360
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newleidnes");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 4499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1DERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 6984
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIITh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 9911
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5ahCrazyMiXofUtPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 10952
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 2089
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGH12345ABCDEFGHJIJThisJIJKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 2942
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWtELL.d");
        org.junit.Assert.assertEquals(
            result, 4082
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345UVtHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.PPER1A$Bc&Def3@FandloWeBrcaseLENTERRS78W90");
        org.junit.Assert.assertEquals(
            result, 10731
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinThhiTHISISALONThis\nis\ta\ttest\twith\nnewlines\tasnsSWLOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.s");
        org.junit.Assert.assertEquals(
            result, 7418
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wh12345AB20itth");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPACESWOWTHISCISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10367
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThis");
        org.junit.Assert.assertEquals(
            result, 4408
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnewindIJKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 3769
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth12345ABCDEThis\nis\ta\ttest\twith\nnewlines\tasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890");
        org.junit.Assert.assertEquals(
            result, 3440
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESRSTUVWXYZnewind");
        org.junit.Assert.assertEquals(
            result, 8650
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 5641
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTOD5AY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5tERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3458
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnewindIJRKLMLNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 3927
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5bsSPbpM5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1285
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345UVWXYZaHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWtELL.dW90");
        org.junit.Assert.assertEquals(
            result, 4694
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 2099
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5tH5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10046
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BERRS");
        org.junit.Assert.assertEquals(
            result, 11353
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5tTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTHERSANDNOSPACESNDNOSPACES5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 8239
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Dandef3");
        org.junit.Assert.assertEquals(
            result, 199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5Nyn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 27214
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("asnsZ67890");
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Decf3@FandloWeBrcaisThis\nis\ta\ttest\twith\nnewlines\tand\ttabsLENTERS");
        org.junit.Assert.assertEquals(
            result, 1820
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("neewines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("neewinees");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercasWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.eLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11931
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKisKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 5701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWONDERIFITWILLOVERFLOWwh12345AB20itthMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10187
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ZGxrhSo");
        org.junit.Assert.assertEquals(
            result, 244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWLONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 5574
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345B20aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5765
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHYopeYOURdayISgoingWELtL.");
        org.junit.Assert.assertEquals(
            result, 2351
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5bsSPbpM5ST5TS5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1220
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRandINGWITHMANYUPPERCASELETTisERSANDNOSPACESWOWTHISCISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 10367
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGHIJKLMNOPQRSTUVWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 13484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t55pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 4499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKisKKKLLLLMMMMNNNNOOOOPPPQTTUUVVVTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5bsSPbpM5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 5304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thins\nis\ta\ttest\twith\nnewlines\tasns");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLaHELLOthereWHATareYOUdoingTODAABCDtHisIsaCrazyMiXofUPPERandloWercaseLENaTERSEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm55g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.dYZnewlind");
        org.junit.Assert.assertEquals(
            result, 6173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESis\ta\ttest\twith\nnewleidnes\tdand\ttabss");
        org.junit.Assert.assertEquals(
            result, 6148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Decf3@FandloWeBrcaisThis");
        org.junit.Assert.assertEquals(
            result, 1279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATIareYOUdoingTODAY?IHoABCDEFGHIJKLMNOPQRSTUVWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 11458
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1234B20");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYTansFGHIJKLiMNOPQRSTUVWXYZnewlindhis\nis\ta\ttest\twith\nnewlines\tasnsZ67890");
        org.junit.Assert.assertEquals(
            result, 6102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newisThis\nis\ta\ttest\twith\nnewlines\tand\ttabsines");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPTHISISALONGCESACES");
        org.junit.Assert.assertEquals(
            result, 8026
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("nenewiThhisneswlwines");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESis");
        org.junit.Assert.assertEquals(
            result, 6064
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("test");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t55v5ff5mm5g5yS5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercasWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANmPZHOEYUPPERCASELETTERS.eLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 12321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 12299
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHopeYOURdaeyISgoingWELL.");
        org.junit.Assert.assertEquals(
            result, 2262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCroazyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1401
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlwineaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZs");
        org.junit.Assert.assertEquals(
            result, 5701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOIPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 10366
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5nsn5t5M5t5nTUVWWXYZsIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 14543
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinesTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5neewinesthytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1X6YZ6789ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5n0");
        org.junit.Assert.assertEquals(
            result, 4955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccisKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 4678
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisERSANDNOSPWOWLONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.ACESWOWTHISCISSUCHALONGSTRINGIWONDEABCDMNOPMQRSTUVWXYZnewlinesLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 16373
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPTPERCASELETTisERSANDNOSPACESWOWTHISISSUCHALONGSTRINGIWONDERIFaaaaabbbbbbccccccisKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 15062
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 24613
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Dand12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890f3@F");
        org.junit.Assert.assertEquals(
            result, 2358
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATODAY?IHopeYOURdayISgoingWELtL.");
        org.junit.Assert.assertEquals(
            result, 1925
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Tht5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.dans");
        org.junit.Assert.assertEquals(
            result, 3847
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 4644
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bcef3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 1750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth12345ABCDEFGHJIJansFGHIJKLMNOPQRSTUVWXYZnewlindKLMNOPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 3769
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5Nyn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbansK12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThisLMNOPQRSTUVWXYZ67890bbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 32866
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIscaCrazyMiXofUPPERandloWetHisRIsaCrazyMiXofUPPERandloWercaseLENTERSrcaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 2966
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ithwlwiwnes");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbcccccbcdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 4644
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5ncm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n55n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3s12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5Nyn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbansK12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThisLMNOPQRSTUVWXYZ67890bbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890t!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 37365
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbtHisIsaCrazyMiXofUPPERandloWercaseLENaTERSVVVTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5bsSPbpM5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYYYZZMZ");
        org.junit.Assert.assertEquals(
            result, 3558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMisThiswlinesand");
        org.junit.Assert.assertEquals(
            result, 1007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2whitth12345ABCDEThis\nis\ta\ttest\twith\nnewlines\tasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQRSTUVWXYZnewlindTSJUSTSOMANYELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 6850
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5mI5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 24686
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIansFGHIJKLMNOPQTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESRSTUVWXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 14291
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Tht5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.dansZGxrhSo");
        org.junit.Assert.assertEquals(
            result, 4091
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t12345AB05Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1398
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("w");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("dad");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5tTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTHERSANDNTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OSPACESNDNOSPACES5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 29955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n55n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 6585
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5tS5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWtELL.d");
        org.junit.Assert.assertEquals(
            result, 4165
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisILeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 21792
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZnewlinesThis");
        org.junit.Assert.assertEquals(
            result, 2099
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5mI5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPEThinsRCATERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 24770
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKTAnnTAG");
        org.junit.Assert.assertEquals(
            result, 444
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5ahCrazyMiXofUtPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.JIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESt5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 20184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5Tn5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNOnPQRSTUVWXYZnewlinesand");
        org.junit.Assert.assertEquals(
            result, 3296
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ww");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 10418
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis");
        org.junit.Assert.assertEquals(
            result, 419
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTOD5AY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS55t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsLENTERS");
        org.junit.Assert.assertEquals(
            result, 541
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("neweines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!HELLOthereWHATODAY?IHopeYOURdayISgoingWELtL.s$0nly42t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITIWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BERRS");
        org.junit.Assert.assertEquals(
            result, 11426
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newleidntHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSes");
        org.junit.Assert.assertEquals(
            result, 8586
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCH12345ABCDEFGHJIJThis\nis\ta\ttest\twith\nnewlines\tansK12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThisLMNOPQRSTUVWXYZ67890ALONGSTRINGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWONDERIFITWILLOVERFLOWwh12345AB20itthMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 16692
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVJWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 6500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5S5T5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinesandY?IHopDeYOURdayISgoingWELL.d305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7673
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ii");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGST12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWO1NDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 9992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("JZAJpAM");
        org.junit.Assert.assertEquals(
            result, 445
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t12345AB05Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 7097
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIzyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPRERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8601
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETef3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 9645
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJ2345ABCDEFGHJIJThisJIJKLMNOPQRSTUVWXYZ67890NNNNJOTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5542
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Tishhhihs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPPERandABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlindloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 13782
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t123454ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHaaaaabbbbbbccccccdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 12283
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("xP");
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nv5t5sn5t5M5t5nS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 12695
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thinsn\nis\ta\ttest\twith\nnewlines\tasns");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJ");
        org.junit.Assert.assertEquals(
            result, 622
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofLUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8662
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth1s\tasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890");
        org.junit.Assert.assertEquals(
            result, 3021
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGHIJKLMNOPQRSTUVWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 11804
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISNISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 16667
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newl12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIansFGHIJKLMNOPQTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESRSTUVWABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlindXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThisines");
        org.junit.Assert.assertEquals(
            result, 16390
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisILeLENTERSercaseLENTERTS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggtHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 24696
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJThis");
        org.junit.Assert.assertEquals(
            result, 853
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("212345AB20");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sns5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 4499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASEL12345ARBCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 6146
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Tishhhih1X6YZ6789ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5n0s");
        org.junit.Assert.assertEquals(
            result, 5039
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZ12345ABCDEFGHJIJKLMNOIPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890ZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 32082
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTU12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThisVWXYWOWTHISISSUCHALIONGSTRINGIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 12140
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1678W90");
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 3035
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVEENALARGBUFFER.ETef3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 9714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("123FGHJIJThis");
        org.junit.Assert.assertEquals(
            result, 518
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCraaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZThisERS");
        org.junit.Assert.assertEquals(
            result, 6229
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("btabs");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$tHisIsaCrazyMABCDEFGHIJKLMNWOWTHISISSUCHALONGSTRINGIWONDERIFITIWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BERRS0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 15508
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCEDEThis");
        org.junit.Assert.assertEquals(
            result, 488
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIscaCrazyMiXofUPPERandloWercaseLENTERSd");
        org.junit.Assert.assertEquals(
            result, 1483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisILeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5Tn5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNOnPQRSTUVWXYZnewlinesand");
        org.junit.Assert.assertEquals(
            result, 25088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn15t5M5t5nUVWXYThis");
        org.junit.Assert.assertEquals(
            result, 4408
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TdadS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5n");
        org.junit.Assert.assertEquals(
            result, 2195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHitWOWTHIttabs.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1182
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t55v5ff5mm5g5yS5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m55t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth1s\tasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$-0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890");
        org.junit.Assert.assertEquals(
            result, 3021
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENtHisRIscaCrazyMiXofUPPERandloWercaseLENTERSdeLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 5664
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ZGxrhS");
        org.junit.Assert.assertEquals(
            result, 244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nistHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTE5RS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS\ta\ttest\twith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 24697
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5newlinThhiTHISITh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nETTERS.sCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 26466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thshissd");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("dmFWhHwdrnenewiThhisneswlwines");
        org.junit.Assert.assertEquals(
            result, 313
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSbsSPbpMPACESNDNOSPACESTTTUUVVVVWWWXXXTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nv5t5sn5t5M5t5nYYYZ");
        org.junit.Assert.assertEquals(
            result, 13123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnewindIJRKLMLNOPQRSTUVVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 4013
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5neidnes");
        org.junit.Assert.assertEquals(
            result, 7870
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIansFGHIJKLMNOPQTHTHISISALONGSTRINGWITHMANYUPLPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESRSTUVWXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 14367
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWCELLTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETef3@FandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 7981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGST12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890RINGWITHMANYUPPERCASELETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 13938
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYRUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 9536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPPERandABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGWXYZTODAY?IHopDZGxrhSoeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES\nis\ta\ttest\twith\nnewlines\tansFGHIJKLiMNOPQRSTUVWXYZnewlindloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 14026
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIzyMiXofUPHALONGSTRINTGIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPRERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8065
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("112345UVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 525
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVEENALARGBUFFER.ETef3@FaLndloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 9790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFIT.ETTERTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nS.");
        org.junit.Assert.assertEquals(
            result, 10546
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wwaaaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZd");
        org.junit.Assert.assertEquals(
            result, 7639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansK12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!");
        org.junit.Assert.assertEquals(
            result, 2271
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SithS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5nZGxrhS");
        org.junit.Assert.assertEquals(
            result, 4932
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("bPsSPbpM");
        org.junit.Assert.assertEquals(
            result, 320
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wwaaaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggXHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZd");
        org.junit.Assert.assertEquals(
            result, 7727
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIs");
        org.junit.Assert.assertEquals(
            result, 695
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Tishs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKTtHisRIscaCrazyMiXofUPPERandloWercaseLENTERSdAnTG");
        org.junit.Assert.assertEquals(
            result, 1862
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5Ut5n");
        org.junit.Assert.assertEquals(
            result, 4773
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZn1A$Bc&Def3@Fewlinesand");
        org.junit.Assert.assertEquals(
            result, 2284
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_.c@5ES.4305t5nn5t5v5ff5mm5g55gn5t5Tht5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5YZnewlinURdayISgoingWELL.dansZGxrhSo");
        org.junit.Assert.assertEquals(
            result, 4091
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345B20");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbcccccbcdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSSTTTTUUVTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5bsSPbpM5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nZZ");
        org.junit.Assert.assertEquals(
            result, 5926
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDMNOPMQRSTUVWXYZinewlines");
        org.junit.Assert.assertEquals(
            result, 1512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newleines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("dand");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2d%3*4@5_c@5ESnWOWTHISISSUCHALONGSLTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESASELETTERS.ewlinThhis.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nUVWXYThis");
        org.junit.Assert.assertEquals(
            result, 18750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTOD5AY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5WmaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS55t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 15236
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n55n5t55Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 6585
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGneewinesWITHMThhiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 21312
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdaoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETef3@eFandloWeBrcaseLENTERRS");
        org.junit.Assert.assertEquals(
            result, 9645
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOIGPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASErpaKTAnnTAGLETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 10881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIscaCrazyMiXofUPPtHisIsaCraaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZThisERSloWercaseLENTERSrcaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 8102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("whitth12345ABCDEThis");
        org.junit.Assert.assertEquals(
            result, 419
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRIWOWTHISISSUCHALONGSTRINGIWONDERIFIT.ETTERTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nS.NGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWOaNDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 20602
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL1ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SithS5t5v5t5sn5t5M5t5nVWXYZ67890ETTERSANDNOSPACESNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 12600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES\nis\ta\ttest\twith\nnewlines\tanaaaaMaABCDEIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSbsSPbpMPACESNDNOSPACESTTTUUVVVVWWWXXXTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nv5t5sn5t5M5t5nYYYZsFGHIJKLiMNOPQRSTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 25422
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Dandef3aaaaMaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHQHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 15635
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERaTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACESseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nB20");
        org.junit.Assert.assertEquals(
            result, 13836
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMtHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWABCDEThisNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIITh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 12873
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMtHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWABCDEThisNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIITh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5S5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nIIJJJJKKKKLLLLMMMMNNNPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 12479
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sTh!s!s$0nly4t3st!ng-1DERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 11084
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5645
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQRSTUVnWXYZnewind");
        org.junit.Assert.assertEquals(
            result, 1680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTOD5AY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5WmaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRITh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t55v5ff5mm5g5yS5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nzyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS55t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 17441
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbcccccbcdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 4725
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 2554
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHYopeYOURdayThinsgWELtL.");
        org.junit.Assert.assertEquals(
            result, 2279
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Def3@FandlLoWeBrcaseLaENTERS");
        org.junit.Assert.assertEquals(
            result, 1812
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1DERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn512345ABCDEFGHJIJKLMNOPTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nQRSTUVWXYZ67890t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 13938
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("MSrP");
        org.junit.Assert.assertEquals(
            result, 240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFGHIJKLMNOPQRSTUVWXYZnewliGnd");
        org.junit.Assert.assertEquals(
            result, 1751
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5tT5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5neidnes");
        org.junit.Assert.assertEquals(
            result, 7954
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5a_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLtabsLENTERSMNOPQRSTUVWXYZ67890ETTHERSANDNOSPACESNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7583
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPaHELLOthereWHATareYOUdoingTODAABCDEFGHIJKLMTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNOnPQRSTUVWXYZnewlinesandY?IHopDeYOURdayISgoingWELL.dPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5neidnes");
        org.junit.Assert.assertEquals(
            result, 13412
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISNISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMAABCDMNOPMQRSTUVWXYZinewlinesNYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890");
        org.junit.Assert.assertEquals(
            result, 18179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPER1A$Bc&Def3@FandloansFGHIJKLiMNOPQRSTUVWXYZnewlindXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThisinesWeBrcaseLaENTERS");
        org.junit.Assert.assertEquals(
            result, 5367
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("mw");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("123O45Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nABCDMNOPMQRSTUVWXYZinewlinesOSPACESRSTUVWXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 6847
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nistHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4KtHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETef3@FandloWeBrcaseLENTERRS5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTE5RS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS\ta\ttest\twith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 34342
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M!5t5nlinThhis");
        org.junit.Assert.assertEquals(
            result, 3897
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOv5t5sn5t5M5t5nENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 6934
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Tihshhhi123FGHJIJThishs");
        org.junit.Assert.assertEquals(
            result, 602
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsLEasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890NTERS");
        org.junit.Assert.assertEquals(
            result, 3562
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJOPPPQQQQRRRbRSSSTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nSTTTTUUVVZZPERCASEL12345ARBCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 17071
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLfENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4942
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpaKnKTAnTG");
        org.junit.Assert.assertEquals(
            result, 454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nistHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTE5RS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTNERS\ta\ttest\twith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 24775
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("btab");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttelst\twith\nnewlines\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPLER1A$Bc&Decf3@FandloWeBrcaisThis\nis\ta\ttest\twith\nnewlines\tand\ttabsLENTERS");
        org.junit.Assert.assertEquals(
            result, 1896
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLtabsLENTERSMNOPQRSTUVWXYZ67890ETTHERSANDNOS");
        org.junit.Assert.assertEquals(
            result, 6469
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rZGxrhS");
        org.junit.Assert.assertEquals(
            result, 244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlinThhiTHISITh!s!s$0nly4t3sHELLOthaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLYOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.QQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nETTERS.s");
        org.junit.Assert.assertEquals(
            result, 17281
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345BAB0");
        org.junit.Assert.assertEquals(
            result, 197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yMn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TSt5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJJ2345ABCDEFGHJIJThisJIJKLMNOPQRSTUVWXYZ67890NNNNJOTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5616
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYweeZIFRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 3146
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnewindIJKLMNOPQRSTUVWXYZ678");
        org.junit.Assert.assertEquals(
            result, 3769
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rTpaKnKTAnTG");
        org.junit.Assert.assertEquals(
            result, 538
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALOtHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sns5t5M5t5nv5t5sn5t5M5t5nSNGSTRINGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWOaNDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 14555
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aHSgoingWELL.d");
        org.junit.Assert.assertEquals(
            result, 463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("asnsSWLOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.s");
        org.junit.Assert.assertEquals(
            result, 6484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFrpaKTAnnTAGGHIJKLMNOPQRSTUVnWXYZne12345UVWXYZ678newleidntHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSes90wind");
        org.junit.Assert.assertEquals(
            result, 11235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIsaCrazyMiXofUPwitWOWTHIttabs.Wercas12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGiABCDEFGHIJKLMNOPQRSTUVWWXYZsIWONDERIFITWILLOVERFLOWMELETTERS.Z67890eLENTERS");
        org.junit.Assert.assertEquals(
            result, 10262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rnao");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5ahCrazyMiXofUtPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5THTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHHELLOthereWHATarteYOUdoingTODAY?IHopeYOURdayISgoingWELL.JIJKLMNOPQRSTUVWXYZ67890ETTERSANDNOSPACESNDNOSPACESt5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 20184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t55n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 9974
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQRSTUVWXYZnewlindLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSPACESNDNOSPACESTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 10221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("asnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890");
        org.junit.Assert.assertEquals(
            result, 3021
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabss");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMABCDEFGHIJKLMNWOWTROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.OPQRSTUVWXYZnwithewlinesandiXofUPPER1A$BLENTERRS");
        org.junit.Assert.assertEquals(
            result, 7489
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rpAnTAG");
        org.junit.Assert.assertEquals(
            result, 285
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLSSTTTTUUVVVVWWWXXXYYYZZZIsaCrazyMiXofUPwitWOWTHIttabs.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 7379
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTER7890ETTERSANDNOSPACESNDNOSPACESRSTUVWXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 5417
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUWOWTHISISSUaHELLOthereWHATarERRS");
        org.junit.Assert.assertEquals(
            result, 2347
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCERS.");
        org.junit.Assert.assertEquals(
            result, 7672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("T12345ABCDEFGHJIJKLMTHTHISISALONGSTRINGWITHMANYUPPERCASEL12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890ETTHERSANDNOSPACESNDNOSPACESNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONABCDEFGHIJKLMNOPQRSTUVWXYZnewlinesandOSPACES");
        org.junit.Assert.assertEquals(
            result, 13851
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHaaaaabbbbbbccccccdddeeefffggggHHHHHIIIJIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 11846
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thins\nis\ta\ttest\twith\nnewlisnesns");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFEMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 9483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisRIzyMiXofUPHALONGSTRINTGIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFXER.ITSJUSTSOMANYUPPRER.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 7234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaNNZGxrhSOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 2798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("rGTpaKnKTAnTG");
        org.junit.Assert.assertEquals(
            result, 609
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345B20aaaaabbbbbbccccccddKdeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 3446
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQRSTThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5Ut5nUVWXYZnewlindLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaETTHERSANDNOSPACESNDNOSPACESTTTUUVVVVWWWXXXYYYZZJZ");
        org.junit.Assert.assertEquals(
            result, 15068
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t55pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nWOWTHISISSUCHALONGSTRINGIWONDERIFIT.ETTERTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nS.S");
        org.junit.Assert.assertEquals(
            result, 15045
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeThis\nis\ta\ttest\twith\nnewleines\tand\ttabseefffggggHHHHHIIIIJJJOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 3119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nistHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOW5THISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTE5RS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS\ta\ttest\twith\nnewlines\tans");
        org.junit.Assert.assertEquals(
            result, 24697
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGABCDEtHisRIsaCrazyMiXofUPwitWOWTHISISSUCHALONGSTRINTGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSFGQRSTUVWXYZnewlinesSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFEMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 20268
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThis\nis\ta\ttest\twith\nnewlines\tansFGHIJKLMNOPQDRSiTUVWXYZnewlind");
        org.junit.Assert.assertEquals(
            result, 2167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKABCDEThis");
        org.junit.Assert.assertEquals(
            result, 1266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("hTiishhhihs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("123O45Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nABCDMNOPMQRSTUVWXYZinesOSPACESRSTUVWXYZnewindsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThis");
        org.junit.Assert.assertEquals(
            result, 6847
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisERIsaCrazyMiXofUPHALONGSTRINTGIWONDERItHisRIsaCrazyMiXofansFGHIJKLMNOPQDRSiTUVWXYZnewlindUPPERandloWercaseLENTERSFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 11798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWONDERIFITWILLOVERFLOWwh12345AB20itthMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 7426
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITORORTHISISALONGSTRIN12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890GWITHMANYUPPERCASELETTisERSANDNOSPACESEVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 24561
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaMaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNaaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNMNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 15432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5tThis\nistHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTE5RS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS\ta\ttest\twith\nnewlines\tans5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 25964
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mmY5g55gn5t5Th5t5yn5thy5ht5t5S5t5aaaaaABCDEFGHIJKLMNOPQRSTUVWXYZbbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZt5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10636
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thins");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaYaabbbWbbbccccccddKdePQQQQVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 1975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnThins\nis\ta\ttest\twith\nnewlisnesnsewindIJRKLMLNOPQRSTUVVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 4097
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaNNOOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 2633
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n512345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONG5STRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFEMANYUPPERCASELETTERS.Z67890t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEThisTHISISALONGSTRINGWITHMANYUPPERCASELETTisEThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHoABCDEFGHIJKLMNOPQRSTUVWXYZTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th05t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsahCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5ABCDEFGHIJKLMNOPQRSTUVWXYZn1A$Bc&Def3@Fewlinesandt5v5t5sn5t5M5t5nRSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 14088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t25v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4688
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("nRGf");
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHitWOWTHIttabs.WercaseLENTRS");
        org.junit.Assert.assertEquals(
            result, 1113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercasWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 10157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("an");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThhiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nv5t5sn5t5M5t5nv5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 17112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaOaNNOOOOPPPQQQQRRRbRSSSSTTTTUUVVZZ");
        org.junit.Assert.assertEquals(
            result, 2633
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ansFrpaKTAnnTAGGHIJKLMNOPQRSTUVnWXYZne12345UVWXYZ678newleidntHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERIFITWILLPERCASELETTERS.WercaseLENTERSes90wind");
        org.junit.Assert.assertEquals(
            result, 7107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sTt!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZMZn5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nwitWOWTHISISSUCHALONGSTRINTGIWONDERIFIaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZ12345ABCDEFGHJIJKLMNOIPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOVWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z67890ZZTWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 32166
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("TrpaKnKTAnTG");
        org.junit.Assert.assertEquals(
            result, 538
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJansFGHIJKLMNOPQRSTUVWXYZnewindIJRKLMLNOPQRSTUVWXYZ67890mOPZHOE");
        org.junit.Assert.assertEquals(
            result, 4396
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThshissTd");
        org.junit.Assert.assertEquals(
            result, 168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SSbtab5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1267
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnewlines5shr5t5SS5t5v5t5sn5t5M5t5nZGxrhttabs");
        org.junit.Assert.assertEquals(
            result, 4849
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHATh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g5yS5gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSs5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nLONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 12070
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("hTiishhhiaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZhs");
        org.junit.Assert.assertEquals(
            result, 5708
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("LjZfMMKsDj");
        org.junit.Assert.assertEquals(
            result, 463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aithand");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYO5URdayISgoingWELL.t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERThhiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 14923
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th55t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t55pn5t5shr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nWOWTHISISSUCHALONGSTRINGIWONDERIFIT.ETTERTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNONOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nS.S");
        org.junit.Assert.assertEquals(
            result, 15123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisOVERFLOWMYTEXTEDITORORETh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5mI5t5nms5t4K5t5ms512345ABCDEFGHJIJKLMNOPQRSTUIVW12345ABCDEFGHJIJKLMNOPQRSTUVWXYWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSOMANYUPPERCASELETTERS.Z67890XYnewasnsFGHJIJKLMNOPQRSTUVWXTh!s!s$0nly4t3st!ng-1&2%3*4@5seLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nYZ67890%3*4@5_c@5ES.4305t5n5t5v5ff5maHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5neidnesWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFUPPERCASELETTERS.Z697890tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nVENALARGBUFFER.ITSJUSTSOMANYUPPERCATERS.WercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 32556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIeLENTERTh!s!s$0nly4t3st!ng-1&*2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERS5t5m5t5sTh!s!s$0nly4t3st!ng-1DERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.Z678905S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nn5t5sThisTh!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.t!ng-1&2ABCDEFGHIJKLMNOPQRSTUVWXYZnIewlines5shr5t5SS5t5v5t5sn5t5M5t5nhr5t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5sn5t5M5t5nS");
        org.junit.Assert.assertEquals(
            result, 15845
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMNOPQRSTU12345Th!s!s$0nly4t3st!sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thytHisIeLENTERSercaseLENTERSL5t5m5t5sn5ST5TS5t5n5tHisRIsaCrazyMiXofUPHALONGSTRINTGIWONDERItHisRIrpaKTAnTGsaCrazyMiXofUPPERandloWercaseLENTERSFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.WercaseLENTERSt5n5t5Ar5t5pn5t5shr55t5SS5t5Th!s!s$0nly4t3sHELLOthereWHATareYOUdoingTODAY?IHope5t5sn5t5M5t5nv5t5tHisIsaCrazyMiXofUPPEPRandloWercaseLENaTERSWXYThisVWXYWOWTHISISSUCHALIONGSTRINGIWONDERIFITWILLOVERFLOWMELETTERS.Z67890");
        org.junit.Assert.assertEquals(
            result, 22500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Ths");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEwhitthXYZnewlinesThis");
        org.junit.Assert.assertEquals(
            result, 686
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t55S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar55t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2437
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("bans");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUaHELLOthereWHATareYOUdoingTODAY?IHopDeYOURdayISgoingWELL.dCHALONGSTRITh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUPPERandloWercaseLENTERS5tTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5tHisRIsaCrazyMiXofUaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZS5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5m5t5sn5ST5TS5t55n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nNGtHisIsaCrazyMiXofUPPERandloWercaseLENTERSIWOaNDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ETTERS.");
        org.junit.Assert.assertEquals(
            result, 20030
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(" ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(" aBcDeF12* ");
        org.junit.Assert.assertEquals(
            result, 204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCabc");
        org.junit.Assert.assertEquals(
            result, 198
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("A");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("hellothere");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abc");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABC");
        org.junit.Assert.assertEquals(
            result, 198
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twith\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 2099
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 4059
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ");
        org.junit.Assert.assertEquals(
            result, 2034
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASELERSANDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 3822
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSSALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 5311
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1725
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 1680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3551
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\n1A$Bc&Def3@Fnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYZ");
        org.junit.Assert.assertEquals(
            result, 354
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1045
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 11897
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwh");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSSALONGSTRINGWITHMANYUPPERCASELETTTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThisERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9868
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2183
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXofRUzPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1940
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wittestsIsaCrazyMiXofRUPPERandloWercaseLENTERSth");
        org.junit.Assert.assertEquals(
            result, 1411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2183
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRESTUVThis\nis\ta\ttabstest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2252
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXLENTERS");
        org.junit.Assert.assertEquals(
            result, 846
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9959
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7261
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUFCHALtabsBCDEFGHIJKLMNOPQRSTUVThisONGSTRINGIWONDERIFFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 6852
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("uidRKhwDoJ");
        org.junit.Assert.assertEquals(
            result, 299
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZZZh");
        org.junit.Assert.assertEquals(
            result, 5624
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINEGWITHMANYUPPERCASELETTERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 4044
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFKLMONOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1804
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 1844
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASESLETTERS.");
        org.junit.Assert.assertEquals(
            result, 9881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 2102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 1314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXTHISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACESThisAThisZ");
        org.junit.Assert.assertEquals(
            result, 4473
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALAtabsWXYZRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 10152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiwth");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("dgtm");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSTUVThish");
        org.junit.Assert.assertEquals(
            result, 1759
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 3946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCASSELETTOERSANDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 4221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tteWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 628
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIsaCrazyMiXofUPPERaTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nLENTERS");
        org.junit.Assert.assertEquals(
            result, 2511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 4030
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMN0OPQRSTUVWXYZ67890");
        org.junit.Assert.assertEquals(
            result, 2089
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiERS");
        org.junit.Assert.assertEquals(
            result, 451
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsttestsIsaCrazyMiERSBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2634
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis");
        org.junit.Assert.assertEquals(
            result, 149
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRESTUVThis");
        org.junit.Assert.assertEquals(
            result, 1749
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettestsIsaCrazyMiXLENTERSstestt");
        org.junit.Assert.assertEquals(
            result, 846
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSsh");
        org.junit.Assert.assertEquals(
            result, 1420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMTANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9952
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSTUVtabsWDXYZThish");
        org.junit.Assert.assertEquals(
            result, 2181
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("iThis");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsbBCDEFs");
        org.junit.Assert.assertEquals(
            result, 340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSTUVtabsWDXDYZThish");
        org.junit.Assert.assertEquals(
            result, 2249
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 1933
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.tabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 10390
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTR12345ABCDEFGHJIJKLMNOPQRSTUVWXYZ67890NDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 4009
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7183
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRS");
        org.junit.Assert.assertEquals(
            result, 1341
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOQRSsh");
        org.junit.Assert.assertEquals(
            result, 881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 5513
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t12345ABCSTUVWXYZ67890estt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 1562
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabiThissBCDEFGHIJKLMNOPQRS\nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 5262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twitestth\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 2269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 12268
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ntabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUtabsttestsIsaCrazyMiERSBCDEFGHIJKLMNOPQRSTUVThisVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 7755
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ntabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 12758
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wittestsIsaCrazyrcaseLENTERSth");
        org.junit.Assert.assertEquals(
            result, 681
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("antabsWXYABCDEFGHIJLMNOPQRSTUVWXYZZd");
        org.junit.Assert.assertEquals(
            result, 2294
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELEcTTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7261
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tstabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 3946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5429
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nntestewlines\tand\ttabsWDXYZtabs");
        org.junit.Assert.assertEquals(
            result, 506
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabiThissBCDEFGHIJKLMNOPQRS\nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.tabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 15652
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5578
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 10107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5Tt5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 756
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJGHIJKLMNOPQRSTUVThisVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 3694
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERanAdloWerca12345ABCSTUVWXYZ67890seLENTERSStabsBCDEFGHIJKLMNOPQRSTUittabsBCDEFGHIOJKLMNOPQRSshVWXYZALONGSTRINGWITHMANYUPPERCASELEcTTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 9636
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXYAThisZa");
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThisLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSsWXYZ");
        org.junit.Assert.assertEquals(
            result, 10400
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlineTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 4639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThisZ");
        org.junit.Assert.assertEquals(
            result, 349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXTHICSISALONGSTRINGWITHMANYUPPERCASELETTERSANDNhOSPACESThisAThisZ");
        org.junit.Assert.assertEquals(
            result, 4540
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.IJJJJGHIJKLMNOPQRSTUVThisVVVVWWWXXXYYYZZZ");
        org.junit.Assert.assertEquals(
            result, 5956
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t1c&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 464
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5Tt5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5tt5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 756
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCrazyMiXofRUPPEWRandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1847
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttOesst\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 4025
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabiThissBCDEFGHIJKLMNOPQRS");
        org.junit.Assert.assertEquals(
            result, 1425
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 3247
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXofRUPPERPandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1491
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tteWeTrcaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 712
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVThis\niWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.s\ta\ttest\twitestth\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 12137
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 1764
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3s5t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiwtTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7329
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Def3@Fnewlines");
        org.junit.Assert.assertEquals(
            result, 269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 12608
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettestsIsaCrtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tstabsWXYAThisZa\ttest\ttabsWDXYZazyMiXLENTERSstestt");
        org.junit.Assert.assertEquals(
            result, 4792
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSQRS");
        org.junit.Assert.assertEquals(
            result, 2824
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tteWeTrcaseLeENTERS");
        org.junit.Assert.assertEquals(
            result, 712
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXTisZ");
        org.junit.Assert.assertEquals(
            result, 349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twitTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nh\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 3041
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t12345ABCSTUVWXYZ67890estt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nRRRSSSSTTTTUUVVVVWWWXXXYYYZZZh");
        org.junit.Assert.assertEquals(
            result, 7186
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5ttabsWDXYZazyMiXLENTERSstestt5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 2325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5tn5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ntabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nh");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttwitwhtabsBCDEFGHIJKLMNOPQRSTUVThiseWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 2308
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZsaCraMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5429
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFKLMONOPQRSTUVWXYVtabsBCDEFGHIJKLMNOPQRSTUVThis\niWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.s\ta\ttest\twitestth\nnewlines\tand\ttabsWXYAThisZZ");
        org.junit.Assert.assertEquals(
            result, 13941
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("dgtmtteTrcaseLeENTERSm");
        org.junit.Assert.assertEquals(
            result, 625
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabstest");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 2193
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnetabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZwlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 14080
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQBRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 2081
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaTHISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACESCrazyMiXofRUzPPERIandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5459
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettsestsIsaCrazyMiXLENTERSstestt");
        org.junit.Assert.assertEquals(
            result, 846
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5vn");
        org.junit.Assert.assertEquals(
            result, 968
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nt5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1869
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZazyMiXLENTERSstestt");
        org.junit.Assert.assertEquals(
            result, 1128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 10035
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttabsttestsIsaCrazyMiERSBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZbs");
        org.junit.Assert.assertEquals(
            result, 2634
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROROEVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXofRUPPERandloWercaseLENRS");
        org.junit.Assert.assertEquals(
            result, 1258
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 12319
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("CtabsBCDEtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 3314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 13537
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5hwithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALAtabsWXYZRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.t5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5ts5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5tabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewl5ines\tand\ttabsTS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 2136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.");
        org.junit.Assert.assertEquals(
            result, 10509
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettsestsIsaCrazyMiXLENTERtt");
        org.junit.Assert.assertEquals(
            result, 763
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f55S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t1c&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 380
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsttestsIsaCrazyMiERSBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tetHisIsaCrazyMiXofUPPERaTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nLENTERSt");
        org.junit.Assert.assertEquals(
            result, 2511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZtabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThisLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSsWXYZZZ");
        org.junit.Assert.assertEquals(
            result, 16024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCSTUVWCXYZ67890");
        org.junit.Assert.assertEquals(
            result, 957
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$eBc&Def3@Fnewlines");
        org.junit.Assert.assertEquals(
            result, 269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSTUVThishittabsBCDEFGHIOQRSsh");
        org.junit.Assert.assertEquals(
            result, 2640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nthtabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 5143
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 3258
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSsWXYZ");
        org.junit.Assert.assertEquals(
            result, 2114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 1680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTTh!s!s$0nly4t3st!ng-f55S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t1c&Def3@F5nRINGIWONDMERIFITWILLOVERFLOWMYCTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 10406
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCrazyMiXofRUPPEVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twitestth\nnewlines\tand\ttabsWXYAThisZWRandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 4116
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabAThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZDThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 21187
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPEERCASELETTERS.THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVaWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 17499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVTRhis\nis\ta\ttest\twitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.h\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 12219
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("s");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7337
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 13311
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXoIfUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7402
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXTHICSISALONGSTRINGWITHMANYUPPERCASELETTERisAThisZ");
        org.junit.Assert.assertEquals(
            result, 3558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twiRth\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZsaCraMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYZDThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 6420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1053
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttwitwhtabsBCDEFGHIJKLMNOPQRSTUVThiseWABCQRSTUVWXYZercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 3361
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 11631
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ntestewlines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMN0OPQRSTUVWXYZY67890");
        org.junit.Assert.assertEquals(
            result, 2178
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXoIfUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWIITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7475
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 12947
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testtwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.h5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11065
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witabsiYWXYAThisZTh!s!s$0nly4t3s5t!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 1390
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEtHisIsaCraztabsiYWXYAThisZyMiXofRUPPERandloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 3839
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZZ");
        org.junit.Assert.assertEquals(
            result, 593
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttest\twith\nntestestabsWXThiAThiswlines\tand\ttabsWDXYZtabs");
        org.junit.Assert.assertEquals(
            result, 914
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345AHBCDEFGHJIJKLMN0OPQRSTUVWXYZY67890");
        org.junit.Assert.assertEquals(
            result, 2250
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0tnly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("TATihiABCDEFKLMNOPQRSTUVWXYZstabsWXYAThisZa");
        org.junit.Assert.assertEquals(
            result, 2461
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5mstabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsiYWXYAThisZ5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 5484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZtabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThisLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 11737
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMWiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7416
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRESQTUVThis");
        org.junit.Assert.assertEquals(
            result, 1830
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITtettestsIsaCrtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tstabsWXYAThisZa\ttest\ttabsWDXYZazyMiXLENTERSstesttSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 14590
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tetHTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t12345ABCSTUVWXYZ67890estt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nisIsaCrazyMiXofUPPERaTh!s!s$0nly4t3sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SSaaaaabbbbbbccccccdddeeefffggggHHHHHIIIHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.IJJJJGHIJKLMNOPQRSTUVThisVVVVWWWXXXYYYZZZ5t5v5t5sn5t5M5t5nLENTERSt");
        org.junit.Assert.assertEquals(
            result, 9558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\ttest\twithWOWTHISISSUCIHALONGXSTRFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 7438
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNPACES");
        org.junit.Assert.assertEquals(
            result, 7175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twitestth\nnewlines\tand\ttabsWXYAThisZHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 9598
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 13301
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiRth");
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsTS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 475
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlintabstesteTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 4639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 10290
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabbsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5578
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTaERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 25208
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSFTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 13381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVTRhis\nis\ta\ttest\twitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVYERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.h\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 12308
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQitAThis\nis\ta\ttest\twith\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 14707
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 5552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVEaCrtabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 8402
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5ttabsWDXYZazyMiXLENTERSstestt5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5ttest5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 2325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5hwithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALAtabsWXYZRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.t5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5ts5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCtetHisIsaCrazyMiXofUPPERaTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nLENTERStrazyMiXofRUPPERandloWercaseLENTERSsWXYZ");
        org.junit.Assert.assertEquals(
            result, 4625
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5ttabsBCDEtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 3919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.twitwhtabsBCDEFGHIJKLMNOPQRSTUVThiseWABCQRSTUVWXYZercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 13530
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCAtetHTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t12345ABCSTUVWXYZ67890estt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nisIsaCrazyMiXofUPPERaTh!s!s$0nly4t3sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SSaaaaabbbbbbccccccdddeeefffggggHHHHHIIIHELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWELL.IJJJJGHIJKLMNOPQRSTUVThisVVVVWWWXXXYYYZZZ5t5v5t5sn5t5M5t5nLENTERStSELETTERS.");
        org.junit.Assert.assertEquals(
            result, 17676
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsbBiThisEFs");
        org.junit.Assert.assertEquals(
            result, 289
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabiThtabsbBCDEFsissBCDEFGHIJKLMNOPQRS\nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n\tWOWTHISISSUFCHALtabsBCDEFGHIJKLMNOPQRSTUVThisONGSTRINGIWONDERIFFFER.ITSJUSTSOMANYUPPERCASELETTERS.a\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttetHisItabbsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSst\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 18032
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttabsttestsIsaCrTazsyMiERSBCDEFGHIJKLMNOPQRSTUVThiest\twith\nnewlines\tand\ttabsWXYAThisZbs");
        org.junit.Assert.assertEquals(
            result, 2718
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("itTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ntabsBCDEFGHIOQRSsh");
        org.junit.Assert.assertEquals(
            result, 4112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSFPTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 13461
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.b5t5m5t5nm5t4KKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 11409
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("1A$Bc&Def3@FnewliDnes");
        org.junit.Assert.assertEquals(
            result, 337
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 592
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5n5t5Ar5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 879
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYCZsaCraMiXofRUPPERandloWercaseLEwitwhtabsBCDEFGHIJKLMNOPQRESTUVThis\nis\ta\ttabstest\twith\nnewlines\tand\ttabsWXYAThisZNTERS");
        org.junit.Assert.assertEquals(
            result, 4079
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYATThisZHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 5636
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINEGWITHMANYUPPERCAtabsBCDEFGHIJKLMNOPtHisIsaCrazyMiXofRUPPERandloWercaseLENTERSQRSERSANDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 6403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKh");
        org.junit.Assert.assertEquals(
            result, 784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wtabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZiwth");
        org.junit.Assert.assertEquals(
            result, 11631
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("atabsbBCDEFs");
        org.junit.Assert.assertEquals(
            result, 340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5Th!s!s$0nly4t3sttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nthtabsWXYAThisZa\ttest\ttabsWDXYZ!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nt5yn5thy5ht5t5S5t5b5t5m5t5nm5tK5t5ms55t5m5t5n5t5r5testt55s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 7012
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZa");
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%tteWercaseLENTERS3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testtwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.h5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nn5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 12491
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0tnly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5nff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabiThissBCDEFGHI");
        org.junit.Assert.assertEquals(
            result, 640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXoTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5mstabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsiYWXYAThisZ5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nIfUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 12886
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVYERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.h");
        org.junit.Assert.assertEquals(
            result, 10460
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFGER.ITSJUSTSOMANYUPPERCASELETTERS.tabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 10461
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCrazyMiXofRUPPEVtabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2816
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQitAThis");
        org.junit.Assert.assertEquals(
            result, 5288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereOURdayISgoingWELL.");
        org.junit.Assert.assertEquals(
            result, 1082
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("itTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2083
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 3227
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVwittestsIsaCrazyMiXofRUPPERandloWercaseLENTERSthThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 11209
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms55v5t5sn5t5M5t1A$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZsaCrazyMiXofRUPPEVtabsBCDEFLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2451
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlintabstesteTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttTHISISALONGSTRINEGWITHMANYUPPERCASELETTERSANDNOSPACESestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 8683
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCDEFGHJIJKLMN0OPQRSTUVWtabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThisLMNOPQRSTUVThisXYZY67890");
        org.junit.Assert.assertEquals(
            result, 8471
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZwlines");
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 4742
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCQRSTUVWwithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFGER.ITSJUSTSOMANYUPPERCASELETTERS.tabsiYWXYAThisZXYZ");
        org.junit.Assert.assertEquals(
            result, 11514
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITtettestsIsaCrtabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 9511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testtwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMASNYUPPERCASELETTERS.h5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 19877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQBSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 1999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZiwth");
        org.junit.Assert.assertEquals(
            result, 10290
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("CtabsBCDEtHisIsaCrazyMiXofRUPPERawitestthndloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 3314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabbsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 1825
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsttestsIsaCrazyMiERSBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\tteAThisZ");
        org.junit.Assert.assertEquals(
            result, 2370
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILAThis\nis\ta\ttest\twith\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 14707
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGsHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 3946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDIgTOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.b5t5m5t5nm5t4KKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 11409
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrarzyMiXofRUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 1411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsABCDEFThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 4807
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabiThissBCDEFGHIJKLMNOPQRS\nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n\ta\ttest\twith\nnewlines\ta\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 4759
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 11720
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WpMhOT");
        org.junit.Assert.assertEquals(
            result, 327
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGsHIJKLMwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 3966
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGI12345ABCDEFGHJIJKLMN0OPQRSTUVWXYZY67890WONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROROEVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 12055
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabswithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTEROS.WXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 11108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("yxGNyD");
        org.junit.Assert.assertEquals(
            result, 217
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEABCDEFKLMONOPQRSTUVWXYZFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALAtabsWXYZRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 11956
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlineTh!s!s$0ttabsttestsIsaCrTazsyMiERSBCDEFGHIJKLMNOPQRSTUVThiestnly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 6854
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGwitaaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t12345ABCSTUVWXYZ67890estt5s5tt5v5t5sn5t5M5t1A$Bc&Def3@F5nRRRSSSSTTTTUUVVVVWWWXXXYYYZZZhIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 17221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOTPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 19961
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\tstabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZtest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 32824
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHaIJKLMNOPQRESQTUVThis");
        org.junit.Assert.assertEquals(
            result, 1830
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMtabsWXYAThisZaNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnetabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZwlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 14583
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("antabsWXYABCDEFGHIJLMaNOPQRSTUVWXYZZd");
        org.junit.Assert.assertEquals(
            result, 2294
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENtHisItabbsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSALARGBUFFER.ITSJUSTSOMANYUPPERCASELETtabsBCDEFGHIJKLMNOPQRSTUVWXYZDThisXTKTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS..sbsWDXYZiwth");
        org.junit.Assert.assertEquals(
            result, 22045
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZNTERS");
        org.junit.Assert.assertEquals(
            result, 899
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Thiwitestths");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHITHISISALONGSTRINEGWITHMANYUPPERCASELETTERSANDNOSPACESJKLMNOPQRESTUVThis");
        org.junit.Assert.assertEquals(
            result, 5793
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEtHisIsaCraztabsiYWXYAThisZyMiXofRUPPERastabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\ttest\twithWOWTHISISSUCIHALONGXSTRFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZndloWercaseLENTERSFTGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 11277
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("atabstabsBCDEFGHIJKLMNOPQRSTUVThisbBCDEFs");
        org.junit.Assert.assertEquals(
            result, 2020
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("This\nis\ta\ttestnes\tand\ttabs");
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttesiWOWTHISISSUCHALONGSTRINGIWONFDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 13381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHaIJKLMNOPQRESTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5vnQTUVThis");
        org.junit.Assert.assertEquals(
            result, 2798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tstabsWXYAThisZa\ttest\ttabsWDX");
        org.junit.Assert.assertEquals(
            result, 3767
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZCDEFGHIJKLNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 11643
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiRith");
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5Tt5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5testt5s5tt5v5t5sn5tteWercaseLENTERSDef3@F5n");
        org.junit.Assert.assertEquals(
            result, 1176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDIgTOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.b5t5m5t5nm5t4KKLMNOPQRSTUVThisUVThisLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 17702
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMiXofRUzPPERandloWercaseLENtettestsIsaCrazyMiXLENTERSstesttRS");
        org.junit.Assert.assertEquals(
            result, 2104
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3switwhtabsBCDEFGHIJKLMNOPQRESTUVThis\nis\ta\ttabstest\twith\nnewlines\tand\ttabsWXYAThisZt!ng-f55S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5nt5t5r5t1c&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 2632
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabAThis");
        org.junit.Assert.assertEquals(
            result, 4258
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 11970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHaIJKLMNOPQRESTh!s!s$0nly4t3st!nng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5mAThis5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5vnQTUVThis");
        org.junit.Assert.assertEquals(
            result, 2947
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("uidRKohwDoJ");
        org.junit.Assert.assertEquals(
            result, 299
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPEERCASELETTERS.THISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVaWXSPACES");
        org.junit.Assert.assertEquals(
            result, 14325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHaIJKLMNOPQRESTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TSn5t5n5t5Ar5t5pn5t5shr5t5SS5t5vnQTUVThis");
        org.junit.Assert.assertEquals(
            result, 2798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5Tt5Th5t5yn5thy5ht5t$Bc&Def3@F5n");
        org.junit.Assert.assertEquals(
            result, 456
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("12345ABCSTUVWCXAThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnetabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZwlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZYZ67890");
        org.junit.Assert.assertEquals(
            result, 15037
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 4029
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMiXoIfUPTHISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNOSPACESPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWIITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 14812
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlintabstesteTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thytabsBCDEFGsHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZ5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t55M5t5ns\tand\ttabsWXYAThisZstest");
        org.junit.Assert.assertEquals(
            result, 8585
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettestsIsaCrazyMiXLENTERSsteestt");
        org.junit.Assert.assertEquals(
            result, 846
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3315
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbBiThisEFs");
        org.junit.Assert.assertEquals(
            result, 10157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENtHisItabbsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 8628
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsiYWXYAThisZ5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nIfUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 7951
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 9433
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYZYZ67890");
        org.junit.Assert.assertEquals(
            result, 2129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mmV5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 3637
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZtest");
        org.junit.Assert.assertEquals(
            result, 3258
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\tt5est\twith\nnewlintabstesteTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 4639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tettrazyMiXLENTERtt");
        org.junit.Assert.assertEquals(
            result, 623
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYHZ");
        org.junit.Assert.assertEquals(
            result, 2022
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlintabstesteTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttTHISISALONGSTRINEGWITHMANYUPPERCASELETTERSANDNOSPACESestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5Mn5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 8760
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCIHALONGXSTRFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 4362
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newl5ines");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5tTHISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONOGSTRINGWITHMANYUPPERCASELETTERSDNOSPACES5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5vn");
        org.junit.Assert.assertEquals(
            result, 8230
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("t5est");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wittestsIsaCrazyMiXofRUPPERandloWercaseLENTERSthwiwtTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 3814
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMtabsBCDEFGsHIJKLMwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZabsWXYAThisZa\ttest\ttabsWDXYZiXofRUzPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5377
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDtabiThissBCDEFGHIEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 14177
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabstabsWXYAThisZiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 1095
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("i");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZazyMiXLENTERstestt");
        org.junit.Assert.assertEquals(
            result, 1045
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.tabsWXTHISISALONGSTRINGWITHMANYUPPERCASELETTERSANDNOSPACESThisAThisZ");
        org.junit.Assert.assertEquals(
            result, 12591
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRESTUVThistabsBCDEFGsHIJKLMwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttabstest\twith\nnewlines\tand\ttabsWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 4790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISItHisIsaCrazyMWiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDAThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 19684
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aaaaabbbbbbccccccdddeeefffggggHHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPQQQQRRRRSSSSTTTTUUVVVVWWWXXXYYYZtabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBSTUVThis");
        org.junit.Assert.assertEquals(
            result, 9486
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("withWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTTEDITOROREVENtabsBCDEFGsHIJKLMwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZabsWXYAThisZa\ttest\ttabsWDXYZALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.");
        org.junit.Assert.assertEquals(
            result, 14073
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCtabiThissBCDtAThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQittabsBCDEFGHIOJKLMNOPQRSshROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTtabsbBCDEFsERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZabiThissBCDEFGHIEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 16506
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabstabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZWDXYZsaCrazyMiXofRUPPEVtabsBCDEFLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 4845
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("VtabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 1766
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPtesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENtHisItabbsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSALARGBUFFER.ITSJUSTSOMANYUPPERCASELETtabsBCDEFGHIJKLMNOPQRSTUVWXYZDThisXTKTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS..sbsWDXYZiwthQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 23725
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tteststIsaCrazyMiERS");
        org.junit.Assert.assertEquals(
            result, 451
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5withWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVSThisXTEDRIgTOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.b5t5m5t5nm5t4KKLMNOPQRSTUVThisUVThisLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 17784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testtwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMASNYUPPERCASELETTERS.h5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5");
        org.junit.Assert.assertEquals(
            result, 11148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYZabiThissBDCDEFGHIEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 5498
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ThAThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnetabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZwlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZis");
        org.junit.Assert.assertEquals(
            result, 14164
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIIWONDERIFITWILLOVERFLOWMYBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 11817
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisItabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twiRNTERS");
        org.junit.Assert.assertEquals(
            result, 3644
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("THISISALONGSTRINGWITHMANYUPPERCTASELERSANDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 3906
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsbBCDEF");
        org.junit.Assert.assertEquals(
            result, 340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabstabsWXYAThisZiYWYXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 1184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5ttabsWDXYZarzyMiXLENTERSstestt5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nth");
        org.junit.Assert.assertEquals(
            result, 2325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ATHISISALONGSTRINGWITHMANYUPPERCTASELERSANDNOSPACESThis");
        org.junit.Assert.assertEquals(
            result, 3971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZ5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5tn5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t55M5t5ns");
        org.junit.Assert.assertEquals(
            result, 2710
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("wittestsIsaCrazyMiXofRUPPERandloWercawitwhtabsBCDEFGHaIJKLMNOPQRESTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TSn5t5n5t5Ar5t5pn5t5shr5t5SS5t5vnQTUVThisseLENTERSth");
        org.junit.Assert.assertEquals(
            result, 4209
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlintabstesteTh!s!s$THISItHisIsaCrazyMiXoIfUPTHISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNOSPACESPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWIITHMANYUPPERCASELETTERSNDNOSPACES0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thytabsBCDEFGsHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 16660
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!Sng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mmV5g55gn5t5ThTh!s5!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2572
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("AThis\nis\ta\ttest\twithWOWTHISISSUCHALONGSTRINGIIWONDERIFITWILLOVERFLOWMYBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNTHISItHisIsaCrazyMiXofUPPEHRandloWercaseLENTERSStabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNOSPACESTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 18821
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("HELLOthereWHATareYOUdoingTODAY?IHopeYOURdayISgoingWEL.");
        org.junit.Assert.assertEquals(
            result, 2186
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYAThisZwli");
        org.junit.Assert.assertEquals(
            result, 503
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5ThtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5ttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 6349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5Th!s!s$0nly4t3sttabsBCDEFGHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 2084
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tHisIstesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTaERS.aCrazyMiXofUPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 21489
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ABCDEFGHIJNKLMNOPQBSTUVWXYZ");
        org.junit.Assert.assertEquals(
            result, 2077
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMNOPQRSTUVThis\nis\ttabiThissBCDEFGHIJKLMNOPQRS\nistabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5nt5v5t5sn5t5M5t5n\ta\ttwitwhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlineTh!s!s$0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5ttestsIsaCrazyMiXofRUPPERandloWercaseLENTERSt5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5ns\tand\ttabsWXYAThisZest\twiEth\nnewlines\ta\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 9467
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMttestsIsaCrazyMiXofRUPPERPandloWercaseLENTERSNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5tt5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nthtabsWXYAThisZa\ttest\ttabsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 6634
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWDXYZWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.tabsiYWXYAThisZ");
        org.junit.Assert.assertEquals(
            result, 8108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDwithWOWTHISISSUCHALONGSETRINGIWONDMERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS.EFGHIOQRSsh");
        org.junit.Assert.assertEquals(
            result, 10988
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("Th!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testtwitWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMASNYUPPERCASELETTERS.h5s5t5n5n5M5t5s5t5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.sbsWDXYZiwthM5t5");
        org.junit.Assert.assertEquals(
            result, 21438
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFTGHIJKLMbsWDXYZ");
        org.junit.Assert.assertEquals(
            result, 1364
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\tstabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZtest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALA\nRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZ");
        org.junit.Assert.assertEquals(
            result, 32824
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHALONGSTRINisXTEDITOROROEVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 6031
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazRS");
        org.junit.Assert.assertEquals(
            result, 305
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("newlintabstesteTh!s!s$THISItHisIsaCrazyMiXoIfUPTHISItHisIsaCrazyMiXofUPPERandloWercaseLENTERSSttabtHisItabsBCDEFGHIJKwithWOWTHISISSUCHALONGSTRINGIWONDERIFITtabsBCDEFTGHIJKLMNOPQRSTUVThisLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERSsWXYZabsBCDEFGHIJKLMNOPQRSTUVWXYZALONGSTRILNGWITHMANYUPPERCASELEcTTERSNDNOSPACESPERandloWercaseLENTERSStabsBCDEFGHIJKLMNDOPQRSTUVWXYZALONGSTRINGWIITHMANYUPPERCASELETTERSNDNOSPACES0nly4t3st!ng-f5mm5g55gn5t5Th5t5yn5thytabsBCDEFGsHIJKLMNOPQRSTUVThis");
        org.junit.Assert.assertEquals(
            result, 27060
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("stabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\tstabsWXThiAThis\ni\ns\ta\ttest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZa\ttest\ttabsWDXYZEtabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYZsZRFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCtabiThissBCDEFGHIJKLMNOPQRSGHIJKLMNOPQRSTUVWXYZsZtest\twithWOWTHISISSUCIHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROREVENALA\nRGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZtabsWXYAThisZaZ");
        org.junit.Assert.assertEquals(
            result, 33327
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("WOWTHISISSUCHATLONGSTRINGI12345ABCDEFGHJIJKLMN0OPQRSTUVWXYZY67890WONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEDITOROROEVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.");
        org.junit.Assert.assertEquals(
            result, 12139
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ittabsBCDEFGHIOJKLMNOPQRSTUVtabsWDXDDYZThish");
        org.junit.Assert.assertEquals(
            result, 2317
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsBCDEFGHIJKLMNOPQRSTUVWXYZOPQRSTUVWXYZALONGSTRINGWITHMANYUPPERCASELETTERSNDNOSPACES");
        org.junit.Assert.assertEquals(
            result, 6406
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("iWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETTERS.s");
        org.junit.Assert.assertEquals(
            result, 9868
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tesiWOWTHISISSUCHALONGSTRINGIWONDERIFITWILLOVERFLOWMYTEtabsBCDEFGHIJKLMNOPQRSTUVThisXTEFDITOROREVENtHisItabbsBCDEFGHIJKLMNOPQRSTUVThis\nis\ttabsBCDEFGHIJKLMNOPQRS\nis\ta\ttest\twith\nnewlines\tand\tAThistabsWXYAThisZa\ttest\ttabsWDXYZsaCrazyMiXofRUPPERandloWercaseLENTERStabsTS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5nthALARGBUFFER.ITSJUSTSOMANYUPPERCASELETtTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5Th!s!s$0nly4t3sttabsBCDEFGHIJKLMNOPQRSTUVThisabsBCDEFGHIJKLMNOPQRSTUVWXYZDThisXTKTEDITOROREVENALARGBUFFER.ITSJUSTSOMANYUPPERCASELETOTERS..sbsWDXYZiwth");
        org.junit.Assert.assertEquals(
            result, 24604
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("ttestsIsaCrazyMtabsBCDEFGsHIJKLMwitwhhtabsBCDEFGHIJKLMNOPQRSTUVThis\nis\ta\ttest\twith\nnewlines\tand\ttabsWXYAThisZabsWXYAThisZa\ttest\ttabsWDXYZiXofRUzPPERandloWercaseLENTERS");
        org.junit.Assert.assertEquals(
            result, 5377
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("tabsWXYZ5nm5t4K5t5ms5t5m5t5n5t5r5t5s5t5n5n5M5t5s5twiTh!s!s$0nly4t3st!ng-1&2%3*4@5_c@5ES.4305t5n5t5v5ff5mm5g55gn5t5Th5t5yn5thy5ht5t5S5t5b5t5m5t5nm5t4K5t5ms5t5m5t5n5t5r5testt5s5t5n5n5M5t55t5shr5t5SS5t5v5t5sn5t5M5t5nth5m5t5sn5ST5TS5t5n5t5n5t5Ar5t5pn5t5shr5t5SS5t5v5t5sn5t5M5t5n");
        org.junit.Assert.assertEquals(
            result, 1946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("witwhtabsBCDEFGHIJKLMNOPQRESTUVTstabsWXThiAThis\ni\ns\ttteWercaseLENTERSa\ttest\twithWOWTHISISSUCIHALONGXSTRFFER.ITSJUSTSOMANYUPPERCASELETTERS.\nnewlines\tand\ttabsBCDEFGHIJKLMNOPQRSTUVWXYZsZhis");
        org.junit.Assert.assertEquals(
            result, 9187
        );
    }
}

