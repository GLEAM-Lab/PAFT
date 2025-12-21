package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FRUIT_DISTRIBUTION {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 0 oranges", 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 5);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 100 oranges", 120);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 20 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 9);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("7 apples and 8 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 5);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 0 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 5 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("8 apples and 2 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 20 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("8 apples and 2 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 2);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 20 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 5 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 9);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 8);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("7 apples and 8 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 8);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 11);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 0 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 20 oranges", 52);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 4);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 11);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 5 oranges", 11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 52);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 0 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 3);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 9);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 8);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 5 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 9);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 5 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 4 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 0 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("100 apples and 100 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 25);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 178
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 25);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 26);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 188
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 177
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 26);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 83
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 79
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 93
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("100 apples and 100 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 180
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 16);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 27);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 102);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 102);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 174
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 198
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 118 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 118 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 198);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 187
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 26);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 25);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 22);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 118 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 99 oranges", 102);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 98);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 85
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 102);
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 11 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("97 apples and 1 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 118 oranges", 197);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 181
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 27);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 195);
        org.junit.Assert.assertEquals(
            result, 153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 94
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 27);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 18 oranges", 97);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 196);
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("24 apples and 11 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 108);
        org.junit.Assert.assertEquals(
            result, 85
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 104
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 17);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 32);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 94
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 22);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 18);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 27);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 14);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 11);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 22);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 101);
        org.junit.Assert.assertEquals(
            result, 91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("91 apples and 9 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 25);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 16);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 93
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 31);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 16);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 26);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 85
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 10);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 22);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 50);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 105);
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 183
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 27);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 25);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 18);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 187
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("20 apples and 0 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 182
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 102);
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("91 apples and 9 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 82
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 32);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 13);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 97
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 29);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 108);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 26);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("91 apples and 9 oranges", 106);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 104);
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 18);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("50 apples and 50 oranges", 107);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 185
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 12);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 200);
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 18);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 48);
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 85
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("91 apples and 9 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 98);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 78 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 28);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 52);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 97);
        org.junit.Assert.assertEquals(
            result, 87
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 51);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("99 apples and 1 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 0 oranges", 52);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 78 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("15 apples and 8 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 018 oranges", 20);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 17);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("020 apples and 018 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 99);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 52);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 103);
        org.junit.Assert.assertEquals(
            result, 93
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("10 apples and 5 oranges", 17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 108);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("3 apples and 7 oranges", 49);
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 16);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("03 apples and 7 oranges", 201);
        org.junit.Assert.assertEquals(
            result, 191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 199);
        org.junit.Assert.assertEquals(
            result, 189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 30);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 9 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("100 apples and 100 oranges", 202);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
}

