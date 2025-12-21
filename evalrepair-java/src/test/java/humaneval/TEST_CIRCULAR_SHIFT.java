package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CIRCULAR_SHIFT {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 2);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 2);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(97, 8);
        org.junit.Assert.assertEquals(
            result, "79"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 1);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 101);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 3);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234, 6);
        org.junit.Assert.assertEquals(
            result, "4321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341209, 4);
        org.junit.Assert.assertEquals(
            result, "120934"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456123, 10);
        org.junit.Assert.assertEquals(
            result, "321654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(500, 4);
        org.junit.Assert.assertEquals(
            result, "005"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(345, 1);
        org.junit.Assert.assertEquals(
            result, "534"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(86314, 3);
        org.junit.Assert.assertEquals(
            result, "31486"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(22, 4);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(987654321, 9);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(777, 10);
        org.junit.Assert.assertEquals(
            result, "777"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(23, 789456124);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341209, 3);
        org.junit.Assert.assertEquals(
            result, "209341"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341209, 341209);
        org.junit.Assert.assertEquals(
            result, "902143"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456123, 23);
        org.junit.Assert.assertEquals(
            result, "321654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456122, 789456123);
        org.junit.Assert.assertEquals(
            result, "221654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(500, 3);
        org.junit.Assert.assertEquals(
            result, "500"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(23, 16);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456123, 777);
        org.junit.Assert.assertEquals(
            result, "321654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 2);
        org.junit.Assert.assertEquals(
            result, "15"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456122, 789456122);
        org.junit.Assert.assertEquals(
            result, "221654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(23, 22);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456124, 789456124);
        org.junit.Assert.assertEquals(
            result, "421654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2, 3);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 6);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2, 345);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456123, 789456123);
        org.junit.Assert.assertEquals(
            result, "321654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 6);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(23, 10);
        org.junit.Assert.assertEquals(
            result, "32"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(22, 777);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456124, 3);
        org.junit.Assert.assertEquals(
            result, "124789456"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(3, 3);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456123, 11);
        org.junit.Assert.assertEquals(
            result, "321654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(501, 3);
        org.junit.Assert.assertEquals(
            result, "501"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 23);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(9, 777);
        org.junit.Assert.assertEquals(
            result, "9"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 777);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1235, 23);
        org.junit.Assert.assertEquals(
            result, "5321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 9);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341209, 5);
        org.junit.Assert.assertEquals(
            result, "412093"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 789456123);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(499, 3);
        org.junit.Assert.assertEquals(
            result, "499"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 776);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 4);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341209, 789456124);
        org.junit.Assert.assertEquals(
            result, "902143"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(776, 23);
        org.junit.Assert.assertEquals(
            result, "677"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 1);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2, 777);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(3, 2);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(14, 14);
        org.junit.Assert.assertEquals(
            result, "41"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341210, 5);
        org.junit.Assert.assertEquals(
            result, "412103"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(22, 8);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341208, 4);
        org.junit.Assert.assertEquals(
            result, "120834"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(777, 777);
        org.junit.Assert.assertEquals(
            result, "777"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 12);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(4, 3);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(987654321, 3);
        org.junit.Assert.assertEquals(
            result, "321987654"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 15);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(500, 500);
        org.junit.Assert.assertEquals(
            result, "005"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(987654321, 987654321);
        org.junit.Assert.assertEquals(
            result, "123456789"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(501, 4);
        org.junit.Assert.assertEquals(
            result, "105"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 10);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 776);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2, 22);
        org.junit.Assert.assertEquals(
            result, "2"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341208, 345);
        org.junit.Assert.assertEquals(
            result, "802143"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 1);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(3, 341209);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456124, 341209);
        org.junit.Assert.assertEquals(
            result, "421654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(22, 23);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(14, 10);
        org.junit.Assert.assertEquals(
            result, "41"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 341209);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234, 10);
        org.junit.Assert.assertEquals(
            result, "4321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(22, 5);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 776);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 8);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 10);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234, 1235);
        org.junit.Assert.assertEquals(
            result, "4321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(341208, 10);
        org.junit.Assert.assertEquals(
            result, "802143"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456124, 23);
        org.junit.Assert.assertEquals(
            result, "421654987"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(3, 9);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 23);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 4);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(789456122, 3);
        org.junit.Assert.assertEquals(
            result, "122789456"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(14, 15);
        org.junit.Assert.assertEquals(
            result, "41"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(9, 8);
        org.junit.Assert.assertEquals(
            result, "9"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(777, 12);
        org.junit.Assert.assertEquals(
            result, "777"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(501, 777);
        org.junit.Assert.assertEquals(
            result, "105"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(499, 499);
        org.junit.Assert.assertEquals(
            result, "994"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(3, 6);
        org.junit.Assert.assertEquals(
            result, "3"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 11);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 10);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 100);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 1000);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 1000);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 1234567890);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 123456789);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 1000);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 55671);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 25);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 123456790);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 123456788);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 1000);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483646, 11);
        org.junit.Assert.assertEquals(
            result, "6463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 1000);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 1000);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 99);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 99);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 98);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 1234567891);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 1001);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 26);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 123456789);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 123456789);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 11);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 1000);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 25);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 25);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 200);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(157, 25);
        org.junit.Assert.assertEquals(
            result, "751"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 158);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 100);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 12);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 24);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 26);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 1000);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 158);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 99);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 25);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 28);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55675, 24);
        org.junit.Assert.assertEquals(
            result, "57655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 55671);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 11);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 2147483646);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 1234567890);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(24, 25);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 10);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 123456789);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 26);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456790);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 99);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 123456790);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 1000);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 27);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483646, 1001);
        org.junit.Assert.assertEquals(
            result, "6463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55675, 2147483646);
        org.junit.Assert.assertEquals(
            result, "57655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 11);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 27);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 1000);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 159);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 55672);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483646, 100);
        org.junit.Assert.assertEquals(
            result, "6463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 98);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 27);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 200);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 98);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 159);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 2147483646);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 200);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 1234567890);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 11);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 1000);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 1001);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 1234567891);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 0);
        org.junit.Assert.assertEquals(
            result, "1234567891"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 1234567890);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 2147483647);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(156, 157);
        org.junit.Assert.assertEquals(
            result, "651"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 98);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(156, 99);
        org.junit.Assert.assertEquals(
            result, "651"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 11);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 11);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 27);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 199);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 158);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 200);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 1234567892);
        org.junit.Assert.assertEquals(
            result, "2987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 100);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 12);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 15);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 1000);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 13);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483646, 26);
        org.junit.Assert.assertEquals(
            result, "6463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 1234567891);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 123456787);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 0);
        org.junit.Assert.assertEquals(
            result, "55672"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 1000);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 99);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 200);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 26);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 1234567892);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 55672);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(157, 199);
        org.junit.Assert.assertEquals(
            result, "751"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 2147483647);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 123456787);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 11);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 11);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 99);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 25);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456789);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(24, 100);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 199);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 25);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 123456787);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 99);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 11);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1002, 1002);
        org.junit.Assert.assertEquals(
            result, "2001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 99);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 200);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 999);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 55671);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 11);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 123456789);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 2147483647);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55673, 25);
        org.junit.Assert.assertEquals(
            result, "37655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 55673);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 2147483647);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(97, 97);
        org.junit.Assert.assertEquals(
            result, "79"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 201);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(97, 2147483646);
        org.junit.Assert.assertEquals(
            result, "79"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 1000);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 200);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 28);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 98);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 2147483647);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 55671);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 1234567890);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 1234567890);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 1001);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 2147483646);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 98);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 99);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(157, 1234567892);
        org.junit.Assert.assertEquals(
            result, "751"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 1234567890);
        org.junit.Assert.assertEquals(
            result, "2987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 55672);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 0);
        org.junit.Assert.assertEquals(
            result, "159"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(202, 11);
        org.junit.Assert.assertEquals(
            result, "202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 2147483646);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(202, 55676);
        org.junit.Assert.assertEquals(
            result, "202"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(997, 200);
        org.junit.Assert.assertEquals(
            result, "799"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 16);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 1001);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 12);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 1234567890);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 1234567892);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 55674);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 99);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 55676);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 2147483646);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 1001);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 123456786);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 13);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 1234567889);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 157);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 2147483647);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 998);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 1234567891);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(24, 99);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 201);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 0);
        org.junit.Assert.assertEquals(
            result, "1234567892"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 0);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 27);
        org.junit.Assert.assertEquals(
            result, "2987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 1234567892);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(97, 10);
        org.junit.Assert.assertEquals(
            result, "79"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 158);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 13);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55673, 123456789);
        org.junit.Assert.assertEquals(
            result, "37655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 123456789);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 123456788);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 160);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 13);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 100);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 14);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 1234567892);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 999);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 123456787);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 27);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55675, 55675);
        org.junit.Assert.assertEquals(
            result, "57655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 1234567890);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 123456789);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 159);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 11);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1002, 1001);
        org.junit.Assert.assertEquals(
            result, "2001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(160, 158);
        org.junit.Assert.assertEquals(
            result, "061"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 123456791);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 101);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 9);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 1001);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 27);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55676, 24);
        org.junit.Assert.assertEquals(
            result, "67655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 27);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 24);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 1234567890);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(24, 123456787);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(157, 157);
        org.junit.Assert.assertEquals(
            result, "751"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(157, 55671);
        org.junit.Assert.assertEquals(
            result, "751"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 1000);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 123456788);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 100);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 200);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 8);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 9);
        org.junit.Assert.assertEquals(
            result, "2345678911"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567889, 1234567890);
        org.junit.Assert.assertEquals(
            result, "9887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 158);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 1001);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483646, 2147483646);
        org.junit.Assert.assertEquals(
            result, "6463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567889, 1234567888);
        org.junit.Assert.assertEquals(
            result, "9887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 2147483647);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 158);
        org.junit.Assert.assertEquals(
            result, "2987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 0);
        org.junit.Assert.assertEquals(
            result, "26"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 0);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 156);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55675, 55674);
        org.junit.Assert.assertEquals(
            result, "57655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 1003);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1003, 1003);
        org.junit.Assert.assertEquals(
            result, "3001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 12);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 2147483646);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 55674);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 156);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 2147483646);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 998);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 11);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 159);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 13);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 99);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 55675);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 998);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 10);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 27);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 1234567892);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 123456790);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 2147483647);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 102);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1002, 27);
        org.junit.Assert.assertEquals(
            result, "2001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 200);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 5);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 0);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 3);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 0);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 10);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 201);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(9, 9);
        org.junit.Assert.assertEquals(
            result, "9"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 99);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 9);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 100);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 26);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 0);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 101);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(9, 10);
        org.junit.Assert.assertEquals(
            result, "9"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 9);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 100);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 101);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 1000);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 10);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 0);
        org.junit.Assert.assertEquals(
            result, "55671"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 17);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 158);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 0);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 12);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 11);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 18);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 999);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 10);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 15);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 25);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 8);
        org.junit.Assert.assertEquals(
            result, "234567901"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 11);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 123456790);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 12);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 123456787);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 16);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456786, 123456787);
        org.junit.Assert.assertEquals(
            result, "687654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 1);
        org.junit.Assert.assertEquals(
            result, "25567"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 2147483647);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 16);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 999);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 2147483647);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 123456790);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 12);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 158);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 26);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55673, 55672);
        org.junit.Assert.assertEquals(
            result, "37655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 55671);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 6);
        org.junit.Assert.assertEquals(
            result, "4836472147"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 123456790);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 8);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(201, 200);
        org.junit.Assert.assertEquals(
            result, "102"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 999);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456791);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 7);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 8);
        org.junit.Assert.assertEquals(
            result, "234567891"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 11);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 28);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 99);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 55672);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 55671);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 123456790);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 28);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 11);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 2147483647);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 55671);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 8);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 15);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 999);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 123456788);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 199);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 17);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 123456786);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 123456789);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 28);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 16);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 158);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 999);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 7);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 26);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 28);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 28);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 19);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 998);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 123456790);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 999);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 17);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 26);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 2147483647);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(9, 101);
        org.junit.Assert.assertEquals(
            result, "9"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456788, 158);
        org.junit.Assert.assertEquals(
            result, "887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 15);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 18);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 55671);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 17);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 8);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456788);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 12);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 100);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 55671);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 999);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 17);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 101);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 123456791);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 1234567889);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 123456791);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 55672);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 55672);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567889, 158);
        org.junit.Assert.assertEquals(
            result, "9887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 8);
        org.junit.Assert.assertEquals(
            result, "3456789112"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 123456790);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(19, 19);
        org.junit.Assert.assertEquals(
            result, "91"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 19);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 103);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 27);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 55673);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 1234567890);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 1);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 98);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 20);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 998);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 5);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 100);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 8);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 199);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 8);
        org.junit.Assert.assertEquals(
            result, "3456789012"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 123456789);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 100);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(28, 100);
        org.junit.Assert.assertEquals(
            result, "82"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 7);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 998);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 100);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 199);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 123456787);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(198, 199);
        org.junit.Assert.assertEquals(
            result, "891"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 0);
        org.junit.Assert.assertEquals(
            result, "15"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 55671);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567889, 123456789);
        org.junit.Assert.assertEquals(
            result, "9887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 55674);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 55674);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 55671);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 100);
        org.junit.Assert.assertEquals(
            result, "1987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 11);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 20);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 20);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(103, 28);
        org.junit.Assert.assertEquals(
            result, "301"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(25, 123456788);
        org.junit.Assert.assertEquals(
            result, "52"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(19, 10);
        org.junit.Assert.assertEquals(
            result, "91"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 100);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 2147483646);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 158);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 201);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 26);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(102, 198);
        org.junit.Assert.assertEquals(
            result, "201"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456786, 15);
        org.junit.Assert.assertEquals(
            result, "687654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 8);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 27);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 1234567890);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 17);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 29);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 123456790);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567888, 1234567888);
        org.junit.Assert.assertEquals(
            result, "8887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(4, 5);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 29);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 198);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(999, 123456790);
        org.junit.Assert.assertEquals(
            result, "999"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(16, 10);
        org.junit.Assert.assertEquals(
            result, "61"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(46, 45);
        org.junit.Assert.assertEquals(
            result, "64"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(29, 201);
        org.junit.Assert.assertEquals(
            result, "92"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 15);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 101);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 2147483647);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 28);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 45);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567892, 11);
        org.junit.Assert.assertEquals(
            result, "2987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 4);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(15, 100);
        org.junit.Assert.assertEquals(
            result, "51"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456786, 123456786);
        org.junit.Assert.assertEquals(
            result, "687654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567888, 45);
        org.junit.Assert.assertEquals(
            result, "8887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1000, 9);
        org.junit.Assert.assertEquals(
            result, "0001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567891, 5);
        org.junit.Assert.assertEquals(
            result, "6789112345"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(45, 1000);
        org.junit.Assert.assertEquals(
            result, "54"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(2147483647, 15);
        org.junit.Assert.assertEquals(
            result, "7463847412"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(5, 99);
        org.junit.Assert.assertEquals(
            result, "5"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(159, 123456789);
        org.junit.Assert.assertEquals(
            result, "951"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 7);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(99, 102);
        org.junit.Assert.assertEquals(
            result, "99"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 99);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 2147483647);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(19, 11);
        org.junit.Assert.assertEquals(
            result, "91"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 11);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567890, 999);
        org.junit.Assert.assertEquals(
            result, "0987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 123456787);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567888, 999);
        org.junit.Assert.assertEquals(
            result, "8887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(30, 25);
        org.junit.Assert.assertEquals(
            result, "03"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 123456786);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 4);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 27);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(103, 103);
        org.junit.Assert.assertEquals(
            result, "301"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 25);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(46, 2147483647);
        org.junit.Assert.assertEquals(
            result, "64"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(103, 104);
        org.junit.Assert.assertEquals(
            result, "301"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 102);
        org.junit.Assert.assertEquals(
            result, "197654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(6, 6);
        org.junit.Assert.assertEquals(
            result, "6"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 0);
        org.junit.Assert.assertEquals(
            result, "123456790"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 11);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 25);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(4, 4);
        org.junit.Assert.assertEquals(
            result, "4"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(14, 13);
        org.junit.Assert.assertEquals(
            result, "41"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 157);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 100);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 14);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(104, 28);
        org.junit.Assert.assertEquals(
            result, "401"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 99);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 102);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(13, 2147483647);
        org.junit.Assert.assertEquals(
            result, "31"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 158);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 123456790);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 55675);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(200, 28);
        org.junit.Assert.assertEquals(
            result, "002"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 11);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55673, 6);
        org.junit.Assert.assertEquals(
            result, "37655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567888, 13);
        org.junit.Assert.assertEquals(
            result, "8887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(46, 46);
        org.junit.Assert.assertEquals(
            result, "64"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456789, 12);
        org.junit.Assert.assertEquals(
            result, "987654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456787, 123456788);
        org.junit.Assert.assertEquals(
            result, "787654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(7, 55674);
        org.junit.Assert.assertEquals(
            result, "7"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(198, 0);
        org.junit.Assert.assertEquals(
            result, "198"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1234567888, 40);
        org.junit.Assert.assertEquals(
            result, "8887654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 17);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(26, 1000);
        org.junit.Assert.assertEquals(
            result, "62"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 17);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 15);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(104, 1000);
        org.junit.Assert.assertEquals(
            result, "401"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55673, 55674);
        org.junit.Assert.assertEquals(
            result, "37655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55675, 26);
        org.junit.Assert.assertEquals(
            result, "57655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 201);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(103, 102);
        org.junit.Assert.assertEquals(
            result, "301"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(98, 103);
        org.junit.Assert.assertEquals(
            result, "89"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(8, 28);
        org.junit.Assert.assertEquals(
            result, "8"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 2147483646);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 1);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456787);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456790, 123456792);
        org.junit.Assert.assertEquals(
            result, "097654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55672, 55673);
        org.junit.Assert.assertEquals(
            result, "27655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456791, 7);
        org.junit.Assert.assertEquals(
            result, "345679112"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(158, 14);
        org.junit.Assert.assertEquals(
            result, "851"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(10, 123456789);
        org.junit.Assert.assertEquals(
            result, "01"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(27, 26);
        org.junit.Assert.assertEquals(
            result, "72"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(24, 24);
        org.junit.Assert.assertEquals(
            result, "42"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55674, 55674);
        org.junit.Assert.assertEquals(
            result, "47655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(998, 123456791);
        org.junit.Assert.assertEquals(
            result, "899"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(17, 199);
        org.junit.Assert.assertEquals(
            result, "71"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1, 7);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 201);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(0, 12);
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 15);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 55672);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 8);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456792, 17);
        org.junit.Assert.assertEquals(
            result, "297654321"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(198, 15);
        org.junit.Assert.assertEquals(
            result, "891"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(101, 8);
        org.junit.Assert.assertEquals(
            result, "101"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(104, 999);
        org.junit.Assert.assertEquals(
            result, "401"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(1001, 2147483647);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(20, 21);
        org.junit.Assert.assertEquals(
            result, "02"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(55671, 98);
        org.junit.Assert.assertEquals(
            result, "17655"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(199, 199);
        org.junit.Assert.assertEquals(
            result, "991"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(18, 55671);
        org.junit.Assert.assertEquals(
            result, "81"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(123456792, 123456791);
        org.junit.Assert.assertEquals(
            result, "297654321"
        );
    }
}

