package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_TRIANGLE_AREA {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 3);
        org.junit.Assert.assertEquals(
            result, 7.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(2, 2);
        org.junit.Assert.assertEquals(
            result, 2.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 8);
        org.junit.Assert.assertEquals(
            result, 40.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 6);
        org.junit.Assert.assertEquals(
            result, 12.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(7, 2);
        org.junit.Assert.assertEquals(
            result, 7.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(12, 5);
        org.junit.Assert.assertEquals(
            result, 30.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 4);
        org.junit.Assert.assertEquals(
            result, 6.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 10);
        org.junit.Assert.assertEquals(
            result, 30.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(9, 12);
        org.junit.Assert.assertEquals(
            result, 54.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(15, 20);
        org.junit.Assert.assertEquals(
            result, 150.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(25, 30);
        org.junit.Assert.assertEquals(
            result, 375.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1, 1);
        org.junit.Assert.assertEquals(
            result, 0.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 7);
        org.junit.Assert.assertEquals(
            result, 35.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(30, 30);
        org.junit.Assert.assertEquals(
            result, 450.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(12, 4);
        org.junit.Assert.assertEquals(
            result, 24.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 25);
        org.junit.Assert.assertEquals(
            result, 325.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1, 4);
        org.junit.Assert.assertEquals(
            result, 2.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 7);
        org.junit.Assert.assertEquals(
            result, 14.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(19, 20);
        org.junit.Assert.assertEquals(
            result, 190.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 6);
        org.junit.Assert.assertEquals(
            result, 18.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 1);
        org.junit.Assert.assertEquals(
            result, 5.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(20, 20);
        org.junit.Assert.assertEquals(
            result, 200.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(12, 12);
        org.junit.Assert.assertEquals(
            result, 72.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 5);
        org.junit.Assert.assertEquals(
            result, 15.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(7, 7);
        org.junit.Assert.assertEquals(
            result, 24.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 12);
        org.junit.Assert.assertEquals(
            result, 24.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 10);
        org.junit.Assert.assertEquals(
            result, 50.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(19, 12);
        org.junit.Assert.assertEquals(
            result, 114.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 11);
        org.junit.Assert.assertEquals(
            result, 143.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(2, 11);
        org.junit.Assert.assertEquals(
            result, 11.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(11, 7);
        org.junit.Assert.assertEquals(
            result, 38.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 19);
        org.junit.Assert.assertEquals(
            result, 47.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 2);
        org.junit.Assert.assertEquals(
            result, 6.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 12);
        org.junit.Assert.assertEquals(
            result, 156.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1, 25);
        org.junit.Assert.assertEquals(
            result, 12.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(16, 15);
        org.junit.Assert.assertEquals(
            result, 120.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 3);
        org.junit.Assert.assertEquals(
            result, 6.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(9, 9);
        org.junit.Assert.assertEquals(
            result, 40.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(12, 13);
        org.junit.Assert.assertEquals(
            result, 78.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 11);
        org.junit.Assert.assertEquals(
            result, 33.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(15, 21);
        org.junit.Assert.assertEquals(
            result, 157.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 16);
        org.junit.Assert.assertEquals(
            result, 48.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 30);
        org.junit.Assert.assertEquals(
            result, 435.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 29);
        org.junit.Assert.assertEquals(
            result, 420.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 4);
        org.junit.Assert.assertEquals(
            result, 8.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 15);
        org.junit.Assert.assertEquals(
            result, 45.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(21, 30);
        org.junit.Assert.assertEquals(
            result, 315.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 26);
        org.junit.Assert.assertEquals(
            result, 338.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 7);
        org.junit.Assert.assertEquals(
            result, 17.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(13, 12);
        org.junit.Assert.assertEquals(
            result, 78.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(19, 19);
        org.junit.Assert.assertEquals(
            result, 180.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(11, 11);
        org.junit.Assert.assertEquals(
            result, 60.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 21);
        org.junit.Assert.assertEquals(
            result, 63.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1, 16);
        org.junit.Assert.assertEquals(
            result, 8.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(8, 7);
        org.junit.Assert.assertEquals(
            result, 28.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(20, 19);
        org.junit.Assert.assertEquals(
            result, 190.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 20);
        org.junit.Assert.assertEquals(
            result, 50.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(15, 15);
        org.junit.Assert.assertEquals(
            result, 112.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 10);
        org.junit.Assert.assertEquals(
            result, 20.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(9, 10);
        org.junit.Assert.assertEquals(
            result, 45.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 10);
        org.junit.Assert.assertEquals(
            result, 145.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(27, 26);
        org.junit.Assert.assertEquals(
            result, 351.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(15, 8);
        org.junit.Assert.assertEquals(
            result, 60.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(14, 15);
        org.junit.Assert.assertEquals(
            result, 105.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 2);
        org.junit.Assert.assertEquals(
            result, 3.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(13, 13);
        org.junit.Assert.assertEquals(
            result, 84.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 9);
        org.junit.Assert.assertEquals(
            result, 18.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(25, 25);
        org.junit.Assert.assertEquals(
            result, 312.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(14, 6);
        org.junit.Assert.assertEquals(
            result, 42.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 7);
        org.junit.Assert.assertEquals(
            result, 21.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 15);
        org.junit.Assert.assertEquals(
            result, 217.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(15, 13);
        org.junit.Assert.assertEquals(
            result, 97.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(13, 20);
        org.junit.Assert.assertEquals(
            result, 130.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(11, 26);
        org.junit.Assert.assertEquals(
            result, 143.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(11, 8);
        org.junit.Assert.assertEquals(
            result, 44.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 15);
        org.junit.Assert.assertEquals(
            result, 195.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(20, 22);
        org.junit.Assert.assertEquals(
            result, 220.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 3);
        org.junit.Assert.assertEquals(
            result, 4.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 14);
        org.junit.Assert.assertEquals(
            result, 21.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(11, 10);
        org.junit.Assert.assertEquals(
            result, 55.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 11);
        org.junit.Assert.assertEquals(
            result, 27.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(26, 13);
        org.junit.Assert.assertEquals(
            result, 169.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(20, 16);
        org.junit.Assert.assertEquals(
            result, 160.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 13);
        org.junit.Assert.assertEquals(
            result, 188.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 6);
        org.junit.Assert.assertEquals(
            result, 15.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 12);
        org.junit.Assert.assertEquals(
            result, 18.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 21);
        org.junit.Assert.assertEquals(
            result, 52.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(16, 20);
        org.junit.Assert.assertEquals(
            result, 160.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(8, 21);
        org.junit.Assert.assertEquals(
            result, 84.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(21, 14);
        org.junit.Assert.assertEquals(
            result, 147.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(8, 10);
        org.junit.Assert.assertEquals(
            result, 40.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(14, 14);
        org.junit.Assert.assertEquals(
            result, 98.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(7, 3);
        org.junit.Assert.assertEquals(
            result, 10.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 4);
        org.junit.Assert.assertEquals(
            result, 10.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(29, 26);
        org.junit.Assert.assertEquals(
            result, 377.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(2, 3);
        org.junit.Assert.assertEquals(
            result, 3.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(12, 28);
        org.junit.Assert.assertEquals(
            result, 168.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(2, 14);
        org.junit.Assert.assertEquals(
            result, 14.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(21, 20);
        org.junit.Assert.assertEquals(
            result, 210.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(27, 4);
        org.junit.Assert.assertEquals(
            result, 54.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(30, 29);
        org.junit.Assert.assertEquals(
            result, 435.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(25, 21);
        org.junit.Assert.assertEquals(
            result, 262.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000000, 500000000);
        org.junit.Assert.assertEquals(
            result, 1.25e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 5);
        org.junit.Assert.assertEquals(
            result, 10.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 9);
        org.junit.Assert.assertEquals(
            result, 2250000004.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 5);
        org.junit.Assert.assertEquals(
            result, 7.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1001, 1001);
        org.junit.Assert.assertEquals(
            result, 501000.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 5);
        org.junit.Assert.assertEquals(
            result, 12.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1000, 1000);
        org.junit.Assert.assertEquals(
            result, 500000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(3, 1000);
        org.junit.Assert.assertEquals(
            result, 1500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(8, 8);
        org.junit.Assert.assertEquals(
            result, 32.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(999, 500000000);
        org.junit.Assert.assertEquals(
            result, 249750000000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 4);
        org.junit.Assert.assertEquals(
            result, 20.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1000, 1001);
        org.junit.Assert.assertEquals(
            result, 500500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(8, 4);
        org.junit.Assert.assertEquals(
            result, 16.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000002, 500000001);
        org.junit.Assert.assertEquals(
            result, 1.2500000075e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000002, 500000000);
        org.junit.Assert.assertEquals(
            result, 1.250000005e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000002, 9);
        org.junit.Assert.assertEquals(
            result, 2250000009.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(9, 6);
        org.junit.Assert.assertEquals(
            result, 27.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 500000000);
        org.junit.Assert.assertEquals(
            result, 1.2499999975e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000000, 499999999);
        org.junit.Assert.assertEquals(
            result, 1.2499999975e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 499999999);
        org.junit.Assert.assertEquals(
            result, 1.25e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 3);
        org.junit.Assert.assertEquals(
            result, 15.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 999);
        org.junit.Assert.assertEquals(
            result, 4995.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 499999999);
        org.junit.Assert.assertEquals(
            result, 1.249999995e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 500000000);
        org.junit.Assert.assertEquals(
            result, 1000000000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 500000000);
        org.junit.Assert.assertEquals(
            result, 1500000000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 500000001);
        org.junit.Assert.assertEquals(
            result, 1500000003.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 500000001);
        org.junit.Assert.assertEquals(
            result, 1.250000005e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 1001);
        org.junit.Assert.assertEquals(
            result, 250250000500.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 1000);
        org.junit.Assert.assertEquals(
            result, 249999999500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 5);
        org.junit.Assert.assertEquals(
            result, 1249999997.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1002, 1001);
        org.junit.Assert.assertEquals(
            result, 501501.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 1002);
        org.junit.Assert.assertEquals(
            result, 250500000501.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 499999998);
        org.junit.Assert.assertEquals(
            result, 1.2499999975e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 1000);
        org.junit.Assert.assertEquals(
            result, 3000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000000, 1001);
        org.junit.Assert.assertEquals(
            result, 250250000000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 10);
        org.junit.Assert.assertEquals(
            result, 2499999995.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(999, 499999998);
        org.junit.Assert.assertEquals(
            result, 249749999001.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000003, 500000002);
        org.junit.Assert.assertEquals(
            result, 1.2500000125e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(999, 499999999);
        org.junit.Assert.assertEquals(
            result, 249749999500.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000003, 499999998);
        org.junit.Assert.assertEquals(
            result, 1.2500000025e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1001, 10);
        org.junit.Assert.assertEquals(
            result, 5005.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 500000000);
        org.junit.Assert.assertEquals(
            result, 1.2500000025e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(4, 500000001);
        org.junit.Assert.assertEquals(
            result, 1000000002.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999999, 999);
        org.junit.Assert.assertEquals(
            result, 249749999500.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999997, 499999997);
        org.junit.Assert.assertEquals(
            result, 1.249999985e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1000, 10);
        org.junit.Assert.assertEquals(
            result, 5000.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 3);
        org.junit.Assert.assertEquals(
            result, 750000001.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 499999999);
        org.junit.Assert.assertEquals(
            result, 1249999997.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(6, 1002);
        org.junit.Assert.assertEquals(
            result, 3006.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(499999998, 499999999);
        org.junit.Assert.assertEquals(
            result, 1.2499999925e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1001, 3);
        org.junit.Assert.assertEquals(
            result, 1501.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(999, 999);
        org.junit.Assert.assertEquals(
            result, 499000.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000003, 1000);
        org.junit.Assert.assertEquals(
            result, 250000001500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 500000001);
        org.junit.Assert.assertEquals(
            result, 1250000002.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 1000);
        org.junit.Assert.assertEquals(
            result, 250000000500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(999, 10);
        org.junit.Assert.assertEquals(
            result, 4995.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000000, 500000001);
        org.junit.Assert.assertEquals(
            result, 1.2500000025e+17, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1000, 999);
        org.junit.Assert.assertEquals(
            result, 499500.0, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(500000001, 5);
        org.junit.Assert.assertEquals(
            result, 1250000002.5, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(1001, 1000);
        org.junit.Assert.assertEquals(
            result, 500500.0, 1e-6
        );
    }
}

