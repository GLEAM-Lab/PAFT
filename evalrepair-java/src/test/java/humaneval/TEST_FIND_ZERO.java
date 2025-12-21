package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_FIND_ZERO {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-6d,-7d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,6d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,7d,3d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,-2d,-10d,-5d,3d,1d,-2d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-7d,-8d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,4d,7d,-7d,2d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,9d,1d,8d,-4d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,4d,10d,1d,-5d,1d,1d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,-8d,9d,10d,-5d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,4d,2d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-9d,-3d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-2d,-8d,-4d,8d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,5d,2d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,-2d,-6d,-3d,7d,7d,-2d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,2d,1d,-3d,-6d,6d,5d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,9d,-8d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,4d,6d,-2d,7d,-10d,-7d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,1d,-7d,-1d,3d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-2d,6d,-5d,6d,-7d,10d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,1d,-5d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-7d,1d,-1d,-3d,-9d,-3d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,7d,-5d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,7d,-4d,-1d,2d,10d,1d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,-3d,-3d,-8d,1d,-10d,8d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,-3d,-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,5d,-4d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,8d,5d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-4d,-7d,-7d,3d,1d,3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,10d,10d,-7d,-9d,2d,1d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,-4d,7d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-5d,-2d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,4d,7d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,5d,5d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,-5d,2d,-10d,2d,-2d,4d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,5d,-6d,-4d,-1d,-4d,-9d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,6d,-8d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-7d,8d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,8d,6d,1d,-2d,-4d,1d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-6d,10d,-1d,4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-2d,-6d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,4d,7d,-1d,9d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-1d,9d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,10d,-2d,6d,5d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-9d,-10d,1d,-6d,10d,-2d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,3d,7d,-10d,-7d,-8d,-6d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-6d,-9d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-4d,-3d,-7d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,-3d,-5d,-5d,3d,-10d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-3d,-2d,-5d,-7d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(4d,1d,-1d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-4d,2d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,-2d,1d,10d,6d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,-7d,-2d,-5d,8d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d,3d,9d,6d,-7d,2d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-9d,3d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,-8d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,-1d,6d,-1d,3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,7d,-6d,-4d,3d,2d,-5d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,7d,-10d,-1d,-1d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,9d,10d,1d,4d,4d,4d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,-8d,-1d,6d,10d,9d,1d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-3d,-4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-8d,4d,3d,10d,8d,-4d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-3d,-6d,10d,-10d,-7d,3d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,4d,-9d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-7d,4d,-6d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(4d,9d,6d,3d,7d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,4d,-2d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,5d,10d,-3d,-2d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d,7d,-8d,-6d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,-3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-20d,156d,-864d,2667d,-4392d,3744d,-1440d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-1d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,2d,1d,-3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,10d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-36d,6d,-1440d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3744d,1d,0d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-20d,156d,-864d,2667d,-4391d,3743d,-1440d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-20d,156d,-864d,2667d,-4391d,3743d,-4d,-1440d,-4391d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,54d,7d,54d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,-3d,7d,54d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-20d,156d,-864d,2667d,-4391d,3743d,-4d,-1440d,-1440d,-4391d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,1d,-1d,2d,1d,-3d,-4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,1d,-1d,2d,1d,-2d,-4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,6d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,-4d,7d,54d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2667d,6d,1d,-1d,-2d,-4d,1d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-1d,-36d,6d,-1440d,1d,1d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,-4392d,2d,1d,-3d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-36d,-20d,6d,-1440d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-36d,1d,54d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2667d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,4d,-4d,7d,54d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-36d,6d,6d,-1441d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2667d,6d,1d,-1d,1d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,6d,-1440d,1d,1d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-36d,6d,-1440d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-36d,6d,-1440d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,1d,-1d,1d,-3d,-4d,1d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4392d,-1d,6d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2667d,6d,1d,-1d,-2d,1d,-1d,2667d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,2d,1d,-3d,3744d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-1d,0d,-1441d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,-1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-1d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4392d,-20d,6d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,-4392d,2d,1d,3743d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,7d,10d,-3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-20d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-20d,156d,-864d,2667d,-4392d,3743d,-1440d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-1d,-36d,6d,-1440d,1d,1d,-36d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,6d,-2d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4391d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-36d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-1d,10d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,6d,-2d,6d,-2d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-2d,2d,1d,-3d,3744d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-1d,-3d,-36d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-4391d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,-4392d,2d,1d,1d,1d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,2d,1d,-3d,1d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,-4d,-5d,7d,54d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-36d,0d,-3d,-5d,7d,54d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-36d,-19d,6d,-1440d,3743d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-4391d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,2d,1d,-3d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-4391d,-1440d,0d,0d,-4391d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,5d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-4391d,4d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-864d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,-4d,6d,54d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,7d,-36d,0d,54d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,-1d,-4392d,2d,1d,0d,1d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-1d,-4392d,2d,1d,0d,1d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-3d,4d,7d,54d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,10d,1d,-1d,2d,1d,1d,-2d,-4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2667d,6d,1d,-1d,-2d,1d,0d,2667d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-2d,-3d,-36d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-20d,156d,7d,-3d,-4391d,3743d,-4d,-1440d,-1440d,-4391d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,5d,10d,7d,10d,-3d,-37d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,1d,-1d,-864d,1d,-36d,-2d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-1d,-4392d,-19d,1d,0d,1d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,1d,54d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-4391d,-1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-3d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,2d,0d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,4d,8d,5d,-5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,-1186740000d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,5d,-6d,7d,-8d,9d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,4d,8d,2d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,4d,0d,26d,5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,17d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,17d,26d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,5d,17d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-6d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,26d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,17d,26d,37d,10d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,-37d,0d,-10d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,1d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,2d,26d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-4d,5d,-6d,7d,-8d,9d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,26d,3d,4d,26d,4d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-3d,1d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,0d,-1186740000d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,-630000d,3d,0d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9450000d,9d,-6d,3d,-7d,2d,6d,1d,-4d,-10d,6d,-11d,-1d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-4d,5d,-6d,7d,-8d,9d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-11d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-4d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,3d,-4d,5d,-10d,7d,21000d,-8d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,-3d,5d,-6d,7d,-8d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,26d,1d,3d,-10d,-4d,5d,-10d,7d,21000d,-8d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,4d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-630000d,3d,-4d,5d,-10d,7d,-8d,-8d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,-8d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-6d,7d,-8d,9d,9d,-10d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,-8d,2d,-630000d,-4d,-10d,26d,6d,5d,-1d,8d,10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-630000d,3d,-4d,5d,-10d,7d,-8d,-8d,9d,-10d,26d,5d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,26d,37d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,3d,-4d,4d,-10d,7d,21000d,-8d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-6d,7d,-8d,9d,-10d,-8d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,2d,0d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9450000d,9d,-7d,3d,2d,1d,-4d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,2d,8d,-4d,-10d,6d,5d,-1186740000d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-4d,5d,7d,-8d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,-4d,5d,-6d,7d,-8d,9d,-11d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,17d,26d,37d,10d,2d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,10d,0d,-83d,0d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,4d,-4d,5d,-6d,7d,-8d,9d,9d,-10d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-6d,4d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-11d,5d,10d,17d,26d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d,-26d,-1186740000d,-37d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,21000d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,26d,37d,10d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,5d,-1d,-1d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,8d,2d,-6d,7d,-8d,9d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,17d,26d,37d,26d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-6d,26d,-630000d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-4d,5d,-6d,7d,9d,-11d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-4d,-10d,-17d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,37d,10d,2d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,2d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,26d,3d,4d,-6d,26d,4d,26d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,6d,17d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(17d,6d,9d,-7d,3d,2d,8d,2d,-4d,-10d,7d,-22d,-1d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,1d,2d,-3d,-630000d,3d,0d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,20999d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,17d,-7d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-6d,2d,2d,8d,-4d,-10d,-6d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,80d,-4d,5d,8d,2d,-6d,7d,-8d,9d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,6d,1d,3d,-4d,5d,-6d,7d,-1186740000d,21000d,-8d,9d,-10d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,-4d,0d,4d,8d,5d,-5d,0d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,2d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,2d,80d,-4d,5d,8d,2d,-6d,7d,-8d,9d,-9d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,1d,2d,0d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,17d,37d,26d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-4d,5d,-6d,-26d,-8d,9d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,10d,-3d,5d,-6d,7d,-8d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,1d,0d,0d,0d,0d,0d,0d,0d,-37d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(27d,1d,3d,-4d,4d,-10d,7d,21000d,-9d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,10d,26d,4d,37d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630000d,3d,-4d,5d,-11d,7d,-8d,-8d,9d,-10d,37d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,-4d,0d,4d,8d,5d,-5d,0d,-5d,-5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-9d,-4d,5d,-6d,3d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-37d,-78840000d,0d,3d,0d,4d,26d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-7d,3d,2d,8d,1d,-2d,-4d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,80d,-4d,17d,8d,2d,-6d,7d,-8d,9d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,6d,5d,-1d,2d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-6d,26d,4d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,-37d,8d,5d,-5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,4d,-4d,7d,-8d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,37d,10d,2d,20999d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,26d,0d,0d,0d,0d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,9450000d,5d,17d,26d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,3d,-6d,4d,2d,8d,-4d,-10d,27d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,17d,26d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,1d,2d,0d,1d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,2d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,-2d,-1186740000d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,10d,0d,27d,0d,0d,0d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(27d,5d,10d,26d,37d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,4d,8d,-26d,-5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-1663750000d,5d,3d,-1d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,16d,6d,17d,9d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,10d,-3d,5d,-6d,-1186740000d,9d,7d,-8d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,9450000d,-1d,17d,26d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,17d,26d,37d,10d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(27d,-37d,-78840000d,0d,3d,0d,4d,26d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,5d,-6d,7d,-8d,9d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,-7d,2d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(17d,6d,9d,-7d,4d,2d,8d,-4d,-10d,7d,-7d,-22d,-1d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-3d,-11d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(17d,-6d,6d,9d,-7d,4d,2d,8d,-4d,-10d,7d,-7d,-22d,-1d,9450000d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,-630000d,3d,1d,0d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,4d,8d,5d,-5d,0d,-5d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-6d,-8d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,9d,-6d,3d,-7d,2d,6d,-4d,-10d,6d,-11d,-1d,9450000d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,-4d,-10d,6d,5d,-1d,-1d,2d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,9d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,26d,37d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-22d,7d,-8d,9d,-10d,-8d,-8d,5d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,17d,26d,37d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,1d,-2d,4d,-4d,5d,-6d,7d,9d,-11d,-4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,5d,17d,26d,4d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-300d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(27d,5d,26d,37d,10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-7d,0d,0d,0d,0d,0d,0d,0d,0d,26d,0d,0d,-1d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630000d,3d,5d,-11d,7d,-8d,-8d,9d,-10d,37d,26d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-3d,-11d,-16d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-7d,0d,0d,0d,0d,0d,0d,5d,0d,0d,26d,0d,0d,-1d,1d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-6d,8d,7d,10d,-8d,9d,9d,-10d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-11d,-18d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,6d,7d,5d,-1d,2d,-6d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,-4d,6d,-5d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-15d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,10d,26d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,2d,0d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,3d,26d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,0d,4d,0d,1d,26d,5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,21000d,2d,8d,-4d,-10d,26d,6d,5d,-1d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,2d,26d,3d,-10d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,0d,-4d,5d,-6d,3d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,-630000d,3d,16d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-1663750000d,5d,-4d,-1d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,2d,-4d,5d,-10d,7d,21000d,-8d,9d,-10d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-10d,20999d,0d,-1d,0d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,8d,-10d,6d,5d,-1d,2d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,80d,0d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-300d,21000d,-630000d,9450000d,-78840000d,-6d,37d,1935360000d,-1663750000d,725760000d,-300d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,9d,-6d,3d,-7d,2d,-4d,-10d,6d,-1d,9450000d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,-3d,6d,5d,-1d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,2d,80d,-4d,5d,8d,2d,-6d,7d,-8d,9d,-9d,-8d,-8d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-11d,5d,10d,25d,26d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,-7d,-3d,5d,-6d,7d,-8d,9d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,2d,8d,-4d,-10d,26d,6d,5d,-1d,8d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,0d,-4d,5d,-6d,3d,7d,-9d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,5d,0d,26d,5d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(8d,-16d,26d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-300d,21000d,-630000d,9450000d,-78840000d,-6d,36d,1935360000d,-1663750000d,725760000d,-300d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,10d,7d,-8d,9d,-10d,-8d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-4d,5d,-6d,-8d,9d,-11d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,26d,0d,0d,0d,0d,1d,1d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,17d,-10d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,-2d,-5d,-11d,-18d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,-2d,-5d,-11d,-18d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,-8d,2d,-630000d,-4d,-10d,26d,6d,5d,-1d,-15d,10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,26d,3d,4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-300d,21000d,-630000d,9450000d,-78840000d,-6d,37d,1935360001d,-1663750000d,725760000d,-300d,725760000d,-300d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,5d,-26d,7d,-8d,9d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,5d,17d,26d,4d,-83d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,5d,17d,21000d,4d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,-1186740000d,2d,8d,17d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,17d,26d,17d,-300d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,1d,-1d,0d,0d,0d,0d,0d,0d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,2d,3d,5d,-6d,7d,-8d,21000d,-10d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,37d,10d,2d,20999d,-10d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d,-26d,-1186740000d,-1186740000d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-3d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9450000d,8d,-7d,3d,2d,1d,-4d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-3d,5d,-6d,7d,-8d,9d,-10d,5d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,-8d,6d,-630000d,-4d,-10d,26d,6d,395580000d,-1d,-15d,10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-6d,4d,-11d,8d,-4d,-10d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,1d,2d,0d,1d,0d,80d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,4d,-4d,16d,7d,-8d,9d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,0d,5d,0d,26d,9450000d,-18d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,2d,8d,-4d,-10d,26d,6d,5d,-15d,-1d,8d,4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,9d,-6d,3d,2d,-630000d,6d,-4d,-10d,6d,-11d,-1d,9450000d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,-4d,0d,4d,8d,5d,-5d,25d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-4d,4d,-6d,7d,-8d,9d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,-1d,1d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-26d,0d,0d,1d,0d,0d,0d,0d,0d,0d,-37d,-1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,16d,26d,37d,10d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,2d,16d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,5d,-6d,7d,-8d,-10d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-630000d,3d,16d,4d,0d,-630001d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,9450000d,-1d,16d,26d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,10d,-4d,5d,-6d,3d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,1d,2d,-3d,-630000d,3d,0d,4d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,37d,9d,2d,20999d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-6d,-1d,0d,0d,0d,26d,0d,0d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,21000d,3d,2d,8d,-4d,26d,6d,5d,-1d,1935360000d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,36d,9d,2d,20999d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,-3d,6d,80d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,-1663750000d,5d,-4d,-1d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,-4d,6d,-5d,4d,5d,-1d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,2d,8d,-4d,-10d,6d,-8d,-1186740000d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,25d,3d,4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-5d,5d,-6d,-8d,9d,-11d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-3d,-11d,-15d,-17d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,4d,-4d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,-300d,17d,26d,17d,-300d,26d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,2d,8d,7d,-10d,26d,6d,5d,-1d,7d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-11d,5d,10d,17d,26d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,2d,-4d,-10d,6d,-8d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,2d,0d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d,0d,-1186740000d,1d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,-83d,1d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,2d,6d,17d,26d,4d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(80d,-11d,5d,10d,17d,10d,26d,-9d,10d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,3d,26d,4d,4d,26d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,10d,17d,38d,26d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,5d,-6d,3d,7d,-9d,9d,-10d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,10d,17d,26d,37d,-4d,2d,20999d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-27d,4d,-4d,16d,7d,-8d,9d,-83d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,2d,9d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,-4d,7d,5d,-1d,2d,-6d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,-1d,26d,0d,3d,0d,5d,0d,26d,5d,-1d,0d,0d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(27d,-37d,-78840000d,0d,4d,0d,4d,26d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(5d,17d,26d,3d,4d,-6d,4d,9450000d,26d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,4d,-10d,5d,-6d,7d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,2d,8d,-4d,-10d,6d,5d,-1d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,-6d,3d,-3d,5d,-6d,7d,-8d,9d,-10d,5d,-3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,1d,-2d,4d,-4d,-26d,-6d,7d,9d,-11d,-4d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,4d,8d,2d,-6d,7d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,9d,3d,2d,-630000d,6d,-4d,-10d,6d,-11d,-1d,9450000d,-26d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,5d,-6d,7d,-8d,26d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-6d,26d,6d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-10d,-8d,2d,-630000d,-4d,-10d,26d,6d,5d,-1d,-15d,10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,80d,0d,4d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,20999d,2d,8d,-5d,-4d,26d,6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,3d,-4d,4d,-10d,7d,21000d,9d,-10d,26d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,3d,27d,4d,4d,26d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-11d,5d,27d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,10d,-4d,3d,8d,2d,-6d,7d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,-6d,3d,-3d,5d,-6d,7d,-8d,9d,-10d,5d,-3d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-4d,-10d,-17d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,-300d,17d,26d,17d,-299d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,-2d,-15d,-11d,-5d,-15d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,21000d,2d,8d,-4d,-10d,26d,-300d,-37d,5d,-1d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,5d,-300d,10d,17d,26d,26d,36d,9d,2d,20999d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,2d,16d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(4d,17d,26d,3d,4d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,3d,-4d,5d,-6d,7d,21000d,-8d,9d,-10d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,-2d,4d,-5d,5d,-6d,-8d,9d,-1186740000d,-7d,-11d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(26d,1d,3d,-4d,4d,-10d,21000d,9d,-10d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,9450000d,9d,-6d,-7d,2d,6d,1d,-4d,-10d,6d,-11d,-1d,9450000d,9d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,1d,1d,1d,1d,1d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,7d,-4d,-1d,2d,10d,-1d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,5d,0d,4d,0d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,-3d,0d,0d,0d,-10d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,6d,5d,-1d,2d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-3d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,5d,10d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,5d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-8d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,5d,1d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,0d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,4d,-6d,3d,2d,8d,-4d,725760000d,-10d,6d,5d,-1d,2d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,6d,1d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-8d,9d,-10d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-37d,-17d,-26d,-37d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-17d,-10d,3d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-3d,-4d,-10d,6d,5d,-8d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-8d,-2d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,5d,10d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-10d,6d,5d,-1d,2d,3d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-17d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-9d,8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-10d,-17d,-26d,-37d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,5d,-6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,-8d,9d,-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-7d,-4d,-6d,7d,-8d,-1186740000d,9d,-10d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-10d,-17d,-27d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,5d,-1d,2d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-630000d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,-10d,0d,0d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-7d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,-10d,-17d,-27d,-18d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-17d,-26d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,-3d,5d,-6d,7d,-8d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-7d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,9d,-26d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,17d,26d,37d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,5d,-6d,7d,-8d,9d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-7d,4d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,5d,-6d,7d,-8d,9d,-10d,-8d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,-10d,-7d,4d,-38d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,10d,17d,26d,9d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,9450000d,-10d,-17d,-38d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,-8d,-37d,-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,-630000d,-1663750000d,-78840000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-1663750000d,0d,0d,0d,0d,0d,0d,-10d,-1663750000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,-8d,9d,-10d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,3d,-4d,-6d,7d,-9d,9d,-10d,3d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,4d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-4d,-6d,7d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,10d,17d,26d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-36d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,17d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,-10d,0d,0d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,0d,1d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,8d,-4d,-10d,-6d,5d,-1d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,3d,-4d,-6d,7d,-9d,9d,3d,-3d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,5d,-8d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-1663750000d,0d,0d,0d,0d,0d,1d,0d,-10d,-1663750000d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,8d,-4d,-10d,-6d,-7d,5d,-1d,8d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,10d,26d,37d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-26d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-3d,-4d,-10d,6d,5d,-8d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,4d,-630001d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-7d,-26d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9449999d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,10d,17d,26d,9d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-8d,8d,-10d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-6d,-10d,-7d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-36d,-4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,5d,-8d,10d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-629999d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,395580000d,1935360000d,-1663750000d,725760000d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,4d,-7d,395580000d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-9d,-8d,-26d,-630002d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,4d,-6d,3d,2d,8d,-4d,725760000d,-10d,6d,5d,-1d,2d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-3d,-4d,-10d,5d,-8d,2d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,5d,-6d,-8d,9d,-10d,-8d,-8d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-2d,3d,3d,-6d,-3d,5d,-6d,37d,-630001d,-38d,-8d,9d,-10d,3d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,5d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,3d,-4d,-6d,7d,-8d,8d,-10d,-3d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,3d,5d,-6d,-8d,9d,-10d,-8d,-8d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,2d,0d,3d,1d,0d,-17d,0d,5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,2d,0d,3d,-36d,0d,-17d,0d,5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-3d,-17d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,9450000d,-11d,-10d,-17d,-38d,-26d,-37d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-7d,-26d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-8d,2d,0d,3d,1d,0d,1d,5d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,1935360000d,-1663750000d,725760000d,9449999d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,1d,4d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-4d,-10d,-17d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,8d,-6d,37d,5d,-8d,10d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-17d,-10d,21000d,3d,-10d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-2d,3d,-4d,8d,-6d,7d,-8d,9d,-10d,3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-1d,0d,0d,-3d,0d,0d,0d,-10d,-3d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-4d,-10d,-17d,-26d,395580000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,10d,17d,26d,0d,27d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,5d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-17d,-6d,-10d,3d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,5d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,5d,10d,18d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,5d,1d,-1663750000d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-630000d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-630000d,1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,-78840000d,395580000d,-1186740000d,1935360000d,725760000d,-630000d,-1663750000d,-78840000d,-1663750000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630002d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,-78840000d,27d,10d,5d,-8d,10d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,-27d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-28d,-2d,-5d,-10d,-17d,-27d,-17d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-7d,-4d,-6d,7d,-8d,9d,-10d,-3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,6d,395580000d,1935360000d,-1663750000d,725760000d,9450000d,395580000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-630000d,6d,5d,-1d,2d,3d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,2d,-2d,3d,-4d,-6d,8d,-9d,9d,-10d,3d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,-7d,-1d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,11d,17d,26d,9d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,1d,-1663750000d,0d,5d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-3d,-2d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,10d,1d,4d,0d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-3d,0d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,4d,-7d,395580000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-17d,0d,0d,0d,0d,-10d,0d,0d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,20999d,-630000d,9450001d,-78840000d,395580000d,1935360000d,-629999d,-1663750000d,-301d,725760000d,9449999d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-7d,4d,-38d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630000d,-2d,-10d,9d,-26d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-9d,-37d,-17d,-26d,-37d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,4d,-4d,-6d,7d,-3d,-2d,-10d,3d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,4d,-630001d,9450000d,1935360000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,4d,-4d,-6d,7d,-3d,-2d,-10d,-300d,3d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-1d,0d,1d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,395580000d,-1186740000d,-1186740000d,-1663750000d,725760000d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,7d,5d,-1663750000d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-8d,-7d,4d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-9d,-8d,-26d,-300d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,-1663750001d,4d,-4d,-6d,7d,-3d,-2d,-10d,3d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-37d,10d,17d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,395580001d,-1186740000d,-1186740000d,-1663750000d,725760000d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,-10d,-26d,-37d,-37d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,5d,1d,4d,0d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,-17d,-26d,-630001d,-36d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-7d,-1d,0d,1d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-5d,7d,-8d,-37d,-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-38d,-10d,-17d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,3d,-4d,-6d,7d,9d,9d,-10d,4d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,2d,-2d,3d,-4d,8d,-2d,9d,-10d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-36d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-38d,-10d,-18d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,395580001d,-7d,-26d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,11d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-3d,-2d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-17d,0d,0d,0d,-8d,0d,-10d,-7d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-8d,0d,3d,1d,0d,-17d,0d,5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,725760000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-629999d,-630000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-17d,-10d,-26d,-37d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-5d,-9d,-18d,-17d,-26d,-37d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,18d,0d,3d,4d,0d,5d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-28d,-38d,-10d,-17d,-37d,7d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,6d,-1d,-7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,-2d,-5d,-10d,-17d,-27d,-17d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-2d,-4d,-6d,7d,-8d,9d,-10d,-3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,-1d,3d,1d,0d,1d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-8d,2d,0d,3d,1d,0d,0d,5d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-629999d,-630002d,1935360000d,37d,-7d,-4d,-6d,7d,-4d,-8d,26d,9d,-10d,17d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-37d,10d,26d,37d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-10d,-11d,-7d,-26d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-4d,0d,0d,0d,0d,-10d,4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,-630000d,1d,-36d,0d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-1d,0d,0d,-3d,0d,-629999d,0d,-10d,-3d,-3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-4d,-6d,8d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d,-78840000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,4d,-4d,-6d,7d,-3d,-2d,-10d,-300d,3d,4d,-6d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,3d,0d,3d,1d,1d,4d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,2d,-2d,3d,-4d,-6d,8d,-9d,9d,-10d,3d,-2d,-6d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,-1d,10d,8d,-1186740000d,-10d,6d,5d,-26d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-17d,-5d,-10d,3d,10d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-9d,-8d,-25d,-630002d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,20999d,3d,-4d,-6d,7d,-300d,-9d,9d,-10d,3d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-1d,0d,3d,-36d,0d,-17d,0d,5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(10d,17d,26d,-6d,0d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,-26d,3d,-4d,-6d,8d,-9d,9d,-10d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-10d,-11d,-7d,37d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,-301d,1935360000d,-1663750000d,725760000d,9449999d,-1d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,3d,-4d,-6d,7d,-9d,10d,-10d,3d,-2d,-2d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,-5d,-10d,3d,10d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-630000d,7d,0d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,20999d,2d,0d,3d,1d,0d,1d,5d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,1935360000d,-629999d,725760000d,9449999d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,395580001d,-1186740000d,-1186740000d,725760000d,21000d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-3d,-6d,8d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-9d,3d,2d,8d,-3d,-4d,-10d,6d,5d,-8d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,37d,21000d,-630000d,9450000d,20999d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d,-78840000d,-630000d,-630000d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,-28d,2d,8d,-4d,-10d,6d,-1d,-7d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,-1186740000d,1935360001d,-1663750000d,725760000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,395580000d,-1186740000d,1935360001d,725760000d,7d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,-10d,-26d,-37d,-37d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,0d,1d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,4d,-6d,3d,2d,8d,-4d,725760000d,-10d,6d,5d,-1d,2d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-4d,-10d,6d,-1d,2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-6d,-10d,-6d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-629999d,-630002d,1935360000d,37d,-7d,-4d,-5d,-6d,7d,-4d,-8d,26d,37d,-10d,17d,9d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450000d,-78840000d,395580000d,1935360000d,-1663750000d,725760000d,9450000d,-300d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-9d,3d,2d,8d,-3d,-10d,6d,8d,5d,-8d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,-4d,-6d,7d,-9d,9d,-10d,3d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-6d,5d,10d,18d,26d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,10d,-6d,-78840000d,27d,10d,5d,-8d,10d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,9450000d,-11d,-17d,-38d,17d,-26d,-37d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,-1663750000d,0d,0d,0d,0d,0d,-10d,-1663750000d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-7d,-10d,-6d,9450001d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630002d,-2d,-6d,-7d,4d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,4d,5d,-6d,7d,5d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,-630000d,0d,1d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-3d,-6d,8d,-9d,9d,-10d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-36d,-4d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-3d,-6d,-9d,9d,-25d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-7d,-7d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-2d,-4d,-6d,7d,-8d,9d,-10d,-3d,-5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-11d,-27d,-2d,-6d,-10d,-7d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,5d,10d,395580001d,26d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-10d,-17d,-26d,-37d,-2d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-26d,-630000d,-36d,-36d,0d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,4d,-6d,3d,2d,8d,-4d,4d,725760000d,-10d,6d,5d,-1d,2d,3d,6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,17d,-36d,26d,37d,4d,-36d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-2d,-6d,7d,-8d,9d,-10d,-3d,-5d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,11d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,9450000d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630001d,9450000d,-78840000d,395580000d,-1186740000d,1935360000d,725760000d,7d,-1186740000d,725760000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-6d,5d,-1663750000d,3d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-2d,3d,3d,-6d,-3d,5d,-6d,37d,3d,-630001d,-38d,9d,-10d,3d,-1186740000d,9d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-36d,-4d,0d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-2d,3d,-4d,8d,-6d,7d,-8d,9d,-10d,3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,9450000d,-10d,-17d,-38d,-26d,-37d,-37d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,6d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(6d,1d,-26d,3d,-4d,-6d,7d,-9d,9d,0d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-8d,-3d,5d,-6d,7d,-8d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-25d,-630000d,-78840000d,395580000d,1935360000d,-1663750000d,1935360000d,725760000d,9449999d,-1d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,10d,17d,26d,17d,9d,0d,17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-37d,10d,26d,-36d,26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,20999d,2d,0d,3d,1d,0d,1d,5d,8d,1d,5d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-10d,6d,5d,0d,2d,3d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-301d,-6d,9450000d,-10d,-17d,-38d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,20999d,-630000d,9450001d,725760000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d,-630000d,725760000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,2d,0d,3d,1d,4d,5d,1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-7d,395580001d,-7d,-26d,-630001d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-8d,0d,3d,1d,0d,-17d,0d,5d,21000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,1d,-2d,3d,-4d,-6d,7d,-9d,9d,3d,6d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(3d,-2d,3d,-4d,8d,-630000d,7d,-8d,9d,-10d,3d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-4d,-6d,7d,-8d,9d,-26d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,725760000d,-28d,2d,8d,-6d,-4d,-10d,6d,-1d,-7d,8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,-10d,0d,0d,0d,1d,0d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,-2d,-4d,-6d,7d,-8d,9d,-10d,-3d,1d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,9450001d,-38d,-78840000d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9449999d,-630000d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,-78840000d,395580000d,-1186740000d,-1186740000d,-1663750000d,725760000d,-1186740000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-3d,-2d,3d,1935360001d,9449999d,-3d,5d,-6d,37d,3d,-630001d,-630000d,-8d,9d,-10d,3d,-10d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-630000d,7d,9450000d,-78840000d,-18d,395580000d,1935360000d,-1663750000d,725760000d,9450000d,-300d,1935360000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,10d,17d,26d,17d,9d,0d,18d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5d,-10d,-27d,-18d,-7d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,37d,21000d,-630000d,9449999d,20999d,-17d,395580000d,-1186740000d,1935360000d,-1663750000d,725760000d,9450000d,-630000d,-78840000d,-630000d,-630000d,9450000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,1d,0d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,5d,10d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-17d,-10d,-18d,-26d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-4d,-10d,-26d,-37d,26d,-4d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,3d,8d,-4d,-10d,6d,5d,-1d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-78840001d,6d,5d,-1d,2d,3d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-6d,3d,2d,8d,-9d,-4d,-10d,6d,5d,-1d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,-3d,5d,-5d,7d,-8d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-17d,-301d,-10d,3d,-26d,-37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-6d,6d,-9d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,-5d,5d,-1663750000d,3d,9d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-3d,-6d,8d,-9d,9d,-10d,-26d,-3d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,3d,-2d,-4d,-6d,7d,-8d,9d,-10d,-3d,1d,-8d,-6d,-6d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,-7d,3d,2d,8d,-4d,-10d,-10d,6d,-1d,-7d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-10d,-38d,-6d,-26d,-38d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,27d,-6d,-10d,-7d,-26d,-38d,-26d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-629999d,-630002d,1935360001d,37d,-7d,-4d,-6d,7d,-4d,-8d,26d,9d,-10d,17d,9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-26d,3d,-9d,9d,-25d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,17d,0d,7d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-27d,3d,-4d,-6d,8d,-9d,9d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-8d,-6d,3d,2d,8d,-4d,725760000d,-10d,5d,-1d,5d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2d,-36d,2d,-4d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-38d,-10d,-17d,-26d,4d,-37d,-17d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-11d,-2d,3d,5d,-6d,7d,5d,-1663750000d,9d,-10d,-11d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,5d,18d,7d,-8d,-37d,-10d,-8d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,0d,-10d,0d,0d,0d,0d,1d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-9d,3d,5d,-6d,-8d,9d,-10d,-8d,-8d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9d,4d,-6d,3d,2d,8d,-4d,725760000d,-9d,6d,5d,-1d,2d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-300d,21000d,-299d,-630001d,-78840000d,-1186740000d,1935360000d,-1663750000d,725760000d,-630000d,-1663750000d,-78840000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,5d,10d,21000d,17d,37d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,26d,0d,3d,-9d,0d,5d,-9d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630001d,-2d,3d,5d,-6d,7d,5d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,-37d,17d,26d,37d,10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(0d,0d,0d,0d,-630000d,1d,0d,1d,0d,-630000d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1d,10d,17d,-1663749999d,9d,0d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-2d,-6d,-10d,9d,-26d,-10d,-10d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-17d,-10d,21000d,3d,-10d,-26d,-37d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1d,-2d,3d,-3d,-6d,7d,-8d,-2d,-10d,3d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-630001d,-2d,3d,5d,-6d,8d,5d,-8d,8d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(7d,-28d,-38d,-27d,-17d,-37d,7d,-10d));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
}
