package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_STRLEN {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("x");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("asdasnakj");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, World!");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("12345");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a long string that has many characters in it");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Testing testing 123");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over the lazy dog");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwo\nthree\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1234567890");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This string has a \n newline character");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwo\nthree\nf\nfoive");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps overq the lazy dog");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdefgjklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("three\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" This striThis is a long string that has many characters in itng has a \n newline character");
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over the lazy This striThis is a long string that has many characters in itng has a \n newline character dog");
        org.junit.Assert.assertEquals(
            result, 133
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1234 This striThis is a long string that has many characters in itng has a \n newline character5");
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over the lazy This striThis is aaracter dog");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthree\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("11234567890");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string that has many characters in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown f ox jumps over the lazy dog");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("122345");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Testing testingone\ntwot\nthrThis is a long string that has many characters in itee\nfour\nfive 123");
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string thtat has many characters in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("123345");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over the lazy Thisthree\nfour\nfiveracter dog");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("GNDKQyadEb");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, Woorld!");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("of\nfoive");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps overq theHello, World! lazy dog");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("M");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("NEvG");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, Woorlod!");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thrieeThe quick brown fox jumps overq the lazy dog\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthree\nfour\nfiv");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdefghijklmnopq1234 This striThis is a long string that has many characters in itng has a \n newline character5rstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, Woo12345rld!");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot This striThis is a long streing that has many characters in itng has a \n newline character\nthree\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 115
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" This striThis is a long string that has many characters in itng has a \n neawline character");
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1223545");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwota\nthrThis is a long string that has many characters in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brzown fox jumps over the leazy Thisis is aaracter dog");
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1234 This sitriThis is a long string that has many characters in itng has a \n newline character5");
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TestiTng testing 123");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("GNDThis string has a \n newline characterdEb");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brzown fox sjumps over the leazy Thisis is aaracter dog");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("G1234 This sitriThis is a long string that has many characters in itng has a \n newline character5NDKQyadEb");
        org.junit.Assert.assertEquals(
            result, 106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over theThe quick brown fox jumps overq the lazy dog lazy Thisthree\nfour\nfiveracter dog");
        org.junit.Assert.assertEquals(
            result, 113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("G1234 This sitriThis is a long string that has many characters in itng has a \n newline character5NDKThe quick brown fox jumps over theThe quick brown fox jumps overq the lazy dog lazy Thisthree\nfour\nfiveracter dogQyadEb");
        org.junit.Assert.assertEquals(
            result, 219
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("oef\nffoive");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string that has many characters in itee\nfoour\nfive");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("of\nfoivfe");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Testing te stingone\ntwot\nthrThis is a long string that has many characters in itee\nfour\nfive 123");
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, WoG1234 This sitriThis is a long string that has many characters in itng has a \n newline character5NDKThe quick brown fox jumps over theThe quick brown fox jumps overq the lazy dog lazby Thisthree\nfour\nfiveracter dogQyadEborlod!");
        org.junit.Assert.assertEquals(
            result, 235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello,The quick brown fox jumps over the lazy Thisthree\nfour\nfiveracter dog Woo12345rld!");
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, WoG1234 This sitriThis is a long string that has many characters in itng has a \n newline character5NDKThe quick brown fox jumps over theThe quick by Thisthree\nfour\nfiveracter dogQyadEborlod!");
        org.junit.Assert.assertEquals(
            result, 197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("off\nfoiivfe");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("912345667890");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdefgjklmnopqrstuvwxyzive");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over the lazy This striThis is aaracter dogM");
        org.junit.Assert.assertEquals(
            result, 70
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, WoG1234 This sitriThis is a long string that has many characters in itng h as a \n newline character5NDKThe quick brown fox jumps over theThe quick brown fox jumps overq the lazy dog lazby Thisthree\nfour\nfiveracter dogQyadEborlod!");
        org.junit.Assert.assertEquals(
            result, 236
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown f ox jumps over the lazyg");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string that has  many characters in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\n\ntwot\nthrThis is a long string that has many characters in itee\nfoour\nfive");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thrieeThe quick brown f ox jumps over the lazy dogThe quick brown fox jumps overq the lazy dog\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 104
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("G1The quick brown f ox jumps over the lazy dog234  has a \n newline character5NDKQyadEb");
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TheHello,The quick brown fox jumps over the lazy Thisthree\nfour\nfiveracter dog Woo12345rld! quick broThis string Thas a \n newline characterwn fox jumps over the lazy Thisthree\nfour\nfiveracter dog");
        org.junit.Assert.assertEquals(
            result, 195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("off\nfoivife");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("three\nefour\noff\nfoiivfe");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Test1iTng testing 123");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwota\nthrThis is a long string that has many chone\ntwot\nthrThis is a long string that has  many characters in itee\nfour\nfivearacters in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TheHello,The quick brown fox jumps over the lazy Thisthree\nfour\nfiveracter dog Woo12345rld! quick broThis string Thas a \n newline characterwn fox jumps over theone\ntwota\nthrThis is a long string that has many characters in itee\nfour\nfive dog");
        org.junit.Assert.assertEquals(
            result, 241
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thrieeThe quick brown f ox jumps over the lazy dogThe quick brown fox jumps overq the lazy dog\nfour\nfive ");
        org.junit.Assert.assertEquals(
            result, 105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("oene");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("off\nabcdefgjklmnopqrstuvwxyzfoivife");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown f ox jumps over the lazy");
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdefghijklTest1iTng testing 123mnopq1234 This striThis is a long string that has many characters in itnghas a \n newline character5rstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 141
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("abcdeflghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1o, Woorld!890");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("12333345");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1122345");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwota\nthrThis is a long string that has many characters ien itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hello, W123345orld!");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwo\nthrfoive");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string that has  many characterns in itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwotaa\nthrThis is a long string that has many characters ien itee\n1234 This sitriThis is a long string that has many characters in itng has a \n newline character5four\nfive");
        org.junit.Assert.assertEquals(
            result, 175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brzown fox sjumps over the leazy Thisis is aaThe quick brown fox jumps overq theHello, World! lazy dogracter dog");
        org.junit.Assert.assertEquals(
            result, 122
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MThe quick brown fox jumps over the lazy This striThis is aaracter dogM");
        org.junit.Assert.assertEquals(
            result, 71
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brzown fox jumps over the leazy Thisis is aaracter Hello, Woorld!dog");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1234 This sitriThis is a long string that has many character12345s in itng has a \n newline character5");
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1234 This sitriThis is a long string that has many characters in itng has a \n neThe quick brown f ox jumps over the lazygwline character5");
        org.junit.Assert.assertEquals(
            result, 137
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("912345667890The quick brown fox jumps over the lazy This striThis is aaracter dogM");
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Hellone\ntwot\nthree\nfour\nfivo, WoG1234 This sitriThis is a long string that has many characters in itng has a \n newline character5NDKThe quirck brown fox jumps over theThe quick by Thisthree\nfour\nfiveracter dogQyadEborlod!");
        org.junit.Assert.assertEquals(
            result, 221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox11234567890 jumps over the lazy This striThis is aaracter dog");
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwota\nthrThis is a long string that has many characters iThe quick bis striThis is aaracter dogMen itee\nfour\nfive");
        org.junit.Assert.assertEquals(
            result, 117
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The quick brown fox jumps over theThe quick brown fox jxumps overq the lazy dog lazy Thisthree\nfour\nfiveracter dog");
        org.junit.Assert.assertEquals(
            result, 114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("one\ntwot\nthrThis is a long string that has many characters in itee\nfour\nfiveabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Testing te stingone\ntwot\nthrThis is a long strinThe quick brown fox jumps over theThe quick brown fox jumps overq the lazy dog lazy Thisthree\nfour\nfiveracter dogg that has many characters in itee\nfour\nfive 123");
        org.junit.Assert.assertEquals(
            result, 209
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\t");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\n");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\r");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string to test the function");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The Quick Brown Fox Jumps Over The Lazy Dog");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("          ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n   ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Quick");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("           ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("           àèìòùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("w1th");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n 1s  ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jumps");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Fox");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1t");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample string to test the function          ");
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sampleto string to test the function          ");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Qukick");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \t ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("            ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n  string");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ps");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("a");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Dog");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!           ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("4");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("is");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jummtops");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!n");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!           4");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("yLazy");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" ã          àèìòùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LqNCZA");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Over");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyNcJH");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QFoxukick");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Fo    This is a sampleto string to test the function  n        x");
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!nn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\t\t");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH1th");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TheTe");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sampl           eto string to test the func tion          ");
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     ã          àèìòùáéíóúýâêîôûãñõäëïöüÿç  ");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QFoQxukick");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb0ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iw1th");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("x      ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Dàèìòù4áéíóúýâêîôûãñõäëïöüÿçgog");
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample    \n\n 1s  string to test the functoion          ");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("isJumps");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("function");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("func");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Dëàèìòù4áéíóúýâêîôûãñõäëïÿçgog");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sampl");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funcc");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazy");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb40ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("n");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Doo");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aOver");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb0lse !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Dëàèìòùõäëïÿçgog");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("str1ng");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sampl            eto string to test the func Theon          ");
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!           4!n");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("cQukick");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n     ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QuaOverick");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Te");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QFoxuk");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jum5ymb0lsmtops");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funnc");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("eto");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample string to test the function  i        ");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sample");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("        functoion   ");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     ã         ô àèìòùáéíóúýâêîôûãñõäëïöüÿç  ");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tetn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("mThfGqorZJum5ymb0lsmtops");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample strinisg to test the function          ");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhyNcJH\n  string");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("str1ngsampl");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("       ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iwTish!1th");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("test");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTetn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    ");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtes            ls    ");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaàèìòùáéíóúýâêîôûãñõäëïöüÿçQFoQxukyicky");
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ver");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    4\n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample TTetnstrinisg to test the function           ");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test the func Theon           to test the function");
        org.junit.Assert.assertEquals(
            result, 118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tn ã          àèìòùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!          4");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("strin");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîèôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to test the fuunction          NcJH\n  string");
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funthec");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Tish!           4!n \n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funtThis is a sample string    This is a sampl            eto string to test the func Theon           to test the functionhec");
        org.junit.Assert.assertEquals(
            result, 125
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("        ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s1s 1s 4 str1ng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nBrown");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n wwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iis");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("                ã           àèìòùáöüÿç   ");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("astr1ngsampl");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QQFoxuk");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functoion");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nTetn\nBrown");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1t   \n\n wwtest5ymb40ls    \n");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nFo");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The QuiisJumpsck Brown Fox Jg");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 stTheTer1ng wtest5ymb0lse !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jum5ymb0lsmfunction");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iiis");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("        funthec    ");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyNcJ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTh!s40lsh!s 1s 4 str1ng wtest5ymb0lse !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample string to tea  ");
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fufncc");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("p1ss");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wiw1th");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("44");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("eeTe");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("           àèìòùáéíóúýâêîôiwTish!1thûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazyy");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test the func Theon       to test the function");
        org.junit.Assert.assertEquals(
            result, 114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("RLkion");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stricQukickn");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funtht");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TheyLazyTe");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to test the fuunction          NcJH\n  string4");
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("i        s");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("etoo");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng wtest5ymb40ls s!n 1t\n");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("FoFxuk");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The Quick Brown Fox Jumpe Lazy Dog");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("4!n");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QuiisJumpsck");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to LqNCZAtest the func Theon           to test the function");
        org.junit.Assert.assertEquals(
            result, 124
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("         ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("mThftGqorZJum5ymb0lsmtops");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wwtes");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tis          ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5ymb40ls");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample strintg to test the function          ");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" àèìòùáéíóúýâêîôiwTish!1thûãñõäëïöüÿç  \n\nwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QFoxukcick");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tis");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fux      ncc");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fux");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("YJvcL");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Qck");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTh!s40lsh!s 1s 4 str1nb0lse !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" Th!s  \n\n 1s  ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sampl          tothe func tion          ");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sTh!s4strinisg05ymb0lsls");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Th!s 1s 4 str1ng wtest5ymb0ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH1thfunnc");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1NcJH1th");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iisTe");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1This is a sample string    This is a sampl            eto string to LqNCZAtest the func Theon           to test the functi           àèìòùáéíóúýâêîôûãñõäëïöüÿçnt\n");
        org.junit.Assert.assertEquals(
            result, 175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stcricQukDogickn");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N    This is a sampleto string to test the function          cJH1th");
        org.junit.Assert.assertEquals(
            result, 71
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ssps");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th    This is a sample TTetnstrinisg to test the function           !s40ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This irs a sample string to tea  ");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuwhy1N    This is a sampleto string to test the function          cJH1th");
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtes            ls   Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n ");
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hy");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("strinisg");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("           fux");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iiàèìòùáéíóúýâêîèôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to test the fuunction          NcJH\n  strin");
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Laàèìòùáéíóúùýâê   \n\n  1s  îôûãñõäëïöüÿçQFoQxukyicky");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to test othe fuunction          NcJH\n  string4");
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!s40ls");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test thLaàèìòùáéíóúùýâê   \n\n  1s  îôûãñõäëïöüÿçQFoQxukyickythe function");
        org.junit.Assert.assertEquals(
            result, 139
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Theon");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("t1t");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" cJH1th1s 4         funthec    ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 stsr1ng wtest5ymb0ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Laàèìòùáéíóúùýâê");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("       This is a sample string to test the function          1s  ");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyLaàèìòùáéíóúùýâê   \n\n  1s  îôûãñõäëïöüÿçQFoQxukyickytothe  \t H1th");
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wwwtes");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("îôûãñõäëïöüÿçQFoQxukyickythe");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nBro   \n\n 1s  n");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample TTetnstrinisg tiiiso test the function           ");
        org.junit.Assert.assertEquals(
            result, 70
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\n\n");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tishstrintg4");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N    This is a sampleto string to test e function          cJH1th");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sThe Quick Brown Fox Jumps Over The Lazy DogtcricQukDogickn");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample sttotherintg to test the function          ");
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("to");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tt1t");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("RL   \n\n  1s  kion");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LqNCZAtest");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ps1ss");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nF");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wwhyNcJH1thfunnchy1N");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáöüÿç");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sJummtops");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtens            ls   Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n ");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   ã \t ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuunction");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\n\nfunc");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5ymb0lse");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QQFoTTxuk");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sQuiisJsumpsck");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Brown");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("FMc");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("p1sBrown");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TlTh!s40lsh!s");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test thLaàèìòùáéíóúùýâê   \n\n  Bro1s  îôûãñõäëïöüÿçQFoQxukyickythe function");
        org.junit.Assert.assertEquals(
            result, 142
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("i        s   ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample sttotherintg to test the funcstricQukickntion          ");
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  LqNCZAtest");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyisJumpsJ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhyN cJH\n  string");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OvhyNcJer");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("othe");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaàèìòùáéQFoxukcky");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaàèìòùáéíiisTeóúùýâê");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuuni        sction");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuon");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stgrsr1ng");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Ove    This is a sample    \n\n 1s  string to test the functoion          r");
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" Tsh!s   \n\n 1s  ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jum5ymbops");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyLaàèìòùáéíóúùýâê   \n\n  1s  îôãñõäëïöüÿçQFoQxukyickytothe  \t H1th");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tiiiiso");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("pFomThfGqorZJum5ymb0lsmtopss");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LqqNCZA");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ncc");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tishstrintgi        s4");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!ncnncc");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("string");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n   \n\nBrownrown");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("4n");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("B        functoion   rown");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("vemThfGqorZJum5ymb0lsmtopsr");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1This is a sample string    This is a samplt1t            eto string to LqNCZAtest the func Theon           to test the functi           àèìòùáéíóúýâêîôûãñõäëïöüÿçnt\n");
        org.junit.Assert.assertEquals(
            result, 178
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôiwTish!1thûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th    This is a sample TTetnstrinisg Jumpeto test the function           !s40ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Ove");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("FoF1Thisxuk");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtes            ls    Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n ");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("B");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\n\nfnunc");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sns");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wiw1thstricQukickn");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  ring to tea  ");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogtcricQukDogickn");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Dàèìòù4áéíóúýp1ssâêîôcJH1thûãñõäëïöüÿçgog");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" Th!s   \n\n 1s  ");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Th!s 1s 4 str1ng wtest5nymb0ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Do");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n  striing");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 stsr1ng wtest5ymb0TTh!s40lsh!sls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("striing");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wteb40ls");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fJumpeuon");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyNycJ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("mThfGeeTeqorZJum5ymb0lsmtops");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("cJH1th");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTh!s40lsh!s");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nfuntThis is a sample string    This is a sampl            eto string to test the func Theon           to test the functionheccc");
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fnunnc");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("                ã           ");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyLaàèìòùáéíóúùýâê");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ô");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaazLyy");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("psx       ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stgrsr1ngLqNCZAtest");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test thLaàèìòùáhéíóúùýâê   \n\n  Bro1s  îôûãñõäëïöüÿçQFoQxwtest5ymb0lseukyickythe function");
        org.junit.Assert.assertEquals(
            result, 156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to LqNCZAtmThfGeeTeqorZJum5ymb0lsmtopsest the func Theon           to test the function");
        org.junit.Assert.assertEquals(
            result, 152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Foxx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("îôûãñõäëïöüÿçQFoQxukyicky");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The Quick Br owsttotherintgn Fox Jumpe Lazy og");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("og");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("str1ngsampaOverl");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Fo stgrsr1ng   This is aTh!s 1s 4 str1ng wtest5ymb0lse !n 1t\n sampleto string to test the function  n        x");
        org.junit.Assert.assertEquals(
            result, 110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" ã          àèìòùáéíóúýâêîôûãñõäëïöàèìòùáéíóúýâêîôûãñõäëïöüÿçüÿç");
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sampl           eto string to test thes func tion          ");
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funthstr1ng");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tet");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH1c");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample strinisg to test the functiostgrsr1ngLqNCZAtestn          ");
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample    \n\n 1s  string to te   ");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("x  cJH1th1s 4         funthec    ls !nsampleto 1t\n     ");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hTheTe");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funaTh!s");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to test the fuunction          NcJH\n  string4cJH1Jth");
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BB");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N  p  This is a sampleto string to test the function          cJH1th");
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("mThftGqorZJum5ymb0lsmtstricQukicknops");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" àèìòùáéíóúýâêîôiwTish!!1thûãñõäëïöüÿç  \n\nwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nRL 1s  ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s RL4 str1ng wtest5ymb0l !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("str1nb0lse");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This  is a sample strinisg to test the fuunction          NcJH\n  string4cJH1Jth");
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nfuntThis");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("samplt1t");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wiw1s1th");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Th!s 1s 4 st1r1ng wtest5nymb0ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nfuntThis        ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!  TTh!s40lsh!s 1s 4 str1ng wtest5ymb0lse !n 1t\n         ");
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!          This is a sample string    This is a sampl   unction4");
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("p");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s str1ng wtest5ymb0ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("FMcc");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBo");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("f\n\nfnunc");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("îôûãñõäëïöüÿçQFoyQxukyickythe");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functionheccc");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1This is a sample string    This is a samplt1t            etto string to LqNCZAtest the func Theon           to test the functi           àèìòùáéíóúýâêîôûãñõäëïöüÿçnt\n");
        org.junit.Assert.assertEquals(
            result, 179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Bro");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("JTh!s 1s 4 str1ng wtest5ymb0ls !nsampleto 1t\num5ymb0lsmfunction");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sThe Quick Brown Fox Jumps Over The Lazy DogttcricQukDogickn");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sTh!s4strinisg05ymb0lslTs");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("puobAuk");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Juom5ymbops");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaàèìòùáéQFoxxukcky");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH1funnc");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jg");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thLaàèìòùáéíóúùýâê");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuwhy1N");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuuni");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Bro1s");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\r\r");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N  p  This is a samplefunction          cJH1th");
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QQFoTfuuniTxuk");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     o test the function1s  ");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QFoxucick");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôiwTish!1thûãñõäëïñöüÿç");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fnuncc");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 sTtTheTer1ng wtest5ymb0lse !n 1t\nJum5ymb0lsmfunction");
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Ths !nîôûãñõäëïöüÿçQFoyQxukyickythe 1t\n");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("p1s4Bnrown");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n  ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("k");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("etfuntThisoo");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôûãñõäëïöàèìòùáéíóúýâêîôûãñõäëïöüÿçüÿç");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaàèìòùáéíúýâêîôûãñõäëïöüÿçQFoQxukyickThs !nîôûãñõäëïöüÿçQFoyQxukyickythe 1t\ny");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyàèìòùáéíóúýâêîôûãñõäëïöàèìòùáéíóúýâêîôûãñõäëïöüÿçüÿç");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!whyNcJH1th          4");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th    This iTh!s 1s RL4 str1ng wtest5ymb0l !n 1t\ns a sample TTetnstrinisg Jumpet   \n\nwtest5ymb40ls    t\n");
        org.junit.Assert.assertEquals(
            result, 104
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!whyNcJH1whyLaàèìòùáéíóúùýâê   \n\n  1s  îôãñõäëïöüÿçQFoQxukyickytothe  \t H1th  4");
        org.junit.Assert.assertEquals(
            result, 83
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wDohycJHt");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TtTetn");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("isJuis");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s1s");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   s is a sample    \n\n 1s  string to te   ");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wiiw1th");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OvOe");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sJTh!s 1s 4 str1ng wtest5ymb0ls !nsampleto 1t\num5ymb0lsmfunctionJummtop    This is a sample sttotherintg to test the function      QuaOverick     s");
        org.junit.Assert.assertEquals(
            result, 147
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Laàaèìòù!nnáéíóúùýâê");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Tish!     sThe Quick Brown Fox Jumps Over The Lazy DogttcricQukDogickn      4!n \n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!nirs");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sJTh!s 1s 4 str1ng wtest5ymb0ls !nsampleto 1t\num5ymb0lsmfunctionJummtop    This is a sample sttotherintg to test           àèìòùáéíóúýâêîôûãñõäëïöüÿçQuaOverick     s");
        org.junit.Assert.assertEquals(
            result, 165
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("           àèìòùáéíóúýâêîôiwTstgrsr1ngïöüÿç");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tsh!s");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôûãñõäëïöàèìòùáiséíóúýâêîôûãñõäëïöüÿçüÿç");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("i       s   ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Tish!     sThe Quick Brown Fox Jumps Over The Lazy DogttcricQukickn      4!n \n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("RL4");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("st1r1ng");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sTtTheTer1stgrsr1ngLqNCZAtestng");
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("zPyWTI");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aTh!s");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Fow1thF1Thisxuk");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("saTh!s40lsmplt1t");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     nFo   ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("t1");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample sttotherintg tàèìòùáöüÿço test the funcstricQukickntion          ");
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nwwtes        t    ls    Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n ");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("string4cJH1Jth");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     This is a sampl          tothe func tion          ");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBro");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nnnp1ss");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBBo");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The QuiisJumpsck Brown Fox JgLaàaèìòù!nnáéíóúùýâê");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5ymb0lscQukiwhyLaàèìòùáéíóúùýâê   \n\n  1s  îôûãñõäëïöüÿçQFoQxukyickytothe  \t H1thkn");
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TBrownrown");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("vemThfGqorZJum5ymb0lsmtstgrsr1ngLqNCZAtestpsr");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \nhy    This is a sample strinisg to ttest the fuunction          NcJH\n  string");
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5nymb0ls");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH1thFox");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1This");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("x  cJH1th1s 4         funtthec    ls !nsampleto 1t\n     ");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("eo");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Th!s 1s 4 st1   \n\nwwtest5ymb40ls    r1ng wtest5nymb0ls !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 71
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     ã          àèìòùáéíóúìýâêîôstgrsr1ngûãñõäëïöüÿç  ");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5ymb0TîôãñõäëïöüÿçQFoQxukyickytothesh!sls");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    This is a sampl            eto string to test thLaàèìòùáhéíóúùýâê   \n\n  Bro1s  îôûãñõäëïöüÿçQFoQxwtest5ymb0lseukyickythe ction");
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("striing     This is a sampl          tothe func tion          ");
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QQFoTkTxu");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thes");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s40ls !n 1This is a sample string    This Dàèìòù4áéíóúýâêîôûãñõäëïöüÿçgogis a samplt1t            etto string to LqNCZAtest the func Theon           to test the functi           àèìòùáéíóúýâêîQckôûãñõäëïöüÿçnt\n");
        org.junit.Assert.assertEquals(
            result, 213
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" ã          àèòìòùáéíóúýâêîôûãñõäëïöàèìòùáéíóúýâêîôûãñõäëïöüÿçüÿç");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("rBrown");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hy         functoio");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nnshthes");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtest5ymb0l");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" àèìòùáéíóúýâêîôiwTish!!1th1ûãñõäëïöüÿç  \n\nwtest5ymb40ls    ");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string Theonto test the function");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     ã          àèìòùáDogttcricQukDogicknéíóúìýâêîôstwhy1Ngrsr1ngûãñõäëïöüÿç  ");
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sQuiisJsmpsck");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíóúýâêîôiwTish!!1thûãñõäëïöüÿçtnwtest5ymb0lscQukiwhyLLaàèìòùáéíóúùýâê   \n\n  1s  îôûãñõäëïöüÿçQFoQxukyickytothe  \t H1thkn\nBrown");
        org.junit.Assert.assertEquals(
            result, 133
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   Jum5ymbops ã iëïöüÿç  ");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("o");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("why1N  p  This is a sampleto string to test the function          cJH1t1sh");
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ywwtensLazy    This is a samQuaOverickple TTetnstrinisg to test the function           ");
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OZn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("cJH1t1s");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stgrsr1ngLqNtCZAtest");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This  is a sample TTetnstrinisg to test the function           ");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("yyy");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1n0g wtest5ymb0lse !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("kRLkion");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Juom5This is a sample string    This is a sampl            eto string to test the func Theon       to test the functionymbops");
        org.junit.Assert.assertEquals(
            result, 125
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\nRL 1Ls  ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 sTtTheTer1ng wtest5ymb0lse !n 1t\nJum5ymb0lsmfunct ion");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("        funthec  tothet ");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  Tish!     sThe Quick Brown Fox Jumps Over The Lazy DogttTcricQukickn      4!n \n\n  1s  ");
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample strinitsg to test  the functiostgrsr1ngLqNCZAtestn          ");
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hyNJcJ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a sample TTetnstrinisg tiiiso test the function       n    ");
        org.junit.Assert.assertEquals(
            result, 71
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iwTish!1Fo");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tish!          This is a sample string    This is a sampl   unction!n4");
        org.junit.Assert.assertEquals(
            result, 70
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("whyNcJH11thîôûãñõäëïöüÿçQFoQxwtest5ymb0lseukyickythefunnc");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("strinifunctitsg");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("44n");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" cJH1th1s 4         funthec    lwiiw1ths !nsampleto 1t\n");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    This is a           ");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \n\nwwtes            ls   Th!s 1s 4 str1ng wtest5ymb0ls !n 1t\n ");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("st1r1n");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("fuwiw1thstricQukicknnc");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("cJH1t1sh");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("mThfGeeTebqorZJum5ymb0lsmtops");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("wtestm5nTheymb0ls");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iTh!s");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample string    Thits is a sampl            eto string to test the func Theon       to test the function");
        org.junit.Assert.assertEquals(
            result, 115
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tion");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("funtThis is a sample string    This is a sampl            eto string to test the func Theon               àèìòùáéíóúýâêîôûãñõäëïöüÿç       to test the functionhec");
        org.junit.Assert.assertEquals(
            result, 162
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!stàèìòùáöüÿço40ls !n 1t\n");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DëàèìòùhyNJcJõäëïÿçg");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" zPyWTI        functoion   ");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aOwtest5nymb0lsver");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QQFoTfuuniTxusample");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("rstn1r1n");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" àèìòh  ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmCdV");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      The    ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t  The    ");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmCV");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe Quick Brown Fox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1s");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sampLazyle");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ttest");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazy  ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThTis");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MN!nhqmCCdV");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r \n   ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r \n  ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownLazy");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("samplse");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazy z ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r \n\r  ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrownis");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòõùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThTi");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox oJumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCV\n");
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCV");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownsampBrownleLazy");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCV\nhqmCV");
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample strOvering to test the function");
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test the function The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \n\n   z");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r \n    ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuick");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample strintog to test the function");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrownis   ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t 1 The    ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("testt");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \n\n   ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aa");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sample string to test the function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 53
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownLazys");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT    1t 1 The    i");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLazyLazy");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("GThT    1t 1 The    ic");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1ngng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("RGTk");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqTMNMNhqThehe");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJumpsk\r");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmVCVBBrownLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe Quick Brown FoxJumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòõùáéíóúýâêîôûãñõäëïöüÿçç");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample strintog ton test the function");
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCVnsampBrownleLazy");
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazy zThTi ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox oJutesttmps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("w1This is a sample sstrintog ton test the functiont");
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \n\n function  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   \r\n \n   ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 sstr1str1ngng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverThisBBrownLaazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r  \n   ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fstrintogwox Jumpes Over The BrownLazey DogmCVnsampBrownleLazy");
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJstrOveringumpsk");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thCV");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jumpes");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      1t  The    ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" MNhqm CdV ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps  OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThhT    1t 1 The    i");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThTTi");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Foxa");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1t Over The TTBrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     str1ng 1t  The    This is a sampleOvering to test the function");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1ngng w1th 5ymb0ls !n 1tBrownLazys");
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownL  \r  \n   azys");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòõ\nç");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaazyLazy");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmCdCQuicJumpsk\r");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      The      ");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLMNhqThe CQuick BrMNhqThe Quick Brown Fox Jumps Over The BrownLazy DogmCVown Fox Jumpes Over The BrownLazy DogmCVaazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrLownL  \r  \n   azys");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverThis");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     str1ng 1t  The    This is a samp leOvering to test the function");
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sample string to test th e function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This nction");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("zThTi ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLMNhqThehTTi");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1ngng w1th 5ymb0ls !n 1tBrow");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("oJutesttmps");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functont");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNMNhqThe CQuick Brown Fox Jumpes OvewnLazy DogmCV\nhqmCV");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Fstrintogwox");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk BrowMNhqmn Fox Jumps OverThis  to test t");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ic");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox oJutesttmps Oqver The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This sample string to      The     test the function");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCVown  GThT ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1ngnsg w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Do      The    g");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\t\t\t");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \n\n func!ntion  ");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("te      1t  The    stt");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT     testt1t 1 The    i");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("bUmvrK");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tihis sample string to      The     test the function");
        org.junit.Assert.assertEquals(
            result, 53
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1thTTBrownis    5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("r1ng");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("leOvering");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("te      1t  sThe    s tt");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ttV");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sample stringunction\n\n   z");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("The The Lazy Dog");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps Over The BrownLazy DoMNhqmCdCQuicJumpsk\rgmCV");
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TThTi");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhq1TMNMNhqThehe");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      T he    ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmC      The      ");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aaa");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCVnsampBrownleLazyhTiTh!s 1s 4 str1ng w1th 5ymb0ls !n 1ts");
        org.junit.Assert.assertEquals(
            result, 118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Foxstr1str1ngng Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("leOvMNhqThe CQuick Brown Fox oJumps Over The BrownLazy DogmCVering");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT OverThisBBrownLaazyLazy   t1t 1 The    i");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuDogmCVnsampBrownleLazyick Brown Fox oJutesttmps Oqver The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 85
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BzyLazy");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumpsw1This is a sample sstrintog ton test the functiont OverThis is a sample string to test the function The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT     testt1t 1 The    iMNhq1TMNMNhqThehe");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT    1sampLazylet 1 The    i");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("s");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT     i");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  CdV  ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\t\t\t\t");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòùáéíBrMNhqTheóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    \n\n !func!ntion  ");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t 1   ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1tBrownsampBrownleLazy 1   ");
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tVhCV");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaayLazy  ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumpes OveJr The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownL");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BwBrownLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BwownLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBris   ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      1t   The    ");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumps Over The BrownLaz   \n\n   zy DomgmCV");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1sr 4 str1str1ngnsg w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ttVàèìòùáéíóúýâêîôûãñõäëïöüÿç");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuticJumpsk Brown Fox Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmCdCQuicJumpsk\rhqmCV");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCVering");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverThisBBrownLaazyLazy  \t\t\t");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk BBrownLazyLazyBrown Fox Jumps  OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sample strg to test t function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNe CQuick Brown Fox oJumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 53
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCVerinDog");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("JumbUmvrKpes");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCLazy");
        org.junit.Assert.assertEquals(
            result, 66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t 1 Thestring    ");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("rstr1ng");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("to   This is a sample string to test the function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test th e functionCdV The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BwownisLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT Th!s 1s 4 sstr1str1ngng w1th 5ymb0ls !n 1t   1t 1 The    i");
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJumpskg\r");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("s    \n\n !func!ntion  e");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLa zy z aa");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThTMNei");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("g");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Browno Fox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownsampBrownlMNhqThe CQuicJumpsk BBrownLazyLazyBrown Fox Jumps  OverThis is a sample string to test thCVeLazy");
        org.junit.Assert.assertEquals(
            result, 111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thCVeLBrownLazazy");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("JuTTBrownismbUmvrKpes");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuDogmCVnsampBrownleLazyick");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th1tBrownsampBrownleLazy!s 1s 4 str1str1ngng w1th 5ymb0ls !n 1tBrownLazys");
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("samp");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("rrstr1ng");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1t Over The TrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1testt1tt Over The TBrowMNhqmnrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Brow");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("àèìòõùáéíóúýâêîôûãñõäëïöüÿ");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps OveMNhqThe CQuicJumpsk Brown Fox Jumps  OverThis is a sample string to test thCVr The BrownLazy DoMNhqmCdCQuicJumpsk\rgmCV");
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("bUmv");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \rLazy \n\r  ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stri     ntog");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1thTTBrownis    55ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("teestt");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThBrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCLazyk BrowMNhqmn Fox Jumps OverThis  to test t");
        org.junit.Assert.assertEquals(
            result, 114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tetest");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  t     ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverThisBBrownLaazLazy  ");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCLazyk");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Thi");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuDogmCVnsampBrownleLazyick Brown Fox oJutesttmps OqveThT     testt1t 1 The    iMNhq1TMNMNhqTheher The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aaaaa");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" Th!s 1s 4 str1ng w1th 5ymb0ls !n 1t Over The TTBrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1testt1tt Over The TBrowMNhqmnrownisgmCVstrC1ng");
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1tBrownsampBrownleLazy 1   \t");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Tntoghis");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functontMNhqThe CQuDogmCVnsampBrownleLazyick Brown Fox oJutesttmps OqveThT     testt1t 1 The    iMNhq1TMNMNhqTheher The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1CQuicJstrOveringumpskt");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("JumJp");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \rLazy \n\r Th!s 1s 4 str1ng w1th 5ymb0ls !n 1testt1tt Over The TBrowMNhqmnrownisgmCVstrC1ng 1s");
        org.junit.Assert.assertEquals(
            result, 94
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBroownLazyLazy");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("s    \n\n !fu55ymb0lsnc!ntion  e");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tVtV");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmCdCV");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("oMNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CuQuicJumpsk Brown Foxstr1str1ngng Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("RDogmCLazyGGTk");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !n 1testMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCVt1tt Over The TBrowMNhqmnrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQu\t\t\tick Brown func!ntionFox oJutesttmps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 75
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is ao sample starintog ton test the function");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe\t\t");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("to   Thihs is a sa\nmple string to test the function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("FstrintoBrLownLgwox");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ttVàèìòùáéíóúýâêîôûãñõäëïìöüÿç");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BwownLazyLazy");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowwnL");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps Over The BrownLazy DoMNhThis is a sample strintog to test the function\rgmCV");
        org.junit.Assert.assertEquals(
            result, 107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCV\nhCV");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThBrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCLazyk BrowMNhqmn Fox Jumps OverThis  to tehst t");
        org.junit.Assert.assertEquals(
            result, 115
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNMNhqThe CQuick Brown Fox JumpBrownL  \r  \n   azyses Over The BrownLazy DogmCV\nhCV");
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown Fox Jumpes OveJr The BrownLazy DogmBrownCV");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("r1g");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UcBwownisLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UcBwDomgmCVownisLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe C Quick Brown Fox Jumps Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownL  tt\r  \n   azys");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stCQuicJstrOveringumpskt");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaOverThisBBrownLaazyLazy  \t\t\tzy  ");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBr ownis   ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLa zy z a");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is ao sample starintog ton test the n");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      1t  T");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     str1ng 1t  The    This is a samThT    1sampLazylet 1 The    ipleOvering to test the function");
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrownnnis   ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1tBrownsampBrownleLazy B1   \t");
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functBwownisLazyLazy  ion");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe C Quick Brown Fox zy DogmCV");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ickk");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrozwnLazys");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This i s a sample strintog to test the hfuncti on");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1tBrownLazys");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("z");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazyy z ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLLazyLazy  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stCQuicMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCVstrOveringumpskt");
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("i");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuDogmCVnsampBrownfunctBwownisLazyLazy");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLaa zz aa");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UcBwDomgmCVownisLazyLazy");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCLazy");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownLazMNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test th e functionCdV The BrownLazy DogmCVys");
        org.junit.Assert.assertEquals(
            result, 119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1testt1tt");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sThe");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe C Quic   k Brown FTh!s 1s 4 str1ng w1th 5ymb0ls !n 1testMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCVt1tt Over The TBrowMNhqmnrownisgmCVox Jumps Over TheC BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jumpsw1This");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("QGLWea");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1testt1t");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CCQuicJumpsk");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqmThTis  ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("This is a sample strintog to tesMNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test the function The BrownLazy DogmCVt the function");
        org.junit.Assert.assertEquals(
            result, 151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sampleT stringunction\n\n   z");
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLa zyz z a");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nction");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TBrowMNhqmnrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmC    \n\n func!ntion  Lazyk");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BryownLazys");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThTiTi");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TMNhqmCVhis is ao sample starintog ton test the n");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     str1ng 1t  The    This is a samThT    1sampLazylet 1 The  MNhqThe CuQuicJumpsk Brown Fo    \n\n   xstr1str1ngng Jumps OverThis is a sample string to test thCVt the function");
        org.junit.Assert.assertEquals(
            result, 175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ntog");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hCV");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4Cr1ngng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT OverThisBBrownLaazyLazy   t1DomgmCV  i");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  \r  \n   àèì t   1t  The    òõùáéíóúýâêîôûãñõäëïöüÿ");
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("samplsme");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("on");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThT     ttestt1t 1 TBrownLazyhe    i");
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sasmplsme");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\n\n\n");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuticJumpsk");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OqvveThT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("functontMNhqThLe CQuDogmCVnsampBrownleLazyick Brown Fox oJutesttmps OqveThT     testt1t 1 The    iMNhq1TMNMNhqTheher The BrownLazy DàèìòùáéíBrMNhqTheóúýâêîôûãñõäëïöüÿçogmCV");
        org.junit.Assert.assertEquals(
            result, 172
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("C");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("sTe");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("w1thTTBrownis");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    samThT ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJumpskg");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJumpskg\r\r");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("!func!ontion");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sample string to test thhe function The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jumpsw1Tntoghiss");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaayLazy");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("saasmplsme");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe Quick Brown Fox Jumps Over The BrownLazy DogmCrV");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("1seampLazyleat");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ThhT");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t 1 The    aaaaa");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownLazMNhqThe CQuicJumpsk Brown Fox Jumps OverThis is a sastr1str1ngnsgmple string to test th e functionCdV The BrownLazy DogmCVys");
        org.junit.Assert.assertEquals(
            result, 132
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps Over The BrownLazy DoMNhThis is a sample strintoTh!s 1s 4 str1ng w1th 5ymb0ls !n 1testMNhqThe CQuick Brown Fox Jumpes Over The BrownLazy DogmCVt1tt Over The TBrowMNhqmnrownisgmCVg to test the function\rgmCV");
        org.junit.Assert.assertEquals(
            result, 237
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("GThT    1t 1 The CuQuicJumpsk   ic");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("      The     ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaayLazystringunction");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UcBwDnomgmCVownisLazyLazy");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaayLazystrizngunction");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCVnsampBrownleLaLazy z zyhTiTh!s 1s 4 str1ng w1th 5ymb0ls !n 1ts");
        org.junit.Assert.assertEquals(
            result, 125
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("zz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("w  CdV  1This is a sample sstrintogt ton test the functiont");
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("qygh");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fstrintogwox Jumpes Over The BrownLazuey DogmCVnsampBrownleLazy");
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TheC");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t 1  The    ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  te      1t  sThe    s tt\r \n\r Foxstr1str1ngng");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCV");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverTh");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   ThiBrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCLazys is a sample string to test th e function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 120
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("     str1ng 1t  The    This is a samThT    1sampLazylet i1 The  MNhqThe CuQuicJumpBsk Brown Fo    \n\n   xstr1str1ngng Jumps OverThis is a sample string to test thCVt the function");
        org.junit.Assert.assertEquals(
            result, 177
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1 1t");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("nctoion");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrown");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBroownLaaLLa zy z aazyLazy");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("str1g");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThBrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCLazyk BrowMNhqmn Fox Jumps OverThis  to ytehst t");
        org.junit.Assert.assertEquals(
            result, 116
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fstrintogwox Jumpes Over zy");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("    1t  Theion    ");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TTBrownis    ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqm");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   ThiBrowMNhqThe CQuick FoxJumpsBrown Fwox Jumpes Over The BrownLazey DogmCLazys is a sample string to test th e function\n\n   z");
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1ng w1th 5ymb0ls !nw 1testt1tt Over The TBrowMNhqmnrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("JumbstringunctionUmvrKpes");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Lazy ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BwownLazyaLa zy  ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CCQuicJumt1DomgmCVpsk");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Jumpsw1TntoghiTTBrisss");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownL  tt\r  \n   aCQuDogmCVnsampBrownleLazyickzys");
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UrK");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLaayLazystringunctionn");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("VhCV");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuicJstrOveJringumpsk");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQuick Brown hFox Jumps OcveMNhqThe CQuicJumpsk Brown Fox Jumps  OverThis is a sample string to test thCVr The BrownLazy DoMNhqmCdCQuicJumpsk\rgmCV");
        org.junit.Assert.assertEquals(
            result, 154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrowMNhqThe CQuick Brown Fwox Jumpes Over The BrownLazey DogmCVnsampBrownleLaLazy z zyhTiTh!s 1s 4 str1ng w1th 5ymb0ls !n 1tsrrstr1ng");
        org.junit.Assert.assertEquals(
            result, 133
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("OverThisBBrownLaazyLazy");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aCQuDogmCVnsampBrownleLazyickzys");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("UcBwownisLazzyz ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("iii");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("s    \n\n !func!ntio    \n\n func!ntion  n  e");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1sMNhqmtr1 1t");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("testVhCVtt");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCVBrownsampBrownlMNhqThensampBrownleLazy");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("  te      1t  sThe    s tt\r \n1\r Foxstr1str1ngng");
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe Quick BrowTBrowMNhqmnrownisgmCVgn FoxJumpws Over The BrownLazy DogmCV");
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4 str1str1ngng w1th 5ymb0lDogmVCVBBrownLazyLazy  s !n 1tBrow");
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Ju   This is a sampleT stringunction\n\n   zTTBrownismbUmvrKpes");
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("ç");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("TBrowMNhqmnrownisgmCVstrC1ng");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("   This is a sample strinazysgunction\n\n   z");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLa");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s 4s str1str1ngng w1th 5ymb0ls !n 1tBrow");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BrownLazuey");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("MNhqThe CQugicJumpsk Brown Foxstr1str1ngng Jumps OverThis is a sample string to test thCV");
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("\nzTTBrownismbUmvrKpesBrMNhqThe\nTh!s 1s 4 str1str1ngng w1th 5ymb0lDogmVCVBBrownLazyLazy  s !n 1tBrow\n");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("LaOverThissBBrownLaazyLazy  \t\t\tzy  ");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("stCQuicJstrOveringumpsktoJutesttmps");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("tstr1g");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s !4 str1str1ngnsg w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("leOvMNhqThe CQuick Brown Fox oJumps Ovepr The BrownLazy DogmCVering");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("CQuck");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLaLBrowTBrowMNhqmnrownisgmCVgna");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("thThT OaverThisBBrownLaazyLazye   t1t 1 The    iCVeLBrownLazazy");
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("BBrownLLazyLazy");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("Th!s 1s w1This is a sample sstrintog ton test the functiont4 str1str1ngng w1th 5ymb0ls !n 1t");
        org.junit.Assert.assertEquals(
            result, 92
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen(" Th!s 1s 4 str1ng w1thn 5ymb0ls !n 1t Over The TTBrownisgmCV");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("testtt");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("aLLaa zz aaick");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("DogmCrV");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("hThT     testt1t 1 The    iMNhq1TMNMNhqThehe");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.STRLEN.strlen("         The     ");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
}

