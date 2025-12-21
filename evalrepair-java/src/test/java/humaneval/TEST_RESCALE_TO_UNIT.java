package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_RESCALE_TO_UNIT {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,49.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {100.0,49.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.0,5.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.25,0.0,1.0,0.5,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {12.0,11.0,15.0,13.0,14.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.25,0.0,1.0,0.5,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,2.5,3.0,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,2.5,0.0,-2.5,-5.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.75,0.625,0.5,0.375,0.25,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.5,0.9,0.3,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.24999999999999997,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,10.0,15.0,20.0,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100.0,-50.0,0.0,50.0,100.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.6666666666666666,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,8.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8333333333333333,0.16666666666666666,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,2.5,3.0,3.5,3.5,3.4499912778820896});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0,1.0,0.9749956389410448}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,1.0,0.6831806134735121});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,1.0,0.841590306736756}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,1.0,0.531467821985593});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,1.0,0.7657339109927965}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,-9.46747586475692});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7431613613015037,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.5,0.9,0.3,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3333333333333333,1.0,0.0,0.6666666666666665}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,8.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.16666666666666666,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.3333333333333333,0.16666666666666666,0.0,0.16666666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.6831806134735121,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,0.841590306736756,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.88337557029465});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25750792883628437,0.5150158576725687,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,1.0,-1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.130142616161574,2.0,5.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7100475387205247,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.9,0.3,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.24999999999999997,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,2.1745158364579007,3.0,3.5,3.5,3.4499912778820896,2.7376185386525926,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.33725791822895035,0.75,1.0,1.0,0.9749956389410448,0.6188092693262963,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,2.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,1.0,-1.0,1.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0,0.5218127444499308});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.5260906372224966}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,-9.46747586475692,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7431613613015037,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0,0.6661097696919548}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-9.142847173489907,0.0,10.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.042857641325504674,0.5,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100.0,-62.89269313319225,0.0,50.0,100.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18553653433403874,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,-10.0,-1.0,0.6831806134735121,-1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.8181818181818182,0.0,0.8181818181818182,0.9711982375885011,0.8181818181818182,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.3,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,4.067002335783351,0.0,-2.5,-5.0,-9.46747586475692});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6952353913042474,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,2.5,0.26171065189523324,-2.5,-5.0,-10.0,-100.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.9545454545454545,0.9318181818181818,0.9114700968354111,0.8863636363636364,0.8636363636363636,0.8181818181818181,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.3,0.7,0.2985177336558441});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,1.0,0.33086288942640685}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.531467821985593});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,0.7657339109927965}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.6831806134735121,-1.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,0.841590306736756,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,0.0,-2.5,-5.0,-9.46747586475692});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,3.4499912778820896,-1.0,-1.0,1.0,0.5838719823105398});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.44943908315970266,0.0,1.0,0.0,0.0,0.44943908315970266,0.3559269857859949}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0,0.5218127444499308,0.0,0.531467821985593,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.5260906372224966,0.5,0.5265733910992797,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,8.0,2.0,-50.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9137931034482758,1.0,0.896551724137931,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-9.46747586475692,-3.3072700859535313});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7431613613015037,0.48632272260300735,0.3579034032537592,0.0,0.31643577326609457}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0,0.531467821985593});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.7657339109927965}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.9,0.3,0.7,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.24999999999999997,0.75,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.531467821985593,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,0.7657339109927965,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.531467821985593,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,1.0,0.0,0.7657339109927965,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.937376318260506,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.944887597354252,2.0,2.0,5.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6482958657847506,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0,0.6831806134735121,-1.0,1.1140129329785569});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9460680059237304,0.0,0.7962016632991834,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,0.5218127444499308,0.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9504065737412806,1.0,0.9504065737412806,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,5.5393493405344465});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8476134202528299,0.0,0.0,0.8476134202528299,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,-7.758548951714786});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7184454645706178,0.4368909291412355,0.29611366142654433,0.15533639371185323,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.2,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,1.0,1.0,-0.6653352961236785,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999999999999999,0.9999999999999999,0.9999999999999999,0.0,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,2.5,3.0,3.5,3.4499912778820896});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0,0.9749956389410448}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.3,0.7,0.2985177336558441,0.2985177336558441});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,1.0,0.33086288942640685,0.33086288942640685}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.342224527290663,1.0,-1.0,0.531467821985593});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.14611089727018042,0.799962739457615}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.9,0.3,0.7,0.7,0.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.24999999999999997,0.75,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,-7.758548951714786,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7184454645706178,0.4368909291412355,0.29611366142654433,0.15533639371185323,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0,0.5218127444499308,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.5260906372224966,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0,1.1140129329785569});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9460680059237304,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0,0.531467821985593,4.067002335783351});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.39471069233103145,0.0,0.30224336214931513,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,4.067002335783351,3.0,3.5,3.5,3.4499912778820896,2.7376185386525926,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.19477972147906875,1.0,0.5843391644372062,0.779118885916275,0.779118885916275,0.7596375159849735,0.48212598851216815,0.779118885916275}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.1,0.9,0.3,0.7,0.7,0.9,0.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.24999999999999997,0.75,0.75,1.0,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,3.4499912778820896,5.165207408346182,2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9478051871385885,0.0,0.0,0.9478051871385885,0.45810308482745166,1.0,0.15796753118976475}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,10.0,0.5218127444499308,0.0,0.531467821985593,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,1.0,0.5260906372224966,0.5,0.5265733910992797,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,15.0,20.0,25.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,0.75,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,4.067002335783351,5.0,2.0,4.067002335783351});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.6890007785944503,1.0,0.0,0.6890007785944503}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,-5.0,-9.46747586475692});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.4718761292423558,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,3.4499912778820896,5.165207408346182,2.5,4.067002335783351,2.0,1.3728105527515997});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9564372045867335,0.16538075289329598,0.16538075289329598,0.9564372045867335,0.5477224046492424,1.0,0.29722349484220223,0.7104192640222377,0.16538075289329598,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.13529057908833445,0.3,0.7,0.2985177336558441,0.2985177336558441,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.016696834532450282,0.05724541867544202,0.01654657502850446,0.01654657502850446,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.88337557029465,1.2200287334177464});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25750792883628437,0.5150158576725687,0.9999999999999999,0.05665914342687483}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,3.4499912778820896,-1.0,-1.0,1.0,0.5838719823105398,0.13529057908833445});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.44943908315970266,0.0,1.0,0.0,0.0,0.44943908315970266,0.3559269857859949,0.2551219784926545}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,20.0,25.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.75,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,0.0,10.0,0.5218127444499308,-9.863742780614741});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.5260906372224966,0.006812860969262946}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,2.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.2,0.0,0.2,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-9.46747586475692,-3.3072700859535313,0.26171065189523324});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7431613613015037,0.48632272260300735,0.3579034032537592,0.0,0.31643577326609457,0.4997662041161409}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-10.0,-1.0,0.6831806134735121,-1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8181818181818182,0.0,0.8181818181818182,0.9711982375885011,0.8181818181818182,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,2.5,0.0,-2.5,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.75,0.625,0.5,0.375,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,3.1490494688822803,5.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.38301648962742674,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,4.067002335783351,0.0,-2.5,-5.0,-9.46747586475692,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6952353913042474,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0,0.48632272260300735}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.944887597354252,2.0,0.13529057908833445,5.0,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.78310885371484,0.3833136287433611,0.0,1.0,0.6916568143716806}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,5.0,2.0,5.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.5,2.0,2.5,3.0,3.5,1.7631948427633328,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.75,1.0,0.1315974213816664,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,2.5,0.0,-2.5,-5.0,-10.0,0.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.75,0.625,0.5,0.375,0.25,0.0,0.5,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,0.0,-2.5,-5.0,-9.46747586475692,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,-1.0,0.6831806134735121,-1.0,1.1140129329785569,3.4499912778820896,0.8299626343906432});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.44943908315970266,0.0,0.37824357585586055,0.0,0.47506001719281826,1.0,0.41122836430852244}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,2.0,5.0,3.4499912778820896,5.165207408346182,2.5,4.067002335783351,2.0,1.3728105527515997,6.451678726414332});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7141727887441066,0.12349000324536669,0.12349000324536669,0.7141727887441066,0.4089849655681234,0.7467011794597568,0.2219371341618233,0.5304709023563372,0.12349000324536669,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,5.0,0.0,-2.5,-5.0,50.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2727272727272727,0.18181818181818182,0.09090909090909091,0.045454545454545456,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-1.0,1.0,-1.0,0.531467821985593,-7.758548951714786,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.7716516730081835,1.0,0.7716516730081835,0.9465057305042891,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,2.0,5.0,5.5393493405344465,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.375,0.0,0.375,0.4424186675668058,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,10.0,0.5218127444499308,-9.863742780614741});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4965702027837816,1.0,0.5228398111961082,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.0,4.067002335783351,0.0,-2.5,-5.0,-9.46747586475692,4.067002335783351});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6952353913042474,0.48632272260300735,0.3579034032537592,0.22948408390451103,0.0,0.6952353913042474}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-6.486753627961523,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100.0,0.0,50.0,100.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.7000000000000001,0.8,0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5e-09,1000000000});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.499560300532895,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.499560300532895,0.0,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.17857142857142855,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,13.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.2451826892610212,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7580683373680396,1.0,0.5178571428571429}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,1.0,0.5178571428571429}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-100000.0,-1.0,-0.5,-9.66675615633341,-0.1,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999009999009999,0.999945999946,0.0,0.9999909999909999,0.999995999996,0.999904332342769,0.9999999999999999,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.5357142857142857,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,13.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998800203965327,0.9999200135976885,0.9999400101982664,0.9999600067988442,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.49893003046209256,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,-3.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,1.0,0.2857142857142857,0.0,0.14285714285714285,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999960005199324,0.999980002599662,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,-87387.4823957305});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.12610121681150077}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-0.5,9.0,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.3214285714285714,1.0,0.2857142857142857,0.0,0.49893003046209256,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,1.2451826892610212,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2739990444362713,0.2739990444362713,0.6369995222181357,0.6369995222181357,0.6369995222181357,1.0,0.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,7.0,8.932911673408139,11.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.39347914502763015,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0,0.0,0.30000000000000004,0.5,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.5000100000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.5833333333333333,0.75,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,9.0,8.422739790413504});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999960005199324,0.999980002599662,1.0,0.999960005199324,0.9999542333475689}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.2400220924963046,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2685698505359782,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.5662174840625469,0.28310874203127345,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,-1.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.18367346938775508,0.673469387755102}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.1732110691820333,0.21920090241868048,0.31246774927128523}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,-1.2,11.0,17.0,19.0,11.0,11.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9997980383727092,0.9999200151971126,0.9999800037992782,1.0,0.9999200151971126,0.9999200151971126,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.500015}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.000020000400008e-05,1.000020000400008e-05,1.000020000400008e-05,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05,1.0,0.0,2.000040000800016e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,-100000.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999990000099999,0.999990000099999,0.999990000099999,0.0,0.999990000099999,0.999990000099999,0.999990000099999,0.999990000099999,1.0,0.999990000099999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,2.0,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.375,0.75,1.0,0.825}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,1.5222176980104452,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.5000076110884901,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,13.0,17.0,19.0,-87387.4823957305});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999400113978344,0.9999800037992782,1.0,0.12610121681150077}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.0,4.0,4.0,100000.0,2.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.000020000400008e-05,1.000020000400008e-05,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05,1.0,0.0,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,-3.0,-5.5,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8620689655172413,1.0,0.3103448275862069,0.034482758620689655,0.1724137931034483,0.0,0.6551724137931034,0.7931034482758621}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344,0.9999000189963907}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.029460583547525,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999203097469836,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.023592395169272785,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-9.66675615633341,-3.0,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5434815913326294,0.7880450245472922,0.8940225122736462,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.494052310009373,7.824002367662983,9.0,8.422739790413504,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999492937171364,0.999915070937272,0.9999550655403794,0.999975062841933,0.9999999999999999,0.9999433071507392,0.9999550655403794,0.9999492937171364,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.029460583547525,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999203097469836,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.4718479033854557}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523,0.09966014785525446}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,-93935.84316983708,4.0,4.0,4.0,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.030320784150814583,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.2400220924963046,-1.0,2.0,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.375,0.7299981589586413,0.75,1.0,0.825}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.9741314779560433,-5.5,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18472932743036555,0.0,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.673469387755102}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.2451826892610212,-0.1,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6831272555916355,0.4198620983247112,0.7066833678534159,1.0,0.6831272555916355,0.6831272555916355}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,8.932911673408139,11.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,3.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0,6.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,1.4117100309373578,-2.37372058193593,-1.2,0.0,1.3,2.6,-1.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.7878053626673853,0.1118356103685839,0.32142857142857145,0.5357142857142857,0.7678571428571428,1.0,0.32142857142857145}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,-1.2,11.0,17.0,19.0,11.0,11.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9997980383727092,0.9999200151971126,0.9999800037992782,1.0,0.9999200151971126,0.9999200151971126,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.046541901582966,3.0,-100000.0,3.458912167325974,3.0,4.0,1.2451826892610212,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999795354090923,0.9999795354090923,0.9999999999999999,0.9999895350044545,0.0,0.9999941239404345,0.9999895350044545,0.9999995345998167,0.9999719875414126,0.9999995345998167,0.9999995345998167,0.9999995345998167}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,16.290878548158467,15.0,5e-09,17.0,19.0,9.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.0,0.30000000000000004,0.4,0.5,0.18000000000000002,0.6000000000000001,0.7000000000000001,0.8645439274079234,0.8,0.05000000025,0.9,1.0,0.5,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,0.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523,0.09966014785525446,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,1.46050216156186,3.0,4.0,4.0,4.0,4.0,2.0,4.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.21244272401899175,0.21244272401899175,0.6062213620094958,0.6062213620094958,0.0,0.6062213620094958,0.9999999999999999,0.9999999999999999,0.9999999999999999,0.9999999999999999,0.21244272401899175,0.9999999999999999,0.6062213620094958,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,2.071031386145096,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.14490597207834935,0.28310874203127345}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.970622647728508,4.0,4.0,4.0,4.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999702952500337,0.9999702952500337,0.9999802947529961,0.9999802947529961,0.9999802947529961,1.0,0.9999902942559586,0.9999902942559586,0.9999902942559586,0.9999902942559586,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,1.0,2.0,2.0,3.0,4.0,2.492199888107555});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6666666666666666,0.7777777777777777,0.7777777777777777,0.8888888888888888,1.0,0.8324666542341728}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,1.0932387793203828,0.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.9147132528738643,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,2.0,-1.0,-0.6513673284956263,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.75,0.7790527226253645,0.825}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,8.932911673408139,11.0,13.0,15.0,17.0,0.8986163754356359,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.08509444398719732,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,13.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.7000000000000001,0.8,0.9,1.0,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.2451826892610212,2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000062259134463,0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.401137390833725,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.41948214587105415,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-2.37372058193593,9.0,-1.2400220924963046,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.1875913870045764,1.0,0.2685698505359782,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.0,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.499995,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,13.0,17.0,19.0,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999400113978344,0.9999800037992782,1.0,0.9997978623192763}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999980002599662,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,4.769631488983501,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,-1.0,10.151375828019562});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.41916863220340816,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.18367346938775508,0.638831666449778}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.16986524521876406}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,8.932911673408139,11.0,13.0,15.0,17.0,0.8986163754356359,19.0,0.8986163754356359});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.08509444398719732,0.9999999999999999,0.08509444398719732}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,9.883843909648547,17.0,19.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999088557565027,0.9999800037992782,1.0,0.9998000379927814}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-100000.0,-1.0,-0.5,-9.66675615633341,-0.1,-0.12405312115430803});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999009999009999,0.999945999946,0.0,0.9999909999909999,0.999995999996,0.999904332342769,0.9999999999999999,0.9999997594685479}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0,6.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428,0.6428571428571428,0.6428571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,9.0,11.0,13.0,17.0,19.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-6.434931263616406,2.0,4.0,6.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8704237831810467,0.6112713495431401,1.0,0.3521189159052336,0.0,0.5464832411336635,0.6760594579526168,0.80563567477157,0.80563567477157}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344,0.9999000189963907}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034,0.673376412076657}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,1.5222176980104452,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.5000076110884901,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.2451826892610212,2.0,2.0,3.0,3.0,3.0,2.232577808710385,4.0,4.0,4.0,100000.0,1.8392488338004267,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000062259134463,0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.5000111628890436,0.50002,0.50002,0.50002,1.0,0.5000091962441691,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.2176086883151271,0.8986163754356359,1.46050216156186,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.21756951090921e-05,0.00011618604610009662,0.0,2.1161992967242643e-05,2.6780782413636407e-05,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-2.37372058193593,9.0,-1.2400220924963046,-5.0,3.0,4.0,6.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.1875913870045764,1.0,0.2685698505359782,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,0.8571428571428571}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,-5.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,2.071031386145096,5.0,-1.0,20.193269967400774});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6350902451608486,0.15877256129021214,0.39693140322553033,0.47631768387063644,0.5557039645157424,0.0,0.7144765258059547,0.7938628064510607,0.19846570181123088,0.8732490870961668,1.0,0.9526353677412729,0.280671441035434,0.39693140322553033,0.15877256129021214,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,5.486580591351534,-1.2400220924963046,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.8738817159459611,0.3133314922919746,0.0,0.6666666666666666,0.75,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,9.0,13.0,15.0,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.4718479033854557,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,12.435097367794613,3.458912167325974,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.5956527633517534,0.696739572513815,0.668187470225369,0.21450051004382134,0.8989131908379383,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.499560300532895,0.0,0.0,0.0,9.883843909648547,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.05054311916492604,0.0,0.0,0.0,1.0,0.10117521170319234,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,4.769631488983501,7.0,9.0,11.0,5.0,13.0,15.0,10.151375828019562,17.0,19.0,-1.0,10.151375828019562});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.41916863220340816,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.638831666449778,0.9183673469387754,0.9999999999999999,0.18367346938775508,0.638831666449778}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,5.0,17.725302075603715,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.30000000000000004,0.9362651037801858,0.8,0.9,1.0,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,2.071031386145096,11.0,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.1535515693072548,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,9.0,2.0,4.0,6.0,6.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,1.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,4.769631488983501,-1.0,1.0,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6978308206416787,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.906463496197338,4.0,4.0,-87387.4823957305,100000.0,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.500024532317481,0.50002,0.50002,0.06306258802134748,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.4269239279743262,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4269239279743262,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-88211.32021789154,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998801176264184,0.999841324388652,0.9998866602776086,0.9999093282220869,0.9999319961665651,0.9999773320555218,1.0,0.9997903165300344,0.9999319961665651}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.9741314779560433,7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.28756203728885404,0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,-1.2176086883151271,1.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5490638157808762,0.5490638157808762,0.5490638157808762,0.5490638157808762,0.5490638157808762,0.5490638157808762,0.0,1.0,0.5490638157808762,0.5490638157808762}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.324887692190664,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999232634568651,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,12.435097367794613,3.458912167325974,17.0,19.0,3.458912167325974});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.5956527633517534,0.696739572513815,0.668187470225369,0.21450051004382134,0.8989131908379383,0.9999999999999999,0.21450051004382134}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.401137390833725,-0.1,-1.2176086883151271,0.8986163754356359,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-100000.0,-1.0,-0.5,-0.1,4.970622647728508,4.970622647728508});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998503012144844,0.9998952989778154,0.0,0.9999402967411464,0.9999452964926276,0.9999492962938126,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,2.071031386145096,11.0,5.0,13.0,15.0,17.0,19.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.1535515693072548,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-100000.0,-1.0,-0.5,-9.66675615633341,-0.1,-0.12405312115430803,4.769631488983501,-0.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998523107293442,0.9998973085831124,0.0,0.9999423064368806,0.9999473061984104,0.9998556430088434,0.9999513060076343,0.9999510654878947,1.0,0.9999473061984104}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,1.5222176980104452,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.500015,0.5000076110884901,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,2.258580593854103,12.527987311788877,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6846193910654594,0.41411375218032975,1.0,0.2282064636884865,0.0,0.3985067025791004,0.6275677751433378}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.5000100000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,0.4269239279743262,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.38763742342673757,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,19.0,8.422739790413504});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,1.0,0.999894247490881}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.894736842105263,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.6842105263157894,0.7368421052631579,0.8421052631578947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,-3.0,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0,0.0,0.7678571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,11.0,5.0,13.0,15.0,17.0,18.55562594891745});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18706642718654798,0.0,0.5196289644070777,0.6859102330173427,0.4364883301019453,0.7690508673224751,0.8521915016276075,0.9353321359327399,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-147046.595120599,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3199021163448808,0.9999280779423568,0.9999048043834554,0.9999456025048317,0.9999592018786237,0.999833407671047,1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,0.4269239279743262,-5.0,3.0,4.0,-5.392186064112541,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8610357042988017,0.5831071128964052,1.0,0.40432426082907846,0.02724993009161211,0.5831071128964052,0.6525892607470043,0.0,0.7915535564482026}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,-5.0,3.0,4.0,6.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,13.0,-116505.32195163157,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14164944257189566,0.9998970154404838,0.9999313436269892,0.9999485077202419,0.9999656718134946,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-5.0,3.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.562048029970825,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.7810240149854124,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.5833333333333333,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,12.435097367794613,17.725302075603715,17.0,19.0,3.458912167325974});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.5956527633517534,0.696739572513815,0.668187470225369,0.9355724270886383,0.8989131908379383,0.9999999999999999,0.21450051004382134}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.5662174840625469}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.626959923143518,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.813479961571759,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.2176086883151271,-0.5899488856573549,-3.0,-2.5,-1.2,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3182841628008702,0.4303662704183294,0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {9.0,-1.2400220924963046,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.41406376414005136,0.5117198034500429,0.7070318820700258}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,-88211.32021789154,11.0,13.0,-5.5,19.0,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.11786440358440359,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,13.0,17.0,19.0,-1.9494985562533456});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999400113978344,0.9999800037992782,1.0,0.9997905448109234}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,2.0,4.0,9.294663202788586,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8394741330917859,0.9793864886070835,0.2798247110305953,0.0,0.4896932443035418,0.6296055998188395,1.0,0.7695179553341371}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,19.0,3.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4,0.2,0.5,0.0,1.0,0.2,0.25,0.35000000000000003,0.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,3.0,9.0,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,0.5714285714285714,1.0,0.2857142857142857,0.0,0.17857142857142855,0.5,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,19.41864539875061,5.0,9.0,11.0,11.029460583547525,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.9998558415396327,0.9998958337736825,0.9999158298907075,0.9999161244393456,0.9999758182417823,0.9999958143588072}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,12.435097367794613,-2.5,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1433889325228488,0.4588445840731161,0.6814087571883665,0.22942229203655806,0.0,1.0,0.1433889325228488,0.4014890110639766,0.5162001570822556,0.6309113031005347,0.4588445840731161}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,17.0,20.193269967400774,19.0,11.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114,0.5662174840625469,0.8493262260938202}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,-1.9494985562533456,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.256766964653098,0.5892043605670749,0.7575484635862391,0.9258925666054034,0.673376412076657}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,0.499560300532895,17.725302075603715});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.999987255442222}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,16.290878548158467,15.0,3.6477041535209116,5e-09,17.0,19.0,9.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.0,0.30000000000000004,0.4,0.5,0.18000000000000002,0.6000000000000001,0.7000000000000001,0.8645439274079234,0.8,0.2323852076760456,0.05000000025,0.9,1.0,0.5,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,19.41864539875061,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.49142775137780514,1.0,0.3276185009185368,0.4865310026351811,0.1638092504592684,0.0,0.10238078153704275,0.2866661883037197,0.36857081353335386,0.45047543876298807}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,19.41864539875061,3.0,3.562048029970825,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.49142775137780514,1.0,0.3276185009185368,0.3506356675464441,0.1638092504592684,0.0,0.10238078153704275,0.2866661883037197,0.36857081353335386,0.45047543876298807}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,9.0,6.822138554696681,5.0,13.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.5102040816326531,0.5918367346938775,0.5029444308039461,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.42857142857142855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,2.0,-0.1,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.375,0.75,1.0,0.825,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,9.0,11.0,11.029460583547525,18.149298285479812,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.2857142857142857,0.42857142857142855,0.4306757559676804,0.9392355918199865,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,0.0,100000.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.00012217459927461562,1.1175950803803283e-05,0.0,1.2175938627864657e-05,2.5175780340662495e-05,3.8175622053460336e-05,1.2175938627864657e-05,1.0,0.00012217459927461562}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.9183673469387754,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-87387.4823957305,3.0,9.0,-1.0,-5.0,3.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999313473513404,1.0,0.9998855789189006,0.9998398104864609,0.9999313473513404,0.9999427894594503,0.9999313473513404}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,9.0,2.0,4.0,6.0,6.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,1.0,0.2857142857142857,0.0,1.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,2.0,-5.0,3.0,4.0,6.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.5,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,1.2451826892610212,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.40017135553497335,0.8003427110699467,1.0,0.8803769821769414}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,19.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,1.0,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,2.0,-5.0,3.3850444114672107,4.0,6.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.5,0.0,0.5989317436762294,0.6428571428571428,0.7857142857142857,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.258580593854103,12.527987311788877,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.41411375218032975,1.0,0.2282064636884865,0.0,0.3985067025791004,0.6275677751433378}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,18.803842168566185,5.0,7.0,2.071031386145096,11.0,5.0,13.0,15.0,17.0,19.0,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9901921084283093,0.30000000000000004,0.4,0.1535515693072548,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.123025108078093}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.401137390833725,4.0,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.5843724246857585,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.41948214587105415,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,18.803842168566185,5.0,7.0,2.071031386145096,-0.5,5.0,13.0,15.0,17.0,19.0,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9901921084283093,0.30000000000000004,0.4,0.1535515693072548,0.025,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.123025108078093}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.9976986611875804,10.401137390833725,4.0,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.5554406364717839,0.27069539837148315,0.1930774100648354,0.3400493636383805,0.37907236411537726,0.45821055516924214}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,4.906463496197338,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3018824687121769,0.9999999999999999,0.6641414311667891}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,17.0,20.193269967400774,19.0,11.0,17.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.8493262260938202,1.0,0.9436958067709114,0.5662174840625469,0.8493262260938202,0.37747832270836457}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.401137390833725,2.232577808710385,8.932911673408139,11.0,10.282719410300084,13.0,12.435097367794613,3.458912167325974,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.48716847998058793,0.0,0.3996042914800858,0.5228843224240002,0.4801060956031517,0.6421632418180002,0.6084727540518579,0.07313791855570076,0.8807210806060001,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.8340070003829894,10.31652351054666,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,2.071031386145096,5.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.18090681646958737,0.5339677892063658,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.14490597207834935,0.28310874203127345,0.37747832270836457}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {18.149298285479812,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000907464914275,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.49999391195655846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,5.486580591351534,-1.2400220924963046,3.0,4.0,4.006918996620226,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.514564408311167,0.8163330884723421,0.0,0.514564408311167,0.6359233062333752,0.6367629880379334,0.8786411020777918}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-99999.35396643436,19.0,19.0,8.004448108665093});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,6.459108425846659e-06,1.0,1.0,0.9998900653686666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,9.0,11.0,10.971192509868965,18.149298285479812,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.2857142857142857,0.42857142857142855,0.42651375070492603,0.9392355918199865,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,3.562048029970825,13.0,-6.434931263616406,15.0,17.0,19.0,-1.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.21367980936480238,0.03675776647188292,0.44957586655536164,0.5282078856188814,0.6068399046824011,0.6854719237459209,0.44957586655536164,0.3930413331954817,0.7641039428094407,0.0,0.8427359618729604,0.9213679809364802,0.9999999999999999,0.21367980936480238,0.6854719237459209}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5,19.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572,1.0,0.9997550465411572}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.562048029970825,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.7810240149854124,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,1.0,2.0,2.0,4.0,2.492199888107555});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6666666666666666,0.7777777777777777,0.7777777777777777,1.0,0.8324666542341728}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,1.0,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1,0.30000000000000004,0.4,0.5,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.5833333333333333,0.75,0.9166666666666666,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,15.73361557746605,0.499560300532895,8.932911673408139,11.0,13.0,15.0,17.0,19.0,-0.7849750781391729,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.8349058106146898,0.06492479134286995,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.9999999999999999,0.0,0.5956527633517534}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,13.0,3.626959923143518,-87387.4823957305});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999960005199324,1.0,0.9999062817825997,0.12610878190104782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.9183673469387754}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,12.751538518728971,-2.5,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14083286343672946,0.4506651629975343,0.6692618792626058,0.22533258149876714,0.0,1.0,0.14083286343672946,0.3943320176228425,0.506998308372226,0.6196645991216096,0.4506651629975343}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.0,4.0,4.0,100000.0,2.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.000020000400008e-05,1.000020000400008e-05,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05,1.0,0.0,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,3.562048029970825,13.0,-6.434931263616406,15.0,17.0,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.21367980936480238,0.03675776647188292,0.44957586655536164,0.5282078856188814,0.6068399046824011,0.6854719237459209,0.44957586655536164,0.3930413331954817,0.7641039428094407,0.0,0.8427359618729604,0.9213679809364802,0.9999999999999999,0.6854719237459209}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.258580593854103,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6598709630776457,0.36363636363636365,0.0,0.6350018569517542,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,5.234060683691759,2.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.3092087928475343,0.3092087928475343,0.3092087928475343,0.6184175856950686,0.6184175856950686,0.6184175856950686,1.0,0.0,0.6184175856950686,0.6184175856950686,0.3092087928475343}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.3850444114672107,7.0,3.0,9.0,0.4269239279743262,-5.0,3.0,4.0,-5.392186064112541,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6098608256230169,0.8610357042988017,0.5831071128964052,1.0,0.40432426082907846,0.02724993009161211,0.5831071128964052,0.6525892607470043,0.0,0.7915535564482026}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.3815710434538918,-10.0,-5.5,-1.0,-0.5,-0.1,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.43346040605650704,0.8669208121130141,0.915083079452626,0.9536128933243155,0.8669208121130141}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-6.022656626008542,-1.0,1.2451826892610212,-0.1,1.2451826892610212});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3536930865329347,0.8003427110699467,1.0,0.8803769821769414,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,9.0,9.294663202788586,8.422739790413504});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999960005199324,0.999980002599662,1.0,0.999960005199324,0.9999629514483396,0.9999542333475689}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,17.0,19.0,-99999.35396643436,17.725302075603715});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,6.459108425846659e-06,0.999987255442222}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {24.263901532923043,9.0,11.0,10.971192509868965,18.149298285479812,16.116478869765537,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.13102809892255635,0.12914080358925645,0.599407580410912,0.4662293486639604,0.6551404946127817}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,19.41864539875061,5.0,9.0,11.0,17.0,15.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.9998558415396327,0.9998958337736825,0.9999158298907075,0.9999758182417823,0.9999558221247574,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,12.435097367794613,3.458912167325974,17.0,8.873088049958566,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.5956527633517534,0.696739572513815,0.668187470225369,0.21450051004382134,0.8989131908379383,0.4881513921525801,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.0858890328967417,0.8986163754356359,1.46050216156186,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.085855523930036e-05,0.00011486901688724808,0.0,1.9844838590397926e-05,2.5463635437761423e-05,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.232577808710385,2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,4.514661959966183,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000111628890436,0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.5000225733097999,0.5000100000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {6.822138554696681,-5.0,10.401137390833725,4.0,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.767614641353232,0.0,0.9999999999999999,0.5843724246857585,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.41948214587105415,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {20.193269967400774,-116505.32195163157,-100000.0,5.0,9.0,11.0,13.0,17.0,1.46050216156186,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.14164556080479937,0.999869614221928,0.9999039414677023,0.9999211050905896,0.9999382687134768,0.9999725959592511,0.9998392389188735,0.14164556080479937,0.9999897595821384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,11.324887692190664,9.0,11.0,10.971192509868965,18.149298285479812,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4517776922993331,0.2857142857142857,0.42857142857142855,0.42651375070492603,0.9392355918199865,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-88211.32021789154,8.422739790413504,5.0,7.295974043936857,9.0,11.0,13.0,17.0,19.0,0.499560300532895,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998801176264184,0.999841324388652,0.9998673468947278,0.9998866602776086,0.9999093282220869,0.9999319961665651,0.9999773320555218,1.0,0.9997903165300344,0.9999319961665651}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,6.887143430238047,13.0,17.0,19.0,0.499560300532895,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9998788944443581,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.971192509868965,2.0,10.401137390833725,-1.2176086883151271,0.8986163754356359,1.46050216156186,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.00012188652788088758,3.21756951090921e-05,0.00011618604610009662,0.0,2.1161992967242643e-05,2.6780782413636407e-05,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-100000.0,-1.0,-0.09622505532175613,-0.5,-9.66675615633341,-0.1,-0.1,-1.0,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999900962155254,0.9999459621985554,0.0,0.9999909622418566,0.9999999999999999,0.9999959622466679,0.9999042945968972,0.9999999622505168,0.9999999622505168,0.9999909622418566,0.9999999622505168}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5,19.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572,1.0,0.9997550465411572}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,6.361720364471644,5.0,13.0,19.0,-1.9494985562533456});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998736412118144,0.999860026594947,0.9999400113978344,1.0,0.9997905448109234}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,19.41864539875061,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.707385811718033,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.49142775137780514,1.0,0.3276185009185368,0.4865310026351811,0.1638092504592684,0.0,0.10238078153704275,0.31563527320448276,0.36857081353335386,0.45047543876298807}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,0.4269239279743262,-5.0,3.0,2.492199888107555,-5.392186064112541,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8610357042988017,0.5831071128964052,1.0,0.40432426082907846,0.02724993009161211,0.5831071128964052,0.5478240704433436,0.0,0.7915535564482026}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,3.6375526859691534,4.0,4.0,4.0,100000.0,-100000.0,2.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.5000181877634299,0.50002,0.50002,0.50002,1.0,0.0,0.5000100000000001,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.970622647728508,7.0,3.0,6.822138554696681,9.0,0.4269239279743262,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7121873319806077,0.8571428571428571,0.5714285714285714,0.8444384681926201,1.0,0.38763742342673757,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-1.2176086883151271,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6166826376843831,0.0,0.8083413188421915,0.8083413188421915,0.8083413188421915,1.0,1.0,1.0,1.0,0.6166826376843831,1.0,1.0,0.8083413188421915}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.401137390833725,2.232577808710385,8.932911673408139,11.0,10.282719410300084,13.0,12.435097367794613,3.458912167325974,17.0,19.0,2.232577808710385});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.48716847998058793,0.0,0.3996042914800858,0.5228843224240002,0.4801060956031517,0.6421632418180002,0.6084727540518579,0.07313791855570076,0.8807210806060001,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,7.295974043936857,-2.5,-1.2,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.04856267098832115,0.17482561555795614,0.2913760259299269,0.4176389704995619,0.5439019150691968}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,9.0,-100000.0,-1.0,-0.5,-9.66675615633341,-0.1,-0.12405312115430803,4.769631488983501,-0.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998100170984611,0.9999999999999999,0.0,0.99990000899919,0.9999050085492305,0.9998133492370053,0.9999090081892629,0.9999087676796973,0.9999577001218787,0.9999050085492305}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999980002599662,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,20.193269967400774,3.0,4.0,4.0,4.0,5.234060683691759,2.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.054965380153860675,0.054965380153860675,0.9999999999999999,0.054965380153860675,0.10993076030772135,0.10993076030772135,0.10993076030772135,0.1777613749197721,0.0,0.10993076030772135,0.10993076030772135,0.054965380153860675}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,8.932911673408139,11.98005133446692,13.0,15.0,17.0,0.8986163754356359,19.0,0.8986163754356359,0.8986163754356359});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.49117508175609503,0.6451878944598941,0.696739572513815,0.7978263816758767,0.8989131908379383,0.08509444398719732,0.9999999999999999,0.08509444398719732,0.08509444398719732}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,4.970622647728508,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.28172257782364146,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.5662174840625469}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,1.5222176980104452,4.0,4.0,5e-09,4.0,127422.41835526374,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4397191830217183,0.4397191830217183,0.4397235801256065,0.4397235801256065,0.4397170821633006,0.4397279772294946,0.4397279772294946,0.439710388813964,0.4397279772294946,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,9.0,11.0,5.0,13.0,15.0,10.151375828019562,17.0,19.0,-1.0,10.151375828019562});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.638831666449778,0.9183673469387754,0.9999999999999999,0.18367346938775508,0.638831666449778}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,20.193269967400774,3.0,4.0,4.0,4.0,5.234060683691759,2.0,4.0,4.0,3.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.054965380153860675,0.054965380153860675,0.9999999999999999,0.054965380153860675,0.10993076030772135,0.10993076030772135,0.10993076030772135,0.1777613749197721,0.0,0.10993076030772135,0.10993076030772135,0.054965380153860675,0.054965380153860675}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,0.5283826421326979,-1.2176086883151271,0.0,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.6300683289522675,0.3182841628008702,0.5357142857142857,1.0,0.5178571428571429}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.9325817584583431,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.9325817584583431,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.7551020408163265}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,7.0,8.932911673408139,11.0,13.0,15.0,17.0,19.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.39347914502763015,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.9999999999999999,0.7978263816758767}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,2.0,-5.0,3.3850444114672107,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.5,0.0,0.5989317436762294,0.6428571428571428,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-12.436351439193258,-3.0,0.0,5.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5411884173189077,0.7132427608243173,1.0,0.8623565251956722}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,-5.0,3.0,3.4732209828361675,4.0,6.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.0,0.5714285714285714,0.6052300702025833,0.6428571428571428,0.7857142857142857,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5,-1.0858890328967417,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572,0.9997991792656106,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.690179826736281,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.5833333333333333,0.8075149855613566,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,8.722521795855851,2.0,4.0,6.0,6.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.9801801282754179,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428,0.6428571428571428,0.6428571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,0.5283826421326979,-1.2176086883151271,0.0,2.6,-0.1,0.5283826421326979});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.6300683289522675,0.3182841628008702,0.5357142857142857,1.0,0.5178571428571429,0.6300683289522675}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,6.0,5.0,7.0,9.0,-5.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,2.071031386145096,5.0,-1.0,20.193269967400774});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6350902451608486,0.4366245435480834,0.39693140322553033,0.47631768387063644,0.5557039645157424,0.0,0.7144765258059547,0.7938628064510607,0.19846570181123088,0.8732490870961668,1.0,0.9526353677412729,0.280671441035434,0.39693140322553033,0.15877256129021214,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,2.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.5000100000000001,0.500015}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,9.883843909648547,17.0,19.0,-1.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999088557565027,0.9999800037992782,1.0,0.9998000379927814,0.999860026594947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,9.0,11.0,13.0,17.0,19.0,-100000.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.0,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {12.527987311788877,-10.0,-9.194474676157663,-5.5,-1.0,-0.5,-0.7178865318555435,-0.1,-10.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999999999999999,0.0,0.035756648505426245,0.19975153295852371,0.39950306591704743,0.42169768069021674,0.4120258654126254,0.43945337250875216,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,16.290878548158467,15.0,5e-09,17.0,19.0,9.0,19.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.0,0.30000000000000004,0.4,0.5,0.18000000000000002,0.6000000000000001,0.7000000000000001,0.8645439274079234,0.8,0.05000000025,0.9,1.0,0.5,1.0,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,8.932911673408139,9.270697628078713,11.0,13.0,15.0,17.0,0.8986163754356359,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.49117508175609503,0.5082479339247996,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.08509444398719732,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,12.435097367794613,3.458912167325974,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.48716847998058793,0.0,0.3996042914800858,0.5228843224240002,0.6421632418180002,0.6084727540518579,0.07313791855570076,0.8807210806060001,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,19.41864539875061,3.0,6.880428028847085,-1.0,-0.09622505532175613,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.43342094491576166,1.0,0.2509279154775462,0.42796568210286307,0.06843488603933079,0.10966804293550286,0.0,0.20530465811799237,0.2965511728371001,0.3877976875562078}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.970622647728508,1.631962701646998,4.0,0.8986163754356359,4.0,4.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999702952500337,0.9999702952500337,0.9999802947529961,0.9999802947529961,0.9999802947529961,1.0,0.9999666150599785,0.9999902942559586,0.9999592819612171,0.9999902942559586,0.9999902942559586,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,13.0,-155640.12451219512,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.35745311810533886,0.9999229074799011,0.9999486049866008,0.9999614537399506,0.9999743024933004,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.707385811718033,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.50811353843399,0.3122955711221384,0.5256346949317138,0.753409729402123,1.0,0.753409729402123}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,9.0,3.0,6.880428028847085,10.971192509868965,-5.0,12.751538518728971,-2.5,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14083286343672946,0.788664035245685,0.4506651629975343,0.6692618792626058,0.8997075094656369,0.0,1.0,0.14083286343672946,0.3943320176228425,0.506998308372226,0.6196645991216096,0.4506651629975343}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,19.0,8.422739790413504,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,1.0,0.999894247490881,0.9997550465411572}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.046541901582966,3.0,-100000.0,3.0,2.2157899019980976,4.0,1.2451826892610212,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999795354090923,0.9999795354090923,0.9999999999999999,0.9999895350044545,0.0,0.9999895350044545,0.9999816932207956,0.9999995345998167,0.9999719875414126,0.9999995345998167,0.9999995345998167,0.9999995345998167}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.970622647728508,1.631962701646998,16.290878548158467,4.0,0.8986163754356359,4.0,4.0,-100000.0,0.8986163754356359});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999857114491823,0.999857114491823,0.9998671128630005,0.9998671128630005,0.9998671128630005,0.9998868158796832,0.9998534347183069,0.9999999999999999,0.999877111234178,0.9998461024495358,0.999877111234178,0.999877111234178,0.0,0.9998461024495358}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {8.422739790413504,-88211.32021789154,11.0,13.0,-5.5,20.193269967400774,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998665949419693,0.0,0.9998958051425847,0.9999184727804947,0.9997087971298266,1.0,0.9999864756942249,0.9999864756942249}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,-0.5,-9.66675615633341,-0.1,-0.12405312115430803,4.769631488983501,-0.5,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30467923342274983,0.6093584668454997,0.643211715003583,0.022562773073597206,0.6702943135300496,0.6686657609712231,1.0,0.643211715003583,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,8.341045402099477,9.0,2.071031386145096,11.0,5.0,13.0,15.0,17.0,19.0,-1.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.46705227010497385,0.5,0.1535515693072548,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0,0.0,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.9741314779560433,-5.5,7.0,9.0,11.0,5.0,15.0,17.0,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18472932743036555,0.0,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.836734693877551,0.9183673469387754,0.9999999999999999,0.673469387755102}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.401137390833725,2.232577808710385,11.0,10.282719410300084,13.0,6.887143430238047,12.435097367794613,3.458912167325974,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.48716847998058793,0.0,0.5228843224240002,0.4801060956031517,0.6421632418180002,0.27759577879214065,0.6084727540518579,0.07313791855570076,0.8807210806060001,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,0.4269239279743262,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4315750293264325,0.863150058652865,1.0,0.47952781036270276}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,18.803842168566185,5.0,7.0,2.071031386145096,-0.5,13.0,15.0,17.0,19.0,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9901921084283093,0.30000000000000004,0.4,0.1535515693072548,0.025,0.7000000000000001,0.8,0.9,1.0,0.123025108078093}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {6.822138554696681,-5.0,10.401137390833725,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6,0.8986163754356359});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.767614641353232,0.0,0.9999999999999999,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.41948214587105415,0.4934700475124182,0.38299875040049364}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,7.295974043936857,11.0,17.0,19.0,6.718598622152663,11.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9998829819738644,0.9999200151971126,0.9999800037992782,1.0,0.9998772093164515,0.9999200151971126,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,4.690179826736281,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.8075149855613566,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,-5.392186064112541,6.822138554696681,-1.0,-5.0,-2.5,4.046541901582966,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6870773723492783,0.0,1.0,0.3595930353241861,0.03210869829909393,0.23678640893977657,0.7727588925514975,0.7689484566055513,0.9326906251180974}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2176086883151271,0.0,1.3,2.6,-3.0,1.5688721641863903,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0,0.0,0.8158700293189983,0.7678571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,3.3850444114672107,11.0,13.0,-116505.32195163157,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14164944257189566,0.9998970154404838,0.9998831558163235,0.9999485077202419,0.9999656718134946,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.0858890328967417,0.8986163754356359,1.46050216156186,100000.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.085855523930036e-05,0.00011486901688724808,0.0,1.9844838590397926e-05,2.5463635437761423e-05,1.0,3.085855523930036e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.906463496197338,4.0,-87387.4823957305,100000.0,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.500024532317481,0.50002,0.06306258802134748,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.258580593854103,18.255935636763752,20.193269967400774,-1.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.28811585805441126,0.9231011165623254,1.0,0.15877256129021214,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,4.690179826736281,6.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.8075149855613566,0.9166666666666666,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,9.0,11.0,13.0,17.0,19.0,-100000.0,2.2157899019980976,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.0,0.9998321897829612,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,11.0,13.0,-5.5,19.0,-100000.0,19.0,19.0,8.422739790413504});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,1.0,0.999894247490881}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.258580593854103,18.255935636763752,20.193269967400774,-1.0,6.361720364471644,-5.0,18.255935636763752,2.258580593854103});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.28811585805441126,0.9231011165623254,1.0,0.15877256129021214,0.45098236073258136,0.0,0.9231011165623254,0.28811585805441126}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,4.482372439717762,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0,6.0,4.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.6773123171226971,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857,0.7857142857142857,0.6428571428571428,0.8571428571428571}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.23828023614698846,1.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.23828023614698846,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,4.336363527402568,11.0,13.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999133748965374,0.999980002599662,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-0.1,-1.2176086883151271,0.8986163754356359,2.6,-0.1,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6447368421052632,0.49768306732695694,0.7761337336099521,0.9999999999999999,0.6447368421052632,0.49768306732695694}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,-5.0,-2.5,4.690179826736281,6.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.3333333333333333,0.0,0.20833333333333331,0.8075149855613566,0.9166666666666666,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,9.0,11.0,5.0,3.562048029970825,13.0,11.0,15.0,17.0,19.0,-1.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.36987951142738057,0.7551020408163265,0.673469387755102,0.836734693877551,0.9183673469387754,0.9999999999999999,0.18367346938775508,0.673469387755102}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.6842105263157894,0.7368421052631579,0.8421052631578947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,3.0,1.3,4.690179826736281,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06501798543925603,0.23406474758132173,0.7802158252710725,0.5591546747776018,1.0,0.7282014369196675}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.322975733592047,0.4269239279743262,2.0,-5.0,3.0,4.0,6.0,9.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.45164112382800337,0.38763742342673757,0.5,0.0,0.5714285714285714,0.6428571428571428,0.7857142857142857,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,11.0,13.0,-5.5,19.0,-100000.0,19.0,-5.5,19.0,-5.5,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.0,1.0,0.9997550465411572,1.0,0.9997550465411572,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,6.880428028847085,6.124505038471483,-1.0,-5.0,-2.5,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.673376412076657,1.0,0.9363724111168276,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,10.151375828019562,13.0,17.0,19.0,-100000.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999115305674724,0.9999400113978344,0.9999800037992782,1.0,0.0,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-6.434931263616406,-100000.0,19.41864539875061,5.0,9.0,11.0,15.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9997415144277729,0.0,1.0,0.9998558415396327,0.9998958337736825,0.9999158298907075,0.9999558221247574,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-0.5,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,3.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.894736842105263,0.5,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.6842105263157894,0.7368421052631579,0.8421052631578947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,-5.847428382699748,5.578999868638974,6.822138554696681,-1.0,-5.0,-2.5,4.046541901582966,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6983212943597169,0.0,0.9018799385803499,1.0,0.3826041100419716,0.0668869257242263,0.2642101659228171,0.7809241099692952,0.7772505904391532,0.9351091825980259}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,18.255935636763752,11.0,14.357147265189116,13.0,17.0,19.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999925607698213,0.9999200151971126,0.9999535802923963,0.9999400113978344,0.9999800037992782,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,6.361720364471644,5.0,13.0,19.0,7.340064277412082,-1.9494985562533456});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998736412118144,0.999860026594947,0.9999400113978344,1.0,0.9998834227924436,0.9997905448109234}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.2176086883151271,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,18.803842168566185,5.0,11.0,-116505.32195163157,2.071031386145096,11.0,5.0,13.0,15.0,17.0,19.0,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998283620134834,0.9999983165932387,0.9998798534094383,0.9999313448053934,0.0,0.9998547172956658,0.9999313448053934,0.9998798534094383,0.999948508604045,0.9999656724026967,0.9999828362013483,1.0,0.9998494777953248}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,-1.4695256238944465,0.0,1.2451826892610212,-0.1,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6831272555916355,0.4198620983247112,0.36052026217320937,0.7066833678534159,1.0,0.6831272555916355,0.6831272555916355}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.942680122481894,11.0,13.0,17.0,19.0,-87387.4823957305});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999294402075853,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.12610121681150077}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,3.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5714285714285714,0.7857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,4.769631488983501,7.0,9.0,11.0,5.0,13.0,17.0,19.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.28848157444917505,0.4,0.5,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.9,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,1.5222176980104452,4.0,4.0,5e-09,6.361720364471644,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.5000076110884901,0.50002,0.50002,0.5000000000000251,0.5000318086018224,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,2.071031386145096,11.0,3.0,-3.0,15.0,17.0,19.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.09090909090909091,0.36363636363636365,0.4545454545454546,0.5454545454545454,0.23050142664295892,0.6363636363636364,0.2727272727272727,0.0,0.8181818181818182,0.9090909090909092,1.0,0.09090909090909091}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.029460583547525,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999203097469836,1.0,0.9999200151971126}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,1.7387690576468535,-1.2176086883151271,0.0,1.3,2.6,0.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.2419767911530387,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523,0.09966014785525446,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.0858890328967417,0.8986163754356359,1.46050216156186,100000.0,3.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.085855523930036e-05,0.00011486901688724808,0.0,1.9844838590397926e-05,2.5463635437761423e-05,1.0,4.085844665157621e-05,3.085855523930036e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {8.422739790413504,5.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.42784247380168794,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,9.0,11.0,11.029460583547525,23.88238347602904,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.21183766366560408,0.3177564954984061,0.3193167107956394,1.0,0.7414318228296143}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-1.1252324395847113,2.258580593854103,12.527987311788877,-1.0,-5.0,1.9850204264692954,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6846193910654594,0.22106175064430925,0.41411375218032975,1.0,0.2282064636884865,0.0,0.3985067025791004,0.6275677751433378}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,9.0,6.822138554696681,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.5102040816326531,0.5918367346938775,0.5029444308039461,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.1252324395847113,8.422739790413504,5.0,4.514661959966183,13.0,-5.5,13.327637346787848,19.0,-100000.0,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9997987859062819,0.999894247490881,0.999860026594947,0.9998551741365138,0.9999400113978344,0.9997550465411572,0.9999432871489096,1.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-4.737351970693368,-100000.0,-1.0,-0.09622505532175613,-0.5,-9.66675615633341,-0.1,-0.1,-1.0,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999900962155254,0.999953588686187,0.0,0.9999909622418566,0.9999999999999999,0.9999959622466679,0.9999042945968972,0.9999999622505168,0.9999999622505168,0.9999909622418566,0.9999999622505168}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,11.0,13.0,-5.5,19.0,19.0,-5.5,19.0,-5.5,-100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,1.0,0.9997550465411572,1.0,0.9997550465411572,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.258580593854103,3.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.41952686461803435,0.6666666666666666,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,9.0,11.0,11.029460583547525,18.149298285479812,24.457547670728097,19.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.20557575228339764,0.30836362842509646,0.30987772383146905,0.6757942217590758,1.0,0.7195151329918917,0.20557575228339764}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,-5.847428382699748,5.578999868638974,-4.211888230877799,6.822138554696681,-1.0,-5.0,-2.5,4.046541901582966,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6983212943597169,0.0,0.9018799385803499,0.1290920328929609,1.0,0.3826041100419716,0.0668869257242263,0.2642101659228171,0.7809241099692952,0.7772505904391532,0.9351091825980259}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {20.193269967400774,-116505.32195163157,-100000.0,5.0,11.942680122481894,11.0,13.0,17.0,1.46050216156186,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.14164556080479937,0.999869614221928,0.9999291949936523,0.9999211050905896,0.9999382687134768,0.9999725959592511,0.9998392389188735,0.14164556080479937,0.9999897595821384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,6.880428028847085,6.124505038471483,-1.0,-5.0,-2.5,2.0,4.0,-2.5402928043798356,-116505.32195163157,6.0,6.124505038471483});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999666950933069,0.9999999999999999,0.9999935120701957,0.999932363925255,0.999898032757203,0.9999194897372355,0.9999581123012939,0.9999752778853199,0.9999191439124759,0.0,0.9999924434693459,0.9999935120701957}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,7.51554490959548,-2.5,8.722521795855851,-1.2,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.8970377784507885,0.04265293839562406,0.9999999999999999,0.15355057822424664,0.2559176303737444,0.3668152702023669,0.4777129100309895}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,-3.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,11.168244657255205,9.0,9.294663202788586,8.422739790413504});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.9999200103986482,0.999960005199324,0.999980002599662,1.0,0.9999816848275449,0.999960005199324,0.9999629514483396,0.9999542333475689}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {20.193269967400774,-116505.32195163157,-100000.0,5.0,9.0,11.0,13.0,1.46050216156186,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.14164556080479937,0.999869614221928,0.9999039414677023,0.9999211050905896,0.9999382687134768,0.9998392389188735,0.14164556080479937,0.9999897595821384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,11.0,13.0,-5.5,19.0,5.578999868638974,19.0,-5.5,19.0,-5.5,-100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999200151971126,0.9999400113978344,0.9997550465411572,1.0,0.9998658154937426,1.0,0.9997550465411572,1.0,0.9997550465411572,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,1.4117100309373578,-2.37372058193593,-1.2,0.0,1.3,2.6,-1.2,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.7878053626673853,0.1118356103685839,0.32142857142857145,0.5357142857142857,0.7678571428571428,1.0,0.32142857142857145,0.7678571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.970622647728508,4.0,4.0,4.0,4.0,-100000.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999702952500337,0.9999702952500337,0.9999802947529961,0.9999802947529961,0.9999802947529961,1.0,0.9999902942559586,0.9999902942559586,0.9999902942559586,0.9999902942559586,0.0,0.9999802947529961}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,0.4269239279743262,-5.0,3.0,3.4732209828361675,-5.392186064112541,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8610357042988017,0.5831071128964052,1.0,0.40432426082907846,0.02724993009161211,0.5831071128964052,0.6159875231918336,0.0,0.7915535564482026}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.401137390833725,2.232577808710385,8.932911673408139,11.0,10.282719410300084,13.0,12.435097367794613,3.707031356089287,17.0,19.0,2.232577808710385});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.48716847998058793,0.0,0.3996042914800858,0.5228843224240002,0.4801060956031517,0.6421632418180002,0.6084727540518579,0.08793561291400269,0.8807210806060001,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.5997629033964986,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.6428148041779462,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.494052310009373,7.824002367662983,9.0,8.422739790413504,-100000.0,-100000.0,5.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999492937171364,0.999915070937272,0.9999550655403794,0.999975062841933,0.9999999999999999,0.9999433071507392,0.9999550655403794,0.9999492937171364,0.0,0.0,0.999915070937272,0.999975062841933}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.029460583547525,19.0,16.47865507751967});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999203097469836,1.0,0.9999747913404206}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,7.0,5.0,13.0,15.0,17.0,18.55562594891745});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18706642718654798,0.0,0.5196289644070777,0.4364883301019453,0.7690508673224751,0.8521915016276075,0.9353321359327399,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,3.6375526859691534,5.0,7.0,9.0,11.0,13.0,15.0,-1.5661416747342105,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.027527850565656823,0.2530223919976285,0.3192694953959598,0.416516710339394,0.5137639252828283,0.6110111402262627,0.708258355169697,0.8055055701131314,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,13.0,12.435097367794613,17.725302075603715,17.0,19.0,3.458912167325974});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.696739572513815,0.668187470225369,0.9355724270886383,0.8989131908379383,0.9999999999999999,0.21450051004382134}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,19.41864539875061,3.0,6.880428028847085,-1.0,-0.09622505532175613,-2.5,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.43342094491576166,1.0,0.2509279154775462,0.42796568210286307,0.06843488603933079,0.10966804293550286,0.0,0.20530465811799237,0.2965511728371001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,4.970622647728508,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,11.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5662174840625469,0.28172257782364146,0.0,0.28310874203127345,0.37747832270836457,0.4718479033854557,0.16986524521876406,0.5662174840625469,0.660587064739638,0.7549566454167291,0.04718479057446952,0.8493262260938202,1.0,0.9436958067709114,0.5662174840625469,0.5662174840625469}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,13.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.7551020408163265,0.836734693877551,0.9183673469387754,0.9999999999999999,0.42857142857142855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,8.932911673408139,11.0,13.0,12.435097367794613,3.458912167325974,17.0,19.0,3.458912167325974,19.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.49117508175609503,0.5956527633517534,0.696739572513815,0.668187470225369,0.21450051004382134,0.8989131908379383,0.9999999999999999,0.21450051004382134,0.9999999999999999,0.8989131908379383}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,-5.0,-2.5,4.690179826736281,6.0,-5.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.3333333333333333,0.0,0.20833333333333331,0.8075149855613566,0.9166666666666666,0.0,0.3333333333333333}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,4.784100732862937,-1.0,-5.0,-2.5,4.690179826736281,6.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.815341727738578,0.3333333333333333,0.0,0.20833333333333331,0.8075149855613566,0.9166666666666666,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,5.0,3.562048029970825,13.0,-6.434931263616406,15.0,17.0,19.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.21367980936480238,0.03675776647188292,0.44957586655536164,0.5282078856188814,0.6068399046824011,0.44957586655536164,0.3930413331954817,0.7641039428094407,0.0,0.8427359618729604,0.9213679809364802,0.9999999999999999,0.6854719237459209}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-5.0,-2.5,-1.9494985562533456,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.0,0.2104301287739553,0.256766964653098,0.5892043605670749,0.7575484635862391,0.9258925666054034}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-4.737351970693368,-100000.0,-1.0,-0.09622505532175613,-0.5,-9.66675615633341,-0.657703561355692,-0.1,-1.0,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999900962155254,0.999953588686187,0.0,0.9999909622418566,0.9999999999999999,0.9999959622466679,0.9999042945968972,0.9999943852095368,0.9999999622505168,0.9999909622418566,0.9999999622505168}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,19.477741831900236,8.422739790413504,10.151375828019562,13.0,17.0,19.0,-100000.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.9998894715080394,0.9999067545020786,0.9999352351964022,0.9999752274068227,0.999995223512033,0.0,0.9999752274068227}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-9.66675615633341,-3.0,0.0,1.3,-93935.84316983708,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998832543146803,0.9999542247096845,0.9999861609587418,1.0,0.0,0.9999595474178608}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,3.6375526859691534,5.0,9.0,11.0,13.0,15.0,-1.5661416747342105,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.027527850565656823,0.2530223919976285,0.3192694953959598,0.5137639252828283,0.6110111402262627,0.708258355169697,0.8055055701131314,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,18.149298285479812,-5.0,-2.5,2.0,4.690179826736281,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5183742440921801,0.3455828293947868,0.5132089915787632,1.0,0.0,0.10799463418587088,0.30238497572043843,0.4185949702334761,0.47517639041783183}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,10.151375828019562,-94845.99165474174,13.0,17.0,19.0,-100000.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999115305674724,0.051530292696970195,0.9999400113978344,0.9999800037992782,1.0,0.0,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.046541901582966,3.0,-100000.0,3.458912167325974,3.0,4.0,1.8392488338004267,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999795354090923,0.9999795354090923,0.9999999999999999,0.9999895350044545,0.0,0.9999941239404345,0.9999895350044545,0.9999995345998167,0.9999779279624763,0.9999995345998167,0.9999995345998167,0.9999995345998167}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,-100000.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999990000099999,0.999990000099999,0.999990000099999,0.0,0.999990000099999,0.999990000099999,0.999990000099999,1.0,0.999990000099999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.046541901582966,3.0,-100000.0,3.0,2.2157899019980976,4.0,1.2451826892610212,4.0,4.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999795354090923,0.9999795354090923,0.9999999999999999,0.9999895350044545,0.0,0.9999895350044545,0.9999816932207956,0.9999995345998167,0.9999719875414126,0.9999995345998167,0.9999995345998167,0.9999995345998167,0.9999795354090923}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,2.0,4.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,0.0,1.0,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.0858890328967417,0.8986163754356359,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.26864124091520847,1.0,0.0,0.17276058530105654,0.22167540149451917}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,7.0,5.578999868638974,6.822138554696681,-1.0,-2.5,4.046541901582966,4.0,6.822138554696681});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5789473684210527,1.0,0.8504210388041025,0.9812777425996507,0.15789473684210525,0.0,0.6891096738508384,0.6842105263157894,0.9812777425996507}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,13.0,17.0,19.0,14.357147265189116});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999400113978344,0.9999800037992782,1.0,0.9999535802923963}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.894736842105263,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.7368421052631579,0.8421052631578947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.626959923143518,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.813479961571759,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,-1.2176086883151271,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,10.401137390833725,2.232577808710385,8.932911673408139,11.0,13.0,-0.657703561355692,12.435097367794613,17.0,19.0,3.458912167325974,-0.7348076171425224});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5653842082082107,0.1525173964046947,0.49117508175609503,0.5956527633517534,0.696739572513815,0.00643273576442893,0.668187470225369,0.8989131908379383,0.9999999999999999,0.21450051004382134,0.002535634277956789}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,9.0,18.469247120829454,11.0,11.029460583547525,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999000189963907,0.9999946934794471,0.9999200151971126,0.9999203097469836,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,11.0,13.0,9.883843909648547,17.0,12.528000738941515,19.0,-1.0,5.0,5.486580591351534,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999400113978344,0.9999088557565027,0.9999800037992782,0.9999352923018521,1.0,0.9998000379927814,0.999860026594947,0.999864891476533,0.9999800037992782}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,9.0,11.0,11.029460583547525,18.149298285479812,24.457547670728097,19.0,9.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.20557575228339764,0.30836362842509646,0.30987772383146905,0.6757942217590758,1.0,0.7195151329918917,0.20557575228339764,0.7195151329918917}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.088536751425015,3.0,3.0,3.0,4.970622647728508,1.631962701646998,16.290878548158467,4.0,0.8986163754356359,4.0,4.0,-100000.0,0.8986163754356359,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999857114491823,0.9998579997151266,0.9998671128630005,0.9998671128630005,0.9998671128630005,0.9998868158796832,0.9998534347183069,0.9999999999999999,0.999877111234178,0.9998461024495358,0.999877111234178,0.999877111234178,0.0,0.9998461024495358,0.9998671128630005}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,4.0,6.0,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.894736842105263,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.7368421052631579,0.8421052631578947,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.258580593854103,-1.0,-5.0,1.9850204264692954,16.47865507751967,6.0,2.258580593854103});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3379439060619393,0.18623139975773173,0.0,0.3252075328394313,1.0,0.5121363493337623,0.3379439060619393}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {18.149298285479812,2.0,3.0,-0.5292714556132707,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000907464914275,0.5000100000000001,0.500015,0.49999735364272196,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.49999391195655846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,9.0,4.006918996620226,11.0,13.0,17.0,-100000.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9998500976714086,0.9999200151971126,0.9999400113978344,0.9999800037992782,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,1.4902206382938175});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.5000074511031916}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-9.66675615633341,-5.0,3.0,4.0,6.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8928576565071044,0.6785729695213129,1.0,0.0,0.25000359554973,0.6785729695213129,0.7321441412677607,0.8392864847606565,0.8928576565071044}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,1.3,9.0,11.0,13.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9998800203965327,0.9998430266854635,0.9999200135976885,0.9999400101982664,0.9999600067988442,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {12.528000738941515,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000626400036947,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,17.0,19.0,0.499560300532895,13.72122445462381,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0,0.9998150307471635,0.9999472222723146,0.9999400113978344}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.401137390833725,-0.1,-1.2176086883151271,0.8986163754356359,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.4934700475124182,0.3181583201066907}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,7.0,5.578999868638974,6.822138554696681,-1.0,-2.5,4.046541901582966,4.0,6.822138554696681,6.822138554696681,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5789473684210527,1.0,0.8504210388041025,0.9812777425996507,0.15789473684210525,0.0,0.6891096738508384,0.6842105263157894,0.9812777425996507,0.9812777425996507,0.15789473684210525}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.9741314779560433,7.0,3.0,9.0,-1.0,-5.0,2.0,4.0,6.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.28756203728885404,0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5,0.6428571428571428,0.7857142857142857,0.2857142857142857}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.602606106550939,3.0,-100000.0,3.458912167325974,3.0,4.0,1.2451826892610212,4.0,4.0,4.0,1.2451826892610212});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999739751367566,0.9999739751367566,1.0,0.9999839746765171,0.0,0.9999885635869808,0.9999839746765171,0.9999939742162777,0.9999664273110458,0.9999939742162777,0.9999939742162777,0.9999939742162777,0.9999664273110458}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0,5e-09,4.0,-100000.0,-1.2176086883151271,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999980000799968,0.999990000399984,1.0,1.0,0.999960001599986,1.0,0.0,0.9999478260000768,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.3933151616068914,-1.2176086883151271,11.743598807823856,0.0,1.3,2.6,0.0,100000.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.00012217459927461562,8.242834901608433e-06,0.0,0.00012961049681271968,1.2175938627864657e-05,2.5175780340662495e-05,3.8175622053460336e-05,1.2175938627864657e-05,1.0,0.00012217459927461562}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,2.0,4.0,2.492199888107555});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.7777777777777777,1.0,0.8324666542341728}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,14.803481340003744,-147046.595120599,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3199021163448808,0.9999280779423568,0.9999048043834554,0.9999456025048317,0.9999592018786237,0.999833407671047,0.9999714649870586,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {8.873088049958566,5.0,9.0,11.0,10.971192509868965,18.149298285479812,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.27664914642561184,0.0,0.2857142857142857,0.42857142857142855,0.42651375070492603,0.9392355918199865,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,2.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,0.0,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,18.803842168566185,5.0,16.290878548158467,7.0,2.071031386145096,-0.5,13.0,15.0,17.0,19.0,1.46050216156186,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9901921084283093,0.30000000000000004,0.8645439274079234,0.4,0.1535515693072548,0.025,0.7000000000000001,0.8,0.9,1.0,0.123025108078093,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-5.5,5.0,7.0,9.0,11.0,5.0,15.0,17.0,19.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18367346938775508,0.0,0.42857142857142855,0.5102040816326531,0.5918367346938775,0.673469387755102,0.42857142857142855,0.836734693877551,0.9183673469387754,0.9999999999999999,0.9183673469387754}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {12.528000738941515,2.0,3.0,-1.2176086883151271,4.0,4.0,5e-09,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000626400036947,0.5000100000000001,0.500015,0.49999391195655846,0.50002,0.50002,0.5000000000000251,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,-1.4695256238944465,0.0,1.2451826892610212,-0.1,-0.1,-1.4695256238944465});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6831272555916355,0.4198620983247112,0.36052026217320937,0.7066833678534159,1.0,0.6831272555916355,0.6831272555916355,0.36052026217320937}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,-1.0,4.0,4.0,-1.9494985562533456,4.0,100000.0,-100000.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.499995,0.50002,0.50002,0.4999902525072188,0.50002,1.0,0.0,0.499995}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5,-2.37372058193593,9.0,-1.2400220924963046,-10.0,-5.0,3.0,4.046541901582966,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,0.40138312726652997,1.0,0.46105146881598397,0.0,0.2631578947368421,0.6842105263157894,0.7392916790306824,0.8421052631578947}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.486580591351534,-3.0,7.51554490959548,-2.5,8.722521795855851,-1.2,11.324887692190664,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5924360995847853,0.0,0.7340752078166812,0.03490428761075588,0.8183325445718144,0.12565543539872118,1.0,0.2094257256645353,0.3001768734525006,0.3909280212404659}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-87387.4823957305,5.0,7.0,9.0,2.6,11.0,13.0,15.0,17.0,20.193269967400774,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998948230816415,0.0,0.9998261792245167,0.9998490605102249,0.9998719417959332,0.9997987216816668,0.9998948230816415,0.9999177043673496,0.9999405856530579,0.9999634669387661,1.0,0.9999863482244744}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,3.621270797455902,9.0,11.0,5.0,13.0,15.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.23106353987279513,0.5,0.6000000000000001,0.30000000000000004,0.7000000000000001,0.8,0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.9976986611875804,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,4.0,3.0,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7499280624680326,0.0,0.8749640312340162,0.8749640312340162,0.9999999999999999,0.9999999999999999,0.9999999999999999,0.9999999999999999,0.7499280624680326,0.9999999999999999,0.9999999999999999,0.8749640312340162,0.7499280624680326,0.9999999999999999}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,1.8139876754497708,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.500015,0.5000090699383772,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,20.193269967400774,3.0,4.0,4.0,4.0,5.234060683691759,2.0,4.0,4.0,3.0,3.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.054965380153860675,0.054965380153860675,0.9999999999999999,0.054965380153860675,0.10993076030772135,0.10993076030772135,0.10993076030772135,0.1777613749197721,0.0,0.10993076030772135,0.10993076030772135,0.054965380153860675,0.054965380153860675,0.054965380153860675}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,-1.2,11.0,17.0,19.0,11.0,14.001363610040931,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9997980383727092,0.9999200151971126,0.9999800037992782,1.0,0.9999200151971126,0.9999500231317053,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,1.0,10.151375828019562,-94845.99165474174,13.0,17.0,19.0,-100000.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9998200341935033,0.9999115305674724,0.051530292696970195,0.9999400113978344,0.9999800037992782,1.0,0.0,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0,-0.5,-9.66675615633341,-0.1,-155640.12451219512,4.336363527402568,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999907890306878,0.9999368023540827,0.9999657144012875,0.9999689268509769,0.9999100313650421,0.9999714968107284,0.0,0.9999999999999999,0.9999714968107284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.401137390833725,4.0,-0.1,-1.2176086883151271,0.8986163754356359,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.5843724246857585,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,11.736647377028104,13.0,-5.5,19.0,-149710.3331618766,19.0,-5.5,19.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3320012993588461,0.9999293574613188,0.9999514901157335,0.9999599276917001,0.9998363714077754,1.0,0.0,1.0,0.9998363714077754,1.0,0.9998363714077754}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,1.3,2.6,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.7678571428571428,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.9850204264692954,-2.5,-1.2,0.0,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8794157698959405,0.0,0.25490196078431376,0.4901960784313726,0.7450980392156863,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.7849750781391729,0.499560300532895,7.0,8.932911673408139,11.0,13.0,15.0,17.0,19.0,15.0,15.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06492479134286995,0.39347914502763015,0.49117508175609503,0.5956527633517534,0.696739572513815,0.7978263816758767,0.8989131908379383,0.9999999999999999,0.7978263816758767,0.7978263816758767,0.7978263816758767}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,-5.5,19.0,-100000.0,19.0,8.422739790413504,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9997550465411572,1.0,0.0,1.0,0.999894247490881,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.371036804582337,6.361720364471644,5.0,13.0,7.340064277412082,-1.9494985562533456});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5681306524782125,0.479540638558937,1.0,0.6317791835030538,0.027424190943536382}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.913461319358456,-1.0,5.0,9.883843909648547,7.0,9.0,2.6,11.0,13.0,15.0,14.803481340003744,17.0,20.193269967400774,19.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.12085675509888363,0.3697498932281304,0.5723424326957699,0.452714272604546,0.5356786519809617,0.27019263797643167,0.6186430313573772,0.7016074107337927,0.7845717901102084,0.7764197657789713,0.8675361694866239,1.0,0.9505005488630396,0.27019263797643167}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.088536751425015,3.0,3.0,3.0,1.250889673660545,4.970622647728508,1.631962701646998,16.290878548158467,4.0,0.8986163754356359,4.0,4.0,-100000.0,0.8986163754356359,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999857114491823,0.9998579997151266,0.9998671128630005,0.9998671128630005,0.9998671128630005,0.9998496246087273,0.9998868158796832,0.9998534347183069,0.9999999999999999,0.999877111234178,0.9998461024495358,0.999877111234178,0.999877111234178,0.0,0.9998461024495358,0.9998671128630005}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,6.0,-1.0,6.880428028847085});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.9900356690705904,0.3333333333333333,0.0,0.20833333333333331,0.5833333333333333,0.9166666666666666,0.3333333333333333,0.9900356690705904}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,-1.2176086883151271,4.784100732862937,4.0,4.0,5e-09,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.49999391195655846,0.5000239205036644,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,-1.9494985562533456,2.0,4.0,6.0,11.743598807823856,6.880428028847085,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14931079206411788,0.4777945346051772,0.709550447619162,0.2388972673025886,0.0,0.14931079206411788,0.18218911470341922,0.41807021777953,0.5375188514308243,0.6569674850821187,1.0,0.709550447619162,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,0.0,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.11627906976744186,0.6976744186046512,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,0.5,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,9.0,11.0,11.029460583547525,-4.737351970693368,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999203097469836,0.9997626715726944,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.2400220924963046,-5.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2685698505359782,0.0,0.5714285714285714,0.6428571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0,2.492199888107555,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034,0.6306338349018745,0.673376412076657}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,1.9052748416682936,-5.0,-2.5,-1.9494985562533456,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.5812311496607252,0.0,0.2104301287739553,0.256766964653098,0.5892043605670749,0.7575484635862391,0.9258925666054034,0.673376412076657}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,0.0,3.458912167325974,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523,0.09966014785525446,0.3827689177927025,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.4269239279743262,0.0,0.0,0.0,0.0,1.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4269239279743262,0.0,0.0,0.0,0.0,1.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,0.46837860635787776,-1.2176086883151271,0.0,1.2451826892610212,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6193533225639067,0.3182841628008702,0.5357142857142857,0.7580683373680396,1.0,0.5178571428571429}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,7.0,5.578999868638974,6.822138554696681,-1.0,-2.5,4.046541901582966,4.0,6.822138554696681,6.822138554696681,-1.0,7.0,-1.0,6.822138554696681});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5789473684210527,1.0,0.8504210388041025,0.9812777425996507,0.15789473684210525,0.0,0.6891096738508384,0.6842105263157894,0.9812777425996507,0.9812777425996507,0.15789473684210525,1.0,0.15789473684210525,0.9812777425996507}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,10.401137390833725,-1.0858890328967417,0.8986163754356359,-0.1716125073528473,1.46050216156186});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.26864124091520847,1.0,0.0,0.17276058530105654,0.07959209736430455,0.22167540149451917}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.392186064112541,-6.028697603862666,-100000.0,-1.0,-0.5,-9.66675615633341,-0.1,-0.12405312115430803});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999470780864369,0.9999407129646743,0.0,0.9999909999909999,0.999995999996,0.999904332342769,0.9999999999999999,0.9999997594685479}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-0.1,-1.2176086883151271,0.8986163754356359,2.6,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6447368421052632,0.49768306732695694,0.7761337336099521,0.9999999999999999,0.6447368421052632}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.0,4.0,3.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.0,1.0,0.5,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,3.0,6.880428028847085,-1.0,-5.0,-2.5,2.0,4.0,6.0,3.5026414432127666});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2104301287739553,0.673376412076657,1.0,0.3366882060383285,0.0,0.2104301287739553,0.5892043605670749,0.7575484635862391,0.9258925666054034,0.7156847735256127}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,2.6,-3.0,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,1.0,0.0,0.7678571428571428}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,9.0,18.469247120829454,11.0,11.029460583547525,11.307879951386456,19.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999000189963907,0.9999946934794471,0.9999200151971126,0.9999203097469836,0.9999230934117657,1.0,0.9999000189963907}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,1.3,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.7678571428571428,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-9.66675615633341,-2.3146433358554312,0.0,1.3,-93935.84316983708,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998832543146803,0.9999615206167244,0.9999861609587418,1.0,0.0,0.9999595474178608}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,-12.436351439193258,1.0,5.0,7.0,9.0,11.0,5.0,13.0,17.0,19.0,5.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3637938537910284,0.0,0.4274144684119256,0.5546556976537199,0.6182763122746171,0.6818969268955143,0.7455175415164115,0.5546556976537199,0.8091381561373086,0.9363793853791029,1.0,0.5546556976537199,0.6818969268955143}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,-3.0,2.6,-1.2176086883151271});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5178571428571429,0.3182841628008702,0.5357142857142857,0.7678571428571428,1.0,0.0,1.0,0.3182841628008702}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {18.065380446624353,-100000.0,8.422739790413504,5.0,9.0,11.0,9.578249337079814,17.0,19.0,-87387.4823957305});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999906555799061,0.0,0.999894247490881,0.999860026594947,0.9999000189963907,0.9999200151971126,0.9999058003912965,0.9999800037992782,1.0,0.12610121681150077}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,0.0,100000.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.00012217459927461562,1.1175950803803283e-05,0.0,1.2175938627864657e-05,2.5175780340662495e-05,1.2175938627864657e-05,1.0,0.00012217459927461562}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,-5.0,-3.0,-5.5,4.0,6.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8620689655172413,1.0,0.3103448275862069,0.034482758620689655,0.1724137931034483,0.0,0.6551724137931034,0.7931034482758621,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-5.5,-1.0638245062379739,-9.66675615633341,-0.1,-0.12405312115430803,4.769631488983501,-0.5,-10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30467923342274983,0.6050371331490171,0.022562773073597206,0.6702943135300496,0.6686657609712231,1.0,0.643211715003583,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,-5.0,3.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8571428571428571,0.5714285714285714,1.0,0.2857142857142857,0.0,0.5714285714285714,0.6428571428571428,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {6.822138554696681,-5.0,10.401137390833725,-0.1,-1.2176086883151271,0.8986163754356359,1.46050216156186,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.767614641353232,0.0,0.9999999999999999,0.3181583201066907,0.2455916868799595,0.38299875040049364,0.41948214587105415,0.4934700475124182}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,9.0,11.0,13.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999542333475689,0.999960005199324,0.999980002599662,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-93935.84316983708,-1.0,5.0,7.0,9.0,2.6,11.0,13.0,15.0,5e-09,17.0,20.193269967400774,19.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9997744341846414,0.9998382938388728,0.9998595803902832,0.9998808669416938,0.9998127499771803,0.9999021534931042,0.9999234400445147,0.9999447265959251,0.9997850774603999,0.9999660131473356,1.0,0.9999872996987461,0.9999447265959251}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,5.0,11.0,1.8139876754497708,-5.5,19.0,-99999.35396643436,19.0,19.0,8.004448108665093});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999860026594947,0.9999200151971126,0.9998281725239749,0.9997550465411572,1.0,6.459108425846659e-06,1.0,1.0,0.9998900653686666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-99999.95414373039,5.0,3.3850444114672107,11.0,13.0,-116505.32195163157,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.14164983611253962,0.9998970154404838,0.9998831558163235,0.9999485077202419,0.9999656718134946,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {10.733186857378628,-71087.59728792847,8.422739790413504,9.0,11.0,13.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998837405605399,0.0,0.9998512478361642,0.9998593660731717,0.9998874928585374,0.9999156196439031,0.9999718732146343,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-10.0,-4.737351970693368,-100000.0,-1.0,-0.09622505532175613,-0.5,-9.66675615633341,-0.1,-0.1,-1.0,-0.1,-0.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999900962155254,0.999953588686187,0.0,0.9999909622418566,0.9999999999999999,0.9999959622466679,0.9999042945968972,0.9999999622505168,0.9999999622505168,0.9999909622418566,0.9999999622505168,0.9999999622505168}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.620022473016821,5.0,11.0,13.0,-5.5,14.803481340003744,-147046.595120599,19.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3199021163448808,0.9999294194028285,0.9999048043834554,0.9999456025048317,0.9999592018786237,0.999833407671047,0.9999714649870586,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,-1.0,4.0,-1.9494985562533456,4.0,100000.0,-100000.0,-1.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.500015,0.499995,0.50002,0.4999902525072188,0.50002,1.0,0.0,0.499995,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.620022473016821,5.0,11.0,13.0,-5.5,14.803481340003744,-147046.595120599,19.0,23.38614527981872,-100000.0,14.803481340003744});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.31989257573607993,0.9998995979826766,0.9998749836974101,0.9999157806020426,0.9999293795702533,0.9998035891143033,0.9999416423129591,0.0,0.9999701764748858,1.0,0.31989257573607993,0.9999416423129591}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,6.361720364471644,5.0,7.0,9.0,11.0,13.0,15.0,17.0,19.0,7.277367751488355});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3680860182235822,0.30000000000000004,0.4,0.5,0.6000000000000001,0.7000000000000001,0.8,0.9,1.0,0.4138683875744178}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,4.0,4.0,5e-09,4.0,100000.0,-100000.0,-1.2176086883151271,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50002,0.50002,0.5000000000000251,0.50002,1.0,0.0,0.49999391195655846,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,5.0,15.0,17.0,19.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.30000000000000004,0.8,0.9,1.0,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,0.46837860635787776,-1.2176086883151271,0.0,1.2451826892610212,2.6,7.51554490959548});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.329833464283241,0.16950061333088245,0.28529192027533323,0.40370544044629336,0.5325449178472886,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,10.151375828019562,4.0,-0.1,-1.2176086883151271,0.8986163754356359,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.9999999999999999,0.5940054620885469,0.3234029738037644,0.24964012209967532,0.3893122606415238,0.5016046124303284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,5.0,11.0,13.0,-5.5,8.9984541936865,19.0,-100000.0,19.0,-5.5,19.0,-5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9997550465411572,0.9999000035412641,1.0,0.0,1.0,0.9997550465411572,1.0,0.9997550465411572}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-100000.0,8.422739790413504,12.900300750606242,5.0,11.0,13.0,17.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.999894247490881,0.9999390145947331,0.999860026594947,0.9999200151971126,0.9999400113978344,0.9999800037992782,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,-0.1,-1.2176086883151271,0.0,1.3,2.6,-0.31657732340816347,0.0,3.458912167325974,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.09147524010848404,0.0,0.09966014785525446,0.20606394856326984,0.31246774927128523,0.07374858598710125,0.09966014785525446,0.3827689177927025,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.25,0.5,0.5,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.0,0.0,1.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.375,0.625,0.75,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.1,2.2,3.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5000000000000001,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,-3.0,1.0,2.0,5.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.5,0.625,1.0,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0,16.0,17.0,18.0,19.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.05263157894736842,0.10526315789473684,0.15789473684210525,0.21052631578947367,0.2631578947368421,0.3157894736842105,0.3684210526315789,0.42105263157894735,0.47368421052631576,0.5263157894736842,0.5789473684210527,0.631578947368421,0.6842105263157894,0.7368421052631579,0.7894736842105263,0.8421052631578947,0.894736842105263,0.9473684210526315,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.0,6.0,7.0,8.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.6666666666666666,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.4028235e+38,-3.4028235e+38});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0,11.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0,0.25}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.5,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,1.0,0.3333333333333333}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.49752129843287196,1.0,0.49752129843287196,0.49752129843287196,0.9950425968657439,0.9950425968657439,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.19870306141267724,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,4.0,2.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,1.0,0.3333333333333333,1.0,0.6666666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,0.3333333333333333}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.3084506581856825,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3084506581856825,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,4.0,2.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,1.0,0.3333333333333333,0.6666666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.39999999999999997,0.3798357534627028,0.39999999999999997,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0,0.0,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,0.8717565888215102,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.16611421015887298,0.0,0.5385438667434284,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.63532512522154,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.5000181766256261,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.317700548477839,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,-0.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3798357534627028,0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.6579213422902667,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0,0.17857142857142855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-0.1,2.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.26829268292682934,0.0,0.5121951219512196,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.49752129843287196,1.0,0.49752129843287196,0.49752129843287196,0.9950425968657439,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.604901901518098,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000130245095077,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.604901901518098,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000130245095077,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,1.3,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,1.0,0.0,0.0,0.7692307692307692}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.9973080733816877}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,4.0,15.0,100000.0,1.8803882689883606,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.500075,1.0,0.5000094019413449,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.3613347876448154,4.009964202838896,3.0,2.604901901518098,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.17977175271801463,1.0,0.49752129843287196,0.30095157946779727,0.9950425968657439,0.9950425968657439,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.875}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,3.093771311909787,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.5058607069943617,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0,11.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.19870306141267724,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,1.0,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.95439506042047,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.13451353481778283,0.0,0.3384787679199815,0.3384787679199815,0.6243091497427591,0.3384787679199815,0.676957535839963,0.676957535839963,0.676957535839963,1.0,0.676957535839963,0.3384787679199815}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.6666666666666666,1.0,0.3333333333333333}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.7499191886213326,2.0,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.0,2.3974061228253545});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.19870306141267724,0.3749595943106663,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,1.0,1.0,1.0,0.19870306141267724}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.2987978284968885,0.7000000000000001,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.63532512522154,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.5000181766256261,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.3084506581856825,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.023726973706590965,0.0,0.0,0.0,0.07692307692307693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4582220594085185,0.4582220594085185,0.7291110297042592,0.7291110297042592,0.7291110297042592,1.0,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000094542896367,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,2.6,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0,0.0,0.3846153846153846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,11.0,-1.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,1.0,0.25,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,2.7499191886213326,3.0,4.0,4.0,1.89085792733363,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.5000137495959431,0.500015,0.50002,0.50002,0.5000094542896367,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4582220594085185,0.4582220594085185,0.7291110297042592,0.7291110297042592,0.7650343291965445,1.0,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-0.7560991815460972,0.0,0.3084506581856825,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1401204876460228,0.0,0.4305560810525609,0.6062014326517329,0.4305560810525609,0.4305560810525609,0.4305560810525609,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,3.132612632596544,-3.0,1.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.508288289537284,0.125,0.375,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.1,2.0,3.63532512522154,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5121951219512196,0.9110549085906197,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,2.6,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0,0.3846153846153846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,2.0,4.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7142857142857142,0.14285714285714285,1.0,0.0,0.2857142857142857,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,11.0,-1.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,1.0,0.25,0.5,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4582220594085185,0.4582220594085185,0.7291110297042592,0.7291110297042592,0.7650343291965445,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,2.6,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.49752129843287196,1.0,0.49752129843287196,0.49752129843287196,0.9950425968657439,0.9950425968657439,0.29851277905972323,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,8.485686893878379,-1.8821461758972977,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,-1.8821461758972977});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.8428554308673987,0.1948658640064189,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.1948658640064189}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,17.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.10134166141047106,0.10134166141047106,0.16125221731643966,0.22175973415364636,0.16125221731643966,0.16125221731643966,0.22116277322240827,1.0,0.24657372479673287,0.0,0.22116277322240827,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,15.0,-1.0,-5.0,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.4,1.0,0.2,0.0,0.35000000000000003,0.45,0.55,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,-10.0,0.0,1.3,0.0,0.0,-12.900064462349789,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9084511198208407,0.20422896459653778,0.9084511198208407,1.0,0.9084511198208407,0.9084511198208407,0.0,0.9788733353432709}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,-0.2950823455421112,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.22784832683252437,0.22784832683252437,0.22784832683252437,0.22784832683252437,0.0,0.22784832683252437,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.375,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,0.3128608452500923,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.3320538028281308,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.0,4.0,6.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.7000000000000001,0.4,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-0.7560991815460972,0.0,0.0,0.927368319637066,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1401204876460228,0.0,0.4305560810525609,0.4305560810525609,0.9586403312943932,0.4305560810525609,0.4305560810525609,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.047004414913656,5.0,9.0,11.0,-1.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5029377759321035,0.625,0.875,1.0,0.25,0.5,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,100000.0,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.50002,1.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,2.0,6.210898792063733,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5,0.8007784851474096,0.7142857142857142,0.8571428571428571,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,15.0,-1.0,-5.0,2.0,4.0,6.0,3.0,-5.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.4,1.0,0.2,0.0,0.35000000000000003,0.45,0.55,0.4,0.0,0.55}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-1.9243870830593395,1.3,2.6,-2.033802097685287,2.317700548477839,2.6,11.0,-1.9243870830593395});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.07682949406719003,0.3071428571428571,0.39999999999999997,0.06901413587962235,0.3798357534627028,0.39999999999999997,1.0,0.07682949406719003}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,-2.5,3.0,4.0,4.0,4.0,100000.0,-100000.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.49998750000000003,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.500015}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,1.0,3.0,4.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.0,0.6666666666666666,1.0,0.3333333333333333}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,0.8717565888215102,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,2.604901901518098,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.5000130245095077,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6,11.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.39999999999999997,0.3798357534627028,0.39999999999999997,1.0,0.39999999999999997}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,2.0,6.210898792063733,5.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5,0.8007784851474096,0.7142857142857142,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.1581270304608839,0.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.25}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,1.377524891878108,2.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.2377524891878108,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,4.0,4.295988999465306,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.5,0.5295988999465306,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,13.0,15.0,17.0,19.0,17.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.30000000000000004,0.4,0.5,0.6000000000000001,0.7000000000000001,0.8,0.9,1.0,0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.000020000400008e-05,1.000020000400008e-05,1.000020000400008e-05,2.000040000800016e-05,2.000040000800016e-05,2.000040000800016e-05,1.0,2.000040000800016e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,2.604901901518098,2.996533149237559,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.5000130245095077,0.5000149826657463,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.331382164224474,2.0,3.0,4.009964202838896,3.0,3.0,4.0,17.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.12119495108648229,0.10134166141047106,0.16125221731643966,0.22175973415364636,0.16125221731643966,0.16125221731643966,0.22116277322240827,1.0,0.24657372479673287,0.0,0.22116277322240827,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,6.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.29720366814479654,1.0,0.29720366814479654,0.4729027511085974,0.6503525353736577,0.4729027511085974,0.4729027511085974,0.6486018340723982,0.6486018340723982,0.6486018340723982,0.0,0.6486018340723982,0.0,0.6486018340723982}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,-0.2950823455421112,100000.0,-100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.4999985245882723,1.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.49752129843287196,1.0,0.49752129843287196,0.49752129843287196,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,1.9879782849688847,6.0,2.0,2.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004,0.30000000000000004,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,3.093771311909787,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.5058607069943617,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.9879782849688847,-1.0,2.0,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.2987978284968885,0.0,0.30000000000000004,0.30000000000000004,0.5,0.7000000000000001,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,6.0,2.0,2.0,2.709339832728434,4.0,6.0,3.0,7.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7142857142857142,0.14285714285714285,1.0,0.5714285714285714,0.0,0.0,0.10133426181834773,0.2857142857142857,0.5714285714285714,0.14285714285714285,0.7142857142857142,0.14285714285714285}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,1.9879782849688847,6.0,2.0,2.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004,0.30000000000000004,0.4,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.6,4.0,-0.5,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.36000000000000004,0.5,0.05,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,1.0,3.0,5.0,7.0,9.0,11.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.375,0.5,0.625,0.75,0.875,1.0,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.9359140818779,-1.0,10.012494985460352,1.0,3.0,5.0,7.0,9.0,11.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.06650536988263125,0.25,0.938280936591272,0.375,0.5,0.625,0.75,0.875,1.0,0.25}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,17.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.10134166141047106,0.10134166141047106,0.16125221731643966,0.22175973415364636,0.16125221731643966,0.16125221731643966,0.22116277322240827,1.0,0.24657372479673287,0.0,0.22116277322240827,0.0,0.10134166141047106}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,2.6,2.317700548477839,2.6,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,1.0,0.949589383656757,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.7499191886213326,-0.2950823455421112,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.009964202838896,2.3974061228253545});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6254260989071131,0.7073097816581271,0.0,0.7653999343587325,0.7653999343587325,0.9615548095000674,0.7653999343587325,0.9976854599068985,0.9976854599068985,0.9976854599068985,1.0,0.6254260989071131}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,2.0,4.0,6.0,3.0,6.941347396260423});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.375,0.625,0.875,0.5,0.9926684245325529}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5,0.15625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,11.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,1.0,0.25}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,0.3128608452500923,3.0,6.210898792063733,5.0,7.0,9.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.3320538028281308,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,-2.212238668183224,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.1742350832385485,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {11.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.0,0.0,0.09090909090909091,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.0,0.999990000399984}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.0,0.07692307692307693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,15.0,-1.0,-5.0,2.0,6.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.4,1.0,0.2,0.0,0.35000000000000003,0.55,0.4,0.45}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.6010757126300734,2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8005378563150367,0.0,0.0,0.5,0.5,0.9222279340876556,0.5,1.0,0.8717565888215102,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.0,3.0,4.0,4.0,2.0,3.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3333333333333333,0.3333333333333333,0.6666666666666666,1.0,1.0,0.3333333333333333,0.6666666666666666,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-2.5869330155418675,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.15081668652863328,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,3.844455868175311,1.0,3.0,5.0,4.833878055412355,9.0,11.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.552778491760957,0.375,0.5,0.625,0.6146173784632722,0.875,1.0,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,-3.6497815875309945,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.47203855153246277,0.6614970533978501,0.07966939295929135,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.5024139185226595,6.0,4.0,4.0,4.0,100000.0,-100000.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.5000225120695927,0.5000300000000001,0.50002,0.50002,0.50002,1.0,0.0,0.50002,0.500015}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.63532512522154,3.0,4.0,4.0,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.5000181766256261,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,2.996533149237559,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.5000149826657463,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,1.0,2.9770126806470683,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.375,0.49856329254044174,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1111111111111111,0.2222222222222222,0.3333333333333333,0.4444444444444444,0.6228277106702074,0.5555555555555556,0.6666666666666666,0.7777777777777777,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.0,0.0,0.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7647058823529411,0.0,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,-2.870785908662275,5.0,7.0,9.0,11.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.25,0.375,0.5,0.13307588070860782,0.625,0.75,0.875,1.0,0.25}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,6.89535009486304,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.74345938092894,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.5885610609142073,-1.2,0.0,-1.9243870830593395,1.3,2.6,-2.033802097685287,2.317700548477839,2.6,11.0,-1.9243870830593395});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.10081706707755661,0.12857142857142856,0.21428571428571427,0.07682949406719003,0.3071428571428571,0.39999999999999997,0.06901413587962235,0.3798357534627028,0.39999999999999997,1.0,0.07682949406719003}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,0.0,-2.5,1.991219214535127,2.6,2.317700548477839,2.6,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.8912891454527012,1.0,0.949589383656757,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6,-1.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0,0.32142857142857145}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,4.0,0.3084506581856825,2.3242811798678176});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4582220594085185,0.4582220594085185,0.7291110297042592,0.7291110297042592,0.7650343291965445,1.0,1.0,1.0,0.0,0.5460662543091995}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,-5.0,2.0,4.0,6.0,3.0,-5.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.3333333333333333,0.0,0.5833333333333333,0.75,0.9166666666666666,0.6666666666666666,0.0,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {8.485686893878379,2.0,2.604901901518098,3.0,3.0,4.0,4.0,4.0,-3.0,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000424284344694,0.5000100000000001,0.5000130245095077,0.500015,0.500015,0.50002,0.50002,0.50002,0.49998500000000007,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,4.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.05555555555555555,0.1111111111111111,0.16666666666666666,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.05555555555555555,0.1111111111111111,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,-0.2950823455421112,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.0881147068072361,0.375,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.77124784854875,3.0,3.0,4.0,4.0,4.0,3.3437558978820334,100000.0,-100000.0,4.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.5000188562392428,0.500015,0.500015,0.50002,0.50002,0.50002,0.5000167187794894,1.0,0.0,0.50002,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,15.0,-1.0,-0.9053077270335478,-5.0,6.0,3.0,3.7435131776430204,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.4,1.0,0.2,0.20473461364832263,0.0,0.55,0.4,0.43717565888215104,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,1.5971393412498083,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.95439506042047,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.23836932557917717,0.11999701317053972,0.0,0.4178593399184791,0.4178593399184791,0.6693909296491285,0.4178593399184791,0.7157216666664185,0.7157216666664185,0.7157216666664185,1.0,0.7157216666664185,0.4178593399184791}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,-0.9053077270335478,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5910777203142337,0.5910777203142337,0.7945252638616261,1.0,0.7945252638616261,0.0,0.9979728074090186,0.9979728074090186,0.9979728074090186,0.9979728074090186}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-0.3115474205775115,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.29302828621390553,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,1.89085792733363,3.0,-1.0,2.0,-0.2950823455421112,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.36135724091670374,0.5,0.0,0.375,0.0881147068072361,0.375,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,2.0,6.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.7000000000000001,0.4,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,3.844455868175311,1.0,3.0,5.0,1.5971393412498083,9.0,11.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.552778491760957,0.375,0.5,0.625,0.412321208828113,0.875,1.0,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,2.996533149237559,3.0,4.0,4.0,4.0,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7262117127559281,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,1.5971393412498083,-2.1195243965065043,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.95439506042047,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6385329302708921,0.5823538734912445,0.5254037398060638,0.0,0.7237182198184807,0.8430941716252823,0.7237182198184807,0.865082566145717,0.865082566145717,0.865082566145717,0.9999999999999999,0.865082566145717,0.7237182198184807}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,4.0,6.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.5,0.7000000000000001,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.9436012405046843,-1.0,1.0,3.0,5.0,2.6,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.22741748496494246,0.38193398797195394,0.5364504909789655,0.690966993985977,0.5055471903775632,0.8454834969929885,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,-5.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.0,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,-2.212238668183224,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,-2.212238668183224,7.0,-2.033802097685287});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.1742350832385485,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.1742350832385485,0.75,0.18538736889466956}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.89085792733363,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.43067862045835187,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.626245525354862,0.375,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,3.132612632596544,-3.0,1.0,6.210898792063733,5.0,7.0,9.0,2.709339832728434,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5809009023283246,0.14285714285714285,0.42857142857142855,0.8007784851474096,0.7142857142857142,0.8571428571428571,1.0,0.5506671309091739,0.8571428571428571}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.6010757126300734,2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,7.0,3.7435131776430204,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3202151425260147,0.0,0.0,0.2,0.2,0.36889117363506224,0.2,0.4,1.0,0.3487026355286041,0.4,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,3.0,9.0,-1.0,2.0,2.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4,1.0,0.0,0.30000000000000004,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.286574222026122,3.0,-1.0,2.0,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5358217777532652,0.5,0.0,0.375,0.626245525354862,0.375,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3207118780090659,0.0,0.2118712787367652,0.0,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.7142857142857142,0.7110282186014621,0.17857142857142855,1.0,0.2857142857142857,0.17857142857142855,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,2.0,2.0,6.0,3.0,7.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.2,0.0,0.0,0.8,0.2,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,15.0,-1.0,-5.0,2.0,4.0,6.0,3.0,-5.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,0.4,1.0,0.2,0.0,0.35000000000000003,0.45,0.55,0.4,0.0,0.55,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.566306316298272,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,-5.0,2.0,4.0,6.0,-5.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.3333333333333333,0.0,0.5833333333333333,0.75,0.9166666666666666,0.0,0.9166666666666666}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.6497815875309945,3.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0,2.317700548477839});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.9999235052439148,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.0,0.9999831776783776}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,3.0,4.009964202838896,6.210898792063733,5.0,7.0,9.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.5,0.563122762677431,0.7006811745039834,0.625,0.75,0.875,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.6728877465517957,3.0,3.0,4.0,4.0,4.0,4.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999980000799968,0.9999967290083052,0.999990000399984,0.999990000399984,1.0,1.0,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.0,1.0,1.8568589519865748});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0,0.5385438667434284,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,5.423014615696999,9.0,11.0,-1.0,3.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6514384134810625,0.875,1.0,0.25,0.5,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,11.0,-1.0,3.0,-2.033802097685287});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,1.0,0.25,0.5,0.18538736889466956}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,1.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.375,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.89085792733363,3.0,6.210898792063733,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.22270384457876444,0.2857142857142857,0.4922041376666878,0.5714285714285714,0.8007784851474096,0.7142857142857142,0.8571428571428571,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-4.747059300613937,-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01580879371162891,0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5,0.15625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.3084506581856825,0.0,0.0,0.0,0.1581270304608839,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.023726973706590965,0.0,0.0,0.0,0.0121636177277603,0.07692307692307693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,0.546353249751977,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.16611421015887298,0.0,0.2942351917292677,0.5385438667434284,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000094542896367,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,1.0,100000.0,1.8568589519865748,1.8568589519865748});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.856858951986575e-05,0.0,0.0,1e-05,1.0,1.856858951986575e-05,1.856858951986575e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.16666666666666666,0.3333333333333333,0.5,0.6666666666666666,0.8333333333333333,1.0,0.6666666666666666,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,-5.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.0,4.0,4.0,2.317700548477839,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,0.9999831776783776,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-10.0,1.0,3.0,8.214348434556833,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.23809523809523808,0.3865644678144144,0.0,0.5238095238095237,0.6190476190476191,0.8673499254550873,0.7719475615268444,0.7142857142857142,0.8095238095238095,0.9047619047619047,1.0,0.7719475615268444}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.38904762141515903,0.0,1.0,100000.0,1.8568589519865748,1.8568589519865748,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.856858951986575e-05,3.890476214151591e-06,0.0,1e-05,1.0,1.856858951986575e-05,1.856858951986575e-05,0.0,1e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,2.093512706816888,3.0,4.0,4.0,2.317700548477839,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,0.9999809358896325,0.999990000399984,1.0,1.0,0.9999831776783776,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,15.0,-1.0,-5.0,2.0,4.0,6.0,3.0,-5.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,1.0,0.2,0.0,0.35000000000000003,0.45,0.55,0.4,0.0,0.55,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,-2.1195243965065043,4.009964202838896,2.996533149237559,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6720828874608641,0.6720828874608641,0.0,0.9999999999999999,0.8346630331102064,0.8352286350696931,0.9983743826785222,0.9983743826785222,0.9983743826785222,0.39611380547334446,0.9983743826785222,0.8352286350696931}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,10.012494985460352,-1.0,1.0,3.0,10.216971081237052,5.0,4.95439506042047,9.0,6.0,-1.0,3.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.19492695927983444,0.9865626283519179,0.26286440176863524,0.39429660265295285,0.5257288035372705,1.0,0.6571610044215881,0.6541640256315211,0.9200254061902233,0.7228771048637469,0.26286440176863524,0.5257288035372705,0.39429660265295285}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,2.539730481972406,0.1581270304608839,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4781803817532602,0.4781803817532602,0.7377967557711238,1.0,0.7377967557711238,0.7377967557711238,0.9974131297889873,0.9974131297889873,0.6183032524298502,0.0,0.03902647515912341,0.9974131297889873}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,1.3,6.210898792063733,0.1581270304608839,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.3717303593318144,0.6614970533978501,0.30435435150989987,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,0.0,-2.5,-2.5,2.6,2.317700548477839,2.6,5.0,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.225,0.375,0.0625,0.0625,0.7,0.6647125685597299,0.7,1.0,0.7}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,15.0,-1.0,-5.0,2.0,6.0,3.0,-5.0,6.0,3.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,1.0,0.2,0.0,0.35000000000000003,0.55,0.4,0.0,0.55,0.4,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,8.485686893878379,-1.8821461758972977,-1.0,1.0,2.7499191886213326,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,-1.8821461758972977});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.8428554308673987,0.1948658640064189,0.25,0.375,0.48436994928883326,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.1948658640064189}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0,3.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75,0.5,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,0.927368319637066,-2.1195243965065043,3.093771311909787,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,-5.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3704605199773166,0.18002972521834348,0.5058607069943617,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,1.8568589519865748});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.50000928429476}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-0.1,2.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.26829268292682934,0.0,0.5121951219512196,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,13.0,2.0,2.0,6.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5714285714285714,0.2857142857142857,0.7142857142857142,0.0,1.0,0.21428571428571427,0.21428571428571427,0.5,0.2857142857142857,0.5714285714285714}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,-0.2950823455421112,2.0,2.989630289631409,4.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.0881147068072361,0.375,0.49870378620392614,0.625,0.3734972856211106,0.875,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,5.0,4.95439506042047});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.625,0.6221496912762794}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.377524891878108,2.0,3.0,4.009964202838896,3.0,3.0,4.0,17.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0640488316452606,0.10134166141047106,0.16125221731643966,0.22175973415364636,0.16125221731643966,0.16125221731643966,0.22116277322240827,1.0,0.24657372479673287,0.0,0.22116277322240827,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,4.0,6.0,-1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.5,0.7000000000000001,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,2.0,4.0,6.0,3.0,6.698272723595944,6.941347396260423});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.375,0.625,0.875,0.5,0.962284090449493,0.9926684245325529}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,9.0,11.0,-1.0,3.0,-2.033802097685287,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.875,1.0,0.25,0.5,0.18538736889466956,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,1.1519077916929108,2.317700548477839,2.6,11.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.39999999999999997,0.2965648422637793,0.3798357534627028,0.39999999999999997,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,5.167048792887977,-3.0,-2.5,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6354405495554986,0.125,0.15625,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0479423465957955,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.740100409025187,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.9973080733816877}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.675310403852642,2.0,3.6728877465517957,3.0,3.0,4.0,4.0,4.0,4.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999867536338931,0.999980000799968,0.9999967290083052,0.999990000399984,0.999990000399984,1.0,1.0,1.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,3.0,4.0,4.0,100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4314370599014409e-06,0.0,1.143162274924463e-05,1.143162274924463e-05,1.143162274924463e-05,2.1431808438587818e-05,2.1431808438587818e-05,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,-3.6497815875309945,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.47203855153246277,0.6614970533978501,0.5900481894155785,0.07966939295929135,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,2.8812658011312893,3.0,4.0,17.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.10134166141047106,0.10134166141047106,0.16125221731643966,0.22175973415364636,0.1541387854571654,0.16125221731643966,0.22116277322240827,1.0,0.24657372479673287,0.0,0.22116277322240827,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.5,-1.2,0.0,-1.9243870830593395,1.3,2.6,-2.033802097685287,2.317700548477839,-100000.0,2.6,11.0,-1.9243870830593395});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998650148483667,0.999878013418524,0.9998900120986691,0.9998707703444316,0.9999030106688265,0.9999160092389837,0.9998696763146284,0.9999131865549638,0.0,0.9999160092389837,1.0,0.9998707703444316}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.6,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.3846153846153846}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.212238668183224,0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5436681236688811,1.0,0.5436681236688811,0.5436681236688811,0.6194713328759414,0.5436681236688811,0.7894228568665258,0.7894228568665258}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-3.271286856294544,1.3,2.6,1.1519077916929108,2.317700548477839,2.6,11.0,-3.0,1.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01900927779157416,0.054044660727589365,0.1451366563612289,0.22922157540766538,0.0,0.320313571041305,0.4114055666749445,0.3099366365855469,0.3916246279015325,0.4114055666749445,1.0,0.01900927779157416,0.320313571041305}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.286574222026122,3.0,-1.0,2.940752465498065,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5358217777532652,0.5,0.0,0.4925940581872581,0.626245525354862,0.375,0.625,0.3734972856211106,0.875,0.375,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,3.0,4.0,2.3974061228253545,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.500015,0.50002,0.5000119870306141,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,0.3128608452500923,3.0,6.210898792063733,0.3128608452500923,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.3320538028281308,0.5,0.7006811745039834,0.3320538028281308,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.3440825794661051,-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.47427096795248125,0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.6497815875309945,3.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0,2.317700548477839,3.0,2.317700548477839});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.9999235052439148,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.0,0.9999831776783776,0.999990000399984,0.9999831776783776}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.08928571428571429,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.833878055412355,3.0,9.0,-1.0,2.0,1.9879782849688847,6.0,2.0,2.0,3.0,7.687190467376851});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5833878055412355,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004,0.30000000000000004,0.4,0.8687190467376852}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.675310403852642,2.0,3.6728877465517957,3.0,3.0,4.0,4.0,4.0,4.0,-100000.0,2.675310403852642});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999867536338931,0.999980000799968,0.9999967290083052,0.999990000399984,0.999990000399984,1.0,1.0,1.0,1.0,0.0,0.9999867536338931}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,4.0,4.0,2.996533149237559,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.5000149826657463,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,0.0,0.546353249751977,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.16611421015887298,0.0,0.0,0.2942351917292677,0.5385438667434284,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,-3.271286856294544,6.89535009486304,11.0,6.210898792063733,-2.033802097685287,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.108044571481591,0.74345938092894,1.0,0.7006811745039834,0.18538736889466956,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.6497815875309945,3.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0,2.317700548477839,3.0,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9998500254956658,0.9997935372827866,0.9998600237959547,0.9998600237959547,0.9998600237959547,0.9998700220962438,0.9998700220962438,0.9998700220962438,0.9998532019611515,0.0,0.9998532019611515,0.9998600237959547,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,9.344477625800707,2.317700548477839,2.6,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.39999999999999997,0.8817484018429076,0.3798357534627028,0.39999999999999997,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,1.9879782849688847,6.0,2.0,3.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004,0.4,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-1.0,2.0,4.0,6.577002407130273});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.0,0.30000000000000004,0.5,0.7577002407130273}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.8821461758972977,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,7.0,3.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1948658640064189,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.75,0.5,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,4.268063860875567,1.3,6.210898792063733,0.1581270304608839,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.5468604300497585,0.3717303593318144,0.6614970533978501,0.30435435150989987,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,-3.271286856294544,0.38904762141515903,6.89535009486304,11.0,6.210898792063733,-2.033802097685287,6.210898792063733,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.108044571481591,0.33681547633844744,0.74345938092894,1.0,0.7006811745039834,0.18538736889466956,0.7006811745039834,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,1.3,1.1519077916929108,2.317700548477839,2.6,11.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.2965648422637793,0.3798357534627028,0.39999999999999997,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,0.0,0.0,0.546353249751977,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.16611421015887298,0.0,0.0,0.0,0.2942351917292677,0.5385438667434284,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,-1.9490889498022153,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.19068194063736155,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.0,6.210898792063733,5.0,7.0,8.670628219354063,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.375,0.7006811745039834,0.625,0.75,0.8544142637096289,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.626245525354862,0.375,0.625,0.3734972856211106,0.875,0.375,0.375}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,3.0,6.210898792063733,5.0,-3.6497815875309945,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.47203855153246277,0.6614970533978501,0.5900481894155785,0.07966939295929135,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,3.093771311909787,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.5058607069943617,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,4.0,4.0,100000.0,-100000.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000094542896367,0.5000100000000001,0.500015,0.500015,0.50002,0.50002,1.0,0.0,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,1.9231874764034629,6.210898792063733,5.0,7.0,9.0,4.770428788329857,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1111111111111111,0.2222222222222222,0.3333333333333333,0.38462152646685904,0.6228277106702074,0.5555555555555556,0.6666666666666666,0.7777777777777777,0.5428015993516587,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,-3.6497815875309945,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.47203855153246277,0.6614970533978501,0.5900481894155785,0.07966939295929135,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,0.0,9.0,-1.0,2.0,2.0,4.0,5.125238815616499,6.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,0.1,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.6125238815616499,0.7000000000000001,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.870785908662275,-3.0,-2.5,-1.2,0.0,-2.5,1.3,2.6,1.1519077916929108,2.317700548477839,2.6,11.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.00922957795269465,0.0,0.03571428571428571,0.12857142857142856,0.21428571428571427,0.03571428571428571,0.3071428571428571,0.39999999999999997,0.2965648422637793,0.3798357534627028,0.39999999999999997,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.9222279340876556,0.5,1.0,0.8717565888215102,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,-3.0,1.0,3.0,13.0,6.210898792063733,5.0,-3.271286856294544,0.38904762141515903,6.89535009486304,6.210898792063733,-2.033802097685287,6.210898792063733,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1600264224163053,0.1111111111111111,0.3333333333333333,0.4444444444444444,1.0,0.6228277106702074,0.5555555555555556,0.09603961909474755,0.2993915345230644,0.6608527830479467,0.6228277106702074,0.16478877235081738,0.6228277106702074,0.6228277106702074}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,2.604901901518098,3.0,19.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.05555555555555555,0.08916121675100543,0.1111111111111111,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000094542896367,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0,0.500015}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-5.0,4.0,6.0,-5.0,6.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.6666666666666666,0.0,0.75,0.9166666666666666,0.0,0.9166666666666666,0.75}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,1.7028886023781937,3.0,9.0,-1.0,5.001164845966617,2.0,2.0,1.9879782849688847,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.2702888602378194,0.4,1.0,0.0,0.6001164845966618,0.30000000000000004,0.30000000000000004,0.2987978284968885,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {5.373081551848091,2.0,2.0,3.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.2964648155192412,0.2964648155192412,0.5468162686919755,0.2964648155192412,0.5929296310384824,0.516890312565304,0.5929296310384824,0.5929296310384824,0.2964648155192412}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,-2.298305269747882,0.0,-2.5,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.32142857142857145,0.12530263040216397,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.9222279340876556,0.5,1.0,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.0,1.5971393412498083,3.0,3.0,3.844455868175311,3.0,4.0,4.0,-0.3440825794661051,4.95439506042047,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5174106391718484,0.44240680791403414,0.36637352323666106,0.6311402645718615,0.6311402645718615,0.7905173395675745,0.6311402645718615,0.8198737212296888,0.8198737212296888,0.0,1.0,0.8198737212296888,0.6311402645718615}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.0,-1.2,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.375,0.2375,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-1.0,1.0,3.38441078074546,3.0,5.0,9.0,11.0,-1.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.25,0.375,0.5240256737965913,0.5,0.625,0.875,1.0,0.25,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,-0.9053077270335478,4.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5910777203142337,0.5910777203142337,0.7945252638616261,1.0,0.7945252638616261,0.0,0.9979728074090186,0.9979728074090186,0.9979728074090186}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,0.18490766288493937,3.0,3.0,4.0,4.0,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.47576629258929487,0.47576629258929487,0.7378831462946475,0.0,0.7378831462946475,0.7378831462946475,1.0,1.0,1.0,0.032382701225565955}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.6497815875309945,3.0,3.0,3.0,4.0,4.0,2.317700548477839,-100000.0,2.317700548477839});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.9999235052439148,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,0.9999831776783776,0.0,0.9999831776783776}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-0.7560991815460972,0.0,0.0,0.927368319637066,0.0,11.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02093087765534311,0.0,0.06431548168060447,0.06431548168060447,0.14319949799553858,0.06431548168060447,1.0,0.1493777106187313,0.06431548168060447}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.0,0.07692307692307693,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0,2.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.626245525354862,0.375,0.625,0.3734972856211106,0.875,0.375,0.375,0.875}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,3.0,4.009964202838896,6.210898792063733,7.0,9.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.5,0.563122762677431,0.7006811745039834,0.75,0.875,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,-1.0,2.0,-0.2950823455421112,2.0,4.0,1.9879782849688847,6.0,2.0,-0.2950823455421112});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.5,0.0,0.375,0.0881147068072361,0.375,0.625,0.3734972856211106,0.875,0.375,0.0881147068072361}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,0.3084506581856825,0.0,0.0,0.0,0.546353249751977,1.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.16611421015887298,0.0,0.0,0.0,0.2942351917292677,0.5385438667434284,0.5385438667434284,0.5385438667434284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,9.0,-1.0,4.0,6.0,-1.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0,0.0,0.5,0.7000000000000001,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.9879782849688847,-1.0,2.6672071366353363,2.0,4.0,6.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.2987978284968885,0.0,0.36672071366353365,0.30000000000000004,0.5,0.7000000000000001,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-0.3115474205775115,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,11.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.29302828621390553,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-12.900064462349789,0.0,-1.9243870830593395,1.3,2.6,-2.033802097685287,2.317700548477839,2.6,11.0,-1.9243870830593395,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4142275213502266,0.43514796701628994,0.0,0.5397501953466066,0.45923212452337253,0.5941433540783713,0.6485365128101359,0.45465410278630525,0.6367248521358783,0.6485365128101359,1.0,0.45923212452337253,0.5397501953466066}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.377524891878108,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.424148152025293,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2597552991425194,0.4109994343234006,0.6539716161945909,0.8993648221701549,0.6539716161945909,0.6539716161945909,0.8969437980657812,1.0,0.0,0.8969437980657812,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,-0.1,2.0,4.0,4.0,4.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.26829268292682934,0.0,0.5121951219512196,1.0,1.0,1.0,0.26829268292682934}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,3.0,2.675310403852642,4.0,4.0,4.0,0.546353249751977,-100000.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999789094228964,0.999980000799968,0.999990000399984,0.999990000399984,0.999990000399984,0.9999867536338931,1.0,1.0,1.0,0.9999654649139009,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.833878055412355,3.0,9.0,-1.0,2.0,1.9879782849688847,2.0,2.0,3.0,7.687190467376851});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5833878055412355,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.30000000000000004,0.30000000000000004,0.4,0.8687190467376852}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,4.0,3.518404627675752,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4582220594085185,0.4582220594085185,0.7291110297042592,0.7291110297042592,0.7650343291965445,1.0,1.0,1.0,0.8695411254918907,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,1.613929098849716,3.0,9.0,-1.0,1.377524891878108,2.0,1.9879782849688847,6.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.2613929098849716,0.4,1.0,0.0,0.2377524891878108,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.30000000000000004}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,3.266924662181324,-2.1195243965065043,-3.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.5166827913863328,0.18002972521834348,0.125,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.317700548477839,-3.0,-1.0,1.0,6.210898792063733,5.0,7.0,9.0,11.0,-0.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.3798357534627028,0.0,0.14285714285714285,0.2857142857142857,0.6579213422902667,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0,0.17857142857142855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-4.747059300613937,-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,1.1519077916929108,11.0,-1.0,-2.5,3.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01580879371162891,0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.3844942369808069,1.0,0.25,0.15625,0.5,0.15625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,0.0,9.0,-1.0,2.0,2.0,4.0,5.125238815616499,6.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4,0.1,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.6125238815616499,0.7000000000000001,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.1581270304608839,0.0,0.0,0.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,2.709339832728434,-2.1195243965065043,3.093771311909787,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.4818337395455271,0.18002972521834348,0.5058607069943617,0.125,0.25,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.7006811745039834}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.0,0.0,0.0,1.0,0.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.0,0.07692307692307693,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,5.423014615696999,9.0,11.0,-1.0,3.0,5.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6514384134810625,0.875,1.0,0.25,0.5,0.625,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-0.3115474205775115,1.0,3.0,6.210898792063733,5.0,7.0,9.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.29302828621390553,0.375,0.5,0.7006811745039834,0.625,0.75,0.875,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {3.0,0.0,9.0,-1.0,2.0,2.0,4.0,6.0,0.3128608452500923,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4,0.1,1.0,0.0,0.30000000000000004,0.30000000000000004,0.5,0.7000000000000001,0.13128608452500923,0.7000000000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.3084506581856825,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.023726973706590965,0.0,0.0,0.0,0.07692307692307693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,4.0,4.0,100000.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0914413642692594e-06,1.1091630453637403e-05,1.1091630453637403e-05,2.1091819543005547e-05,2.1091819543005547e-05,1.0,2.1091819543005547e-05,2.1091819543005547e-05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,1.9879782849688847,-1.0,2.6672071366353363,2.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.4,1.0,0.2987978284968885,0.0,0.36672071366353365,0.30000000000000004,0.5,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,13.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1111111111111111,0.2222222222222222,0.3333333333333333,0.4444444444444444,0.6228277106702074,0.5555555555555556,0.6666666666666666,0.7777777777777777,1.0,0.1111111111111111}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,-2.5,3.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.15625,0.5,0.15625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,0.3084506581856825,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.0,0.9973080733816877,0.7271483163156932}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-2.5,-1.2,0.0,-2.5,2.6,2.317700548477839,2.6,11.439507913526228,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.03462721880789472,0.12465798770842099,0.20776331284736832,0.03462721880789472,0.3878248506484208,0.3682743608940078,0.3878248506484208,1.0,0.3878248506484208}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.0,0.0,0.0,0.0,1.0,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.0,0.07692307692307693,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.6274907176106725,3.3897940249536718,3.0,3.0,3.0,4.0,4.0,4.0,15.0,100000.0,1.8803882689883606,-100000.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000131374535881,0.5000169489701248,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,0.500075,1.0,0.5000094019413449,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,1.0,0.546353249751977,1.8568589519865748,1.8568589519865748});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.5385438667434284,0.2942351917292677,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.833878055412355,3.0,9.0,-1.0,2.0,1.9879782849688847,6.0,1.1020021624546297,2.0,3.0,7.687190467376851});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5833878055412355,0.4,1.0,0.0,0.30000000000000004,0.2987978284968885,0.7000000000000001,0.210200216245463,0.30000000000000004,0.4,0.8687190467376852}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,3.844455868175311,3.0,4.0,3.7435131776430204,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,0.5,0.9222279340876556,0.5,1.0,0.8717565888215102,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,-1.2,-2.298305269747882,0.0,-2.5,1.3,2.6274907176106725,2.317700548477839});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.3198583685561806,0.12469051757939541,0.5330972809269676,0.08884954682116128,0.764106102661987,1.0,0.9449505677257937}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,4.0,4.0,4.0,2.317700548477839,1.0,-100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.999990000399984,0.999990000399984,1.0,1.0,1.0,0.9999831776783776,0.9999700011999519,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,2.7499191886213326,2.0,3.0,3.0,3.0,4.0,4.0,4.0,4.0,2.3974061228253545,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.19870306141267724,0.3749595943106663,0.0,0.5,0.5,0.5,1.0,1.0,1.0,1.0,0.19870306141267724,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.5496229973645987,3.0,3.0,2.093512706816888,3.0,4.0,4.0,2.317700548477839,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.9999954964101172,0.999990000399984,0.999990000399984,0.9999809358896325,0.999990000399984,1.0,1.0,0.9999831776783776,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,4.009964202838896,3.0,3.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,0.3084506581856825,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.0,0.9973080733816877,0.7271483163156932}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.1195243965065043,2.3974061228253545,2.7499191886213326,2.0,3.0,3.0,4.0,4.0,4.0,2.3974061228253545,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.7381179037231179,0.7957225545023875,0.6731772160036238,0.8365886080018119,0.8365886080018119,1.0,1.0,1.0,0.7381179037231179,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,1.8568589519865748,3.0,4.0,2.3974061228253545,100000.0,-100000.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.50000928429476,0.500015,0.50002,0.5000119870306141,1.0,0.0,0.5000100000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.132612632596544,4.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.566306316298272,1.0,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,-4.747059300613937,0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8259979673616429,0.8259979673616429,0.8259979673616429,0.0,0.8259979673616429,0.8259979673616429,0.8259979673616429,0.8259979673616429,1.0,0.8259979673616429}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.63532512522154,3.0,3.0,3.0,4.0,4.0,4.0,100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000181766256261,0.500015,0.500015,0.500015,0.50002,0.50002,0.50002,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {8.485686893878379,0.0,0.0,0.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.0,0.0,0.0,0.1178454982496945}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,3.0,3.0164328160662626,4.0,4.0,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.5,0.5,0.5,0.5082164080331313,1.0,1.0,1.0,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,3.0,1.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.5,0.375,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,4.009964202838896,3.0,3.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,1.0,0.49752129843287196,0.49752129843287196,0.9950425968657439,0.9950425968657439}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,2.0,3.0,1.991219214535127});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5,1.0,0.49560960726756353}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-1.0,5.0,7.0,9.0,11.0,13.0,15.0,17.0,24.946980870408836,19.0,17.0,23.70225109869183,17.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.23124077633412385,0.30832103511216513,0.3854012938902064,0.4624815526682477,0.539561811446289,0.6166420702243303,0.6937223290023715,1.0,0.7708025877804128,0.6937223290023715,0.9520279535436603,0.6937223290023715}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-0.09033406201985716,2.0,4.0,6.577002407130273});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7799860834206127,0.33995825026183807,1.0,0.0,0.22995129197214437,0.4499652085515317,0.7334534048651519}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,3.0164328160662626,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.5010270510041415,0.5,0.625,0.6221496912762794,0.15625,0.875,1.0,0.25,0.15625,0.5,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,3.0,3.0,5.373081551848091,4.0,4.0,2.317700548477839,-100000.0,-100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9999662709967684,0.9999762704594891,0.9999762704594891,1.0,0.9999862699222098,0.9999862699222098,0.9999694478315592,0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,3.0,1.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.18538736889466956,0.0,0.18002972521834348,0.125,0.375,0.5,0.375,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,15.0,-0.6957571854516531,-5.0,2.0,4.0,6.0,-5.0,6.0,2.2570567824361802,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.6000000000000001,1.0,0.21521214072741737,0.0,0.35000000000000003,0.45,0.55,0.0,0.55,0.36285283912180905,0.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-4.747059300613937,-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,1.1519077916929108,11.0,-1.0,3.0,-2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01580879371162891,0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.3844942369808069,1.0,0.25,0.5,0.15625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,5.423014615696999,8.509277922044287,11.0,-1.0,3.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6514384134810625,0.844329870127768,1.0,0.25,0.5,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0,0.42857142857142855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-1.8821461758972977,-1.0,1.0,-1.2,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,6.210898792063733,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1948658640064189,0.25,0.375,0.2375,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.7006811745039834,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {7.0,3.0,9.0,-0.09033406201985716,2.0,5.829250022189214,6.577002407130273,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.7799860834206127,0.33995825026183807,1.0,0.0,0.22995129197214437,0.6511954394439218,0.7334534048651519,0.22995129197214437}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.063682676514065,-3.0,1.0,2.9770126806470683,-3.9144111138034585,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1284688398091476,0.37747774272081974,0.5005511823834173,0.07154471274453779,0.7018677905697066,0.6264866456324919,0.7509910970883279,0.875495548544164,1.0,0.7018677905697066}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,5.0,9.0,-5.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.625,0.875,0.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.882888909339558,-3.0,-1.2,0.0,-2.5,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8719444480963496,0.0,0.32142857142857145,0.5357142857142857,0.08928571428571429,0.7678571428571428,1.0,0.949589383656757,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,1.3,6.210898792063733,0.1581270304608839,5.0,7.0,9.0,11.947768299915708,6.210898792063733});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.3717303593318144,0.6614970533978501,0.30435435150989987,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.510011823263119,4.009964202838896,3.0,3.0,4.0,4.0,4.0,0.3084506581856825,4.0,0.3084506581856825,4.0,0.3084506581856825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.4569885592496988,0.4569885592496988,0.7271483163156932,0.8649329865892423,1.0,0.7271483163156932,0.7271483163156932,0.9973080733816877,0.9973080733816877,0.9973080733816877,0.0,0.9973080733816877,0.0,0.9973080733816877,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,-3.0,-1.0,0.46169913310022603,3.0,6.210898792063733,5.0,7.0,9.0,11.0,6.210898792063733,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18002972521834348,0.125,0.25,0.34135619581876414,0.5,0.7006811745039834,0.625,0.75,0.875,1.0,0.7006811745039834,0.875}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.89085792733363,2.0,3.0,3.0,3.0,4.0,3.6864156720265173,4.0,100000.0,-100000.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000094542896367,0.5000100000000001,0.500015,0.500015,0.500015,0.50002,0.5000184320783602,0.50002,1.0,0.0,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,-3.0,1.0,1.3,6.210898792063733,0.1581270304608839,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.11800963788311569,0.3540289136493471,0.3717303593318144,0.6614970533978501,0.30435435150989987,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.3974061228253545,1.6182674623272582,3.0,3.0,3.844455868175311,3.0,4.0,4.0,4.0,4.95439506042047,4.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.23354582149178546,0.0,0.4141725689576385,0.4141725689576385,0.6672971402893724,0.4141725689576385,0.7139212957663964,0.7139212957663964,0.7139212957663964,1.0,0.7139212957663964,0.4141725689576385}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.1195243965065043,-3.0,-1.0,1.0,3.0,6.210898792063733,5.0,7.0,9.0,6.210898792063733,2.996533149237559});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.20574825739239255,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.8007784851474096,0.7142857142857142,0.8571428571428571,1.0,0.8007784851474096,0.5711809392312541}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,1.8568589519865748,0.0,0.0,1.0,3.266924662181324,1.8568589519865748,1.8568589519865748});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.5683813200475677,0.0,0.0,0.3060982738831512,1.0,0.5683813200475677,0.5683813200475677}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,0.3128608452500923,3.0,6.210898792063733,0.3128608452500923,5.0,7.0,9.0,11.0,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.125,0.3320538028281308,0.5,0.7006811745039834,0.3320538028281308,0.625,0.75,0.875,1.0,0.125}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,2.0,3.0,3.0,4.0,4.0,4.0,4.0,100000.0,-100000.0,4.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5000100000000001,0.5000100000000001,0.500015,0.500015,0.50002,0.50002,0.50002,0.50002,1.0,0.0,0.50002,0.50002}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.0,-2.033802097685287,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,9.0,11.0,-1.0,-2.5,3.0,11.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2806228932579327,0.0,0.18538736889466956,0.0,0.25,0.375,0.5,0.625,0.6221496912762794,0.875,1.0,0.25,0.15625,0.5,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {4.833878055412355,3.254937912294724,9.0,-1.0,2.0,1.9879782849688847,2.0,2.0,3.0,7.687190467376851});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5833878055412355,0.42549379122947245,1.0,0.0,0.30000000000000004,0.2987978284968885,0.30000000000000004,0.30000000000000004,0.4,0.8687190467376852}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,0.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,0.0,1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,3.0,5.0,7.0,9.0,-5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.14285714285714285,0.2857142857142857,0.42857142857142855,0.5714285714285714,0.7142857142857142,0.8571428571428571,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {13.0,0.3084506581856825,0.0,0.0,-0.31361409536449547,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,0.04672395858062065,0.023555894974730332,0.023555894974730332,0.0,0.09866697997667415}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-0.7560991815460972,0.0,0.3084506581856825,3.3897940249536718,0.0,0.0,11.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02093087765534311,0.0,0.06431548168060447,0.0905529821833109,0.35265891708430824,0.06431548168060447,0.06431548168060447,1.0,0.1493777106187313}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.604901901518098,3.0,-1.0,2.0,4.009964202838896,2.0,4.0,1.9879782849688847,6.0,2.0,2.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5149859859311569,0.5714285714285714,0.0,0.42857142857142855,0.715709171834128,0.42857142857142855,0.7142857142857142,0.4268540407098407,1.0,0.42857142857142855,0.42857142857142855,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-3.0,-1.0,1.0,7.0,6.210898792063733,5.0,7.0,9.0,4.770428788329857,13.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.1111111111111111,0.2222222222222222,0.3333333333333333,0.6666666666666666,0.6228277106702074,0.5555555555555556,0.6666666666666666,0.7777777777777777,0.5428015993516587,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,2.6,0.0,0.0,1.0,0.20411598356772886});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.0,0.0,0.3846153846153846,0.07850614752604955}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {0.0,0.0,0.0,0.0,1.0,0.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0,0.0,0.0,1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-2.033802097685287,-5.0,-2.1195243965065043,3.38441078074546,-2.077778522892178,1.0,1.3,6.210898792063733,0.1581270304608839,5.0,7.0,9.0,11.947768299915708,6.210898792063733,-3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.1750199701709083,0.0,0.16996194144970828,0.49472064004953153,0.17242514916387877,0.3540289136493471,0.3717303593318144,0.6614970533978501,0.30435435150989987,0.5900481894155785,0.7080578272986942,0.8260674651818098,1.0,0.6614970533978501,0.11800963788311569}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0,3.0,4.0,2.0,4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.6666666666666666,1.0,0.3333333333333333,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0,-3.6497815875309945,3.0,3.0,3.0,4.0,4.0,-3.4147617533948647,4.0,2.317700548477839,-100000.0,2.317700548477839,3.0,2.317700548477839});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.999980000799968,0.9999235052439148,0.999990000399984,0.999990000399984,0.999990000399984,1.0,1.0,0.9999258553482522,1.0,0.9999831776783776,0.0,0.9999831776783776,0.999990000399984,0.9999831776783776}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-3.0,5.423014615696999,-2.5,-1.2,0.0,1.3,2.6,2.317700548477839,2.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,1.0,0.05936116970142825,0.2137002109251417,0.3561670182085695,0.5105060594322829,0.6648451006559963,0.6313298493591422,0.6648451006559963}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-5.0,-2.033802097685287,-1.0,1.0,3.0,5.0,5.423014615696999,8.509277922044287,11.0,-1.0,3.941667953273927,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.18538736889466956,0.25,0.375,0.5,0.625,0.6514384134810625,0.844329870127768,1.0,0.25,0.5588542470796205,0.625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {-0.5100337078730766,-5.063682676514065,-5.0,-1.0,1.0,3.0,5.0,4.95439506042047,-2.5,9.0,11.0,-1.0,-2.5,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.2834747834815399,0.0,0.003964388353311573,0.2529732912649837,0.37747774272081974,0.5019821941766558,0.6264866456324919,0.623647636639479,0.15959495267310664,0.875495548544164,1.0,0.2529732912649837,0.15959495267310664,0.5019821941766558}, 1e-6
        );
    }
}
