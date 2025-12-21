package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CLOSEST_INTEGER {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("14.5");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-15.5");
        org.junit.Assert.assertEquals(
            result, -16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("15.3");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2.8");
        org.junit.Assert.assertEquals(
            result, -3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("3.6");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.5");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.5");
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.5");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.6");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.6");
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0003");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.99");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99.99");
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99.9");
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999.99");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.9999");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.999");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9.999");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999.999");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("09.99900");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-999.99");
        org.junit.Assert.assertEquals(
            result, -1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.9");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99");
        org.junit.Assert.assertEquals(
            result, -99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0900");
        org.junit.Assert.assertEquals(
            result, 900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.00000");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("6");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-999");
        org.junit.Assert.assertEquals(
            result, -999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999");
        org.junit.Assert.assertEquals(
            result, 999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.6");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.00099900");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.6");
        org.junit.Assert.assertEquals(
            result, 112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00900");
        org.junit.Assert.assertEquals(
            result, 900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-66.");
        org.junit.Assert.assertEquals(
            result, -66
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9111.699");
        org.junit.Assert.assertEquals(
            result, -9112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.65");
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0009000");
        org.junit.Assert.assertEquals(
            result, 9000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99.");
        org.junit.Assert.assertEquals(
            result, -99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9.");
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99000");
        org.junit.Assert.assertEquals(
            result, -99000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5");
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("900.999");
        org.junit.Assert.assertEquals(
            result, 901
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("911.600");
        org.junit.Assert.assertEquals(
            result, 912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-66666.");
        org.junit.Assert.assertEquals(
            result, -66666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9111.6919");
        org.junit.Assert.assertEquals(
            result, -9112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999.9999");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-090109111.6919");
        org.junit.Assert.assertEquals(
            result, -90109112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9111.19");
        org.junit.Assert.assertEquals(
            result, -9111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("009090");
        org.junit.Assert.assertEquals(
            result, 9090
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.000999006");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9999.99");
        org.junit.Assert.assertEquals(
            result, 10000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0009000000");
        org.junit.Assert.assertEquals(
            result, 9000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-91111.691");
        org.junit.Assert.assertEquals(
            result, -91112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999000.999");
        org.junit.Assert.assertEquals(
            result, 999001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.00");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.000999900");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-090109111.6919999");
        org.junit.Assert.assertEquals(
            result, -90109112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.9096");
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("911");
        org.junit.Assert.assertEquals(
            result, 911
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6.000000");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-666666.");
        org.junit.Assert.assertEquals(
            result, -666666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("66666.");
        org.junit.Assert.assertEquals(
            result, 66666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9999.9999");
        org.junit.Assert.assertEquals(
            result, 10000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9.9");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999.99999");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-699.990");
        org.junit.Assert.assertEquals(
            result, -700
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-66.6000");
        org.junit.Assert.assertEquals(
            result, -67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9999");
        org.junit.Assert.assertEquals(
            result, 9999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00090000");
        org.junit.Assert.assertEquals(
            result, 90000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0099090");
        org.junit.Assert.assertEquals(
            result, 99090
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00009000");
        org.junit.Assert.assertEquals(
            result, 9000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-919");
        org.junit.Assert.assertEquals(
            result, -919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000600");
        org.junit.Assert.assertEquals(
            result, 600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9900");
        org.junit.Assert.assertEquals(
            result, -9900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00090099990");
        org.junit.Assert.assertEquals(
            result, 90099990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6666666.");
        org.junit.Assert.assertEquals(
            result, -6666666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer(".9096");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00090000000");
        org.junit.Assert.assertEquals(
            result, 90000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00600");
        org.junit.Assert.assertEquals(
            result, 600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9.9999");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.");
        org.junit.Assert.assertEquals(
            result, 111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99");
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00090000009.999000");
        org.junit.Assert.assertEquals(
            result, 90000010
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-6999.99000");
        org.junit.Assert.assertEquals(
            result, -7000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000900");
        org.junit.Assert.assertEquals(
            result, 900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-66666666.");
        org.junit.Assert.assertEquals(
            result, -66666666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000900000000");
        org.junit.Assert.assertEquals(
            result, 900000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9111191.691");
        org.junit.Assert.assertEquals(
            result, -9111192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99999");
        org.junit.Assert.assertEquals(
            result, 99999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0090900");
        org.junit.Assert.assertEquals(
            result, 90900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-60.00099900");
        org.junit.Assert.assertEquals(
            result, -60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-66966666.");
        org.junit.Assert.assertEquals(
            result, -66966666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-111.900090099990900");
        org.junit.Assert.assertEquals(
            result, -112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-54.9999");
        org.junit.Assert.assertEquals(
            result, -55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12345678.54321");
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.12345");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234567890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5.5");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345678900040000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.9");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-787654321.12345");
        org.junit.Assert.assertEquals(
            result, -787654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.01");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.123345");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("4.9999");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2345678900000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.23456789000000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-187654321.123345");
        org.junit.Assert.assertEquals(
            result, -187654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.234567890000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.09");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9");
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2354567890000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.011");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.27890000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.55");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-91.01");
        org.junit.Assert.assertEquals(
            result, -91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.212345");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.278900000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234567890000000000091");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.99");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("55.5");
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.00001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.278590000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1234567821");
        org.junit.Assert.assertEquals(
            result, 1234567821
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111");
        org.junit.Assert.assertEquals(
            result, 111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("01");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.1234567890000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.9");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.00");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111");
        org.junit.Assert.assertEquals(
            result, 1111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.0000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-599.5");
        org.junit.Assert.assertEquals(
            result, -600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.00000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11111");
        org.junit.Assert.assertEquals(
            result, 11111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000000010");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.23456789000000000011101");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("911.99");
        org.junit.Assert.assertEquals(
            result, 912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.23456789000000011111000091");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111111");
        org.junit.Assert.assertEquals(
            result, 111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.00001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.000000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.123456789001111100000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-91.");
        org.junit.Assert.assertEquals(
            result, -91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10001");
        org.junit.Assert.assertEquals(
            result, 10001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-511.23545678900000500001");
        org.junit.Assert.assertEquals(
            result, -511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-687654321.12345");
        org.junit.Assert.assertEquals(
            result, -687654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.1223456789001111100000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-01.234567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.00000000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-687654321.152345");
        org.junit.Assert.assertEquals(
            result, -687654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5787.12345");
        org.junit.Assert.assertEquals(
            result, -5787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2345678900000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.555");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111.");
        org.junit.Assert.assertEquals(
            result, 1111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.0001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-54.99999");
        org.junit.Assert.assertEquals(
            result, -55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111111");
        org.junit.Assert.assertEquals(
            result, 1111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.1001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2345678900000002001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.011111");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0000011");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9111.9900");
        org.junit.Assert.assertEquals(
            result, 9112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1000101");
        org.junit.Assert.assertEquals(
            result, 1000101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12345678.521");
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0111");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234567890000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("555.5");
        org.junit.Assert.assertEquals(
            result, 556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.20000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("101.234567890000001");
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0099");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("911001.99");
        org.junit.Assert.assertEquals(
            result, 911002
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-787654321.12");
        org.junit.Assert.assertEquals(
            result, -787654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.00111");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-54.999");
        org.junit.Assert.assertEquals(
            result, -55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-191.01");
        org.junit.Assert.assertEquals(
            result, -191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5780007.12345");
        org.junit.Assert.assertEquals(
            result, -5780007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-7876521.12345");
        org.junit.Assert.assertEquals(
            result, -7876521
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-599");
        org.junit.Assert.assertEquals(
            result, -599
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0010.234567890000000000091000000");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.0000000010");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-687654321.122345");
        org.junit.Assert.assertEquals(
            result, -687654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5780017.12345");
        org.junit.Assert.assertEquals(
            result, -5780017
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.10001010");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("100001");
        org.junit.Assert.assertEquals(
            result, 100001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.9");
        org.junit.Assert.assertEquals(
            result, 112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.12340001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234567890000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("91000000");
        org.junit.Assert.assertEquals(
            result, 91000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.99999");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.21");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9911.99");
        org.junit.Assert.assertEquals(
            result, 9912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-051.278900000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11100");
        org.junit.Assert.assertEquals(
            result, 11100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5787.122345");
        org.junit.Assert.assertEquals(
            result, -5787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("4.94999");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-051.123456789001111100000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234556789000000000011101");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.1001010");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12534567");
        org.junit.Assert.assertEquals(
            result, 12534567
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-511.235456789000005000001");
        org.junit.Assert.assertEquals(
            result, -511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2789000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("101");
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0101");
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("125345678.521");
        org.junit.Assert.assertEquals(
            result, 125345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("654321.12345");
        org.junit.Assert.assertEquals(
            result, 654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0111111101");
        org.junit.Assert.assertEquals(
            result, 111111101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.123485");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0051.123456789001111100000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.000011011");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.1234001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11111111");
        org.junit.Assert.assertEquals(
            result, 11111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876514321.212345");
        org.junit.Assert.assertEquals(
            result, -876514321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9911.919");
        org.junit.Assert.assertEquals(
            result, 9912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-00.55");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("94.9999");
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("55");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.0000000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.00111100015");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0000921.12345");
        org.junit.Assert.assertEquals(
            result, -921
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5700800.12345");
        org.junit.Assert.assertEquals(
            result, -5700800
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111111111");
        org.junit.Assert.assertEquals(
            result, 111111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9100");
        org.junit.Assert.assertEquals(
            result, 9100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("995");
        org.junit.Assert.assertEquals(
            result, 995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.279989000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0.000000000099599");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2345567890000000000111091001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876543345");
        org.junit.Assert.assertEquals(
            result, -876543345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234556789000000011101");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5787.123345");
        org.junit.Assert.assertEquals(
            result, -5787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234567890001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2345567189000000000011101");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000.0000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("3231.12345");
        org.junit.Assert.assertEquals(
            result, 3231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876000.000000000000000543345");
        org.junit.Assert.assertEquals(
            result, -876000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("94999");
        org.junit.Assert.assertEquals(
            result, 94999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.000000000000011111");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111111111");
        org.junit.Assert.assertEquals(
            result, 1111111111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.1011111");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2345678900000011");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.23456789000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("100011.0011110001501");
        org.junit.Assert.assertEquals(
            result, 100011
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12345678.543211");
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-55.5");
        org.junit.Assert.assertEquals(
            result, -56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("011");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0010.234567890000000601111111101345000091000000");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.1011");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654");
        org.junit.Assert.assertEquals(
            result, -87654
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9599.5");
        org.junit.Assert.assertEquals(
            result, -9600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0101.234567890000001");
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("109100");
        org.junit.Assert.assertEquals(
            result, 109100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5787.123");
        org.junit.Assert.assertEquals(
            result, -5787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.23000091");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("990.001");
        org.junit.Assert.assertEquals(
            result, 990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.1213485");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.10111");
        org.junit.Assert.assertEquals(
            result, 111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.5510111");
        org.junit.Assert.assertEquals(
            result, 112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9955");
        org.junit.Assert.assertEquals(
            result, 9955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-574321.12345");
        org.junit.Assert.assertEquals(
            result, -574321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.02789000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5.55");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-8761.0154");
        org.junit.Assert.assertEquals(
            result, -8761
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1911.9925345678221");
        org.junit.Assert.assertEquals(
            result, 1912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.00001000");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2785900000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9995100");
        org.junit.Assert.assertEquals(
            result, 9995100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("123475678.521");
        org.junit.Assert.assertEquals(
            result, 123475679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-59654321.12345");
        org.junit.Assert.assertEquals(
            result, -59654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-278900000");
        org.junit.Assert.assertEquals(
            result, -278900000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1000.00000000000000001111");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.5125345678215555");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.1234567890011111000000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("4.994999");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.00111101");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("494.9999");
        org.junit.Assert.assertEquals(
            result, 495
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("94.99999");
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("654321.123345");
        org.junit.Assert.assertEquals(
            result, 654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer(".12345");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9999955");
        org.junit.Assert.assertEquals(
            result, -9999955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-57121.12345");
        org.junit.Assert.assertEquals(
            result, -57121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99999955");
        org.junit.Assert.assertEquals(
            result, -99999955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.23456789000000002001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("654321.122345");
        org.junit.Assert.assertEquals(
            result, 654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.1");
        org.junit.Assert.assertEquals(
            result, 111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-57121.125345");
        org.junit.Assert.assertEquals(
            result, -57121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("604555.55");
        org.junit.Assert.assertEquals(
            result, 604556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.0001253456700000000000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-151.0279000");
        org.junit.Assert.assertEquals(
            result, -151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1001");
        org.junit.Assert.assertEquals(
            result, 1001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9999995");
        org.junit.Assert.assertEquals(
            result, -9999995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0010.2345678900000000091000000");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00125345678.521000000");
        org.junit.Assert.assertEquals(
            result, 125345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2300");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-99999995");
        org.junit.Assert.assertEquals(
            result, -99999995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.12314567890011111000500001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000.");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1100010.234567890001");
        org.junit.Assert.assertEquals(
            result, 1100010
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0111011");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-00009121.12345");
        org.junit.Assert.assertEquals(
            result, -9121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.5551");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.1234567890011511100000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11001");
        org.junit.Assert.assertEquals(
            result, 11001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234569100000078900000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99501015");
        org.junit.Assert.assertEquals(
            result, 99501015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000.00000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.27859000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-268555.576542345");
        org.junit.Assert.assertEquals(
            result, -268556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.234100015678900000011");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111.5510111");
        org.junit.Assert.assertEquals(
            result, 1112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0.00000099599");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00000.0000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-.27859000000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-154.949990");
        org.junit.Assert.assertEquals(
            result, -155
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.0011110");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1000.000125345670000000000000011111");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12345678.5251");
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1100010.2934567890001");
        org.junit.Assert.assertEquals(
            result, 1100010
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111.11011");
        org.junit.Assert.assertEquals(
            result, 1111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("5.51253345678215555");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("94.99991111119");
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111.511");
        org.junit.Assert.assertEquals(
            result, 112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00000099550009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.00001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.001");
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.011");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("110.00001");
        org.junit.Assert.assertEquals(
            result, 110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000000000099");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10001011");
        org.junit.Assert.assertEquals(
            result, 10001011
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00000000010");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.202789000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12345678.5431");
        org.junit.Assert.assertEquals(
            result, 12345679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("111001");
        org.junit.Assert.assertEquals(
            result, 111001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.230");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-91.011");
        org.junit.Assert.assertEquals(
            result, -91
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1911.99253452678221");
        org.junit.Assert.assertEquals(
            result, 1912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2729989000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("110010.9");
        org.junit.Assert.assertEquals(
            result, 110011
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9911.999");
        org.junit.Assert.assertEquals(
            result, 9912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("11.000001000");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9911999");
        org.junit.Assert.assertEquals(
            result, 9911999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("6045555.55");
        org.junit.Assert.assertEquals(
            result, 6045556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("01111111101");
        org.junit.Assert.assertEquals(
            result, 1111111101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.2789000000001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-9991.011");
        org.junit.Assert.assertEquals(
            result, -9991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-187654321.1345");
        org.junit.Assert.assertEquals(
            result, -187654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-268765410.000001245");
        org.junit.Assert.assertEquals(
            result, -268765410
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1000101.0011110001501");
        org.junit.Assert.assertEquals(
            result, 1000101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.2341006015678900000011");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9499");
        org.junit.Assert.assertEquals(
            result, 9499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("19111.99253452678221");
        org.junit.Assert.assertEquals(
            result, 19112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10.12345678900000000001");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1111.50111");
        org.junit.Assert.assertEquals(
            result, 1112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876514321.21234");
        org.junit.Assert.assertEquals(
            result, -876514321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("789000001.123345");
        org.junit.Assert.assertEquals(
            result, 789000001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-051.02789000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10011");
        org.junit.Assert.assertEquals(
            result, 10011
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9911.9999");
        org.junit.Assert.assertEquals(
            result, 9912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5787.1233");
        org.junit.Assert.assertEquals(
            result, -5787
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1909100");
        org.junit.Assert.assertEquals(
            result, 1909100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.23001");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1000.000000000000000001111");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer(".011");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-51.027890000");
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-268765421.0000145");
        org.junit.Assert.assertEquals(
            result, -268765421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-999.011");
        org.junit.Assert.assertEquals(
            result, -999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("100.001");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-999999955");
        org.junit.Assert.assertEquals(
            result, -999999955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000000000000000000000000000000000000000000000000000000000000000000000000000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0.000000000000000000000000000000000000000000000000000000000000000000000000000000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-0.5");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23405678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-8761.12345");
        org.junit.Assert.assertEquals(
            result, -8761
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-454.9999");
        org.junit.Assert.assertEquals(
            result, -455
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345607890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456789000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876544321.12345");
        org.junit.Assert.assertEquals(
            result, -876544321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345678900000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876654321.12345");
        org.junit.Assert.assertEquals(
            result, -876654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134560789000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23456078900000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-8765421.12345");
        org.junit.Assert.assertEquals(
            result, -8765421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2345");
        org.junit.Assert.assertEquals(
            result, -2345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-234");
        org.junit.Assert.assertEquals(
            result, -234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2345607890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654432.12345");
        org.junit.Assert.assertEquals(
            result, -87654432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134567890000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-54.9");
        org.junit.Assert.assertEquals(
            result, -55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-454.59999");
        org.junit.Assert.assertEquals(
            result, -455
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234056789000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134567899000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013945678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20345672890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12678.54321");
        org.junit.Assert.assertEquals(
            result, 12679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234055670001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer(".5");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-24345");
        org.junit.Assert.assertEquals(
            result, -24345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12678.254321");
        org.junit.Assert.assertEquals(
            result, 12678
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12678.543251");
        org.junit.Assert.assertEquals(
            result, 12679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2334");
        org.junit.Assert.assertEquals(
            result, -2334
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-23");
        org.junit.Assert.assertEquals(
            result, -23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2340567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87565421.12345");
        org.junit.Assert.assertEquals(
            result, -87565421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20304567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567890001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345678900000000000091");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-243545");
        org.junit.Assert.assertEquals(
            result, -243545
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-11.234055670001");
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.230456789000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.230304567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-21.23456789000000000013");
        org.junit.Assert.assertEquals(
            result, -21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201394567890000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134567899000000000");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-454.");
        org.junit.Assert.assertEquals(
            result, -454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23405567000");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203045678900000000901");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.0000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203456728900000000401");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-234523");
        org.junit.Assert.assertEquals(
            result, -234523
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("126784.2544321");
        org.junit.Assert.assertEquals(
            result, 126784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234560789000000000010000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-41.20134560789000000000001");
        org.junit.Assert.assertEquals(
            result, -41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-245");
        org.junit.Assert.assertEquals(
            result, -245
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2344");
        org.junit.Assert.assertEquals(
            result, -2344
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.237890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9999.99999");
        org.junit.Assert.assertEquals(
            result, 10000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2234");
        org.junit.Assert.assertEquals(
            result, -2234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.121345");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234560789000000000091");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456780900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456078900000300");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.00000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2303045678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-875654221.12345");
        org.junit.Assert.assertEquals(
            result, -875654221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12678.5432");
        org.junit.Assert.assertEquals(
            result, 12679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2435545");
        org.junit.Assert.assertEquals(
            result, -2435545
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0000001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-22234");
        org.junit.Assert.assertEquals(
            result, -22234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2345607890000000000100000700001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2303045067890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23456078900100000000100000700001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-222324");
        org.junit.Assert.assertEquals(
            result, -222324
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134567809000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.230304501");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2");
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2030456708900000000901");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.123450000000");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876654321.125345");
        org.junit.Assert.assertEquals(
            result, -876654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2312678.54325134");
        org.junit.Assert.assertEquals(
            result, -2312679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2345678900000050001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("123456678.54321");
        org.junit.Assert.assertEquals(
            result, 123456679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23405670001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203456724890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345678900000000000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2223224");
        org.junit.Assert.assertEquals(
            result, -2223224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99999.99999");
        org.junit.Assert.assertEquals(
            result, 100000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-200.00000000009");
        org.junit.Assert.assertEquals(
            result, -200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-24");
        org.junit.Assert.assertEquals(
            result, -24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23400000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.1213435");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999999999");
        org.junit.Assert.assertEquals(
            result, 999999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-8745");
        org.junit.Assert.assertEquals(
            result, -8745
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-23434");
        org.junit.Assert.assertEquals(
            result, -23434
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-22324");
        org.junit.Assert.assertEquals(
            result, -22324
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-323");
        org.junit.Assert.assertEquals(
            result, -323
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-22434");
        org.junit.Assert.assertEquals(
            result, -22434
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20139456789000000050001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.000000009009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-541.234567890000000000199999");
        org.junit.Assert.assertEquals(
            result, -541
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00005");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2312678.543251334");
        org.junit.Assert.assertEquals(
            result, -2312679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999999.99999");
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-10.00001");
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("123456678.543221");
        org.junit.Assert.assertEquals(
            result, 123456679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23456078900000050001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-22");
        org.junit.Assert.assertEquals(
            result, -22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("99.999999");
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-31.2303045067890000000001");
        org.junit.Assert.assertEquals(
            result, -31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999999.999999");
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00999.999990001");
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20131");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234560789000000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654432.1234");
        org.junit.Assert.assertEquals(
            result, -87654432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345607890000000000091");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1234566678.543221");
        org.junit.Assert.assertEquals(
            result, 1234566679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654432.212345");
        org.junit.Assert.assertEquals(
            result, -87654432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234056711");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-299.9999992434");
        org.junit.Assert.assertEquals(
            result, -300
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23030450678900000030001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23456078900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-454.59");
        org.junit.Assert.assertEquals(
            result, -455
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567289000200000401");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234105678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5.555");
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-87654321.12145");
        org.junit.Assert.assertEquals(
            result, -87654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-877654321.12345");
        org.junit.Assert.assertEquals(
            result, -877654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345670809000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-11.201");
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-224");
        org.junit.Assert.assertEquals(
            result, -224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-544.95999");
        org.junit.Assert.assertEquals(
            result, -545
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2101");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456708090008000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-243554500");
        org.junit.Assert.assertEquals(
            result, -243554500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876754321.12134335");
        org.junit.Assert.assertEquals(
            result, -876754321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5944.95999");
        org.junit.Assert.assertEquals(
            result, -5945
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23456078900000000000091");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000.00000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-41.0000001");
        org.junit.Assert.assertEquals(
            result, -41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234560578900000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-24341");
        org.junit.Assert.assertEquals(
            result, -24341
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234560789000000000000091");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23030567890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345060578900000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013435678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.230305678890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234500000");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-875654221.123445");
        org.junit.Assert.assertEquals(
            result, -875654221
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2341050678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201394567890");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2021345678900000000000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23457890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567289");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876543211.121345");
        org.junit.Assert.assertEquals(
            result, -876543211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23435678900000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.230405670001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5000054.99999");
        org.junit.Assert.assertEquals(
            result, -5000055
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-872654321.121345");
        org.junit.Assert.assertEquals(
            result, -872654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203456728890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013645678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2222324");
        org.junit.Assert.assertEquals(
            result, -2222324
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5941.23450000095999");
        org.junit.Assert.assertEquals(
            result, -5941
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2304567890000000901");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-13.234056789000000000001");
        org.junit.Assert.assertEquals(
            result, -13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("01.23456078900000000");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-45554.59");
        org.junit.Assert.assertEquals(
            result, -45555
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("12678.85432");
        org.junit.Assert.assertEquals(
            result, 12679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2312678.5432511334");
        org.junit.Assert.assertEquals(
            result, -2312679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20345678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-2424345");
        org.junit.Assert.assertEquals(
            result, -2424345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2134560789000000000010000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("000001.234560789000000000000911");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-454.99");
        org.junit.Assert.assertEquals(
            result, -455
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23456001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-871.12345");
        org.junit.Assert.assertEquals(
            result, -871
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.234560789000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234560789001000000001000007600001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23030456789000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-8765421.122345");
        org.junit.Assert.assertEquals(
            result, -8765421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345678909000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-812345");
        org.junit.Assert.assertEquals(
            result, -812345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203045607890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-594.9999");
        org.junit.Assert.assertEquals(
            result, -595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-594.9");
        org.junit.Assert.assertEquals(
            result, -595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876654321.142345");
        org.junit.Assert.assertEquals(
            result, -876654321
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23456078900000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("9999999");
        org.junit.Assert.assertEquals(
            result, 9999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-871.125");
        org.junit.Assert.assertEquals(
            result, -871
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-21.234567890000000003");
        org.junit.Assert.assertEquals(
            result, -21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456789000000000000091");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5944.959999");
        org.junit.Assert.assertEquals(
            result, -5945
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2345300000");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-11.2343055670001");
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034560728900000000401");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("61.23435678900000000001");
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20134569078900000300");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567248900005000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("999999");
        org.junit.Assert.assertEquals(
            result, 999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.20345672890000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("012678.543210");
        org.junit.Assert.assertEquals(
            result, 12679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203456789000000100001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567248900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00.000000000009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-455554.59");
        org.junit.Assert.assertEquals(
            result, -455555
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-29999934");
        org.junit.Assert.assertEquals(
            result, -29999934
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-244");
        org.junit.Assert.assertEquals(
            result, -244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-11.234305567004301");
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.234000000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-876543211.1215");
        org.junit.Assert.assertEquals(
            result, -876543211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201394567890000000000");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.00000010001");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201394567890000000050001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-23126578.54325134");
        org.junit.Assert.assertEquals(
            result, -23126579
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1234566178.54321");
        org.junit.Assert.assertEquals(
            result, 1234566179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013945678900000000050001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1234566781.543221");
        org.junit.Assert.assertEquals(
            result, 1234566782
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5944.995999");
        org.junit.Assert.assertEquals(
            result, -5945
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0000000001.2345607890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("991.23453000009999999");
        org.junit.Assert.assertEquals(
            result, 991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-000052");
        org.junit.Assert.assertEquals(
            result, -52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23045678900000901");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-594.99949");
        org.junit.Assert.assertEquals(
            result, -595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-10.0000");
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-23126781.543251334");
        org.junit.Assert.assertEquals(
            result, -23126782
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456789090000000900001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.23141050678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-45.59");
        org.junit.Assert.assertEquals(
            result, -46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("54.9");
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("00000");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2011");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-22312678.543251334");
        org.junit.Assert.assertEquals(
            result, -22312679
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-5954.9999");
        org.junit.Assert.assertEquals(
            result, -5955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0.0009");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-991.23453000009999999001");
        org.junit.Assert.assertEquals(
            result, -991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.21345607890000000000100000000011");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.201345670809000000000999999001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("100901");
        org.junit.Assert.assertEquals(
            result, 100901
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.2304567890000000001");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("1.23400091");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("123456378.54321");
        org.junit.Assert.assertEquals(
            result, 123456379
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.203045670890000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2013456750809000000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567890");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2034567289000000000401");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-1.2345678900000000001");
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
}



