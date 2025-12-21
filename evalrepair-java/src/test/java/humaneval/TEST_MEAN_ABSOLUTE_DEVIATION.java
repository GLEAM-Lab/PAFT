package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_MEAN_ABSOLUTE_DEVIATION {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6666666666666666) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,4.5,0.0,2.5,-3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.32) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0,2.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,-1.0,0.0,1.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6666666666666666) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,7.5,-5.5,7.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 6.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,-3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.12) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.24573046924300002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,-3.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.625) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.888888888888889) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625,10.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.18805903258392803) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625,10.0,10.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.1679798129590817) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625,10.0,10.0,9.985189420898806,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.15131978153021683) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,1.0,1.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,7.5,-5.5,10.416066198571809))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 7.229016549642952) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,1.0,1.0,2.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8333333333333334) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0,2.0,2.0,2.0,1.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,8.006967641333711,-5.5,10.416066198571809))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 7.35575845997638) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,4.5,0.0,2.5,-3.0,-5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,1.0,1.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,5.049334549043888))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.8935004558914579) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625,10.0,10.0,10.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.9563479576201392) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.777777777777778) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.6403752298016823,2.0,-1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6978611621781516) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,1.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.96) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,5.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,5.0,-1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.375) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,4.5,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,1.0,-0.14848795937485382))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8237580734999765) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,5.049334549043888,5.049334549043888))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.524667274521944) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,2.0,-2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.469387755102041) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,4.5,0.0,2.5,7.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.6399999999999997) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.6403752298016823,-1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8201876149008411) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,1.0,-0.14848795937485382,-5.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.9410014743622628) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.222222222222222) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,2.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.48) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(7.5,-5.5,10.416066198571809,10.416066198571809))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 5.604016549642953) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,5.0,9.232092283615625,4.556069003616063))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.72610580595707) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,1.4955482911935327))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6656773980430073) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,5.0,0.0,5.7682420395965925))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.39294267546591) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(7.5,-5.5,10.416066198571809,10.416066198571809,10.416066198571809))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4.859855887657234) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,9.232092283615625))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.2879653936441402) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.2120988051006742,0.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.95286693219985) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.4267204433287306))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.2133602216643653) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.416066198571809,-1.0,1.0,1.0,-0.14848795937485382,-5.5,4.0,0.0868013662924878))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.988117824299862) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,2.0,-2.0,2.7500345836492754,1.2120988051006742))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2820806611728368) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,2.0,-0.14848795937485382))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.09152815497446) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,2.0,2.0,2.0,1.410033320598176,2.0402809275768705,2.4726166299065415))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.4527664396706049) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.4267204433287306,2.4267204433287306))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.18965353036832466) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,10.416066198571809))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4.629362754920804) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.5,1.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.4444444444444444) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,-3.0,4.0,5.0,-3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,1.0,-0.14848795937485382,-5.5,4.0,-0.21656423755989618))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.7001513565373672) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,-0.14848795937485382))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1441084354166342) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.6403752298016823,2.0,-0.6846214759932707,-2.6403752298016823))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6490322459025233) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,0.0,0.0,5.0,0.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4444444444444444) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0,2.0,2.0,2.0,1.0,10.0,10.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.7600000000000002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,0.0,0.0,5.0,0.0,0.0,0.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.125) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,4.5,2.5,-3.0,-5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.2) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,-0.14848795937485382,-5.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.058585340104191) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,0.0868013662924878,0.0868013662924878,0.0868013662924878))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5299494876403171) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0540014624285938,2.0,10.416066198571809,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.537775007268002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,-0.14848795937485382,2.9190756023754556))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1665547347602114) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,5.604766823261059,5.049334549043888))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.6635253430762367) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0,5.0,5.7682420395965925))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.3929426754659096) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,-0.21656423755989618,-0.14848795937485382,-5.5,4.0,-0.21656423755989618))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.5860984592661267) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,2.0,2.0,2.0,2.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.489795918367347) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.0,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.25) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,9.232092283615625,10.0,10.0,9.985189420898806,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.1675169823621694) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.4267204433287306,2.4267204433287306,2.4267204433287306))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.16002016624827387) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0,4.556069003616063))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4579420811571402) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,7.5,-5.5,10.416066198571809,-5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 6.939855887657235) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,5.049334549043888,-0.6846214759932707))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6705567737735059) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.4267204433287306,2.4267204433287306,2.4267204433287306,1.410033320598176,3.3687304220687535))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.4254250123176215) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,7.5,-5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 5.777777777777778) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,2.0,2.5567212714240335))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0477617883376367) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,5.0,-2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,0.0,0.0,5.0,0.0,0.0,0.0,0.0,0.0,-1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9400000000000001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-1.0,1.0,-0.21656423755989618,-0.14848795937485382,-5.5,4.0,-6.4523436914092915))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.40574867983082) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,8.006967641333711,-5.5,10.416066198571809,-5.463621965026399))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 7.055707635981548) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.6403752298016823,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.320187614900841) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-0.21656423755989618,0.0,2.5,-3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.3253497219904165) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.5,2.5,-3.0,-5.5,-5.174476065704185))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.8679161705126694) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,10.0,10.0,10.0,9.232092283615625,-6.4523436914092915))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4.527433930036782) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0540014624285938,2.0,10.416066198571809,5.049334549043888,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.2403364134163426) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.5,2.5,-3.0,-5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 3.875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-5.5,7.5,4.0,9.985189420898806))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4.748148677612351) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-2.0,1.0,1.0,2.0,2.0,1.4023465069741052,-2.0,2.7500345836492754,1.2120988051006742,-2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.5218687937434432) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 100000000.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.70247933884297) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.1518518518518518) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.0,7.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.003,0.004,0.005,9999.995,9999.996,9999.997,9999.998,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4999.997) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.33074793) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,300000000.0,99999999.88224646,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116666666.01962559) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116666666.66666667) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.0,6.5,7.5,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.25) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.31999999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7346938775510203) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.074380165289256) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.22222222222222) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.0,6.5,7.5,10.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2244897959183674) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,1.7968360300361357,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7595710983629222) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,2.0,60.0,50.51467930227886,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.748532069772118) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.082840236686394) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.10249999999999992) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0555555555555556) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,4.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7346938775510203) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.619834710743802) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1413.550153846154) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.721327344912485) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65800002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,99999999.88224646,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111999999.37884057) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,58.67263492064459,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.03079627443344) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.5,3.1148637087934263))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6263098418930727) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.702273665674365) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.703125) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,3.05,3.1,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.23009145525784924) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,1.5,2.0,2.5,3.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 87499999.375) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,9999.999,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.1149679001876) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.003293898078466) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10000.702716116059,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.2224800845852) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.925925925925924) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.73611111111111) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,2.7025347144325655,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104938271.23084855) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,80.0,2.0,2.5,3.0,3.5,4.0,50.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 19.86) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7346938775510203) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,2.99,3.01,3.05,3.1,3.25,2.9))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.10123456790123456) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,99999999.88224646,400000000.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111111110.23530595) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.004,50.0,60.0,70.0,80.0,90.0,100.0,2.0,9999.998,4.0,5.0,2.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1321.2752040816326) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.24999999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,1.654732131931256,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.793158483508593) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,3.05,3.1,3.9174287938154095,3.25,2.9))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.21854548027616325) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.1148637087934263))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6024772847989044) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.25) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.74999999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 61111103.291666664) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7363549979314951) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.5,3.0,3.5,4.0,3.098997828558572,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6039589177826823) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,80.0,2.0,2.5,3.0,3.5,4.0,50.0,3.5,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 18.46280991735537) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,60.0,80.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.33333333333333) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,10.0,20.0,30.0,40.0,50.0,60.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 71999990.4) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.92592592592593) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,38.50410272414793,100.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.983064192646488) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.2) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,29.42670336259685,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.74965355306306) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,100.0,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.19453244209735) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,200000000.0,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 55554999.33355555) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,90.0,99.32299855953764,100.0,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.49465267774567) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1320.3570102040824) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,200000000.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 63999199.28032) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,3.01,3.05,3.1,3.25,2.9))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.11374999999999996) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,2.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.92592592592593) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.18181818181818) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,4.0,99999999.88224646,400000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 143999999.37884057) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,100.0,2.0,100.0,4.0,5.0,2.0,2.0,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 39.00826446280991) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,3.098997828558572,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.34962898316818) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,70.0,80.0,3.098997828558572,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.55208017371531) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,10.0,20.0,30.0,70.32312812754411,40.0,50.0,60.0,70.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.472787448557366) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.5,3.1148637087934263,3.1148637087934263))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5967563868138965) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,3.0,2.99,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.441199999999995) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.446280991735534) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.4443200000003) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,3.5,4.0,3.0,2.109160016548039))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6574498732744615) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,100000000.0,200000000.0,4.0,99999999.88224646,400000000.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 97959183.0300207) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,9999.999,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1410.8198424711654) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.003,0.004,0.005,9999.995,9999.996,9999.997,9999.998,10000.381530384688))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 5000.035253038469) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0,100000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 115625000.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.000058830521493,60.0,80.0,3.25,90.0,100.0,2.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.29999529355828) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.000058830521493,60.0,80.0,3.25,90.0,100.0,2.0,4.0,5.0,2.0,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.239665531866336) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,389139843.14684427,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 114856640.52447404) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,3.5,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7799737098300886) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.2604224241965685,1.5,70.32312812754411,2.0,2.5,3.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 12.190771414143043) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.8874862541396014,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.14350164950324779) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,1.654732131931256,2.5,3.0,105.71131118650902,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 20.346561910126937) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.95,2.99,3.01,3.05,3.1,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.24332278426894968) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,60.0,80.0,90.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.63265306122449) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,0.003,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.90052892561984) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.051350691620275) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,389139843.14684427,100000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116594260.1056072) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,144647566.04988787,400000000.0,389139843.14684427,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111127211.20153931) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,99.32299855953764,50.0,60.0,70.0,80.0,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.93229985595376) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,67.843815042106,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.69611301235235) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.02555078040559666,0.004,0.005,9999.995,9999.996,9999.997,9999.998,10000.381530384688,9999.998))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4958.704171028777) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,98.8500430921985,100.0,2.0,100.0,4.0,5.0,50.0,1.0,2.0,99.32299855953764))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.597439699054036) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,80.0,30.0,50.51467930227886,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.75061031712937) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,4.0,1.8777897434625945,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9561600381642698) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.92218881583286) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,2.75,2.95,2.8874862541396014,2.99,3.01,3.05,3.1,3.25,2.8874862541396014))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35999999.46250055) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,10.0,20.0,30.0,70.32312812754411,40.0,50.0,60.0,70.0,90.0,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.860094010628675) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.861421052674434) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,99.32299855953764,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.37228686051389) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,2.0,60.0,50.51467930227886,70.0,80.0,90.0,2.567418340479382,389139843.14684427))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 64320627.874154456) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,9999.999,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1410.9538941289093) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,100.0,2.0,3.098997828558572,100.0,4.0,5.0,2.0,2.0,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 39.32508351428679) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,4.0,1.8777897434625945,3.5,4.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9770368374009845) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,1.1592059112460973,2.5,3.0,3.5,3.1148637087934263))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7635823461794241) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,300000000.0,144647566.04988787,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 109225404.99168535) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 75645481.59026219) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.67455621301775) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.25,10.0,20.0,80.0,30.0,50.51467930227886,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.35294339147676) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,50.0,60.0,70.0,80.10367424442046,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.235021511656846) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.0,6.5,7.5,10.31119115924337,7.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.140145856233882) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,2.0,60.0,50.51467930227886,70.0,80.0,2.8874862541396014,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.64873518986044) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1800000000000002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,3.5,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9199605647451327) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 125925925.92592594) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100.03327743022699,50.0,1.0,70.0,80.0,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,33.01214550051202,2.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.85579102407819) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,38.50410272414793,100.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.874658106321) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,5.0,100.0,60.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.68639053254438) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.1148637087934263,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5289573402111716) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.177796669110723,6.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.6069491672776808) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,326309516.59178865,400000000.0,100000000.0,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116828335.3817023) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,9999.999,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.4905050705463) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.999,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,58.67263492064459))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1517.9533851410936) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,98.8500430921985,100.0,5.0,2.0,50.0,67.843815042106,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.129814090787253) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,10000.381530384688,60.0,70.0,80.0,90.0,100.0,50.66963449602627,1.0,2.0,3.0,5.0,100.0,60.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1237.7215270301292) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.183673469387756) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,326309516.59178865,400000000.0,244992351.53341857,100000000.0,38.50410272414793,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116162165.55753273) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.086843866079424,1.5,2.0,2.5,3.0,3.1148637087934263,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6247685836527103) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.178049360544698,9999.996,200000000.0,3.5,5442.05326006151,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 55554697.18181614) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.178049360544698,9999.996,200000000.0,400000000.0,3.5,5442.05326006151,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 122447718.30797473) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,400000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 100000000.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.999,59.21352436744138,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,58.67263492064459))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1411.0464994768192) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,1.2604224241965685,60.0,70.0,80.0,2.0,100.0,4.0,5.0,2.0,2.0,1.2604224241965685))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.470953063978165) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,6.393816185538867,5.5,6.0,6.5,7.5,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1762674058523837) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,9999.996,2.0,3.0,5.0,100.0,60.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1236.3550577777776) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,6.0,400000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 130612244.1632653) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99999999.88224646,60.0,70.0,90.0,99.32299855953764,100.0,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 15277769.671968227) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,2.99,3.05,3.1,2.6779794490678,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.139002568866525) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.0,6.5,7.5,11.053466235242924,10.31119115924337,7.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4944777178884836) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,4.0,3.5,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,2.0465378224234207,3.5,4.0,3.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6344302161028541) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,80.0,2.0,2.5,3.0,3.5,4.0,50.0,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 17.222222222222225) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.654732131931256,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7769715756818869) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.1148637087934263,5.5,3.0,1.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8631964156833014) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0,80.0,30.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.214024474887083) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100.03327743022699,50.0,1.0,0.02555078040559666,70.0,80.0,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,33.01214550051202,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.583720808450366) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,389139843.14684427,100000000.0,200000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104349362.14642356) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.000058830521493,60.0,80.0,3.25,90.0,100.0,2.0,4.0,50.66963449602627,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.44195756655047) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(58.00000593868845,0.002,10.0,20.0,30.0,70.32312812754411,40.0,50.0,60.0,70.0,90.0,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.61449472659639) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1319.9488469387748) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,99.23067676029065,4.0,5.0,2.0,50.0,2.0,50.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.4511584287968) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,1.860855894192014,2.5,3.0,9999.999,4.0,3.098997828558572,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2186.922910821164) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,50.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.095988953908993) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,99999999.88224646,400000000.0,105.71131118650902,67156047.58717318,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 95802739.92620432) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,3.01,3.05,3.1,3.25,2.9,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.12400000000000003) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.211386967102,60.0,80.0,4.677927171701372,90.0,100.0,2.0,4.0,51.538678895195,50.66963449602627,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.96207739046754) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,2.722350268490859,2.0465378224234207,3.5,4.0,3.0,3.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5558592565229733) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,199999999.80664238,300000000.0,326309516.59178865,400000000.0,244992351.53341857,100000000.0,38.50410272414793,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 116162165.57351269) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,2.0,100.0,4.0,5.0,2.0,50.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.53719008264463) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.4168467628,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1524.914684614995) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.5,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.3199999999999998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,6.393816185538867,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4022632623349438) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,53.141327018040194,80.0,90.0,38.50410272414793,100.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.12803837916219) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.4168467628,30.0,40.0,60.0,70.0,80.0,90.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1640.9982500445042) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,10000.381530384688,60.0,70.0,80.0,90.0,100.0,50.66963449602627,1.0,2.0,3.0,5.0,100.0,60.0,90.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1165.9613540724552) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,199999999.1783595,200000000.0,4.0,99999999.88224646,400000000.8417644,4.0,200000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99999999.01723468) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,3.01,3.05,3.1,3.25,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7653125000000002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.926034094861598,2.75,2.9,2.95,2.99,3.05,3.1,2.6779794490678,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.2395621289374367) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.000058830521493,60.0,80.0,3.25,90.0,100.0,1.8745816509527913,2.0,4.0,99.15854930176937,50.66963449602627,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.80862860969345) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1413.786840236686) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,10.31119115924337,100.0,1.0,2.0,3.0,5.0,100.0,60.0,90.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.81787085089825) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,2.7025347144325655,60.0,70.0,80.0,90.0,99.32299855953764,100.0,1.3260530476744576,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.592457914102184) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.000058830521493,60.0,80.0,3.25,90.0,100.0,1.8745816509527913,2.0465378224234207,4.0,99.15854930176937,50.66963449602627,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.804750457824824) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,29.42670336259685,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.305900666005247) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.857988165680474) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,98.8500430921985,100.0,5.0,2.0,50.0,67.843815042106,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.838399477610484) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,2.75,2.95,4.0,2.99,3.01,3.05,3.1,3.25,2.8874862541396014))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35999999.44025028) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.4576681,400000000.0,400000000.0,100000000.0,100000000.0,100000000.0,200000000.0,200000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94000000.06407355) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,1.5,100.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,50.0,70.0,80.0,90.0,100.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.92218881583286) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.72) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,62.42198837120362,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 20.242198837120362) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,3.098997828558572,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,78.68590989376426,90.0,100.0,50.51467930227886,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.66514052780218) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.0,1.5,8.0,2.0,2.5,3.0,2.0465378224234207,3.5,4.0,3.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1120251800857117) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,99999999.88224646,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104000000.01884057) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,50.82476780440175,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.404497764194566) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,90.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.916666666666664) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.594410940003277,60.0,70.0,80.0,90.0,99.32299855953764,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.6313071696898) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.0,1.5,8.0,2.0,2.5,3.0,7.5,2.0465378224234207,3.5,4.0,3.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4955882679776826) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.0,7.5,3.25,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.346938775510204) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,79.0638059804664,90.0,99.32299855953764,100.0,2.0,81.08813381399271,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.116315163472) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,400000000.0,389139843.14684427,100000000.0,200000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 120675892.75866845) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.4168467628,30.0,40.0,60.0,70.0,80.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1775.8422670486193) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(105.71131118650902,20.0,30.0,40.0,2.0,60.0,50.51467930227886,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.660636035022677) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,9999.997,100.0,2.0,100.0,4.0,5.0,2.0,2.0,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1645.8672727272728) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,29.42670336259685,2.109160016548039,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.01919960660627) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,9999.999,30.0,40.0,60.0,70.0,80.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.1149679001876) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 118367346.93877551) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.883843468527003,2.95,2.99,3.01,3.05,3.1,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.23340845326694945) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.70247933884297) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,50.66963449602627,1.0,2.0,3.0,5.0,100.0,60.0,3.01,90.0,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.85846319949816) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,2.7025347144325655,60.0,70.0,80.0,90.0,99.32299855953764,100.0,1.3260530476744576,100.0,4.0,98.8500430921985,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.26206746191375) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,3.05,2.0465378224234207,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.2634758781594931) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,3.0,1.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.56944444444445) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,300000000.0,400000000.0,389139843.14684427,100000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 131523307.19114071) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,300000000.4576681,200000000.0,300000000.0,99999999.88224646,400000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 106122449.0548579) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.3852814948719425,2.95,3.01,3.05,3.1,1.654732131931256,2.9,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.3309980922475523) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,9999.997,2.0,2.5,3.0,3.1148637087934263,2.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2448.3006994404573) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,4.0,199999999.76194745,99999999.88224646,400000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 122222221.81731178) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,99.23067676029065,40.0,50.0,60.0,70.0,80.10367424442046,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.933435100471108) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.999,59.21352436744138,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,58.67263492064459,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2433.335289914107) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,62.42198837120362,30.0,40.0,50.0,60.0,70.0,80.0,67.843815042106,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 19.03023168705038) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,300000000.4576681,2.95,2.99,3.01,3.05,3.1,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 49586776.43238434) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,70.0,20.0,30.0,40.0,50.0,70.0,50.66963449602627,80.0,90.0,100.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.87935447185853) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,98.8500430921985,100.0,2.0,144647566.04988787,4.0,5.0,51.57851300983106,50.0,1.0,2.0,99.32299855953764,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 15179059.62823173) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,4.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0236348389340075) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,9999.999,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0,90.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1318.3089356001383) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,2.0,60.0,50.51467930227886,30.0,70.0,14.387809343061292,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.17723916326813) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,80.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.326530612244895) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,339837993.58006203,326309516.59178865,400000000.0,100000000.0,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 121746606.19405563) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.584596847562561,1.8521371502623292,2.5,2.75,2.95,2.99,3.01,3.05,3.2759247382344467,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.36705812440269187) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,70.32312812754411,2.0,100.0,4.0,5.0,2.0,50.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.8681144166442) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,400000000.0,80.0,90.0,99.32299855953764,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 66115694.34176863) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,200000000.0,3.885611721306203,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 55554999.2843549) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.8521371502623292,100000000.0,6.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31999998.511829026) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.5,3.0,3.5,4.0,3.098997828558572,3.098997828558572))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.452815794749038) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,2.2605696812961398,3.05,3.1,3.9174287938154095,3.25,2.9))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.2547382593766058) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,300000000.0,9999.996,2.0,3.0,5.0,100.0,60.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37333237.24448001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100.03327743022699,50.0,1.0,0.02555078040559666,70.0,80.0,999999999.7,99.32299855953764,100.0,100.0,3.460317038362515,2.7025347144325655,50.0,33.01214550051202,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 124444438.25993934) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,200000000.0,3.885611721306203,2.75,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 48979183.03544443) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,6.393816185538867,5.5,5.4540673533728095,6.5,7.5,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2431163013577538) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,7.5,3.25,7.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.125) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.8521371502623292,139587520.52129036,6.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 44668005.07864195) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(14.387809343061292,6.0,6.5,7.0,7.5,3.25,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.389846423356946) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.19008264462811) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,80.0,90.0,99.32299855953764,2.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 71999991.35354) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,3.2503848093472767,3.0,3.5,4.0,3.098997828558572,3.647324850433938))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.4406994965350757) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.48530966653453,70.0,80.0,90.0,100.0,2.0,99.23067676029065,4.0,5.0,2.0,3.1,2.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.685955676206) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100.03327743022699,50.0,1.0,70.0,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,33.01214550051202,2.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.90297112677287) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 70900852.78755939) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(80.3476701265547,20.0,30.0,40.0,60.0,80.0,90.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.543458765819338) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,4.379225312715933,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.38506455727367) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,326309516.59178865,20.0,9999.999,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 43285847.04064225) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(105.71131118650902,20.0,10000.381530384688,40.0,2.0,60.0,50.51467930227886,70.0,80.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1517.8607061630946) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,50.0,70.0,80.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.902736019791075) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,59.513894124236124,9999.999,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,58.67263492064459))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1411.0429448051414) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,1.2604224241965685,80.0,90.0,100.0,1.0,2.0,4.0,5.0,3.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.468026220541894) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,50.0,2.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.402366863905325) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.0,1.5,8.0,2.5,3.0,2.0465378224234207,3.5,4.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2606581296617123) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.16656249999999995) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,50.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.24999999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,-0.5922881227694902,90.0,100.0,2.0,0.003,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.46577401023079) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.594410940003277,60.0,70.0,80.0,90.0,99.32299855953764,2.0,100.0,4.0,5.0,50.0,2.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.38197768967104) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,60.0,70.0,80.0,90.0,100.0,120.91036269918699,90.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.909196891598913) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,3.5,6.393816185538867,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2726810695770752) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,1.2604224241965685,60.0,70.0,80.0,2.0,100.0,4.0,5.0,2.0,2.0,1.2604224241965685,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.093593143271335) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.30975113546599) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.60559550547181,80.0,90.0,100.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.46152697556838) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,32.93494749919239,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.63313156260095) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,4.0,99999999.4829637,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111999999.4427258) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,3.0,1.0,2.0,3.0,4.0,5.0,3.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.301775147928986) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,9999.999,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1411.7315427820045) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,70.0,80.0,3.098997828558572,100.0,1.0,2.0,4.0,5.0,80.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.10752084061499) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,9999.999,30.0,39.72365572880419,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,40.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1318.6897011158217) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.638157948698464,8.0,5.5,5.102062277753876,6.5,7.5,6.374548256709973,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.016791003782204) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,1.654732131931256,2.5,3.0,105.71131118650902,3.5,4.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 18.514941370933006) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,2.95,4.0,1.3963374489270861,2.99,3.01,3.05,3.1,3.25,2.8874862541396014))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35999999.46732353) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0,100000000.0,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 124000000.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,30.0,40.0,60.0,70.0,80.0,90.0,100.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.89661883239646) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,6.393816185538867,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.286140526906163) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,6.0,6.5,7.5,10.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1666666666666667) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.1571959032806265,1.5,2.0,2.5,3.0,3.570456180926328,4.0,3.0,2.109160016548039))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6614038821065922) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,-0.5922881227694902,90.0,100.0,2.0,4.0,70.32312812754411,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.544438501976245) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,4.0,1.7313745506292364,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7283086358785091) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,2.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.90625) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.02555078040559666,0.004,0.005,9999.995,9999.996,9999.997,9999.998,10000.381530384688,9999.998,10000.381530384688))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4861.159339560888) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,100.0,1.0,3.6710389724234243,2.0,3.0,4.0,5.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.444080085631384) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,3.3415991824925753,4.0,99999999.88224646,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111111110.30846159) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,3.098997828558572,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,78.68590989376426,90.0,100.0,50.51467930227886,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.440696008399048) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.005,5.102062277753876,2.75,2.9,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7591913923596171) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,80.0,99.16524130646621))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.129018988810806) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,53.613922661455135,20.0,30.0,50.0,70.0,80.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.20099568710918) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.258841556073,30.0,40.0,60.0,70.0,80.0,90.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1640.974110360143) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,100.0,2.0,100.0,4.0,5.0,2.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 75645481.59026219) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,2.1571959032806265,100.0,1.0,2.0,3.0,4.0,5.0,80.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.78308604871178) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,60.0,80.0,90.0,40.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 20.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,2.5,3.0,3.5,4.0,3.098997828558572,2.8291309936210185,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5337333543671943) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.95,50.0,70.0,80.0,3.098997828558572,100.0,1.0,2.0,4.0,5.0,80.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.41326403968343) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,10.0,20.0,30.0,70.32312812754411,40.0,50.0,-0.09437586975959777,60.0,70.0,90.0,14.231251393425142,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.119916039575095) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,100000000.0,70.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 15277771.041666666) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,29.42670336259685,40.0,2.0,60.0,50.51467930227886,70.0,14.387809343061292,80.0,90.0,100.0,29.42670336259685))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.27278860283532) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(25.211386967102,60.0,80.0,4.677927171701372,1.7313745506292364,100.0,2.0,4.0,51.538678895195,50.66963449602627,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.663577469424208) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,80.0,2.0,2.5,3.5,4.0,50.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.456790123456795) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,1.7313745506292364,90.0,100.0,1.7006181621934007,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 70900854.88384357) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,1.7313745506292364,90.0,100.0,2.229317625444934,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 70900854.87132998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,1.4802366115292032,3.5,4.0,1.8777897434625945,3.5,4.0,3.5,2.75,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8270368374009841) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.758103001708571,3.01,3.05,3.1,2.548780722396582,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.19397395310738155) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(40.630304346043914,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.07187567388067) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.003,0.004,0.005,9999.995,9999.997,9999.998,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4938.268765432099) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,2.6828796173458698,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.2050036743128) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,70.0,20.0,30.0,40.0,100.03327743022699,70.0,50.66963449602627,80.0,90.0,100.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.68872758986936) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,3.1,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.689999999999998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,53.141327018040194,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,50.0,2.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.91536049832238) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.379225312715933,50.0,60.0,70.0,80.0,90.0,38.50410272414793,100.0,2.0,3.0,4.0,5.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.02603587903926) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,400000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 128000000.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,99.95995609950876,70.32312812754411,2.0,100.0,4.0,5.0,2.0,50.182452590690275,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.8668485616197) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,100.0,2.0,100.0,4.0,5.0,50.0,2.6653430663066757))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.13941526500685) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,2.5,3.0,3.5,3.5,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6122448979591837) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,25.211386967102,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 135802466.64578894) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,1.654732131931256,2.5,3.0,105.71131118650902,3.5,4.0,4.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 16.982783136085274) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.0,6.5,7.5,10.0,6.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.21875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.242693917204057,6.0,6.5,7.0,7.5,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1127346850657651) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,2.7025347144325655,60.0,70.0,90.0,99.32299855953764,1.3260530476744576,100.0,4.0,98.8500430921985,5.0,50.0,2.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.220488963262426) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.4168467628,30.0,40.0,1.3963374489270861,70.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1935.4728794445953) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,1.0,0.02555078040559666,70.0,80.0,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,33.01214550051202,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.65322595300433) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,300000000.0,400000000.0,400000000.0,25.211386967102,100000000.0,100000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 149999996.84857664) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,5.0,2.0,50.0,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1413.0057751479287) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8151399972419936) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,99.32299855953764,90.0,99.32299855953764,100.0,100.0,4.0,2.7025347144325655,50.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.737303112234606) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,3.1,80.0,90.0,100.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.859504132231404) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.2759247382344467,0.005,5.102062277753876,2.75,2.9,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.702073112295431) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,2.75,2.95,4.0,2.99,3.01,2.618193011893701,2.599018233941602,3.05,3.1,3.25,2.8874862541396014))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30555555.094379205) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,400000000.0,100000000.0,100000000.0,100000000.0,100000000.0,400000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 120661157.02479339) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,90.0,59.513894124236124,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.107495440774155) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,0.001,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.24991666666667) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,144647566.04988787,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 75645483.11804003) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10000.702716116059,30.0,40.0,60.0,79.01689679113485,70.0,80.0,90.0,100.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1411.0497560404149) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(200000000.0,2.75,2.95,4.0,4.179530756791099,3.01,2.618193011893701,2.599018233941602,3.05,3.1,3.25,2.8874862541396014))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30555555.077857938) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99999999.88224646,60.0,70.0,90.0,99.32299855953764,100.0,100.0,4.0,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 16528916.008255633) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,3.01,2.2605696812961398,3.05,79.01689679113485,3.1,3.9174287938154095,3.25,2.9))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 10.800293053473451) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.26627218934911) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100.03327743022699,50.0,1.0,0.02555078040559666,70.0,80.0,999999999.7,99.32299855953764,100.0,100.0,3.460317038362515,2.7025347144325655,50.0,33.01214550051202,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 117187494.54643108) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,3.5,3.5,1.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9207873536903016) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.0,2.5,3.0,3.1148637087934263,2.5,3.1148637087934263,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5535533251937632) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.002,10.0,5.242693917204057,20.0,30.0,70.32312812754411,40.0,50.0,60.0,70.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.92320285086167) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,29.42670336259685,2.75,2.9,2.95,2.99,3.01,3.5,3.05,3.1,3.9174287938154095,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4.024670947149305) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.379225312715933,50.0,60.0,70.0,80.0,90.0,38.50410272414793,100.0,2.0,3.0,4.0,5.362056646017906,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.00032771482496) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,2.5,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1239.310986666667) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.75,2.9,2.95,2.99,3.05,3.1,2.6779794490678,2.261848827607997,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.21187729234432628) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.0,4.0,99999999.4829637,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 137499998.93962955) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,2.5,3.0,3.1148637087934263,2.5,3.1148637087934263,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5059119453987675) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.33074795) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.1346065862586165,2.0,50.0,67.843815042106,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.683751183002066) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.638157948698464,8.0,5.5,5.102062277753876,6.5,7.5,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.113442421250734) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.999,58.62454182829088,30.0,40.0,60.0,58.67263492064459,80.0,90.0,100.0,90.0,90.0,58.67263492064459,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2433.347309965927) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1320.5610918367345) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(110.30519609109437,30.0,40.0,50.0,80.0,99.16524130646621,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.44415304449969) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,400000000.0,400000000.0,389139843.14684427,100000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 148189973.85780737) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.258841556073,40.0,60.0,70.0,80.0,90.0,90.0,389139843.14684427,90.0,389139843.14684427))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 101314244.1572813) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(40.630304346043914,60.0,70.0,80.0,90.0,100.0,1.0,59.705289138598424,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.67291539937954) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(99.22188815832858,20.0,30.0,40.0,60.0,70.0,400000000.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 71999988.21556222) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,70.0,200000000.0,3.885611721306203,2.75,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 43749684.82401214) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,9999.996,200000000.0,3.885611721306203,3.5,29.42670336259685,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 48979181.94659938) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.258841556073,30.0,58.978197336195244,40.0,59.21352436744138,60.0,70.0,80.0,90.0,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1424.8822643606) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,58.67263492064459,90.0,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.222719576720383) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,0.003,3.3,3.3,3.3,999999999.7,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 90702947.53422678) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,50.182452590690275,2.0,100.0,2.6828796173458698,5.0,2.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.21833403567675) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,99.32299855953764,50.0,60.0,70.0,80.0,100.0,10.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.544429609210344) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,70.0,80.0,3.098997828558572,100.0,1.0,2.0,3.0,4.0,5.0,70.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.158416847620124) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,9999.999,30.0,40.0,60.0,58.67263492064459,84.40204386712122,90.0,99.89458821788836,90.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.4308296249217) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.638157948698464,8.0,3.638157948698464,5.102062277753876,120.91036269918699,7.5,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.227910123264127) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,69.76449063943501,80.0,90.0,50.82476780440175,2.0,100.0,99.32299855953764,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.892377506916578) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.2503848093472767,3.0,3.5,4.0,3.098997828558572,5.4540673533728095))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6731946743155302) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,1.4802366115292032,3.5,4.0,1.8777897434625945,3.5,4.0,3.5,4.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9255176118191311) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.638157948698464,50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.82545649398379) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.785714285714285) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,399999999.0387684,400000000.0,25.211386967102,100000000.0,3.098997828558572,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 149999997.07283837) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,2.7025347144325655,3.3,3.3,3.3,3.3,3.3,3.3,1.794094515132357,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.34240097) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.8874862541396014,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.154384413069185) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.18163265306122442) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,50.0,70.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1101.4185743944638) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(105.71131118650902,20.0,10000.381530384688,40.0,2.0,60.0,50.51467930227886,70.0,80.10836599247982,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1517.859201079865) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,100.0,1.0,2.0,3.0,4.0,5.0,100.0,70.0,99.9303716082188,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.86295315243833) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.1148637087934263,50.0,60.0,39.45340482232082,70.0,80.0,100.0,2.0,100.0,4.0,5.0,50.0,2.0,60.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.2307009044541) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,3.5,4.0,4.179530756791099,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7943783443067702) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,1.5,3.0210265973324804,80.0,2.0,2.5,3.0,3.5,4.0,50.0,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 17.235527038962985) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,144647566.04988787,400000000.0,389139843.14684427,100000000.0,144647566.19469765,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 115765893.50014517) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,7.5,3.25,7.0,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4081632653061225) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.05,8.0,6.393816185538867,5.5,6.0,6.5,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4354510793217712) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,9999.999,70.0,80.0,90.0,100.0,2.0,100.0,4.0,5.0,2.0,50.0,2.0,90.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1238.6932088888889) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.0,1.4802366115292032,3.5,4.0,1.8777897434625945,3.5,1.4802366115292032))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.958580044915796) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,389139843.14684427,99999999.88224581,200000000.0,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104553100.50273387) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,90.0,2.0,100.0,4.0,5.0,2.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.84) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,7.938358175576009,30.0,40.0,50.0,60.0,3.1,80.0,90.0,100.0,40.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.210294094041938) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,105.71131118650902,20.0,10803.4168467628,30.0,40.0,60.0,70.0,80.0,90.0,90.0,90.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1525.3880573960598) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.2503848093472767,0.002,0.003,0.004,0.005,9999.995,9999.996,9999.997,9999.998,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4999.672061519065) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,144647566.04988787,400000000.0,389139842.3890193,100000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111127211.0778128) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(400000000.0,50.0,60.0,144647566.04988787,80.0,90.0,112.4822840591051,2.0,100.0,4.0,5.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 75645481.24353208) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.109160016548039,1.5,2.0,2.5,3.0,3.5,4.0,4.179530756791099,2.8204083338458177))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7328242069723474) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,40.0,50.0,60.0,70.0,80.0,90.0,2.95,90.95808127061625))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.66869938475222) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(8.0,5.5,6.5,7.5,11.053466235242924,10.31119115924337,7.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.502991304997203) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,99.32299855953764,100.0,2.0,100.0,3.023954871009962,5.0,50.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.27538825159948) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,300000000.0,400000000.0,389139843.14684427,99999999.88224581,200000000.0,100000000.0,200000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94687384.1786254) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,-0.5922881227694902,90.0,100.0,2.0,0.003,4.0,5.0,2.0,-0.5922881227694902))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.438928490807506) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,-2.0,3.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.1,2.2,3.3,4.4))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.1) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1e+308))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1e-308))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,1.00000001,1.00000002,1.00000003))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0000000050247593e-08) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.0,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(-1.0,1.0,-1.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.053615457430645) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.678422558135992) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.64802237170511) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.05361545743064) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.91358024691358) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.15064203930627) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.24815628104338) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.291030709725918,2.0,2.5,2.4994321923502856,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6991269915825057) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.68143938140266) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,49.773450447024764,90.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.55152483033263) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8400000000000001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 86776859.19173552) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.33245856) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.0,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.72) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.554806632198653,3.3,3.3,828201982.1781489,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 157532143.00124812) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.996,30.0,40.0,50.0,1.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1790.57928) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.0,3.5,4.0,3.5,3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.6734693877551019) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 49586768.223883025) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104938271.22716048) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,14.481622339226005,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.8392508183964) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,141.81774959304587,1.0,2.0,3.0,4.0,5.0,50.0,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.25896100462294) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,100.0,7.0,8.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,9999.995,60.0,60.0,100.0,80.0,90.0,100.0,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1518.8881249999997) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 45833326.060453154) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,49.463845425693606,999999999.7,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 179999990.15672308) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,90.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.678422558135985) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.002,0.003,0.004,0.005,9999.995,9999.672036776217,9999.997,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4938.228523058792) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.95,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65975001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,141.81774959304587,1.0,2.0,3.0,4.0,5.0,50.0,4.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.010541181553094) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,100.0,7.0,8.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.919999999999998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,3.01,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.02396694214876) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,10.0,10.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.33333333333333) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,8.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8800000000000001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.63468316584145,10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,103.9388706194337,49.463845425693606,60.0,70.0,80.0,90.0,102.81009280257041,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37333326.035279825) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,3.7609253911481755,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8864610241892942) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.9,2.95,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.13906249999999987) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,30.0,49.463845425693606,70.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.963610764200787) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,90.0,1.1922955283247763,141.81774959304587,1.0,2.0,4.0,4.367504348746251,50.0,4.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.68033015880211) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.0,7.0,4.0,3.5,3.0,1.5,7.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.5925925925925926) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(9.657809016182954,30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,10.0,10.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.361849248651424) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65799998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,9999.996,6.5,7.0,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2775.943333333333) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,3.4908151790033317,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.193074107722644) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.1922955283247763,20.0,30.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.55133611934589) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,100.0,7.9233132434288756,8.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111111104.03203815) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.7,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 179999990.8815046) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,103.9388706194337,3.5,4.5756777070295165,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 19.940404510367912) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,1.5695280358818793,141.81774959304587,1.0,2.0,3.0,4.0,5.0,50.0,4.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.25349537680245) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.07670318) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,3.7609253911481755,8.0,6.0,3.7609253911481755))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.118881504931208) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,200000000.0,300000000.0,400000000.2827599))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 124999998.57068998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,49.773450447024764,70.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.0007981580989) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.554806632198653,3.3,3.3,828201982.1781489,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 164538177.78248534) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,103.9388706194337,3.5,4.5756777070295165,4.852743487198158,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 18.13345019604272) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,300000000.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 107438015.95867766) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,80.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.88312476357196) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,49.463845425693606,999999999.7,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 197530853.7811396) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(44.07742079869188,13.516948827900045,20.0,30.0,40.0,50.0,60.0,70.0,90.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.3475727581329) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.812083947456091,2.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9699334315929745) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.63468316584145,10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,103.9388706194337,49.463845425693606,60.0,70.0,80.0,90.0,102.81009280257041,100.0,49.463845425693606))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35156243.199258864) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.7,70.0,80.0,90.0,34.99098147402468,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 165289248.07907847) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,80.0,2.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.993796532800495) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.0,3.5,4.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8333333333333334) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,1.5695280358818793,141.81774959304587,1.0,2.0,3.0,4.0,5.698041136164186,50.0,4.0,60.0,1.1922955283247763))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.17399629417196) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.35336123802786) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,103.9388706194337,3.5,4.5756777070295165,34.99098147402468,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.271793043530586) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,100.0,10.0,2.991231774154428))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 42603545.01019405) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,70.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.90957748707665) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,400000000.0,3.3,3.3,3.3,3.3,3.3,3.707326232303277,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 125999999.37492676) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,3.5,4.5756777070295165,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7807034446372112) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,5.5,70.0,80.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.78864736901951) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.00164010145102,100.0,70.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.909691383010752) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,3.5,4.5756777070295165,3.5,3.0,3.5,4.276728904550143,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7663239795016257) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,8.0,5.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.0,3.5,4.384425501449117,4.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8974042502415195) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 26.91358024691358) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,41.72055257930202,49.773450447024764,70.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 20.48371234490826) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.3263922,999999999.7,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 297520646.0295535) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,300000000.0,7.0,8.0,5.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 73469386.122449) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,9999.996,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2776.998888888889) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,3.01,19.39446047337968,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.074011531125645) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.003,0.005,9999.995,9999.996,9999.997,9999.998,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4687.4971875) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,6.5,3.7609253911481755,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8522288113052728) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.2339028700898096,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.587157364217548,3.3,3.3,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.3295232) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,14.481622339226005,68.90458824240277,126.29073532991643,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.0923205611001) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.573502645381446,60.0,100.0,80.0,90.0,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.942649735461863) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 86776858.83347109) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,200000000.0,60.0,70.0,80.0,90.0,100.87293165430344,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30555549.08509818) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722990.98753719) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,90.0,1.1922955283247763,141.81774959304587,1.0,4.0,4.367504348746251,50.0,4.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.821807622579605) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.5095597082878824,2.9,2.95,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.1874726358092026) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,3.4834417459133986,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.20418021823917482) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.0,3.5,4.384425501449117,4.0,2.0,13.215774418640153,4.384425501449117))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.1794240602369634) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65800002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,49.773450447024764,90.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.477345044702474) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,3.7609253911481755,6.0,6.5,3.7609253911481755,8.0,6.0,3.7609253911481755,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.3354597316735153) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.01,19.39446047337968,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.75955395266203) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,80.0,1.295110146595121,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.0378521486383) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,400000000.0,3.3,3.3,3.3,3.3,3.3,3.707326232303277,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 125999999.37292674) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,1.1922955283247763,2.991231774154428,2.598294464930153,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,100.0,10.0,2.991231774154428))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 39795913.78329694) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,14.481622339226005,80.0,126.29073532991643,100.0,126.29073532991643))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.120024547676024) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,6.5,3.7609253911481755,6.616788613279709,8.0,6.0,3.7609253911481755,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9710918090973968) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,60.0,70.0,80.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.10612087058541) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.865073243449636,2.0,2.5,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7793967236877106) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(9.657809016182954,30.0,40.0,60.0,100.0,80.0,2.991231774154428,10.0,10.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.788076736773007) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,9999.997,1.295110146595121,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1167.4240199552496) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,70.0,80.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.291581862514846) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.5,4.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9199999999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.5095597082878824,2.9,1.1922955283247763,2.99,1.7570485411520125,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5275427434858431) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.3489045785395586,2.0,103.9388706194337,3.5,4.604612018193867,1.295110146595121,4.852743487198158,3.5,3.0,3.5,2.3489045785395586))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 16.668403824549923) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,80.0,2.95,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.705000000000002) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,90.0,1.1922955283247763,1.5695280358818793,141.81774959304587,1.0,2.0,3.0,4.0,5.698041136164186,50.0,4.0,60.0,1.1922955283247763,50.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 36.17399629417196) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 86776858.83291544) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.288414144976098) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65104386) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,3.4834417459133986))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.330078383544645) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,90.0,2.0,103.9388706194337,3.5,4.5756777070295165,4.852743487198158,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.973082451340282) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,6.5,3.7609253911481755,6.616788613279709,8.0,6.0,90.00164010145102,3.7609253911481755,6.5,6.616788613279709,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 12.824837706223969) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 104938270.84475595) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,2.0,3.0,4.0,5.0,80.0,1.295110146595121,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.75735142197839) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.022850297755034,2.0,3.0,3.5,4.0,2.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7931203717034653) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,400000000.0,3.3,3.3,3.3,3.3,3.3,3.707326232303277,3.3,3.3,3.3,3.3,90.00164010145102,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 120634919.24844477) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,90.0,8.0,5.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 20.408163265306126) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,7.825146418506947,7.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8875244030844911) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,14.481622339226005,80.0,126.29073532991643,100.0,126.29073532991643,20.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.51389853791792) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.99,3.01,3.05,3.1,3.25))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.18571428571428564) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(30.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.19753086419753) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,90.0,2.2180852449630564,2.0,103.9388706194337,3.5,4.5756777070295165,4.852743487198158,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.90341855696731) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(100000000.0,200000000.0,400000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 111111111.11111112) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 34.03086367330783) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.996,30.0,40.0,50.0,1.0,70.0,80.0,5.5,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1792.2692800000004) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.3263922,999999999.7,70.0,80.0,90.0,122.21832735028029,100.0,122.21832735028029))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 260355012.94636047) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,0.001,49.463845425693606,70.0,14.481622339226005,80.0,126.29073532991643,100.0,126.29073532991643))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.17136049714211) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,3.1923226333039425,6.5,3.7609253911481755,8.0,6.0,3.7609253911481755,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.535728323049963) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.7,70.0,80.0,90.0,3.2339028700898096,100.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 152777771.11446282) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.7915956564497671,0.002,0.003,1.5695280358818793,0.005,9999.995,9999.672036776217,9999.997,9999.999,9999.995))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4958.447728961911) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,10.0,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 6.390746254096521) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 90702947.1260771) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,9999.996,1.0,2.0,3.0,3.4908151790033317,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1522.698234573509) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.865073243449636,2.0,2.5,2.470363840094207,3.0,3.5,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7368386754194287) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.9489691459904055,1.5,2.3489045785395586,2.0,3.5,4.5756777070295165,3.5,3.0,3.5,4.276728904550143,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7481515864546008) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,300000000.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 112018139.99501133) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 31.47007446069285) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.5,3.7609253911481755,8.0,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9864477355509683) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,100.0,10.0,2.991231774154428,10.0,49.463845425693606))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37333328.83464489) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.01,19.39446047337968,40.0,50.0,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.629078953903743) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(9999.999,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999949.67450501) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,6.5,3.7609253911481755,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9582519374162921) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.01,19.39446047337968,30.0,40.0,55.269452794728835,60.0,70.0,80.0,90.0,100.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.69384056099096) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.996,30.0,0.004,50.0,1.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1791.3791999999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,9999.996,6.616788613279709,9999.918057026343,2.0,3.0,3.4908151790033317,5.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2440.167029445662) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.63468316584145,3.05,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,103.9388706194337,49.463845425693606,60.0,70.0,80.0,90.0,102.81009280257041,49.463845425693606,49.463845425693606))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35156243.64836945) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.003,0.005,9999.995,9999.996,9999.997,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4897.95612244898) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,300000000.0,7.0,8.0,5.5,7.665849777787074,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 65624998.58856719) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.821576090713375) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.1,3.360554359804471,3.5,4.384425501449117,4.0,1.2400326729593498))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7294349461483209) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(4.604612018193867,5.5,6.0,5.739181757421845,6.5,4.907228154543746,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7186222587300678) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.05,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.1157357195834128,999999999.7))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.33869399) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,60.0,70.0,49.773450447024764,90.0,100.0,1.0,2.0,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.308110788134684) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.0,60.0,100.0,90.0,100.0,100.0,6.374298258979812,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.53104973066283) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.0,3.5,4.384425501449117,4.0,2.0,1.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.006256183850912) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,90.0,5.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.222222222222225) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,9999.997,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999949.44523962) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,10.0,3.3,90.00164010145102,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 13.097980280808452) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.904614872233072) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,3.7609253911481755,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.057377906124438) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,103.9388706194337,3.5,4.5756777070295165,4.852743487198158,3.5,3.0,3.5,103.9388706194337))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.97264495213672) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 59259249.56901043) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,3.7609253911481755,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.089652978319434) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,7.8336618499894906,6.5,3.7609253911481755,6.616788613279709,8.0,6.0,90.00164010145102,3.7609253911481755,6.5,6.616788613279709,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 11.900074474551328) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(30.0,137.09809335349595,40.0,50.0,60.0,100.0,80.0,90.61353519879702,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.016930284183434) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,1.1922955283247763,2.991231774154428,30.0,30.0,300000000.0,49.463845425693606,60.0,70.0,80.0,100.0,10.0,10.0,49.463845425693606))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 39795913.233559005) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.678422558135985) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.5,400000000.0,3.3,3.3,3.3,3.3,3.3,3.707326232303277,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 131855955.02207951) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,300000000.0,400000000.2827599))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 155555552.9517244) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.449805487032002,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 83175802.77435061) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,7.8336618499894906,6.5,3.7609253911481755,6.616788613279709,8.0,90.00164010145102,7.1072971223864805,3.7609253911481755,6.5,6.616788613279709,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 11.886970366594094) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,49.463845425693606,60.0,70.0,80.0,90.0,100.0,40.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.011252444157552) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,297692211.3597524,300000000.0,400000000.2827599))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 124711524.20531404) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,80.0,2.0,60.0,89.14304005313281,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.11028200967208) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.33074795) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,4.5756777070295165,49.463845425693606,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.766366295641173) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,4.504374213573867,80.0,49.773450447024764,90.0,1.0,2.0,2.5994383138597996,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.47076514572229) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,5.211281152854525,7.0,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9261950155432761) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,70.0,80.0,90.0,1.1922955283247763,84.6446595183346,9999.996,6.616788613279709,9999.918057026343,2.0,2.991231774154428,3.0,3.4908151790033317,5.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2179.3822282589267) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.3263922,999999999.7,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 319999984.51523197) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,80.0,90.0,1.1922955283247763,1.5695280358818793,141.81774959304587,1.0,2.0,3.0,4.0,5.698041136164186,50.0,4.0,60.0,1.1922955283247763,50.0,90.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.12031052024169) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,84.6446595183346,3.0,4.0,5.0,9999.997,1.295110146595121,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1166.7783585527625) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(7.8336618499894906,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,3.4908151790033317,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.25577968351961) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.003,9999.995,9999.997,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4799.9976) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 83175803.09795375) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,9999.996,3.0,3.5,4.852743487198158,4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2448.2091125107263) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(7.5,10.0,20.0,30.0,40.0,49.463845425693606,80.0,90.0,49.773450447024764))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.621888379347947) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,1.0,2.0,3.0,4.0,5.0,80.0,2.0,60.0,1.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.953972292398596) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,19.728462954455587,30.0,30.0,49.463845425693606,70.0,14.481622339226005,68.90458824240277,126.29073532991643,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.110273423615425) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 110726642.77128349) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,4.782436984517929,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 86776859.18560976) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 33.66909370239031) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(9.657809016182954,30.0,40.0,60.0,100.0,80.0,2.991231774154428,10.0,10.0,60.0,2.991231774154428))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.294192350042) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,100.0,70.0,13.215774418640153))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.356845116271973) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.3263922,999999999.7,70.0,80.0,90.0,122.21832735028029,100.0,122.21832735028029,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 244897944.21422294) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,40.0,50.0,60.0,100.0,80.0,90.0,100.0,10.0,10.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.59504132231405) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,49.463845425693606,60.0,70.0,80.0,90.0,4.384425501449117))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 22.86254948630935) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,16.045416519836035,70.0,80.0,126.29073532991643,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.7141472839476) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,7.0,62.029282698318745,90.0,5.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.414139326187495) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,3.7609253911481755,8.0,6.0,8.0,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.9673843261064781) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,80.0,126.29073532991643,100.0,126.29073532991643,20.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 35.70487593736613) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,3.812083947456091,90.0,3.4834417459133986))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.5775785031397) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,90.0,2.2180852449630564,2.0,103.9388706194337,3.5,4.5756777070295165,4.852743487198158,6.374298258979812,2.9,3.5,3.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.34894635996958) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,4.782436984517929,3.3,3.3,3.3,3.3,3.3,3.3,828201982.1781489,999999999.7,3.3,3.3,3.3,4.782436984517929))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 151091072.312534) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,100.0,7.699479532889756,7.560787057774588,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.899178672746853) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,40.0,50.0,60.0,100.0,90.0,100.0,10.0,10.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,200000000.0,60.0,70.0,80.0,90.0,100.87293165430344,1.0,2.0,3.0,4.0,5.0,200000000.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 52070994.890581496) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,3.7609253911481755,6.0,6.5,8.0,6.0,3.7609253911481755,6.616788613279709))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0700347477611678) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,19.728462954455587,30.0,30.0,49.463845425693606,70.0,14.481622339226005,68.90458824240277,126.78403630183132,100.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.167349569126245) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,3.7609253911481755,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.4395887150452553) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,70.0,80.0,49.773450447024764,90.0,100.0,1.0,2.5287813908926378,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.247880921118764) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,49.463845425693606,4.782436984517929,60.0,70.0,80.0,90.0,4.384425501449117))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.029698293972654) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,3.7609253911481755,49.463845425693606,999999999.7,70.0,80.0,90.0,34.99098147402468,100.0,3.7609253911481755))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 152777770.89893505) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,6.5,3.7609253911481755,4.0,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2197943575226275) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(50.0,60.0,80.0,49.773450447024764,1.1922955283247763,90.0,100.0,1.0,2.0,3.0,14.481622339226005,5.0,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.56713937999163) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,3.01,14.481622339226005,30.0,40.0,50.0,60.0,70.0,80.0,90.0,90.13265058398068,100.0,14.481622339226005))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.101645988368666) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,4.441276881707008,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.2352718040651094) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,3.7609253911481755,8.0,6.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8349509565472367) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.55344018402163,6.374298258979812,6.5,8.0,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.5657809245598848) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,0.005,60.0,70.0,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.677922558135993) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.446843646862527,3.7609253911481755,8.0,6.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8805547627295752) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,30.0,49.463845425693606,70.0,14.481622339226005,80.0,100.0,126.29073532991643,20.0,30.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.66491602212695) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.9,2.95,2.99,9999.997,3.01,3.05,3.1,6.616788613279709))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1799.402124227734) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,41.72055257930202,49.773450447024764,70.0,80.0,62.029282698318745,49.773450447024764))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 15.508478611143609) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.3489045785395586,2.0,3.5,4.5756777070295165,3.5,3.0,4.276728904550143,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8188914457684159) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,1.8029218152876385,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 99722991.3407526) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.003,0.005,9999.995,9999.996,9999.997,9999.998,9999.999,9999.998))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4444.441851851852) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,50.0,60.0,70.0,90.0,100.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 21.23456790123457) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,3.0,3.5,4.384425501449117,4.0,2.0,2.0301596998612945,13.215774418640153,4.384425501449117))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.0695623069048503) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(0.001,0.003,9999.997,9999.999,9999.999))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 4799.998239999999) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(89.14304005313281,3.05,60.0,70.0,80.0,90.0,1.1922955283247763,100.0,2.0,3.0,4.0,5.0,80.0,1.295110146595121,7.9233132434288756,60.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 37.605145070924) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 83175802.77491698) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,49.463845425693606,70.0,80.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 25.089359095717736) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 79861110.52210258) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,30.0,40.0,50.573502645381446,60.0,100.0,80.0,90.0,9.232931163040913,100.0,10.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 30.263931090213024) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,4.139540681450292,3.3,2.95,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 90702947.51705422) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,999999999.7,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.42872462) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,40.0,50.0,3.707326232303277,60.0,2.022850297755034,90.0,100.0,70.0,4.604612018193867))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.40208359105354) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(2.5,2.75,2.99,3.05,3.25,3.05))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.20444444444444443) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(13.215774418640153,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,3.4834417459133986,20.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.239734201276573) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.01,19.39446047337968,30.0,40.0,55.269452794728835,60.0,70.0,80.0,90.0,100.0,100.0,49.773450447024764,19.659907762221618,3.01))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 27.887259579435913) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.50428171064232,30.0,40.0,60.0,100.0,80.0,2.991231774154428,9.232931163040913,10.0,10.0,60.0,2.991231774154428))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 28.07502247069499) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,100.0,7.699479532889756,7.560787057774588,5.5,5.5,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 38.22365170688454) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.374298258979812,6.0,7.8336618499894906,6.5,3.7609253911481755,6.616788613279709,8.0,90.00164010145102,7.0,3.7609253911481755,6.5,6.616788613279709,6.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 11.888240155024695) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(60.0,70.0,4.504374213573867,80.0,49.773450447024764,90.0,0.07808732746785707,2.0,2.5994383138597996,3.0,4.0,5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 32.534786859092584) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(3.3,3.3,3.3,3.3,3.3,3.3,3.121125756863509,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.1923226333039425,999999999.7,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 94999999.65943275) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,9999.996,30.8359552577593,7604.197665377717,40.0,50.0,1.0,70.0,80.0,5.5,100.0,80.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2432.045343656411) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,7.699479532889756,7.560787057774588,5.5,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 29.899178672746853) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,0.7915956564497671,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.826689389936074) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,2.3541411246909063,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 83175802.77849303) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(6.0,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(9999.999,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,2.5994383138597996,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,999999999.7,3.3,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 86776817.88595688) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,49.99849106738436,40.0,49.463845425693606,4.782436984517929,60.0,70.0,80.0,90.0,4.384425501449117))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.1786860751998) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(90.0,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.3,3.865073243449636,3.3,3.3,999999999.7,2.869383821118558,3.3,3.3,3.812083947456091,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 79861110.52032453) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,6.0,6.5,8.0,5.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.76) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(20.0,30.0,30.0,49.463845425693606,70.0,80.0,100.0,20.0,70.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.744311562894456) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(30.0,40.0,60.0,100.0,80.0,90.0,100.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 23.75) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(19.39446047337968,3.3,3.3,3.3,3.4834417459133986,3.3,3.3,49.463845425693606,3.3,3.3,3.3,3.3,3.3,2.991231774154428,3.3,3.3,10.0,3.3,90.00164010145102,3.3))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 12.562975307243546) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(5.5,7.294790002652797,6.0,6.5,7.825146418506947,7.5,8.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.8106044597338462) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.5,2.0,3.5))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 0.7777777777777778) < 1.e-6);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,49.463845425693606,60.0,70.0,80.23776903555098,80.0,90.0,100.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 24.86621111774535) < 1.e-6);
    }
}

